package com.example.sp1007.dao;

import com.example.sp1007.dto.SimpleBbsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SimpleDbsDao implements ISimpleBbsDao {

    @Autowired
    JdbcTemplate template;


    @Override
    public List<SimpleBbsDto> listDao() {
        System.out.println("listDao()");

        String query = "select * from simple_bbs order by id desc";
        List<SimpleBbsDto> dtos = template.query(
                query, new BeanPropertyRowMapper<>(SimpleBbsDto.class));

        return dtos;
    }

    @Override
    public SimpleBbsDto viewDao(String id) {
        System.out.println("viewDao()");

        String query = "select * from simple_bbs where id = " + id;
        SimpleBbsDto dto = template.queryForObject(
                query, new BeanPropertyRowMapper<>(SimpleBbsDto.class));

        return dto;
    }


    @Override
    public int writeDao(String writer, String title, String content) {
        System.out.println("writeDao()");

        String query = "insert into simple_bbs (writer, title, content) values (?, ?, ?)";
        return template.update(query, writer, title, content);
    }

    @Override
    public int deleteDao(String id) {
        System.out.println("deleteDao()");

        String query = "delete from simple_bbs where id = ?";
        return template.update(query, Integer.parseInt(id));
    }

    @Override
    public int updateDao(String writer, String title, String content, String id) {
        System.out.println("updateDao()");

        String query = "update simple_bbs set writer = ?, title = ?, content = ? where id = ?";
        return template.update(query, writer, title, content, Integer.parseInt(id));
    }

}
