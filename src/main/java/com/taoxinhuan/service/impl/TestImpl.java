package com.taoxinhuan.service.impl;

import java.util.Date;

import com.alibaba.dubbo.config.annotation.Service;
import com.taoxinhuan.service.Test;

@Service
public class TestImpl implements Test {

	@Override
	public Date getDate() {
		// TODO Auto-generated method stub
		return new Date();
	}

}
