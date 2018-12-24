package com.wissensalt.tgf.web.thymeleaf.controller.base;

import com.wissensalt.tgf.web.thymeleaf.util.IComponentInitializer;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created on 2/8/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public abstract class APageController implements IComponentInitializer, IPageController {

    /*@PostConstruct*/
    @Override
    public void initComponents() {
    }

    @Override
    public ModelAndView display(ModelMap p_ModelMap) {
        p_ModelMap.addAttribute("pageTitle", getPageTitle());
        p_ModelMap.addAttribute("pageSubTitle", getPageSubTitle());
        p_ModelMap.addAttribute("pageBreadCrumb", getPageBreadCrumb());
        return new ModelAndView(getPageView(), p_ModelMap);
    }
}
