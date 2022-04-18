package com.yedam.exam.serviceImpl;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.exam.ResultVO;
import com.yedam.exam.service.Orders;
import com.yedam.exam.service.OrdersDAO;
import com.yedam.exam.service.OrdersService;
@Service
public class OrdersServiceImpl implements OrdersService{

	@Autowired	OrdersDAO dao;
	
	@Override
	public ResultVO insertOrders(List<Orders> list) {
		//테이블입력	
		
		ResultVO result = new ResultVO();
		List<String> errList = new ArrayList<String>();
		for(Orders vo : list) {
			if(vo.getOrd_price()>1000) {
				errList.add(vo.getCustomer());
			} else {
				dao.insertOrders(vo);	
			}
		}
		result.setTotal(list.size());
		result.setSuccess(list.size()-errList.size());
		result.setErrList(errList);
		
		return result;
		
	}

}
