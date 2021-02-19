package com.radio.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.radio.domain.VideoVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class VideoMapperTests {
	@Setter(onMethod_ = @Autowired)
	private VideoMapper mapper;
	
	/*
	//전체 게시물 불러오기
	@Test
	public void testGetList() {
		Board_Criteria cri = new Board_Criteria();
		
		log.info(mapper.getList(cri));
	}
	*/
	
	/*
	//게시물 등록
	@Test
	public void testRegister() {
		VideoVO vo = new VideoVO();
		Date d = new Date();
		String s = d.toString();
		
		vo.setVideo_title("등록테스트");
		vo.setVideo_date(s);
		vo.setVideo_thumbnail("등록테스트");
		vo.setVideo_vod("등록테스트");
		
		mapper.register(vo);
		
		
		
		
		
		log.info("******************************");
		log.info(vo);
		log.info("******************************");
		
		
	}
	*/
	
	/*
	//읽기테스트
	@Test
	public void testRead() {
		Long bno = 1L;
		
		log.info(mapper.read(bno));
		
	}
	*/
	
	/*
	//게시물 수정 테스트
	@Test
	public void testModify() {
		VideoVO vo = new VideoVO();
		
		vo.setVideo_bno(1L);
		vo.setVideo_title("수정테스트");
		vo.setVideo_date("2021-02-17");
		vo.setVideo_thumbnail("수정테스트");
		vo.setVideo_vod("수정테스트");
		
		int result = mapper.modify(vo);
		
		log.info("********************************************************");
		log.info(result);
		log.info("********************************************************");
		
		
	}
	*/
	
	/*
	
	//게시물 삭제 테스트
	@Test
	public void testDelete() {
		Long video_bno = 12L;
		
		int result = mapper.delete(video_bno);
		
		log.info("********************************************************");
		log.info(result);
		log.info("********************************************************");
	}
	*/
	
	
	/*
	//전체 게시물 수
	@Test
	public void testGetTotal() {
		log.info(mapper.getTotal());
	}
	*/
	
	
	/*
	//조회수증가
	@Test
	public void testIncrease() {
		Long bno = 49L;
		
		mapper.increaseView_cnt(bno);
		VideoVO vo = mapper.read(bno);
		log.info(vo);
	}
	*/
}
