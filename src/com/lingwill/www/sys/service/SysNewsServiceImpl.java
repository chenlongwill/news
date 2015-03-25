/**
 * Copyright 2015 零志愿工作室 (http://www.0will.com). All rights reserved.
 * File Name: SysNewsServiceImpl.java
 * Author: chenlong
 * Encoding UTF-8
 * Version: 1.0
 * Date: 2015年3月9日
 * History:	
 */
package com.lingwill.www.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lingwill.www.base.dao.BaseDao;
import com.lingwill.www.base.entity.QueryParam;
import com.lingwill.www.base.service.BaseServiceImpl;
import com.lingwill.www.sys.dao.SysNewsDao;
import com.lingwill.www.sys.entity.SysNews;

/**
 * @author chenlong（chenlongwill@163.com）
 * @version Revision: 1.0.0 Date: 2015年3月9日
 */
@Service("SysNewsService")
public class SysNewsServiceImpl extends BaseServiceImpl<SysNews, Long> implements SysNewsService {

	@Autowired
	private SysNewsDao dao;
	/* (non-Javadoc)
	 * @see com.lingwill.www.sys.service.SysNewsService#query(com.lingwill.www.base.entity.QueryParam, java.lang.Long)
	 */
	@Override
	public BaseDao<SysNews, Long> getDao() {
		// TODO Auto-generated method stub
		return dao;
	}
	/* (non-Javadoc)
	 * @see com.lingwill.www.base.service.BaseServiceImpl#query(com.lingwill.www.base.entity.QueryParam)
	 */
	@Override
	public List<SysNews> query(QueryParam param) {
		// TODO Auto-generated method stub
		return dao.query(param);
	}
	

}
