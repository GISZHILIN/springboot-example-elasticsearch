package com.example.elasticsearch.core.utils;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

@Slf4j
public class WebUtil {
	
	private static ThreadLocal<HttpServletRequest> threadLocal = new ThreadLocal<>();
	
	public static void bindRequestAndResponse(HttpServletRequest request) {
		threadLocal.set(request);
    }


    public static HttpServletRequest getRequest(){
	    if(!Objects.isNull(threadLocal.get())){
	        return threadLocal.get();
        }
	    return null;
	}

	public static long getParam(){
        HttpServletRequest request = getRequest();
        if(Objects.nonNull(request)){
           Object start = request.getAttribute("start");
           return Long.valueOf(String.valueOf(start));
        }
        return 0l;
    }

}
