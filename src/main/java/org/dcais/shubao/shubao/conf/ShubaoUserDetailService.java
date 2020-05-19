package org.dcais.shubao.shubao.conf;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.dcais.shubao.shubao.entity.IdEntity;
import org.dcais.shubao.shubao.entity.user.Role;
import org.dcais.shubao.shubao.entity.user.User;
import org.dcais.shubao.shubao.entity.user.UserRole;
import org.dcais.shubao.shubao.service.user.IRoleService;
import org.dcais.shubao.shubao.service.user.IUserRoleService;
import org.dcais.shubao.shubao.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ShubaoUserDetailService implements UserDetailsService {
    @Autowired
    private IUserRoleService userRoleService;
    @Autowired
    private IUserService userService;
    @Autowired
    private IRoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        List<User> users = userService.list(Wrappers.<User>lambdaQuery().eq(User::getName,username) );
        if(users == null || users.size() == 0 ){
            throw new UsernameNotFoundException("非法用户名");
        }
        User user = users.get(0);
        List<UserRole> userRoles = userRoleService.list(Wrappers.<UserRole>lambdaQuery().eq(UserRole::getUserId,user.getId()));
        List<Long> roleIds = userRoles.stream().map(UserRole::getRoleId).collect(Collectors.toList());

        List<Role> roles = roleService.list(Wrappers.<Role>lambdaQuery().in(Role::getId,roleIds));
        for(Role role: roles){
            authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
        }
        return new org.springframework.security.core.userdetails.User(user.getName(),user.getPassword(),authorities);
    }
}
