package com.koala.wms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class WmsApplication {
	public static void main(String[] args) {
		SpringApplication.run(WmsApplication.class, args);
	}

}
