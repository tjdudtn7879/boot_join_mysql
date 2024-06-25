package com.boot.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.boot.dto.EmpDeptDTO;


//실행시 매퍼파일을 읽어 들이도록 지정 (mybatis.mappers)
@Mapper
public interface EmpDeptDAO {
	public ArrayList<EmpDeptDTO> list();
}