package com.test.springCalculator.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.servlet.ModelAndView;
import com.test.springCalculator.AdditionController;

public class AdditionControllerTest {
	@Mock
	HttpServletRequest request;
	@Mock
	HttpServletResponse response;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void testAdd() throws IOException {
		when(request.getParameter("t1")).thenReturn("20");
		when(request.getParameter("t2")).thenReturn("10");
		AdditionController myServlet = new AdditionController();
		ModelAndView result = myServlet.add(request, response);
		int aa = (int) result.getModelMap().values().toArray()[0];
		assertEquals(aa, 30);
	}
	@Test
	public void testsubtract() throws IOException {
		when(request.getParameter("t1")).thenReturn("20");
		when(request.getParameter("t2")).thenReturn("10");
		AdditionController myServlet = new AdditionController();
		ModelAndView result = myServlet.subtract(request, response);
		int aa = (int) result.getModelMap().values().toArray()[0];
		assertEquals(aa, 10);
	}
	@Test
	public void testmultiply() throws IOException {
		when(request.getParameter("t1")).thenReturn("10");
		when(request.getParameter("t2")).thenReturn("20");
		AdditionController myServlet = new AdditionController();
		ModelAndView result = myServlet.multiply(request, response);
		int aa = (int) result.getModelMap().values().toArray()[0];
		assertEquals(aa, 200);
	}
	@Test
	public void testdivide() throws IOException {
		when(request.getParameter("t1")).thenReturn("10");
		when(request.getParameter("t2")).thenReturn("20");
		AdditionController myServlet = new AdditionController();
		ModelAndView result = myServlet.divide(request, response);
		int aa = (int) result.getModelMap().values().toArray()[0];
		assertEquals(aa, 0);
	}
}
