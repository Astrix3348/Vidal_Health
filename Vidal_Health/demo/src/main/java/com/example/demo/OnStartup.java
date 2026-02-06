package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class OnStartup {

	public String webhook_url = "https://bfhldevapigw.healthrx.co.in/hiring/testWebhook/JAVA";

	RestTemplate restTemplate = new RestTemplate();

	String finalQuery = "SELECT E.FIRST_NAME, E.LAST_NAME, TIMESTAMPDIFF(CURDATE(), DOB) FROM EMPLOYEE E JOIN \n"
			+ "PAYMENTS P ON E.EMP_ID = P.EMP_ID WHERE P.AMOUNT > 70000\n"
			+ "GROUP BY E.DEPARTMENT;";

}
