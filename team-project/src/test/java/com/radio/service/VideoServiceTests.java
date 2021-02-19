package com.radio.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.radio.domain.Board_Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class VideoServiceTests {
	
	@Setter(onMethod_= @Autowired)
	private VideoService service;
	
	
	/*
	//전체 게시물 보기
	@Test
	public void testGetList() {
		Board_Criteria cri = new Board_Criteria();
		log.info(service.getList(cri));
	}
	*/
	
	/*
	//게시물 등록
	@Test
	public void testRegister() {
		VideoVO vo = new VideoVO();
		
		vo.setVideo_title("서비스등록");
		vo.setVideo_date("2021-02-17");
		vo.setVideo_thumbnail("서비스등록");
		vo.setVideo_vod("서비스등록");
		
		service.register(vo);
		
		log.info(vo);
	}
	*/
	
	
	/*
	//게시물 읽기
	@Test
	public void testRead() {
		Long bno = 13L;
		
		VideoVO vo = service.read(bno);
		
		log.info(vo);
		
	}
	*/
	
	
	/*
	//게시물 수정
	@Test
	public void testModify() {
		VideoVO vo = new VideoVO();
		
		vo.setVideo_bno(13L);
		vo.setVideo_title("서비스수정");
		vo.setVideo_date("2021-02-17");
		vo.setVideo_thumbnail("서비스수정");
		vo.setVideo_vod("서비스수정");
		
		boolean result = service.modify(vo);
		
		log.info("****************************");
		log.info(result);
		log.info("****************************");
		
	}
	*/
	
	/*
	//게시물 삭제
	@Test
	public void testDelete() {
		Long videoVO_bno = 13L;
		
		boolean result = service.delete(videoVO_bno);
		log.info("****************************");
		log.info(result);
		log.info("****************************");
	}
	*/
	
}
