/**
 * @author zhangjx
 * @time 2014年8月7日 上午11:51:24
 * @description:
 */
package com.really.exception;

import java.util.HashMap;

/**
 * @author zhangjx
 * @date 2014年8月7日 上午11:51:24
 *
 */
public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = -7491305360412055428L;

	private String code;
	
	private static HashMap<String, String> messages = null;
	
	static {
		messages = new HashMap<String, String>();
		messages.put("998", "服务器异常");
		messages.put("999", "参数不正确");
		messages.put("001", "用户名不能为空");
		messages.put("002", "密码不能为空");
		messages.put("003", "邮箱格式不正确");
		messages.put("004", "用户名已存在");
		messages.put("005", "用户名不存在");
		messages.put("006", "密码错误");
	}
	
	public BusinessException(String code) {
		super();
		this.code = code;
	}
	
	public static String getMessage(String code) {
		return messages.get(code);
	}
	
	public String getCode() {
		return code;
	}
	
	public String getMessage() {
		return messages.get(this.code);
	}
	
	
}
