package org.dcais.shubao.shubao.service;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.dcais.shubao.shubao.entity.user.User;
import org.dcais.shubao.shubao.service.user.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@ActiveProfiles("dev")
@SpringBootTest
public class ServiceUserTest {
    @Autowired
    private IUserService iUserService;

    @Test
    public void testPagenation() {
        Page<User> page = new Page<>(1, 3);
        Page<User> result = iUserService.page(page, Wrappers.<User>lambdaQuery().gt(User::getAge, 1).orderByAsc(User::getAge));
        assertThat(result.getTotal()).isGreaterThan(3);
        assertThat(result.getRecords().size()).isEqualTo(3);
    }

}
