package com.zr.uploadtest.FenBuSession;

/**
 * @Auther: gengwei
 * @Date: 2019-07-24 13:29
 * @Description:
 */

import com.zr.uploadtest.pojo.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
public class QuickRun {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public Map<String, Object> firstResp (HttpServletRequest request){
        HttpSession session = request.getSession();
        /*Map<String, Object> map = new HashMap<>();
        map.put("request Url", request.getRequestURL());
        session.setAttribute("request Url", request.getRequestURL());
        session.setAttribute("map", map);*/
        User u = new User(1,12,"8083");

        session.setAttribute("8083",u);
        return null;
    }

    @RequestMapping(value = "/other", method = RequestMethod.GET)
    public Object sessions (HttpServletRequest request){
        /*Map<String, Object> map = new HashMap<>();
        map.put("sessionId", request.getSession().getId());
        map.put("message", request.getSession().getAttribute("map"));*/
        User user = (User) request.getSession().getAttribute("8083");
        System.out.println(user);
        return user;
    }

    @PostMapping("/importFile")
    public void importFile(MultipartFile file){
        System.out.println(file.getOriginalFilename());
//        int x=1/0;
    }

    public void getName(HttpServletRequest request) {
//        request.getParame
    }
}
