package com.sinc.hfsf.fcm.ctrl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PushAlarmController {
	
	@RequestMapping(value="/pushAlarm.do", method=RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public void pushAll() throws Exception{
		//String token = tokenList.get(count).getDEVICE_ID();
        
        final String apiKey = "AAAA8VyI-xA:APA91bEAQs4qKS95pkCB1i6UU0C9Atw466V--UX371nqdPmZJK6tcooN4fhQMqajtYy2xElD_94hmBbkZnqsKjUYgvn4j9OU0tkYmc7lxB6AB2tjr_5EHs9ZQTZ1XX1mybAvf2diI6KZ";
        URL url = new URL("https://fcm.googleapis.com/fcm/send");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("Authorization", "key=" + apiKey);

        conn.setDoOutput(true);
        
        //String userId =(String) request.getSession().getAttribute("ssUserId");

        // 이렇게 보내면 주제를 starfield로 지정해놓은 모든 사람들한테 알림을 날려준다.
        String input = "{\"data\" : {\"title\" : \"Hands-Free In STARFIELD!\", \"content\" : \"장바구니의 상품 목록이 모두 결제되었습니다. 픽업대를 확인해 주세요.\", \"clickAction\" : \"ResultActivity\"}, \"to\":\"/topics/starfield\"}";
        
        // 이걸로 보내면 특정 토큰을 가지고있는 어플에만 알림을 날려준다
        //String input = "{\"notification\" : {\"title\" : \" 여기다 제목넣기 \", \"body\" : \"여기다 내용 넣기\"}, \"to\":\" 여기가 받을 사람 토큰  \"}";

        OutputStream os = conn.getOutputStream();
        
        // 서버에서 날려서 한글 깨지는 사람은 아래처럼  UTF-8로 인코딩해서 날려주자
        os.write(input.getBytes("UTF-8"));
        os.flush();
        os.close();

        int responseCode = conn.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + input);
        System.out.println("Response Code : " + responseCode);
        
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        // print result
        System.out.println(response.toString());
	}
	
	@RequestMapping(value="/pushAlarmEach.do", method=RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public void pushEach(String token) throws Exception{
		//String token = tokenList.get(count).getDEVICE_ID();
        System.out.println("User Token : " + token);
		
        final String apiKey = "AAAA8VyI-xA:APA91bEAQs4qKS95pkCB1i6UU0C9Atw466V--UX371nqdPmZJK6tcooN4fhQMqajtYy2xElD_94hmBbkZnqsKjUYgvn4j9OU0tkYmc7lxB6AB2tjr_5EHs9ZQTZ1XX1mybAvf2diI6KZ";
        URL url = new URL("https://fcm.googleapis.com/fcm/send");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("Authorization", "key=" + apiKey);

        conn.setDoOutput(true);
        
        //String userId =(String) request.getSession().getAttribute("ssUserId");

        // 이렇게 보내면 주제를 starfield로 지정해놓은 모든 사람들한테 알림을 날려준다.
        //String input = "{\"data\" : {\"title\" : \"Hands-Free In STARFIELD!\", \"content\" : \"장바구니의 상품 목록이 모두 결제되었습니다. 픽업대를 확인해 주세요.\", \"clickAction\" : \"ResultActivity\"}, \"to\":\"/topics/starfield\"}";
        
        // 이걸로 보내면 특정 토큰을 가지고있는 어플에만 알림을 날려준다
        String input = "{\"data\" : {\"title\" : \"Hands-Free In STARFIELD!\", \"content\" : \"장바구니의 상품 목록이 모두 결제되었습니다. 픽업대를 확인해 주세요.\", \"clickAction\" : \"ResultActivity\"}, \"to\":\"" + token + "\"}";

        OutputStream os = conn.getOutputStream();
        
        // 서버에서 날려서 한글 깨지는 사람은 아래처럼  UTF-8로 인코딩해서 날려주자
        os.write(input.getBytes("UTF-8"));
        os.flush();
        os.close();

        int responseCode = conn.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + input);
        System.out.println("Response Code : " + responseCode);
        
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        // print result
        System.out.println(response.toString());
	}
}
