package com.wissensalt.tgf.web.thymeleaf.controller.impl;

import com.wissensalt.tgf.web.thymeleaf.controller.IDashboardController;
import com.wissensalt.tgf.web.thymeleaf.controller.base.APageController;
import com.wissensalt.tgf.web.thymeleaf.dto.BreadCrumbDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created on 2/8/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Controller
@RequestMapping("/dashboard")
public class DashboardController extends APageController implements IDashboardController {

    @Override
    public String getPageView() {
        return "impl/dashboard-1/dashboard-1";
    }

    @Override
    public String getPageTitle() {
        return "Admin Dashboard";
    }

    @Override
    public String getPageSubTitle() {
        return "statistics, charts, recent events and reports";
    }

    @Override
    public BreadCrumbDTO getPageBreadCrumb() {
        return new BreadCrumbDTO("dashboard", "dashboard");
    }
}
