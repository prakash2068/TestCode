package com.Inc.UserManagement.Response;

import com.fasterxml.jackson.annotation.JsonInclude;


//@JsonInclude(Include.NON_NULL)
public class GenericResponse {

    private Boolean status;

    private int resultCode;

    private String responseCode;

    private String message;

    private int Failed;

    private int Success;

    /**
     * Default Constructor
     */
    public GenericResponse() {
        super();
    }


    /**
     * @param status
     * @param resultCode
     * @param responseCode
     * @param message
     */
    public GenericResponse(final Boolean status, final int resultCode, final String responseCode,
                           final String message) {
        super();
        this.status = status;
        this.resultCode = resultCode;
        this.responseCode = responseCode;
        this.message = message;
    }

    public int getFailed() {
        return Failed;
    }

    public void setFailed(final int failed) {
        Failed = failed;
    }

    public int getSuccess() {
        return Success;
    }

    public void setSuccess(final int success) {
        Success = success;
    }

    /**
     * @return the status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * @param status
     *            the status to set
     */
    public void setStatus(final Boolean status) {
        this.status = status;
    }

    /**
     * @return the resultCode
     */
    public int getResultCode() {
        return resultCode;
    }

    /**
     * @param resultCode
     *            the resultCode to set
     */
    public void setResultCode(final int resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * @return the responseCode
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * @param responseCode
     *            the responseCode to set
     */
    public void setResponseCode(final String responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message
     *            the message to set
     */
    public void setMessage(final String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "GenericResponse [status=" + status + ", resultCode=" + resultCode + ", responseCode=" + responseCode
                + ", message=" + message + ", Failed=" + Failed + ", Success=" + Success + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Failed;
        result = prime * result + Success;
        result = prime * result + ((message == null) ? 0 : message.hashCode());
        result = prime * result + ((responseCode == null) ? 0 : responseCode.hashCode());
        result = prime * result + resultCode;
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        return result;
    }

    /*@Override
    public boolean equals(final Object obj) {
        if(this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final GenericResponse other = (GenericResponse) obj;
        if (Failed != other.Failed)
            return false;
        if (Success != other.Success)
            return false;
        if (message == null) {
            if (other.message != null)
                return false;
        } else if (!message.equals(other.message))
            return false;
        if (responseCode == null) {
            if (other.responseCode != null)
                return false;
        } else if (!responseCode.equals(other.responseCode))
            return false;
        if (resultCode != other.resultCode)
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        return true;
    }*/

}
