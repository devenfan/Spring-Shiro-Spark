package com.zhuxs.result.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by shusesshou on 2017/9/25.
 */
public class RoleDto implements Serializable{
    private long id;
    private String name;
    private String desc;

    public RoleDto() {
    }

    public RoleDto(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public RoleDto(long id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        RoleDto roleDto = (RoleDto) o;
        return getId() == roleDto.getId() && Objects.equals(getName(), roleDto.getName()) && Objects.equals(getDesc(), roleDto.getDesc());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getName(), getDesc());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(getClass().getName());
        sb.append("{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", desc='").append(desc).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
