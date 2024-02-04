package controler;

import entities.User;
import entities.tempDB;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserControler {

  @GetMapping
    public List<User> getUser(){
      return tempDB.users;
  }
  @GetMapping("/{id}")
    public User getUserId(@PathVariable int id){
      return tempDB.users.stream().filter(u-> u.getId()==id).findAny().orElse(null);
  }

  @PostMapping
    public void addUser(@RequestBody User user){
      tempDB.users.add(user);
  }

  @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id){
      tempDB.users.removeIf(u->u.getId()==id);
  }
    @PutMapping("/{id}")
    public void updatePupil(@PathVariable int id, @RequestBody User pupil) {
        User existUser = tempDB.users.stream().filter(p -> p.getId() == id).findAny().orElse(null);
        if (existUser == null) {
            tempDB.users.add(pupil);
        } else {
            existUser.setName(pupil.getName());
        }
    }

}


