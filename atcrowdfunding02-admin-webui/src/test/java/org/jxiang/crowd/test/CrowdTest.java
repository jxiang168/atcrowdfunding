package org.jxiang.crowd.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.jxiang.crowd.entity.Admin;
import org.jxiang.crowd.mapper.AdminMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * TODO
 *
 * @author Jxiang
 * @version 1.0
 * @create 2022-07-02 16:23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-persist-mybatis.xml")
public class CrowdTest {
    @Autowired
    private DataSource dataSource;

    @Autowired
    private AdminMapper adminMapper;

    @Test
    public void testInsertAdmin() {
//        int r = adminMapper.insertSelective(new Admin(null, "tom", "123123", "汤姆", "tom@jxiang.org", null));
        Admin admin = adminMapper.selectByPrimaryKey(1);
//        System.out.println(admin);
//        System.out.println("受影响行数:" + r);
        Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.info(admin.toString());
    }


    @Test
    public void testConnection() throws Exception {
        Connection connection = dataSource.getConnection();
        System.out.println(connection);

    }
}
