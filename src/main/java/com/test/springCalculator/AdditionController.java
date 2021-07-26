package com.test.springCalculator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdditionController {
	@RequestMapping("add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		int a = Integer.parseInt(request.getParameter("t1"));
		
		int b = Integer.parseInt(request.getParameter("t2"));
		int c = a + b;
		ModelAndView model=new ModelAndView();
		model.setViewName("resultPage");
		model.addObject("result", c);
		model.addObject("display", "add");
		
		
		return model;
	}
	@RequestMapping("subtract")
	public ModelAndView subtract(HttpServletRequest request, HttpServletResponse response) {
		int a = Integer.parseInt(request.getParameter("t1"));
		int b = Integer.parseInt(request.getParameter("t2"));
		int c = a - b;
		ModelAndView model=new ModelAndView();
		model.setViewName("resultPage");
		model.addObject("result", c);

		model.addObject("display", "subtract");
		return model;
	}
	@RequestMapping("multiply")
	public ModelAndView multiply(HttpServletRequest request, HttpServletResponse response) {
		int a = Integer.parseInt(request.getParameter("t1"));
		int b = Integer.parseInt(request.getParameter("t2"));
		int c = a * b;
		ModelAndView model=new ModelAndView();
		model.setViewName("resultPage");
		model.addObject("result", c);
		model.addObject("display", "multiply");
		return model;
	}
	@RequestMapping("divide")
	public ModelAndView divide(HttpServletRequest request, HttpServletResponse response) {
		int a = Integer.parseInt(request.getParameter("t1"));
		int b = Integer.parseInt(request.getParameter("t2"));
		int c = a / b;
		ModelAndView model=new ModelAndView();
		model.setViewName("resultPage");
		model.addObject("result", c);
		model.addObject("display", "divide");
		return model;
	}
}
