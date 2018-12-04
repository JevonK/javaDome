package com.example.demo.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.School;

@Repository
public class SchoolDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public List<School> getList() {
        String sql = "select * from school";
        return  jdbcTemplate.query(sql, new RowMapper<School>() {
            @Override
            public School mapRow(ResultSet resultSet, int i) throws SQLException {
                School school = new School();
                school.setId(resultSet.getInt("ID"));
                school.setYuan_xiao_lei_xing(resultSet.getString("Yuan_xiao_lei_xing"));
                school.setYuan_xiao_ming_cheng(resultSet.getString("yuan_xiao_ming_cheng"));
                school.setYuan_xiao_suo_zai_di(resultSet.getString("yuan_xiao_suo_zai_di"));
                school.setYuan_xiao_li_shu(resultSet.getString("yuan_xiao_li_shu"));
                school.setXue_li_ceng_ci(resultSet.getString("xue_li_ceng_ci"));
                school.setYuan_xiao_te_xing(resultSet.getString("yuan_xiao_te_xing"));
                school.setYan_jiu_sheng_yuan(resultSet.getString("yan_jiu_sheng_yuan"));
                school.setMan_yi_du(resultSet.getString("Man_yi_du"));
                return school;
            }
        });
    }
}
