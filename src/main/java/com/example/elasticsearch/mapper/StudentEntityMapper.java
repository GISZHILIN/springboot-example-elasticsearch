package com.example.elasticsearch.mapper;


import com.example.elasticsearch.entity.StudentEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentEntityMapper {


    List<StudentEntity> selectList();

    /**
     * 新增数据
     * @param studentList
     */
    void insertList(@Param("list") List<StudentEntityMapper> studentList);

    void insert(StudentEntityMapper student);
}
