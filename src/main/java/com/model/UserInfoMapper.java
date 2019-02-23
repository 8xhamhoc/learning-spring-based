package com.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserInfoMapper implements RowMapper<UserInfo> {

    @Override
    public UserInfo mapRow(ResultSet rs, int i) throws SQLException {
        String userName = rs.getString("Username");
        String password = rs.getString("Password");
        return new UserInfo(userName, password);
    }

}
