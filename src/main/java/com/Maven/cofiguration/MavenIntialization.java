package com.Maven.cofiguration;

import javax.servlet.ServletContext;

public class MavenIntialization {//implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) {//throws ServletException {
		// TODO Auto-generated method stub

		/*
		 * AnnotationConfigWebApplicationContext applicatioinContext = new
		 * AnnotationConfigWebApplicationContext();
		 * applicatioinContext.register(MavenConfiguration.class);
		 * 
		 * DispatcherServlet MyDispatcherServlet = new
		 * DispatcherServlet(applicatioinContext);
		 * 
		 * ServletRegistration.Dynamic MyCustomDispatcherServlet =
		 * servletContext.addServlet("MyOwnServlet", MyDispatcherServlet);
		 * MyCustomDispatcherServlet.addMapping("/");
		 * MyCustomDispatcherServlet.setLoadOnStartup(1);
		 */
	}

}
