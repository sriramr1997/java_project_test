import com.example.java_project_test.Userservice.UserserviceImpl;
import com.example.java_project_test.entity.User;
import com.example.java_project_test.repo.Userrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping("/userbyid")
    public Optional<User> getUser(@PathVariable Long id) {
       return repo.findById(id);

    }
}







