package com.andile.bookapi.config;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;



/**
 * IDs are not returned by RestRepository by default. I like them exposed so that the client can easily find
 * the ID of created and listed resources.
 * */
@Configuration
public class RestRepositoryConfigurator implements RepositoryRestConfigurer{
	@Autowired
	private  EntityManager entityManager;
	
	
	@Override
	  public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
	    config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream()
	    		.map(Type::getJavaType)
	    		.toArray(Class[]::new)
	    		);
	  }
}
