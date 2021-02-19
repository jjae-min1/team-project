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
public class VideoControllerTests {
	@Setter(onMethod_ = @Autowired)
	private WebApplicationContext ctx;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	/*
	//게시물 목록
	@Test
	public void testList() throws Exception{
		log.info(
				mockMvc.perform(MockMvcRequestBuilders.get("/video/video_list")
				.param("pageNum", "1")
				.param("amount", "10"))
				.andReturn()
				.getModelAndView()
				.getModelMap()
				);
	}
	*/	
	
	
	
	
	/*
	//게시물 등록
	@Test
	public void testRegister() throws Exception {
		String result = mockMvc.perform(MockMvcRequestBuilders.post("/video/video_register")
				.param("video_title", "컨트롤러테스트")
				.param("video_date", "2021-02-18")
				.param("video_thumbnail", "컨트롤러테스트")
				.param("video_vod", "컨트롤러테스트")
				).andReturn().getModelAndView().getViewName();
		
		log.info(result);
	}
	*/
	
	
	/*
	//게시물 읽기
	@Test
	public void testRead() throws Exception {
		log.info(
				mockMvc.perform(MockMvcRequestBuilders.get("/video/video_read").param("video_bno", "1"))
				.andReturn().getModelAndView().getModelMap()				
				);
		
	}
	*/
	
	
	
	/*
	//게시물 수정
	@Test
	public void testModify() throws Exception{
		String result = mockMvc.perform(MockMvcRequestBuilders.post("/video/video_modify")
				.param("video_bno", "21")
				.param("video_title", "컨트롤러수정")
				.param("video_date", "2021-02-18")
				.param("video_thumbnail", "컨트롤러테수정")
				.param("video_vod", "컨트롤러수정"))
				.andReturn().getModelAndView().getViewName();
		
		log.info(result);
		
	}
	*/
	
	
	
	
	//게시물 삭제
	@Test
	public void testDelete() throws Exception{
		String result = mockMvc.perform(MockMvcRequestBuilders.post("/video/video_delete")
				.param("video_bno", "21"))
				.andReturn().getModelAndView().getViewName();
		
		log.info(result);
		
	}
	
	

}
