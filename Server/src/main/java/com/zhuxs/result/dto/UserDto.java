package com.zhuxs.result.dto;

import javax.validation.constraints.Max;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Created by shusesshou on 2017/9/22.
 */
public class UserDto implements Serializable{

    private long id;
    private String name;
    private String username;
    private String password;
    private String salt;
    private List<RoleDto> roles;
    private List<PermissionDto> permissions;
    private String token;

    public UserDto() {
    }

    public UserDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserDto(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public UserDto(long id, String name, String username, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public UserDto(long id, String name, String username, String password, List<RoleDto> roles) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    public UserDto(long id, String name, String username, String password, String salt) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.salt = salt;
    }

    public UserDto(long id, String name, String username, String password, String salt, List<RoleDto> roles) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<RoleDto> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleDto> roles) {
        this.roles = roles;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public List<PermissionDto> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PermissionDto> permissions) {
        this.permissions = permissions;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        UserDto userDto = (UserDto) o;
        return getId() == userDto.getId() && Objects.equals(getName(), userDto.getName()) && Objects.equals(getUsername(), userDto.getUsername()) && Objects
                .equals(getPassword(), userDto.getPassword()) && Objects.equals(getSalt(), userDto.getSalt()) && Objects.equals(getRoles(), userDto.getRoles())
                && Objects.equals(getPermissions(), userDto.getPermissions()) && Objects.equals(getToken(), userDto.getToken());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getName(), getUsername(), getPassword(), getSalt(), getRoles(), getPermissions(), getToken());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(getClass().getName());
        sb.append("{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", salt='").append(salt).append('\'');
        sb.append(", roles=").append(roles);
        sb.append(", permissions=").append(permissions);
        sb.append(", token='").append(token).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
