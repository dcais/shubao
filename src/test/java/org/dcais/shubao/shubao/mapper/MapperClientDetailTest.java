package org.dcais.shubao.shubao.mapper;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.dcais.shubao.shubao.entity.ClientDetail;
import org.dcais.shubao.shubao.entity.User;
import org.dcais.shubao.shubao.mapper.ClientDetailMapper;
import org.dcais.shubao.shubao.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@ActiveProfiles("dev")
@SpringBootTest
public class MapperClientDetailTest {

    @Resource
    private ClientDetailMapper clientDetailMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<ClientDetail> userList = clientDetailMapper.selectList(null);
        Assert.assertEquals(1, userList.size());
        userList.forEach(System.out::println);
    }

}