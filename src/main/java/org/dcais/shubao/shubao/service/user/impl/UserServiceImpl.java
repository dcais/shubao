package org.dcais.shubao.shubao.service.user.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.dcais.shubao.shubao.entity.user.User;
import org.dcais.shubao.shubao.mapper.user.UserMapper;
import org.dcais.shubao.shubao.service.user.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author david-cai
 * @since 2020-05-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
