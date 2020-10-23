package com.multicampus.controller.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.multicampus.biz.user.UserDAO;
import com.multicampus.biz.user.UserVO;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String login(@ModelAttribute("user") UserVO vo) throws Exception {
		vo.setId("test");
		vo.setPassword("test123");
		return "forward:login.jsp";
	}

	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(UserVO vo, UserDAO userDAO) throws Exception {
		if(userDAO.getUser(vo) != null) return "forward:getBoardList.do";
		else return "forward:login.jsp";
	}
	
	@RequestMapping(value="/loginout.do")
	public String loginout(HttpSession session) throws Exception {
		//�α׾ƿ� ��û�� �������� ���ε� ������ �޸𸮿��� ���� ����
		session.invalidate();
		
		//�α׾ƿ� �Ŀ��� ���� �������� �̵�
		return "forward:index.jsp";
	}

}








