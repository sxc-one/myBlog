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
@TableName("sys_role_resources")
public class RoleResources implements Serializable {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long roleId;

    private Long resourcesId;

    /**
     * 添加时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
