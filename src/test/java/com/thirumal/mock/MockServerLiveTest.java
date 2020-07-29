package com.thirumal.mock;

import static org.mockserver.integration.ClientAndServer.startClientAndServer;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockserver.client.server.MockServerClient;
import org.mockserver.integration.ClientAndServer;


public class MockServerLiveTest {

	private static ClientAndServer mockServer;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 mockServer = startClientAndServer(1080);
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		mockServer.stop();
	}

	/*@Test
	public void test() {
		System.out.println("hi");
		new MockServerClient("localhost", 1080)
	    .when(
	        request()
	            .withMethod("POST")
	            .withPath("/login")
	            .withBody("{username: 'foo', password: 'bar'}")
	    )
	    .respond(
	        response()
	            .withStatusCode(302)
	            .withCookie(
	                "sessionId", "2By8LOhBmaW5nZXJwcmludCIlMDAzMW"
	            )
	            .withHeader(
	                "Location", "https://www.mock-server.com"
	            )
	    );
		System.out.println("before");
		//request
		new MockServerClient("localhost", 1080)
	    .verify(
	        request()
	            .withPath("/login"),
	        VerificationTimes.once()
	    );
	}
*/
	 @Test
	    public void whenPostRequestMockServer_thenServerReceived(){
	        createExpectationForInvalidAuth();
	        System.out.println("hello");
	       // hitTheServerWithPostRequest();
	        System.out.println("hello1");
	        verifyPostRequest();
	}
	 private void createExpectationForInvalidAuth() {
		 System.out.println("hi");
	        new MockServerClient("127.0.0.1", 1080)
	                .when(
	                    request()
	                        .withMethod("POST")
	                        .withPath("/validate")
	                        .withQueryStringParameter("qw", "")
	                        //.withHeader(HttpHeaders.CONTENT_TYPE, "application/json\"")
	                        .withBody("{username: 'foo', password: 'bar'}")//,
	                      //  exactly(1)
	                        
	                )
	                .respond(
	                    response()
	                        .withStatusCode(200)
	                       // .withHeaders(
	                         //   new Header(HttpHeaders.CONTENT_TYPE, "application/json; charset=utf-8"),
	                          //  new Header(HttpHeaders.CACHE_CONTROL, "public, max-age=86400")
	                    //)
	                        .withBody("{ message: 'incorrect username and password combination' }")
	                        //.withDelay(TimeUnit.SECONDS,1)
	                );
	}
	 
	 
	 private org.apache.http.HttpResponse hitTheServerWithPostRequest() {
	        String url = "http://127.0.0.1:1080/validate";
	        HttpClient client = HttpClientBuilder.create().build();
	        HttpPost post = new HttpPost(url);
	        post.setHeader("Content-type", "application/json");
	        org.apache.http.HttpResponse response=null;

	        try {
	            StringEntity stringEntity = new StringEntity("{username: 'foo', password: 'bar'}");
	            post.getRequestLine();
	            post.setEntity(stringEntity);
	            response=client.execute(post);
	            System.out.println(" Response: " + response.toString());
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }
	        return response;
	    }
	 private void verifyPostRequest() {
	        new MockServerClient("localhost", 1080).verify(
	                request()
	                        .withMethod("POST")
	                        .withPath("/validate")
	                        .withBody("{username: 'foo', password: 'bar'}")//,
	               // VerificationTimes.exactly(1)
	        );
	}

}
