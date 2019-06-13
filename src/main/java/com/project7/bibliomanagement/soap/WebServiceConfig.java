package com.project7.bibliomanagement.soap;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

//Enable Spring Web Services
@EnableWs
//Spring Configuration File
@Configuration
public class WebServiceConfig {

	//MessageDispatcherServlet
		//ApplicationContext
		//url -> /ws/*
	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext context) {
		MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
		messageDispatcherServlet.setApplicationContext(context);
		messageDispatcherServlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<MessageDispatcherServlet>(messageDispatcherServlet, "/ws/*");
	}
	
	// /ws/biblio.wsdl
	// biblio-management.xsd
	@Bean(name = "biblio")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema biblioSchema) {
		DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
		//PortType - BiblioPort
		definition.setPortTypeName("BiblioPort");
		//Namespace - http://webservices.soap.project7.com/biblio
		definition.setTargetNamespace("http://webservices.soap.project7.com/biblio");
		//URI - /ws
		definition.setLocationUri("/ws");
		//Schema - biblioSchema
		definition.setSchema(biblioSchema);
		return definition;
	}
	
	@Bean
	public XsdSchema biblioSchema() {
		return new SimpleXsdSchema(new ClassPathResource("biblio-management.xsd"));
	}
	
}
