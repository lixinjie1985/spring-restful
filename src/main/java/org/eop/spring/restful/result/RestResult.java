package org.eop.spring.restful.result;

/**
 * @author lixinjie
 * @since 2017-08-26
 */
public class RestResult<T> {

	private String resultCode;
	private String resultDesc;
	private T data;
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultDesc() {
		return resultDesc;
	}
	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}
