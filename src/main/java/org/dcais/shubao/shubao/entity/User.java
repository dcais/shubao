package org.dcais.shubao.shubao.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.util.Date;

@Data
public class User extends BaseEntity{
    private String name;
    private Integer age;
    private String email;
}