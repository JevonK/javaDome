package com.example.demo.service;

import com.example.demo.dao.SchoolDao;
import com.example.demo.entity.School;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SchoolService {

    @Resource
    private SchoolDao schoolDao;

    public List<School> getSchoolList(){

        return schoolDao.getList();
    }
}
