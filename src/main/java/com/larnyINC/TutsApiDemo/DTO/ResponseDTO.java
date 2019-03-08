package com.larnyINC.TutsApiDemo.DTO;

public class ResponseDTO {

    private String responseCode;
    private String responseMeassage;
    private Object data;

    public ResponseDTO() {
    }

    public ResponseDTO(String responseCode, String responseMeassage, Object data) {
        this.responseCode = responseCode;
        this.responseMeassage = responseMeassage;
        this.data = data;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMeassage() {
        return responseMeassage;
    }

    public void setResponseMeassage(String responseMeassage) {
        this.responseMeassage = responseMeassage;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
