package com.radio.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.radio.domain.BoardVO;
import com.radio.domain.Board_Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMappterTests {
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	/*
	 //게시물 조회 테스트
	@Test
	public void testGetList() {
		Board_Criteria cri = new Board_Criteria();
		cri.setDay(7);
		cri.setPageNum(2);
		List<BoardVO> list = mapper.getList(cri);
		mapper.getList(cri).forEach(board -> log.info(board));
	}
	*/
	
	/* 
	  //게시물 등록 테스트
	@Test
	public void testRegister() {
		BoardVO boardVO = new BoardVO();
		boardVO.setBoard_title("추가제목");
		boardVO.setBoard_content("추가내용");
		boardVO.setBoard_id("추가아이디");
		
		mapper.register(boardVO);
		
		log.info(boardVO);
	}
	*/
	
	
	/*
	//게시물 읽기 테스트
	@Test
	public void testRead() {
		BoardVO boardVO = mapper.read(1L);
		
		log.info(boardVO);

	}
	*/
	
	
	
	/*
	//게시물 삭제 테스트
	@Test
	public void testDelete() {
		int i = mapper.delete(3L);
		
		log.info("**********************************************");
		log.info(i);
		log.info("**********************************************");
	}
	*/
	
	
	/*
	//게시물 수정 테스트
	@Test
	public void testModify() {
		BoardVO boardVO = new BoardVO();
		boardVO.setBoard_bno(5L);
		boardVO.setBoard_title("수정된 내용");
		boardVO.setBoard_content("수정된 내용");
		boardVO.setBoard_id("수정된 내용");
		
		
		int i = mapper.modify(boardVO);
		
		log.info("*********************************************");
		log.info(i);
		log.info("*********************************************");
		
	}
	*/
	
	
	/*
	//페이징테스트
	@Test
	public void testPaging() {
		Board_Criteria cri = new Board_Criteria();
		
		List<BoardVO> list = mapper.getList(cri);
		
		list.forEach(boardVO -> log.info(boardVO));
		
	}
	*/
	
	
	/*
	//검색 테스트
	@Test
	public void testSearch() {
		Board_Criteria cri = new Board_Criteria();
		cri.setDay(2);
		cri.setPageNum(2);
		cri.setType("T");
		cri.setKeyword("??");
		List<BoardVO> list = mapper.getList(cri);
		
		
		
		
		list.forEach(boardVO -> log.info(boardVO));
		
	}
	
	
	*/
	
	//요일정보 얻기 테스트
	@Test
	public void testGetToday() {
		log.info("*****************************************");
		log.info(mapper.getToday());
		log.info("*****************************************");
	}
	
}
