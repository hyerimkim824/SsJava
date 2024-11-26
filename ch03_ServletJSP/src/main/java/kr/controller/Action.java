package kr.controller;

public interface Action {
	
	public String execute(HttpServletRequest request, HttpServletresponse response )throws Exception;

}
