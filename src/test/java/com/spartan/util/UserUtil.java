package com.spartan.util;

import com.spartan.model.User;

/**
 * Created with IntelliJ IDEA.
 * @author Wind
 * @version V1.0
 * @Description: .
 * @Date 2016/4/6 12:40
 */
public class UserUtil {
    public static User user = new User();

    static {
        user.setUserId(1);
    }
}
