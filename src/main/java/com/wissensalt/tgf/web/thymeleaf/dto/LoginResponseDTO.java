package com.wissensalt.tgf.web.thymeleaf.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created on 4/4/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class LoginResponseDTO implements Serializable {
    /**
     *
     *
     */
    private static final long serialVersionUID = -7215347008838394209L;

    public LoginResponseDTO(Boolean result) {
        this.result = result;
    }

    @JsonProperty("result")
    private Boolean result;

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }
}
