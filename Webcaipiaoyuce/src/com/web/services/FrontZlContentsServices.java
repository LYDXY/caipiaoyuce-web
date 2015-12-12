package com.web.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageInfo;
import com.system.pojo.Contents;
import com.system.pojo.ZlContents;

@Transactional
public interface FrontZlContentsServices {

    
	public List<ZlContents> queryTopZlContentsList(ZlContents zlContents);
	
	public List<ZlContents> queryZlContentsList(ZlContents zlContents);
    
    public ZlContents queryZlContentsByBean(int theID);

	public PageInfo<ZlContents> queryContentsByIds(ZlContents zlContents,
			Integer pageNum, Integer pageSize);

	List<ZlContents> queryContentsByIds(ZlContents contents);

	
}
