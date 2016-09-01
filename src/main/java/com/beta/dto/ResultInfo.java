package com.beta.dto;

/**
 * 前后台交互对象
 * @author beta
 *
 */
public class ResultInfo {
	private String code;
	private String msg;
	
	public ResultInfo(){};
	public ResultInfo(String code,String msg){
		this.code = code;
		this.msg = msg;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
