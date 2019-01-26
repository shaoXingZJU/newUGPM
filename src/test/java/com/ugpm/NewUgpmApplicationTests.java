package com.ugpm;

import com.ugpm.configuration.TestConfig;
import com.ugpm.domain.SpringIOCTest;
import com.ugpm.domain.TestBean;
import com.ugpm.pojo.Cart;
import com.ugpm.service.CartService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewUgpmApplicationTests {
	ApplicationContext context=new AnnotationConfigApplicationContext(TestConfig.class);
	@Test
	public void contextLoads() {
		testImport(context);
		Object cartFactoryBean = context.getBean("cartFactoryBean");
		Object cartFactoryBean1 = context.getBean("cartFactoryBean");
		System.out.println(cartFactoryBean.getClass());
		System.out.println(cartFactoryBean==cartFactoryBean1);
		Object bean = context.getBean("&cartFactoryBean");
		System.out.println(bean.getClass());
	}
	private static void testImport(ApplicationContext applicationContext){
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
	}

	@Test
	public void testValue(){
		Environment environment = context.getEnvironment();
		String myTest = environment.getProperty("myTest");
		System.out.println(myTest+"================");
	}

	@Autowired
	private TestBean testBean;
	@Test
	public void testAutowired(){
		System.out.println(testBean);
		System.out.println("获取的IOC容器:"+context);
	}


	@Autowired
	private SpringIOCTest springIOCTest;
	@Test
	public void testSpringIOCTest(){
		springIOCTest.test();

	}

	@Autowired
	public CartService cartService;
	@Test
	public void testInsert(){
		Cart cart=new Cart();
		cart.setId(4);
		cart.setUserId(119);
		cart.setProductId(120);
		cartService.insert(cart);
	}
}

