package com.seon.common.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import com.seon.common.constans.Constants;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CheckLoginSessionInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		if (request.getSession().getAttribute("sessSeqUsr") != null || request.getSession().getAttribute("sessSeqXdm") != null) {
//			by pass
		} else {
			response.sendRedirect(Constants.URL_LOGINFORM_USR);
			return false;
		}
		
		if (request.getSession().getAttribute("sessSeqXdm") != null || request.getSession().getAttribute("sessSeqUsr") != null) {
//			by pass
		} else {
			response.sendRedirect(Constants.URL_LOGINFORM_XDM);
			return false;
		}
		
		
		return HandlerInterceptor.super.preHandle(request, response, handler);
		
	}
	
}
