/**
 * Copyright 2014 赛印信息技术有限公司 (http://www.sein-china.com). All rights reserved.
 * File Name: SysLogService.java
 * Author: caichangshan
 * Encoding UTF-8
 * Version: 1.0
 * Date: 11:47:53 AM
 * History:	
 */
package com.lingwill.www.sys.service;

import com.lingwill.www.base.service.BaseService;
import com.lingwill.www.sys.entity.SysLog;
import com.lingwill.www.sys.entity.SysUser;

/**
 * @author chenlong（chenlongwill@163.com）
 * @version Revision: 1.0.0 Date: 2014年12月4日
 */
public interface SysLogService extends BaseService<SysLog, Long> {

	/**
	 * 写日志
	 * @param level
	 * @param op
	 * @param info
	 */
	public void write(String level, SysUser op, String info);
}
