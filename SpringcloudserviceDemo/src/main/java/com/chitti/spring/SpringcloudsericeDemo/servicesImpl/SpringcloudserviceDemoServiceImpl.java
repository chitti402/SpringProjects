package com.chitti.spring.SpringcloudsericeDemo.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.chitti.spring.SpringcloudsericeDemo.DAO.SpringcloudServiceDemoDAO;
import com.chitti.spring.SpringcloudsericeDemo.DTO.QuatwtAnswer;
import com.chitti.spring.SpringcloudsericeDemo.services.SPringcloudserviceDemoService;

public class SpringcloudserviceDemoServiceImpl implements SPringcloudserviceDemoService{

	
	@Autowired
	SpringcloudServiceDemoDAO serviceDao;
	
	@Override
	public String getDetails(QuatwtAnswer quatwtanswer) {
	
		
		return serviceDao.getDetailsDao(quatwtanswer);
	}

}
