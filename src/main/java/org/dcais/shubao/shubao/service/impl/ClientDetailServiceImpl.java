package org.dcais.shubao.shubao.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.dcais.shubao.shubao.entity.ClientDetail;
import org.dcais.shubao.shubao.mapper.ClientDetailMapper;
import org.dcais.shubao.shubao.service.IClientDetailService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

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
