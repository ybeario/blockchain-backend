package com.ybear.blockchain.controller.advice;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.AbstractMappingJacksonResponseBodyAdvice;

import com.ybear.blockchain.controller.annotation.ResponseWrapper;
import com.ybear.blockchain.controller.to.RestResponse;



@Component
@ControllerAdvice(annotations = { ResponseWrapper.class })
public class WrapResponseResponseBodyAdvice extends AbstractMappingJacksonResponseBodyAdvice {
	@Override
	protected void beforeBodyWriteInternal(MappingJacksonValue bodyContainer, MediaType contentType,
			MethodParameter returnType, ServerHttpRequest request, ServerHttpResponse response) {
		Object value = bodyContainer.getValue();
		bodyContainer.setValue(new RestResponse(value));
	}

}
