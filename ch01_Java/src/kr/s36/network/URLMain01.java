package kr.s36.network;

import java.net.URL;
import java.net.MalformedURLException;


public class URLMain01 {
	public static void main(String[] args) {
		
		try {
		URL url = new URL(
				"http://java.sun.com:8080/member/index.jsp?name=sung#content");
		//프로토콜 : 클라이언트와 서버간의 통신 규약
		System.out.println("protocol : "+url.getProtocol());
		System.out.println("host : "+url.getHost());
		System.out.println("port : "+url.getPort());
		System.out.println("default port : "+url.getDefaultPort());
		System.out.println("path : "+url.getPath());
		System.out.println("query : "+url.getQuery());
		System.out.println("reference : "+url.getRef());
		
	}catch(MalformedURLException e) {
		e.printStackTrace();
	}
	}
}
