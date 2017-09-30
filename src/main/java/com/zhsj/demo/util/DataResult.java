package com.zhsj.demo.util;

public class DataResult {

	private int code;
	private String msg;
	private Object data;
	
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
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	public DataResult(int code, String msg, Object data){
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	
	public static DataResult build(int code, String msg, Object data){
		DataResult dataResult = new DataResult(code, msg, data);
		return dataResult;
	}
	
	public static DataResult defaultError(Object data){
		DataResult dataResult = build(0, "error", data);
		return dataResult;
	}
	
	public static DataResult defaultSuccess(Object data){
		DataResult dataResult = build(1, "success", data);
		return dataResult;
	}
}
