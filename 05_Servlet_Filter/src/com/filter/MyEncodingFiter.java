package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


public class MyEncodingFiter implements Filter {

	public void destroy() {
		System.out.println("MyEncodingFiter.destroy");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("MyEncodingFiter.doFilter 요청");
		request.setCharacterEncoding("utf-8");
		chain.doFilter(request, response);
		System.out.println("MyEncodingFiter.doFilter 응답");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("MyEncodingFiter.init");
	}

}
