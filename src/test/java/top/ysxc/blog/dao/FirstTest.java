package top.ysxc.blog.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.ysxc.blog.dao.entity.User;
import top.ysxc.blog.dao.mapper.GenerateUserMapper;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * @author ysxc
 * @create 2021-05-21 5:34 下午
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class FirstTest {

    @Autowired
    private GenerateUserMapper generateUserMapper;

    @Test
    public void testQuery() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = generateUserMapper.selectList(null);
        Assert.assertEquals(0, userList.size());
        userList.forEach(System.out::println);
    }

    @Test
    public void testInsert() {
        System.out.println(("----- selectAll method test ------"));
        User user = new User();
        user.setGender(0);
        user.setNickname("小明");
        int i = generateUserMapper.insert(user);
        Assert.assertEquals(1, i);
        System.out.println(user);
    }
}

