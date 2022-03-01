package com.example.demo;

import com.example.demo.properties.MyProperty;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

//@EnableConfigServer
@RequiredArgsConstructor	// 자동 생성 Autowirte 하게됨.
@SpringBootApplication (
	//exclude = WebMvcAutoConfiguration.class
		// scanBasePackages = "com.example.demo"
		//exclude = {WebMvcAutoConfiguration.class}
)
public class DemoApplication {

	private final MyProperty myProperty;

	//private final Integer height;

	private final Environment environment;
	private final ApplicationContext applicationContext;

//	public DemoApplication(@Value("${my.height}") Integer height
//				,Environment env
//				,ApplicationContext ctx
//				,MyProperty p
//	){
//		this.height = height;
//		this.environment = env;
//		this.applicationContext = ctx;
//		this.myProperty = p;
//	}


	public static void main(String[] args) {
		//
		SpringApplication app = new SpringApplication(DemoApplication.class);
		//app.setBannerMode(Banner.Mode.OFF); // banner off

		//DemoApplication myApp = new DemoApplication();

		app.run(args);

		//myApp.adb();


	}

	//
	private void adb() {
		System.out.println("0001{value}" + 1000);
	}

	@PostConstruct
	public void init(){
		System.out.println("0002{value}" + 20000);
		System.out.println("[environment]" + environment);
		System.out.println("[applicationContext]" + applicationContext);
		System.out.println("@@@@[myProperty]" + myProperty.getHeight());
	}

//	@ConfigurationProperties("my")
//	@Bean
//	public MyProperty myProperty{
//		return new MyProperty();
//	}


}
