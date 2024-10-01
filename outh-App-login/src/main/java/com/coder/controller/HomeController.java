package com.coder.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HomeController {
	
	@GetMapping("/")
	public ResponseEntity<?> homPage(){
		
		return new ResponseEntity<>("I'm A Java Developer",HttpStatus.OK);
	}
	@GetMapping("/abc")
	
	public ResponseEntity<?> homPage1(){
		
		return new ResponseEntity<>("I'm A Java Developer",HttpStatus.OK);
	}

}
