package com.Inc.UserManagement.SSO;
import com.Inc.UserManagement.Response.GenericResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseModel {

  private GenericResponse response;
  private List<Object> info;
  private Object details;

    public ResponseModel() {
        super();
    }

    public ResponseModel(GenericResponse response, List<Object> info, Object details) {
        this.response = response;
        this.info = info;
        this.details = details;
    }

    public ResponseModel(GenericResponse response) {
        super();
        this.response = response;
    }

    /**
     * get field
     *
     * @return response
     */
    public GenericResponse getResponse() {
        return this.response;
    }

    /**
     * set field
     *
     * @param response
     */
    public void setResponse(GenericResponse response) {
        this.response = response;
    }

    /**
     * get field
     *
     * @return info
     */
    public List<Object> getInfo() {
        return this.info;
    }

    /**
     * set field
     *
     * @param info
     */
    public void setInfo(List<Object> info) {
        this.info = info;
    }

    /**
     * get field
     *
     * @return details
     */
    public Object getDetails() {
        return this.details;
    }

    /**
     * set field
     *
     * @param details
     */
    public void setDetails(Object details) {
        this.details = details;
    }
}

