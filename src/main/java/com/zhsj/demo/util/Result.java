package com.zhsj.demo.util;

public class Result {

	private int code;
	private String msg;
	
	public Result(int code, String msg){
		this.code = code;
		this.msg = msg;
	}
	
	public static Result defaultError(){
		Result result = build(0, "error");
		return result;
	}
	
	public static Result defaultSuccess(){
		Result result = build(1, "success");
		return result;
	}
	
	public static Result build(int code, String msg){
		Result result = new Result(code, msg);
		return result;
	}


	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	
	
}
