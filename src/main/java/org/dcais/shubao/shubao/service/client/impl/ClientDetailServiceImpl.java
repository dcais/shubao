package org.dcais.shubao.shubao.service.client.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.dcais.shubao.shubao.entity.client.ClientDetail;
import org.dcais.shubao.shubao.mapper.client.ClientDetailMapper;
import org.dcais.shubao.shubao.service.client.IClientDetailService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 客户端认证详情 服务实现类
 * </p>
 *
 * @author david-cai
 * @since 2020-05-18
 */
@Service
public class ClientDetailServiceImpl extends ServiceImpl<ClientDetailMapper, ClientDetail> implements IClientDetailService {

}
