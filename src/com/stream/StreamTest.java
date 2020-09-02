package com.stream;

/*
1、id为偶数
2、年龄大于23
3、用户名转换为大写
4、用户字母倒序
5、只输出一个
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        User u1 = new User(1,"a",21);
        User u2 = new User(2,"b",23);
        User u3 = new User(3,"c",24);
        User u4 = new User(4,"d",25);
        User u5 = new User(5,"e",26);
        User u6 = new User(6,"f",27);
        List<User> list = Arrays.asList(u1,u2,u3,u4,u5,u6);

        list.stream()
                .filter(user -> {
                    return user.getId()%2==0;
                })
                .filter(user -> {
                    return user.getAge()>21;
                })
                .map(user -> {
                    user.setName(user.getName().toUpperCase());
                    return user;
//                    return user.getName().toUpperCase();
                })
//                .sorted(Comparator.reverseOrder())
                .sorted((user1,user2)->{
                    return user2.getName().compareTo(user1.getName());
                })
                .limit(1)
                .forEach(user -> {
                    System.out.println(user.getName());
                });

    }
}
