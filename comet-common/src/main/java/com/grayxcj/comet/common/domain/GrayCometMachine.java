package com.grayxcj.comet.common.domain;

import java.io.Serializable;

public class GrayCometMachine implements Serializable {
    private Integer id;

    /**
     * 机器编码
     */
    private String code;

    /**
     * 机器名
     */
    private String name;

    /**
     * 登录用户
     */
    private String login_user;

    /**
     * 登录密码
     */
    private String login_password;

    /**
     * 机器IP
     */
    private String original_ip;

    /**
     * 机器访问端口
     */
    private Byte original_port;

    /**
     * 机器远程映射ip
     */
    private String mapping_ip;

    /**
     * 机器远程映射端口
     */
    private Byte mapping_port;

    /**
     * 机器配置信息
     */
    private String machine_info;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLogin_user() {
        return login_user;
    }

    public void setLogin_user(String login_user) {
        this.login_user = login_user == null ? null : login_user.trim();
    }

    public String getLogin_password() {
        return login_password;
    }

    public void setLogin_password(String login_password) {
        this.login_password = login_password == null ? null : login_password.trim();
    }

    public String getOriginal_ip() {
        return original_ip;
    }

    public void setOriginal_ip(String original_ip) {
        this.original_ip = original_ip == null ? null : original_ip.trim();
    }

    public Byte getOriginal_port() {
        return original_port;
    }

    public void setOriginal_port(Byte original_port) {
        this.original_port = original_port;
    }

    public String getMapping_ip() {
        return mapping_ip;
    }

    public void setMapping_ip(String mapping_ip) {
        this.mapping_ip = mapping_ip == null ? null : mapping_ip.trim();
    }

    public Byte getMapping_port() {
        return mapping_port;
    }

    public void setMapping_port(Byte mapping_port) {
        this.mapping_port = mapping_port;
    }

    public String getMachine_info() {
        return machine_info;
    }

    public void setMachine_info(String machine_info) {
        this.machine_info = machine_info == null ? null : machine_info.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", login_user=").append(login_user);
        sb.append(", login_password=").append(login_password);
        sb.append(", original_ip=").append(original_ip);
        sb.append(", original_port=").append(original_port);
        sb.append(", mapping_ip=").append(mapping_ip);
        sb.append(", mapping_port=").append(mapping_port);
        sb.append(", machine_info=").append(machine_info);
        sb.append("]");
        return sb.toString();
    }
}