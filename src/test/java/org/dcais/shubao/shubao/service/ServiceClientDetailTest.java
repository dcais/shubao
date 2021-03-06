package org.dcais.shubao.shubao.service;

import org.dcais.shubao.shubao.entity.client.ClientDetail;
import org.dcais.shubao.shubao.service.client.IClientDetailService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@ActiveProfiles("dev")
@SpringBootTest
public class ServiceClientDetailTest {
    @Autowired
    private IClientDetailService iClientDetailService;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<ClientDetail> userList = iClientDetailService.list();
        Assert.assertEquals(1, userList.size());
        userList.forEach(System.out::println);
    }

}
