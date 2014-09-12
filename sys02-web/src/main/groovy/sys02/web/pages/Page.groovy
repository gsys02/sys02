package sys02.web.pages;

import org.slf4j.Logger
import org.springframework.stereotype.Service

import util.*


@Service
class Page {

	
	private Logger log = Util.getLog(this)

	static int a=20;
	String msg="s"

	def ya(){
		a++
		msg="hola mundo ${a}"
		log.info(msg)
	}
}
