package top.ysxc.blog.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author ysxc
 * @since 2021-05-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_link")
public class Link implements Serializable {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 链接地址
     */
    private String url;

    /**
     * 链接名
     */
    private String name;

    /**
     * 链接介绍
     */
    private String description;

    /**
     * 友链站长邮箱
     */
    private String email;

    /**
     * 友链站长QQ
     */
    private String qq;

    private String favicon;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 是否首页显示
     */
    private Integer homePageDisplay;

    /**
     * 备注
     */
    private String remark;

    /**
     * 来源：管理员添加、自动申请
     */
    private String source;

    /**
     * 添加时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
