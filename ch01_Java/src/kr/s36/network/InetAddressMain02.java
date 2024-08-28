package kr.s36.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain02 {
	public static void main(String[] args) {
		BufferedReader br = null;
		String url;
		InetAddress[] addresses;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("웹사이트 주소 입력 : ");
			url = br.readLine();
			//해당 도메인과 매핑되어있는 모든 주소 정보를 갖는 InetAddress 배열 반환
			
			addresses = InetAddress.getAllByName(url);
			for(int i=0;i<addresses.length;i++) {
				System.out.println("호스트 이름 : "+addresses[i].getHostName()
						+", IP주소"+addresses[i].getHostAddress());
			}
			
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}

}
