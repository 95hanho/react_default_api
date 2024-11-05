package me._hanho.react_default.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me._hanho.react_default.model.User;

@RestController
@RequestMapping("/api/user")
public class UserController {

	// 로그인
	@PostMapping("/")
	public ResponseEntity<String> login(@ModelAttribute User user) {
		System.out.println(user);
		
		return new ResponseEntity<>(
				"무슨 문제지??"
			, HttpStatus.OK);	
	}
	// 아이디 중복체크
	@GetMapping("/id/{id}")
	public ResponseEntity<Boolean> idDuplCheck(@PathVariable("id") String id) {
		System.out.println(id);
		
		return new ResponseEntity<>(
				false
				, HttpStatus.OK);	
	}
	// 회원가입
	@PostMapping("/sign-up")
	public ResponseEntity<String> signUp(@ModelAttribute User user) {
		System.out.println(user);
		
		return new ResponseEntity<>(
				"무슨 문제지??"
			, HttpStatus.OK);	
	}
	// 아이디 찾기
	@GetMapping("/id")
	public ResponseEntity<String> findId() {
		return new ResponseEntity<>(
				"무슨 문제지??"
			, HttpStatus.OK);	
	}
	// 비밀번호 찾기
	@PostMapping("/password")
	public ResponseEntity<String> findPwd() {
		return new ResponseEntity<>(
				"무슨 문제지??"
			, HttpStatus.OK);	
	}
	// 비밀번호 변경
	@PutMapping("/password")
	public ResponseEntity<String> changePwd() {
		return new ResponseEntity<>(
				"무슨 문제지??"
			, HttpStatus.OK);	
	}
}
