package com.radio.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
@WebAppConfiguration
@ContextConfiguration({
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
		})
public class BoardControllerTests {
	//
	@Setter(onMethod_ = @Autowired)
	private WebApplicationContext ctx;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	
	
	//게시물 목록
	@Test
	public void testList() throws Exception{
		log.info(
				mockMvc.perform(MockMvcRequestBuilders.get("/board/list")
				.param("pageNum", "2")
				.param("amount", "10")
				.param("day", "2")
				)
				.andReturn()
				.getModelAndView()
				.getModelMap()
				);
	}
	
	
	
	/*
	//게시물 등록
	@Test
	public void testRegister() throws Exception {
		String result = mockMvc.perform(MockMvcRequestBuilders.post("/board/register")
				.param("board_title", "컨트롤러테스트")
				.param("board_content", "컨트롤러테스트")
				.param("board_id", "컨트롤러테스트")
				).andReturn().getModelAndView().getViewName();
		
		log.info(result);
	}
	*/
	
	
	/*
	//게시물 읽기
	@Test
	public void testRead() throws Exception {
		log.info(
				mockMvc.perform(MockMvcRequestBuilders.get("/board/read").param("board_bno", "25"))
				.andReturn().getModelAndView().getModelMap()				
				);
		
	}
	*/
	
	
	
	/*
	//게시물 수정
	@Test
	public void testModify() throws Exception{
		String result = mockMvc.perform(MockMvcRequestBuilders.post("/board/modify")
				.param("board_bno", "5")
				.param("board_title", "컨트롤러테스트")
				.param("board_content", "컨트롤러테스트"))
				.andReturn().getModelAndView().getViewName();
		
		log.info(result);
		
	}
	*/
	
	
	
	/*
	//게시물 삭제
	@Test
	public void testDelete() throws Exception{
		String result = mockMvc.perform(MockMvcRequestBuilders.post("/board/delete")
				.param("board_bno", "22"))
				.andReturn().getModelAndView().getViewName();
		
		log.info(result);
		
	}
	*/
	
	
	
	
	
	
	

}
