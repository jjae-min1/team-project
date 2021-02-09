package com.radio.service;

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
public class BoardServiceTests {
	@Setter(onMethod_ = @Autowired)
	private BoardService service;
	
	
	/*
	@Test
	public void testExist() {
		assertNotNull(service);
	}
	*/
	
	
	
	/*
	//게시물 목록
	@Test
	public void testGetList() {
		Board_Criteria cri = new Board_Criteria();
		cri.setDay(2);
		cri.setPageNum(2);
		cri.setType("T");
		cri.setKeyword("??");
		
		
		service.getList(cri).forEach(board -> log.info(board));	
	}
	*/
	
	
	
	/*
	//게시글 등록
	@Test
	public void testRegister() {
		BoardVO boardVO = new BoardVO();
		boardVO.setBoard_title("새로작성테스트");
		boardVO.setBoard_content("새로작성테스트");
		boardVO.setBoard_id("새로작성아이디");
		
		service.register(boardVO);
		
		log.info("새로작성 글 번호 : " + boardVO.getBoard_bno());
		
		
	}
	*/
	
	
	
	/*
	//게시글 읽기
	@Test
	public void testRead() {
		BoardVO boardVO = service.read(46L);
		
		log.info(boardVO);
	}
	*/
	
	
	/*
	//게시글 수정
	@Test
	public void testModify() {
		BoardVO boardVO = service.read(12L);
		
		boardVO.setBoard_title("수정헀어요");
		boardVO.setBoard_content("수정했어요");
		
		log.info(service.modify(boardVO));
	}
	*/
	
	
	
	/*
	//게시글 삭제
	@Test
	public void testDelete() {
		log.info("********************************");
		log.info("제거 결과 : " + service.delete(12L));
		log.info("********************************");
	}
	*/
	
	/*
	//게시글 개수 구하기
	@Test
	public void testGetTotal() {
		Board_Criteria cri = new Board_Criteria();
		cri.setDay(2);
		
		int total = service.getTotal(cri);
		log.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		log.info(total);
		log.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	
	*/

}
