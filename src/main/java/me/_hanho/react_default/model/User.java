package me._hanho.react_default.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	private String user_id;
	private String user_pwd;
	private String user_name;
	private String email;
	private String user_nickName;
	private Date enroll_date;
	
	public User() {}
	
	public User(String user_id, String user_pwd, String user_name, String email, String user_nickName) {
		super();
		this.user_id = user_id;
		this.user_pwd = user_pwd;
		this.user_name = user_name;
		this.email = email;
		this.user_nickName = user_nickName;
	}
	public User(String user_id, String user_pwd, String user_name, String email, String user_nickName,
			Date enroll_date) {
		super();
		this.user_id = user_id;
		this.user_pwd = user_pwd;
		this.user_name = user_name;
		this.email = email;
		this.user_nickName = user_nickName;
		this.enroll_date = enroll_date;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUser_nickName() {
		return user_nickName;
	}
	public void setUser_nickName(String user_nickName) {
		this.user_nickName = user_nickName;
	}
	public Date getEnroll_date() {
		return enroll_date;
	}
	public void setEnroll_date(Date enroll_date) {
		this.enroll_date = enroll_date;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_pwd=" + user_pwd + ", user_name=" + user_name + ", email=" + email
				+ ", user_nickName=" + user_nickName + ", enroll_date=" + enroll_date + "]";
	}
	
}
