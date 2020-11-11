package com.example.demoo.mapper;


import com.example.demoo.enter.userEnter;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface userMapper {

    userEnter userSelective();
}