package ioc.test;

import ioc.dao.impl.UserDaoMysqlImpl;
import ioc.dao.impl.UserDaoOracleImpl;
import ioc.service.impl.UserServiceImpl;

public class IocTest {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoMysqlImpl());
        userService.getUser();
        System.out.print("\n-------------------------------\n");
        userService.setUserDao(new UserDaoOracleImpl());
        userService.getUser();
    }



}
