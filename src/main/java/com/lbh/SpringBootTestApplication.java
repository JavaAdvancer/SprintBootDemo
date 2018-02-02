package com.lbh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootTestApplication {

    @Value("${book1.name}")
    private String name;
    @Value("${book1.author}")
    private String author;
    @Value("${book1.pinyin}")
    private String pinyin;

    @RequestMapping("/")
    public String hello(){
        return "Hello World..《 "+name+" 》"+author+" --> "+pinyin;
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestApplication.class, args);
       /* SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringBootTestApplication.class);
        //修改banner的模式为off
        builder.bannerMode(Banner.Mode.OFF).run(args);*/
		System.out.println("==============Spring Boot Start===============");
	}
}
