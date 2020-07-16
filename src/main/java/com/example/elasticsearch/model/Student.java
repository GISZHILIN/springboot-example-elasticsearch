package com.example.elasticsearch.model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Accessors(chain = true)
@Document(indexName = "student", type = "school")
public class Student {

    private static final long serialVersionUID = 1l;

    @Id
    private String id;

    private String name;

    private String gender;

    private Integer age;

//    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private Date createTime;
}
