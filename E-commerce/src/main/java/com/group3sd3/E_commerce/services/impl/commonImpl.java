package com.group3sd3.E_commerce.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.group3sd3.E_commerce.services.commonService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Service
public class commonImpl implements commonService {

    @Override
    public void removeSessionMessage() {
        RequestAttributes attributes = RequestContextHolder.getRequestAttributes();
        if (attributes != null) {
            HttpServletRequest request = ((ServletRequestAttributes) attributes).getRequest();
            HttpSession session = request.getSession();
            session.removeAttribute("SuccessMessage");
            session.removeAttribute("ErrorMessage");
        }
    }
}
