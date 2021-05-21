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
@TableName("biz_file")
public class File implements Serializable {


    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer userId;

    private String storageType;

    private String originalFileName;

    private Long size;

    private String suffix;

    private Integer width;

    private Integer height;

    private String filePath;

    private String fullFilePath;

    private String fileHash;

    private String uploadType;

    private LocalDateTime uploadStartTime;

    private LocalDateTime uploadEndTime;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
