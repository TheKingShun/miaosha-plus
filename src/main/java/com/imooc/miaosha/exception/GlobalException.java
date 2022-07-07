package com.imooc.miaosha.exception;

import com.imooc.miaosha.result.CodeMsg;

/**
 * 全局的业务异常
 */
public class GlobalException extends RuntimeException{


	private static final long serialVersionUID = 7651791201630108205L;

	private CodeMsg cm;
	
	public GlobalException(CodeMsg cm) {
		super(cm.toString());
		this.cm = cm;
	}

	public CodeMsg getCm() {
		return cm;
	}

}
