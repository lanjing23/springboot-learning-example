package com.liusx.springboot.demo.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class Car implements Serializable {

    private static final long serialVersionUID = 3299504693439576716L;

    @Id
    private Integer id;

    private String cphm;

    private String hpzl;
}
