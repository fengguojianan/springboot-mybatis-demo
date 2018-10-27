package ioc.dao.impl;

import ioc.dao.UserDao;

public class UserDaoMysqlImpl implements UserDao {

    @Override
    public void getUser() {
        System.out.print("This is get mysql user data");
    }
}
