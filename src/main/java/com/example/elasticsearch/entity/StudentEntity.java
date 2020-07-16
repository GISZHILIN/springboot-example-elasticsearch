package com.example.elasticsearch.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class StudentEntity implements Serializable {

    private static final long serialVersionUID = 9203220928139208000L;

    private Long id;

    private String name;

    private String gender;

    private Integer age;
}
