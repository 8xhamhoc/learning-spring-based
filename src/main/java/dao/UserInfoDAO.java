package dao;

import model.UserInfo;

import java.util.List;

public interface UserInfoDAO {

    UserInfo findUserInfo(String userName);

    // [USER,AMIN,..]
    List<String> getUserRoles(String userName);

}
