package tes;

import groovy.util.logging.Log4j
import org.junit.Test

@Log4j
class Testt {

	@Test
	void test() {
		log.info "hola"


		def list=['pro','test']

		if (list.contains('pro'))
			print "si"
	}
}







