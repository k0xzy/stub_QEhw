package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoApplicationTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testOkEndpoint() {
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:" + port + "/ok", String.class);

		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals("OK!", response.getBody());
	}

	@Test
	public void testProcessEndpoint() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		MyRequest request = new MyRequest();
		request.setData("Test Data");

		HttpEntity<MyRequest> entity = new HttpEntity<>(request, headers);

		ResponseEntity<MyResponse> responseEntity = restTemplate.postForEntity("http://localhost:" + port + "/process", entity, MyResponse.class);

		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());

		MyResponse response = responseEntity.getBody();
		assertEquals("Test Data", response.getResponseData());
	}
}