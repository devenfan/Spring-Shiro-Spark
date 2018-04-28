package com.zhuxs.result.dto;

import com.zhuxs.result.domain.enums.ErrorCode;

import java.util.Objects;

/**
 * Created by shusesshou on 2017/9/18.
 */
public class ErrorDto {
    private String status;
    private ErrorCode errorCode;
    private String url;
    private String msg;

    public ErrorDto() {
    }

    public ErrorDto(String status, ErrorCode errorCode, String url, String msg) {
        this.status = status;
        this.errorCode = errorCode;
        this.url = url;
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ErrorDto errorDto = (ErrorDto) o;
        return Objects.equals(getStatus(), errorDto.getStatus()) && getErrorCode() == errorDto.getErrorCode() && Objects.equals(getUrl(), errorDto.getUrl())
                && Objects.equals(getMsg(), errorDto.getMsg());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getStatus(), getErrorCode(), getUrl(), getMsg());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(getClass().getName());
        sb.append("{");
        sb.append("status='").append(status).append('\'');
        sb.append(", errorCode=").append(errorCode);
        sb.append(", url='").append(url).append('\'');
        sb.append(", msg='").append(msg).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
