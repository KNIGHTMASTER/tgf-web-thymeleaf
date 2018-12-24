package com.wissensalt.tgf.web.thymeleaf.controller.impl;

import com.wissensalt.tgf.web.thymeleaf.controller.base.APageController;
import com.wissensalt.tgf.web.thymeleaf.dto.BreadCrumbDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created on 9/13/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Controller
@RequestMapping("/example")
public class ExampleController extends APageController {

    @Override
    public String getPageView() {
        return "impl/example";
    }

    @Override
    public String getPageTitle() {
        return "Example Page Title";
    }

    @Override
    public String getPageSubTitle() {
        return "Example Page Sub Title";
    }

    @Override
    public BreadCrumbDTO getPageBreadCrumb() {
        return new BreadCrumbDTO("example", "example");
    }
}
