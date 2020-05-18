package org.dcais.shubao.shubao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class ShubaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShubaoApplication.class, args);
	}

}
