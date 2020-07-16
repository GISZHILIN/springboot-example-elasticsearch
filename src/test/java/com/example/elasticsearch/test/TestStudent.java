package com.example.elasticsearch.test;

import com.example.elasticsearch.ElasticSearchApplication;
import com.example.elasticsearch.entity.StudentEntity;
import com.example.elasticsearch.mapper.StudentEntityMapper;
import com.example.elasticsearch.model.Student;
import com.example.elasticsearch.repository.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ElasticSearchApplication.class)
public class TestStudent {

    @Autowired
    private StudentEntityMapper studentEntityMapper;

    @Autowired
    private StudentRepository studentRepository;


//    @Test
//    public void testAddData(){
//        //查询所有的学生，加入到es
//        List<Student> esList = new ArrayList<>();
//        List<StudentEntity> dataList = studentEntityMapper.selectList();
//        if(!CollectionUtils.isEmpty(dataList)){
//            for (StudentEntity source : dataList) {
//                esList.add(new Student().setName(source.getName()).setAge(source.getAge()).setGender(source.getGender()));
//            }
//        }
//        if(!CollectionUtils.isEmpty(esList)){
//            studentRepository.saveAll(esList);
//        }
//    }
}
