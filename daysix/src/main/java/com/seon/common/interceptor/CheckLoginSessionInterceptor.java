package com.seon.common.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import com.seon.common.constans.Constants;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CheckLoginSessionInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		boolean redirectToLogin = false;
		String redirectUrl = null;
		
		if (request.getSession().getAttribute("sessSeqUsr") != null) {
			// by pass
		} else {
			redirectToLogin = true;
			redirectUrl = Constants.URL_LOGINFORM_USR;
		}
		if (request.getSession().getAttribute("sessSeqXdm") != null) {
			// by pass
		} else {
			redirectToLogin = true;
			redirectUrl = Constants.URL_LOGINFORM_XDM;
		}
		
		if(redirectToLogin) {
			response.sendRedirect(redirectUrl);
			return false;
		}
		
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}
	
}
