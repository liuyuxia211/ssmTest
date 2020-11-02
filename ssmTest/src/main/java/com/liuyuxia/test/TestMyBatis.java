package com.liuyuxia.test;

import com.liuyuxia.dao.AccountDao;
import com.liuyuxia.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMyBatis {
    @Test
    public void run() throws Exception{
        /*加载配置文件*/
        InputStream in =Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建sqlsessionfactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建sqlsession对象
        SqlSession session = factory.openSession();
        //获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        List<Account> accounts = dao.findAll();
        for (Account acc : accounts) {
            System.out.println(acc);
        }

        //关闭资源
        System.out.println("mybatis hello!");
        session.close();
        in.close();
    }
    @Test
    public void  run1() throws Exception {
        /*加载配置文件*/
        InputStream in =Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建sqlsessionfactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建sqlsession对象
        SqlSession session = factory.openSession();
        //获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        Account account = new Account();
        account.setId(3);
        account.setName("liu");
        account.setMoney(300f);
        dao.saveAccount(account);
        System.out.println("mybatis hello!");

        //注意，在执行增删改的时候，一定需要commit，之前的都是用的destroy方法，里面整合了commit和close，所以这里没写，需要自己加
        session.commit();
        session.close();
        in.close();
    }
}
