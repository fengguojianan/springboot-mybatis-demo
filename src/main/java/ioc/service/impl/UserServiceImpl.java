package ioc.service.impl;

import ioc.dao.UserDao;
import ioc.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao = null;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {

        userDao.getUser();
    }


}
