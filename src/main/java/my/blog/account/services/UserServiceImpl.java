package my.blog.account.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import my.blog.account.resources.entity.User;
import my.blog.account.resources.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserServiceImpl extends  AbstractService implements  UserService{

    @Autowired
    private UserRepo userRepo;

    @Override
    public User findById(String userId) {
        return userRepo.findById(userId).orElse(null);
    }

}
