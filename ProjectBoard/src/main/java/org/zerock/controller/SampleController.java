package org.zerock.controller;

//import org.apache.log4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.zerock.domain.SampleDTO;
//import org.zerock.domain.SampleDTOList;
//
//import lombok.extern.log4j.Log4j;

//import lombok.extern.log4j.Log4j;

//@Controller
//@RequestMapping(value="/sample/*")
//@Log4j
//public class SampleController {
   
   //log4j
//   private Logger log = Logger.getLogger(SampleController.class);
   
   //log4j를 slf4j를 통해 사용: fatal 레벨이 없음
//   private org.slf4j.Logger logger = LoggerFactory.getLogger(SampleController.class);
   
   
//   @RequestMapping("")
//   public void basic() {
//
//      log.trace("basic1: trace...................");
//      log.debug("basic1: debug...................");
//      log.info("basic1: info...................");
//      log.warn("basic1: warn...................");
//      log.error("basic1: error...................");
//      //log.fatal("basic1: fatal...................");
//      
////      logger.trace("=================================");
////      logger.trace("basic2: trace...................");
////      logger.info("basic2: info...................");
////      logger.debug("basic2: debug...................");
////      logger.warn("basic2: warn...................");
////      logger.error("basic2: error...................");
//
//      
//
//   }
//
//   
//   @RequestMapping(value = "/basic", method = { RequestMethod.GET, RequestMethod.POST })
//	public void basicGet() {
//
//		log.info("basic get...................");
//
//	}
//
//	@GetMapping("/basicOnlyGet")
//	public void basicGet2() {
//
//		log.info("basic get only get...................");
//
//	}
//	
//	@GetMapping("/ex01")
//	public void ex001(SampleDTO dto) {
//		log.info("dto:" + dto);
//		log.info("=========================");
//		log.info("dto.toString():"+dto.toString());
//		log.info("dto.hashCode():"+dto.hashCode());
//	}
//	
//	@GetMapping("/ex02Bean")
//	public String ex02Bean(SampleDTOList list) {
//		log.info("list dtos: " + list);
//		
//		return "ex02Bean";
//	}
//	
//	@GetMapping("/ex04")
//	public String ex04(SampleDTO dto, int page) {
//		log.info("dto:" + dto);
//		log.info("page:" + page);
//		
//		return "/sample/ex04";
//	}
//	
//	@GetMapping("/ex05")
//	public void ex05() {
//		log.info("/ex05..............");
//	}
//
//	
//	@GetMapping("/ex06")
//	public @ResponseBody SampleDTO ex06() {
//		log.info("/ex06..............");
//	
//		SampleDTO dto = new SampleDTO();
//		dto.setAge(10);
//		dto.setName("홍길동");
//		
//		return dto;
//	}
//}