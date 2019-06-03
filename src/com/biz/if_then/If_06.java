package com.biz.if_then;

public class If_06 {

	public static void main(String[] args) {

		int i=100;
		int index =2;
		for(index=2;index<i;index++) {
			if(i%index==0) {
				//System.out.println(i+"는 소수가 아님");
				break;
			}
		}
		if(index>=i) {
			System.out.println(index+"는 소수입니다");
		}else {
			System.out.println(i+"는 소수가 아님");
		}
	}

}
