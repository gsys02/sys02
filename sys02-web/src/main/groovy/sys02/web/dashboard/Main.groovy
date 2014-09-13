package sys02.web.dashboard;

import org.slf4j.Logger
import org.springframework.stereotype.Service

import util.*


@Service
class Main {

	private Logger log = Util.getLog(this)

	static int a=20;
	String msg="s"

	
	def init(){
		log.info('init')
	}

	def ya(){
		a++
		msg="hola mundo ${a}"
		log.info(msg)
	}
}
