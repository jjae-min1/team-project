package com.radio.mapper;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.radio.domain.Board_Criteria;
import com.radio.domain.Board_ReplyVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class Board_ReplyMapperTests {
	@Setter(onMethod_= @Autowired)
	private Board_ReplyMapper mapper;
	
	
	
	/*
	@Test
	public void test(){
		log.info(mapper);
	}
	*/
	
	/*
	//댓글등록테스트
	@Test
	public void testRegister() {
		Board_ReplyVO vo = new Board_ReplyVO();
		
		vo.setBoard_bno(43L);
		vo.setReply_content("Mapper테스트");
		vo.setReply_id("Mapper테스트");
		
		mapper.register(vo);
	}
	*/
	
	/*
	//댓글읽기 테스트
	@Test
	public void testRead() {
		Long reply_bno = 4L;
		
		Board_ReplyVO vo = mapper.read(reply_bno);
		
		log.info(vo);
		
	}
	*/
	
	/*
	//삭제테스트
	@Test
	public void testDelete() {
		Long reply_bno = 4L;
		
		int result= mapper.delete(reply_bno);
		
		log.info("*************************");
		log.info(result);
		log.info("*************************");
		
	}
	*/
	
	/*
	//수정테스트
	@Test
	public void testUpdate() {
		Long reply_bno = 2L;
		Board_ReplyVO vo = mapper.read(reply_bno);
		
		vo.setReply_content("매퍼수정테스트");
		mapper.modify(vo);
		
		log.info(vo);
	}
	*/
	
	/*
	//전체 댓글 목록
	@Test
	public void testGetList() {
		List<Board_ReplyVO> list = new ArrayList();
		Board_Criteria cri = new Board_Criteria();
		list = mapper.getList(cri, 301L);
		
		list.forEach(reply -> log.info(reply));
		
	}
	*/
	
	
	
}
