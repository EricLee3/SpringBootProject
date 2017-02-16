package com.example;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ExampleDAO {
	@Select("SELECT NOW()")
	String getCurrentDateTime();
}


