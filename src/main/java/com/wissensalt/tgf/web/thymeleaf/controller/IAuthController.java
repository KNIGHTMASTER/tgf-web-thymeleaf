package com.wissensalt.tgf.web.thymeleaf.controller;

import com.wissensalt.tgf.web.thymeleaf.dto.LoginDTO;
import com.wissensalt.tgf.web.thymeleaf.dto.LoginResponseDTO;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created on 3/31/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
//@RequestMapping("/login")
public interface IAuthController {

    @GetMapping("/login")
    String displayLoginView(Model p_Model);

    @PostMapping(value = "/actionlogin", produces = "application/json")
    @ResponseBody
    LoginResponseDTO actionLogin(@RequestBody LoginDTO p_LoginDTO, HttpServletRequest request);

    @GetMapping("/logout")
    String logout();
}
