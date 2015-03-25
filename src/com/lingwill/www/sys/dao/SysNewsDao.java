/**
 * Copyright 2014 零志愿工作室 (http://www.0will.com). All rights reserved.
 * File Name: BaseEntity.java
 * Author: chenlong
 * Encoding UTF-8
 * Version: 1.0
 * Date: 2014年12月4日
 * History:	
 */
package com.lingwill.www.sys.dao;


import java.util.List;

import com.lingwill.www.base.dao.BaseDao;
import com.lingwill.www.sys.entity.SysNews;


/**
 * @author chenlong（chenlongwill@163.com）
 * @version Revision: 1.0.0 Date: 2014年12月4日
 */
public interface SysNewsDao extends BaseDao<SysNews, Long>{
	/** 通过分类类别搜索新闻*/
	List<SysNews> query(SysNews news);
}
