package top.ysxc.blog.dao.service.impl;

import top.ysxc.blog.dao.entity.Comment;
import top.ysxc.blog.dao.mapper.GenerateCommentMapper;
import top.ysxc.blog.dao.service.GenerateCommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ysxc
 * @since 2021-05-21
 */
@Service
public class GenerateCommentServiceImpl extends ServiceImpl<GenerateCommentMapper, Comment> implements GenerateCommentService {

}
