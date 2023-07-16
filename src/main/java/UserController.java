import com.example.java_project_test.Userservice.UserserviceImpl;
import com.example.java_project_test.entity.User;
import com.example.java_project_test.repo.Userrepo;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserserviceImpl userservice;

    @Autowired
    private Userrepo repo;

    @PostMapping("/SaveUser")
    public ResponseEntity<String> saveUser(@RequestBody User user) {
        return userservice.getUsers(user);
    }


    @GetMapping("/GetUser")
    public List<User> getUser() {
        return repo.findAll();
        }


    }







