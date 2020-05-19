package org.dcais.shubao.shubao.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;

@Configuration
public class ConfAuthorizationServerConfigureAdapter extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private ShubaoClientDetailService shubaoClientDetailService;

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.withClientDetails(this.shubaoClientDetailService);

    }
}
