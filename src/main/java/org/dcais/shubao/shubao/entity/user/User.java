package org.dcais.shubao.shubao.entity.user;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.dcais.shubao.shubao.entity.BaseEntity;

/**
 * <p>
 * 
 * </p>
 *
 * @author david-cai
 * @since 2020-05-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("shubao_user")
public class User extends BaseEntity {


    /**
     * 姓名
     */
    private String name;

    private String password;

    /**
     * 邮箱
     */
    private String email;


}
