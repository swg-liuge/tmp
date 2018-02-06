import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@ContextConfiguration(locations = {"classpath:spring-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class DataSourceTest {

    @Test
    public void testDataSource() throws SQLException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource);
        System.out.println(dataSource.getConnection());
    }

}
