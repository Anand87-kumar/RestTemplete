package com.anand.resttemplete;



import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestTemplateProvider {

	RestTemplate rest = new RestTemplate();

	public UserData getUserData()
	{
		return rest.getForObject(
			"http://localhost:8080/RestApi/getData",
			UserData.class);
	}

	
	public ResponseEntity<UserData> post(UserData user)
	{
		return rest.postForEntity(
			"http://localhost:8080/RestApi", user,
			UserData.class, "");
	}
}

