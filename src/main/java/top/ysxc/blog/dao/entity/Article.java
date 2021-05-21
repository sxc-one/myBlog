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
@TableName("biz_article")
public class Article implements Serializable {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 文章封面图片
     */
    private String coverImage;

    /**
     * 文章专属二维码地址
     */
    private String qrcodePath;

    private Integer isMarkdown;

    /**
     * 文章内容
     */
    private String content;

    /**
     * markdown版的文章内容
     */
    private String contentMd;

    /**
     * 是否置顶
     */
    private Integer top;

    /**
     * 类型
     */
    private Long typeId;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 是否推荐
     */
    private Integer recommended;

    /**
     * 是否原创
     */
    private Integer original;

    /**
     * 文章简介，最多200字
     */
    private String description;

    /**
     * 文章关键字，优化搜索
     */
    private String keywords;

    /**
     * 是否开启评论
     */
    private Integer comment;

    /**
     * 文章私密访问时的密钥
     */
    private String password;

    /**
     * 添加时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
