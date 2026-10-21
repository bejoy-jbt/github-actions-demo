package com.example.CICDDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdDemoApplication {
	@GetMapping("/")
	public String great2() {
		return " Wellcome to my first CICD demo project";
	}
	
	@GetMapping("/{name}")
	public String great3(@PathVariable String name) {
		return " Welcome " + name +" please to wellcome to out page";
	}
	
	
	@GetMapping("/wellcome")
	public String great() {
		return " Hello ! This is from sample CI/CD project";
	}

	public static void main(String[] args) {
		SpringApplication.run(CicdDemoApplication.class, args);
	}
//	echo "# github-actions-demo" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/bejoy-jbt/github-actions-demo.git
//	git push -u origin main
}
