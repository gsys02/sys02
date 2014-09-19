package sys02.web.dashboard;

import groovy.util.logging.Log4j;

import javax.annotation.PostConstruct;

import org.slf4j.Logger
import org.springframework.stereotype.Service

import util.*


@Service
@Log4j
class Dashboard {

	static int a=20;
	String msg="s"

	@PostConstruct
	def init(){
		log.info('init')
	}

	def ya(){
		a++
		msg="hola mundo ${a}"
		log.info(msg)
	}
}
