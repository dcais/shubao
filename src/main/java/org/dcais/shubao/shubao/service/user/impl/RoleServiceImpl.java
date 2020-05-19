package org.dcais.shubao.shubao.service.user.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.dcais.shubao.shubao.entity.user.Role;
import org.dcais.shubao.shubao.mapper.user.RoleMapper;
import org.dcais.shubao.shubao.service.user.IRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author david-cai
 * @since 2020-05-19
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
