package com.test.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsApplication {
    public static void main(String[] args) {
      SpringApplication.run(DevopsApplication.class, args);
    }
    @GetMapping("/")
    public String hello() {
      return String.format("<h1>Hello this is my first spring boot project<h1>");
    }
    @GetMapping("/hello")
    public String helloWorld() {
      return String.format("<h1>Hello this is my first spring boot project and branch b1 code is here<h1>");
    }
}












//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class DevopsApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(DevopsApplication.class, args);
//	}
//
//}
