package com.example.demo.co;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeansException;
import org.springframework.web.filter.OncePerRequestFilter;
@WebFilter
public class TestFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		System.out.println("过滤器");
		super.doFilter(request, response, filterChain);
	}

	@Override
	protected void initBeanWrapper(BeanWrapper bw) throws BeansException {
		super.initBeanWrapper(bw);
		System.out.println("过滤器初始化");
	}

	@Override
	protected void initFilterBean() throws ServletException {
		// TODO Auto-generated method stub
		super.initFilterBean();
		System.out.println("过滤器初始化1111");
	}


}
