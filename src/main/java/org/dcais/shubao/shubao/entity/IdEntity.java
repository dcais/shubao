package org.dcais.shubao.shubao.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public abstract class IdEntity implements Serializable {
    protected Long id;
}
