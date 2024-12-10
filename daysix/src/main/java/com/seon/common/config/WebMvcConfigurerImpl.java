package com.seon.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.seon.common.interceptor.CheckLoginSessionInterceptor;

@Configuration
public class WebMvcConfigurerImpl implements WebMvcConfigurer {
	
	@Override
    public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new CheckLoginSessionInterceptor())
//				.order(1)
				.addPathPatterns("/*/*/*/*Xdm*", "/*/*/*/*Usr*")
				.excludePathPatterns(
//						"/resources/**",
						"/adt/**",
						"/xdm/**",
						"/usr/**",
						"/v1/infra/login/loginXdmSignIn",
						"/v1/infra/member/signinXdmProc",
						"/v1/infra/member/signoutXdmProc",
						"/v1/infra/member/signinUsrProc",
						"/v1/infra/member/signoutUsrProc",
						"/v1/infra/member/memberUsrInst",
						"/v1/infra/login/loginUsrSignIn",
						"/v1/infra/login/loginUsrSignUp",
						"/v1/infra/index/indexUsrView"
		);
	}

}
