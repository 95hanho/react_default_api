package me._hanho.react_default.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
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
import me._hanho.react_default.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService uService;

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
	public ResponseEntity<Map<String, Object>> idDuplCheck(@PathVariable("id") String id) {
//		Boolean result = true;
		Map<String, Object> result = new HashMap<String, Object>();
		
		int count = uService.isUser(id);
		if(count >= 1) {
			result.put("code", "ID_DUPLICATED");
			return new ResponseEntity<>(
					result
					, HttpStatus.BAD_REQUEST);	
		} else {
			result.put("code", "success");
			return new ResponseEntity<>(
					result
					, HttpStatus.OK);	
		}
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
