package Task4.service;


import Task4.pojo.User;

import java.util.List;

public interface UserService {

    void add(User user) throws Exception;

    int findAll();

    int findByStudy();

    int findByWork();

    boolean delete(int id);

    User findByEmail(String email)throws Exception;

    User findByPhone(String phone)throws Exception;
    //根据id查询
    User findById(int id);
    //根据姓名模糊查询
    List<User> findByName(String name) throws Exception;

    boolean update(User user) throws Exception;

    void reset() throws Exception;

    List<User> list();

    User findByUsername(String username) throws Exception;
    //用户注册
    void regist(User user);
    //用户登录
    User login(User user) throws Exception;
//    int total();
//
//    List<User> list(Page page);
}