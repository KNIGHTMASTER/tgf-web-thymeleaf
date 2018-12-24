package com.wissensalt.tgf.web.thymeleaf.controller.impl;

import com.wissensalt.tgf.web.thymeleaf.controller.IAuthController;
import com.wissensalt.tgf.web.thymeleaf.dto.LoginDTO;
import com.wissensalt.tgf.web.thymeleaf.dto.LoginResponseDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created on 3/31/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Controller
public class AuthControllerImpl implements IAuthController {

    /*@Autowired
    private FeignBuilderFactory feignBuilderFactory;

    @Autowired
    private JwtTokenUtils jwtTokenUtils;
*/
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthControllerImpl.class);

    @Override
    public String displayLoginView(Model p_Model) {
        p_Model.addAttribute("loginDTO", new LoginDTO());
        return "/base/auth/login";
    }

    @Override
    public LoginResponseDTO actionLogin(@RequestBody LoginDTO p_LoginDTO, HttpServletRequest request) {/*
        AuthTokenDataRequest authTokenDataRequest = new AuthTokenDataRequest();
        authTokenDataRequest.setUserName(p_LoginDTO.getUserName());
        authTokenDataRequest.setPassword(p_LoginDTO.getPassword());
        IAuthClient authClient = feignBuilderFactory.createClient(IAuthClient.class);
        AuthTokenDataResponse authTokenDataResponse = null;
        try {
            authTokenDataResponse = authClient.login(authTokenDataRequest);
        } catch (Exception e) {
            LOGGER.error("Error "+e.toString());
        }
        if (authTokenDataResponse != null) {
            IUserDetailsClient userDetailsClient = feignBuilderFactory.createClient(IUserDetailsClient.class);
            RequestUserDetailsDTO requestUserDetailsDTO = new RequestUserDetailsDTO();
            requestUserDetailsDTO.setUserName(jwtTokenUtils.getUsernameFromToken(authTokenDataResponse.getToken()));
            UserDetailsDTO userDetailsDTO = userDetailsClient.getUserDetails(authTokenDataResponse.getToken(), requestUserDetailsDTO);
            Collection<RoleDTO> authorities = new ArrayList<>();
            for (String string : userDetailsDTO.getAuthorities()) {
                RoleDTO roleDTO = new RoleDTO();
                roleDTO.setName(string);
                authorities.add(roleDTO);
            }
            if (userDetailsDTO.getUsername() != null && SecurityContextHolder.getContext().getAuthentication() != null) {
                UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
                        userDetailsDTO.getUsername(), userDetailsDTO.getAuthorities(), authorities
                );
                LOGGER.info(String.valueOf(authentication.isAuthenticated()));
				authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                authentication.setDetails(new TMFAuthenticationDetail(request));
                SecurityContextHolder.getContext().setAuthentication(authentication);

            }
            return new LoginResponseDTO(true);
        }else {
            LOGGER.error("Failed Logged in");
            return new LoginResponseDTO(false);
        }*/
        return null;
    }

    @Override
    public String logout() {
        System.out.println("do logout");
        return null;
    }
}