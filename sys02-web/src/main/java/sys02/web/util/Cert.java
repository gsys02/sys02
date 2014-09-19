package sys02.web.util;

public class Cert {

	public Cert() {
		String keystorePath = "/home/gnu/UNAM/cert/keystore.jks";
		System.setProperty("javax.net.ssl.trustStore", keystorePath);
	}

}
