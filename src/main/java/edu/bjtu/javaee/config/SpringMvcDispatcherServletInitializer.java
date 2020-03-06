/**   
 * Copyright © 2020 LiaoJiang.
 * 
 * @Package: edu.bjtu.javaee.config 
 * @author: 小江   
 * @date: 2020年3月4日 上午8:45:52 
 */
package edu.bjtu.javaee.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/** 
 * @ClassName: SpringMvcDispatcherServletInitializer 
 * @Description: TODO 
 */
public class SpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] { MVCConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] { "/" };
	}

}
