package org.jxiang.crowd.test;

import org.junit.Test;
import org.junit.runner.RunWith;
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

    @Test
    public void testConnection() throws Exception {
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}
