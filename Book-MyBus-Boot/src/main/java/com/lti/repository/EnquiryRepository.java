package com.lti.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.lti.entity.Bus;

public interface EnquiryRepository  {
	
	public List<Bus> busEnquiry(String source , String destination , LocalDateTime startDateTime);
	//public Object[] busEnquiry(String source , String destination);

}
