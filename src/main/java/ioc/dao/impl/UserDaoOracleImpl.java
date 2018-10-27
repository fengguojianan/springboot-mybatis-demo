package ioc.dao.impl;

import ioc.dao.UserDao;

public class UserDaoOracleImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.print("This is get oracle user data");
    }
}
