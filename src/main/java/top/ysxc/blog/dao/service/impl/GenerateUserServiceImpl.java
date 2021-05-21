package top.ysxc.blog.dao.service.impl;

import top.ysxc.blog.dao.entity.User;
import top.ysxc.blog.dao.mapper.GenerateUserMapper;
import top.ysxc.blog.dao.service.GenerateUserService;
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
public class GenerateUserServiceImpl extends ServiceImpl<GenerateUserMapper, User> implements GenerateUserService {

}
