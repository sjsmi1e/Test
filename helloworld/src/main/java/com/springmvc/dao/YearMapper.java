package com.springmvc.dao;

import com.springmvc.entity.Year;
import org.springframework.stereotype.Repository;

@Repository
public interface YearMapper {
    int insert(Year record);

    int insertSelective(Year record);


}