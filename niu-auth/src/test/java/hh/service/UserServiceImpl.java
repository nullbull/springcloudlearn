package hh.service;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/4 18:36
 * @desc
 */
@Service("myUserServiceImpl")
public class UserServiceImpl implements UserDetailsService {
    private final static Set<User> userList = new HashSet<>();
    static {
        userList.add(new User("test",  "{bcrypt}"+ new BCryptPasswordEncoder().encode("test"), (Collection) AuthorityUtils.createAuthorityList("USER")));
    }
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<User> user = userList.stream().filter(u -> u.getUsername().equals(s)).findFirst();
        if (!user.isPresent()) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        else {
            return user.get();
        }
    }
}
