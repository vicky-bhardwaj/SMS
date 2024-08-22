package com.dac.studentApp.exceptionhandler;



import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(SessionExpiredException.class)
    public ModelAndView handleSessionExpiredException(HttpServletRequest request, SessionExpiredException ex) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("redirect:/");  // Redirect to your index page
        return mav;
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ModelAndView handle404(HttpServletRequest request, NoHandlerFoundException ex) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("redirect:/");  // Redirect to your index page for any 404 error
        return mav;
    }
}
