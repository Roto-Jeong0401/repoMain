package cmnMain.Service;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class CmnMainVO {
	
	// 인스턴스 변수
	private int reqParam;
	
	public int getReqParam() {
		
		return reqParam;
	}
	
	public void setReqParam(int reqParam) {
		// this는 인스턴스의 자기자신을 의미한다.
		this.reqParam = reqParam;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	
	
	
}
