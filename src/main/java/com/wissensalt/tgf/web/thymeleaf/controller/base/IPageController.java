package com.wissensalt.tgf.web.thymeleaf.controller.base;

import com.wissensalt.tgf.web.thymeleaf.dto.BreadCrumbDTO;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created on 2/8/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface IPageController {

    @GetMapping("/")
    ModelAndView display(ModelMap p_ModelMap);

    /*Properties Variable*/
    String getPageView();

    String getPageTitle();

    String getPageSubTitle();

    /**
     *
     * @return 1st String is Url, 2nd String Name
     */
    BreadCrumbDTO getPageBreadCrumb();
}
