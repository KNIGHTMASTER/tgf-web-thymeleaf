package com.wissensalt.tgf.web.thymeleaf.dto;

import java.io.Serializable;

/**
 * Created on 2/8/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class BreadCrumbDTO implements Serializable {
    /**
     *
     *
     */
    private static final long serialVersionUID = -1905198700539889919L;

    private String key;
    private String value;

    public BreadCrumbDTO() {
    }

    public BreadCrumbDTO(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
