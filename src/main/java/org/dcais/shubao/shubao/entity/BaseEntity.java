package org.dcais.shubao.shubao.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public abstract class BaseEntity extends IdEntity implements Serializable {
    @TableLogic
    protected String isDeleted;

    @TableField(fill = FieldFill.INSERT)
    protected LocalDateTime gmtCreate;
    @TableField(fill = FieldFill.INSERT)
    protected Long creator;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    protected LocalDateTime gmtModified;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    protected Long modifier;
}
