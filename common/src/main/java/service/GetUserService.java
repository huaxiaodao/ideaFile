package service;

import entity.User;
import java.util.List;

public interface GetUserService {
    List<User> getUserList(String name);
}
