package hello.core.beanfind;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import hello.core.AppConfig;

public class ApplicationContextInfoTest {

	AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
	
	@Test
	@DisplayName("모든 빈 출력")
	void findAllBean () {
		String [] beanDefinitionNames = ac.getBeanDefinitionNames();
		
		for(String beanDefinitionName : beanDefinitionNames) {
			Object bean = ac.getBean(beanDefinitionName);
			System.out.println("name : " + beanDefinitionName + "Object" + bean);
		}
	}

	@Test
	@DisplayName("애플리케이션 빈 출력")
	void findAllApplicationBean () {
		String [] beanDefinitionNames = ac.getBeanDefinitionNames();
		
		for(String beanDefinitionName : beanDefinitionNames) {
			BeanDefinition beanDefinition =  ac.getBeanDefinition(beanDefinitionName);
			
			if(beanDefinition.getRole() == beanDefinition.ROLE_APPLICATION) {
				Object bean = ac.getBean(beanDefinitionName);
				System.out.println("name : " + beanDefinitionName + "Object" + bean);
			}
		}
	}
}
