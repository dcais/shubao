package org.dcais.shubao.shubao.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

@Data
public abstract class IdEntity implements Serializable {
    @TableId
    protected Long id;
}
