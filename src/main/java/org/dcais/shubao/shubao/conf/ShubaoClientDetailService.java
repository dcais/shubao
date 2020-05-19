package org.dcais.shubao.shubao.conf;


import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.dcais.shubao.shubao.entity.client.ClientDetail;
import org.dcais.shubao.shubao.service.client.IClientDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.NoSuchClientException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Collections;
import java.util.List;
import java.util.Set;

@Component
public class ShubaoClientDetailService implements ClientDetailsService {
    @Autowired
    private IClientDetailService clientDetailService;
    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
        List<ClientDetail> list = clientDetailService.list(Wrappers.<ClientDetail>lambdaQuery().eq(ClientDetail::getClientId,clientId));
        if(list == null || list.size() == 0){
            throw new NoSuchClientException("No client with requested id: " + clientId);
        }
        ClientDetail cd= list.get(0);
        BaseClientDetails baseClientDetails = new BaseClientDetails(
                cd.getClientId(),
                cd.getResourceIds(),
                cd.getScope(),
                cd.getAuthorizedGrantTypes(),
                cd.getAuthorities(),
                cd.getWebServerRedirectUri()
        );
        baseClientDetails.setClientSecret(cd.getClientSecret());
        baseClientDetails.setAccessTokenValiditySeconds(cd.getAccessTokenValidity());
        baseClientDetails.setRefreshTokenValiditySeconds(cd.getRefreshTokenValidity());
        String autoapprove = cd.getAutoapprove();
        if (StringUtils.hasText(autoapprove)) {
            Set<String> autoapproves = StringUtils
                    .commaDelimitedListToSet(autoapprove);
            if (autoapprove != null
                    && !autoapproves.isEmpty()) {
                baseClientDetails.setAutoApproveScopes(autoapproves);
            }

        }
        return baseClientDetails;
    }
}
