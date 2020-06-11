package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

//@Data自动帮我们重写了set get toString equals hashcode
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true) //支持链式编程
public class Student implements Serializable {

    private Integer sid;
    private String name;
    private String password;
}
