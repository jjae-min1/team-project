package com.radio.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.log4j.Log4j;

@ControllerAdvice
@Log4j
public class ExceptionController {
	
    @ExceptionHandler(
    	Exception.class)
    public String except(Exception ex, Model model) {
    	log.error("Error...." + ex.getMessage());
    	model.addAttribute("exception", ex);
    	log.error(model);
    	return "error";
    	
    }
   
}
