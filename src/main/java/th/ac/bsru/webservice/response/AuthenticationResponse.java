package th.ac.bsru.webservice.response;

public class AuthenticationResponse {

	private String jwttoken;

	public AuthenticationResponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public String getToken() {
		return this.jwttoken;
	}
}
