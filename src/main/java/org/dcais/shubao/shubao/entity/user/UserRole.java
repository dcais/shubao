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
@TableName("shubao_user_role")
public class UserRole extends BaseEntity {


    private Integer userId;

    private Integer roleId;


}
