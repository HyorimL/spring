package com.yedam.exam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CounselServiceImpl implements CounselService {

	@Autowired CounselDAO dao;
	
	@Override
	public int insertCounsel(List<Counsel> list) {
		for(Counsel vo : list) {
		
			dao.insertCounsel(vo);
		}
		return 1;
	}

}
