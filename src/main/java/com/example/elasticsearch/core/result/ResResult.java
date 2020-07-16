package com.example.elasticsearch.core.result;

public class ResResult {

    /**返回请求路径*/
    private String path;

    /**返回code*/
    private Integer code;

    /**返回msg*/
    private String msg;

    /**返回结果*/
    private Object result;

    /**
     * 耗时（毫秒）
     */
    private String expireTime;

    /**服务器当前时间戳*/
    private Long timestamp = System.currentTimeMillis();

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public ResResult() {
        this.code = ResResultEnum.SUCCESS.getCode();
        this.msg = ResResultEnum.SUCCESS.getMsg();
    }

    public ResResult(String path, Object data) {
        this.path =  path;
        this.code = ResResultEnum.SUCCESS.getCode();
        this.msg = ResResultEnum.SUCCESS.getMsg();
        this.result = data;
    }

    public ResResult(String path, Object data, Long expireTime) {
        this.path =  path;
        this.code = ResResultEnum.SUCCESS.getCode();
        this.msg = ResResultEnum.SUCCESS.getMsg();
        this.result = data;
        this.expireTime = expireTime + "ms";
    }



    public ResResult(ResResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
    }

    public ResResult(String uri, ResResultEnum resultEnum, Object data) {
        this.path =  uri;
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
        this.result = data;
    }
}
