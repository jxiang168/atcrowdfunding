package org.jxiang.crowd.util;

/**
 * TODO
 *
 * @author Jxiang
 * @version 1.0
 * @create 2022-07-06 16:14
 */
public class ResultEntry<T> {
    public static final String SUCCESS = "SUCCESS";
    public static final String FAILED = "FAILED";

    private String result;
    private String message;
    T data;

    public ResultEntry() {
    }

    public ResultEntry(String result, String message, T data) {
        this.result = result;
        this.message = message;
        this.data = data;
    }

    public static <E> ResultEntry<E> successWithoutData() {
        return new ResultEntry<E>(SUCCESS,null,null);
    }
    public static <E> ResultEntry<E> successWithData(E data) {
        return new ResultEntry<E>(SUCCESS,null,data);
    }
    public static <E> ResultEntry<E> failed(String message) {
        return new ResultEntry<E>(FAILED,message,null);
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultEntry{" +
                "result='" + result + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
