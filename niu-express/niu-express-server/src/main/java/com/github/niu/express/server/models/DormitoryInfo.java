package com.github.niu.express.server.models;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author System
 * @since 2019-04-13
 */
public class DormitoryInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Byte id;

    /**
     * 1A2B3C
     */
    private Byte part;

    private String name;

    private String content;


    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public Byte getPart() {
        return part;
    }

    public void setPart(Byte part) {
        this.part = part;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "DormitoryInfo{" +
        "id=" + id +
        ", part=" + part +
        ", name=" + name +
        ", content=" + content +
        "}";
    }
}
