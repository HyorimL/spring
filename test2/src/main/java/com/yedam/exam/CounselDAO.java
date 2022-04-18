package com.yedam.exam;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CounselDAO {
	
	@Autowired private SqlSessionTemplate mybatis;
	
	public int insertCounsel(Counsel c) {
		return mybatis.insert("CounselDAO.insert", c);
	}
}
