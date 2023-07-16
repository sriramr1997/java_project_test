import com.example.java_project_test.Userservice.UserserviceImpl;
import com.example.java_project_test.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserserviceImpl userservice;

    @PostMapping("/SaveUser")
    public ResponseEntity<String> saveUser(@RequestBody User user) {
        return userservice.getUsers(user);


    }

}





