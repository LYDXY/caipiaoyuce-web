package com.system;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 
 * @author 林尧
 *
 *2015年12月12日
 *
 * 获取 applicationContext 对象
 */
public class GetApplicationContext implements ApplicationContextAware {

	private static ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext contex)
			throws BeansException {
		applicationContext = contex;
	}

	public static ApplicationContext getContext() {
		if(applicationContext==null){
			applicationContext = new ClassPathXmlApplicationContext(
                    "classpath:applicationContext.xml");
		}
		return applicationContext;
	}

}
