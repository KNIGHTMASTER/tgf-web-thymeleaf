package com.wissensalt.tgf.web.thymeleaf.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created on 9/12/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Configuration
@EnableWebMvc
@ComponentScan("id.co.telkomsigma.tgf")
public class WebAdminConfig extends WebMvcConfigurerAdapter {
    /*@Bean
    public ViewResolver viewResolver(){
        ThymeleafViewResolver thymeleafViewResolver = new ThymeleafViewResolver();
        thymeleafViewResolver.setTemplateEngine((SpringTemplateEngine) templateEngine());
        thymeleafViewResolver.setCharacterEncoding("UTF-8");
        return thymeleafViewResolver;
    }

    @Bean
    public TemplateEngine templateEngine(){
        SpringTemplateEngine springTemplateEngine = new SpringTemplateEngine();
        springTemplateEngine.setTemplateResolver(templateResolver());
        springTemplateEngine.addTemplateResolver(templateResolver());
        springTemplateEngine.addTemplateResolver(urlTemplateResolver());
        *//*springTemplateEngine.addDialect(new SpringSecurityDialect());*//*
        *//*springTemplateEngine.addDialect(new TilesDialect());*//*
        springTemplateEngine.addDialect(new LayoutDialect());
        return springTemplateEngine;
    }

    @Bean
    public UrlTemplateResolver urlTemplateResolver(){
        return new UrlTemplateResolver();
    }

    @Bean
    public ITemplateResolver templateResolver(){
        ServletContextTemplateResolver resolver = new ServletContextTemplateResolver();
        resolver.setPrefix("/resources/templates/");
        resolver.setTemplateMode("HTML");
        resolver.setSuffix(".html");
        resolver.setCacheable(false);
        return resolver;
    }

    @Bean
    public MessageSource messageSource(){
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("/resources/i18N/messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

    @Bean
    public LocalValidatorFactoryBean validator() {
        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
        bean.setValidationMessageSource(messageSource());
        return bean;
    }

    @Override
    public Validator getValidator() {
        return validator();
    }*/

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        if (!registry.hasMappingForPattern("/webjars*//**")) {
            registry.addResourceHandler("/webjars*//**").addResourceLocations("classpath:/META-INF/resources/webjars/");
        }
        if (!registry.hasMappingForPattern("*//**")) {
            registry.addResourceHandler("*//**").addResourceLocations("classpath:/static");
        }
    }
}
