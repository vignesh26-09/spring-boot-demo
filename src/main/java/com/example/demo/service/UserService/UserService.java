package com.example.demo.service.UserService;
import org.springframework.stereotype.Service;
import com.example.demo.repository.UserRepository;
import com.example.demo.entity.User;
@Service
public class UserService {

     private UserRepository userRepository;

     public UserService(UserRepository userRepository){
         this.userRepository=userRepository;
     }
     public void createUser(User user){
              userRepository.save(user);
     }

     public User getStudent(Long id){
            return userRepository.findById(id).orElse(null);
     }
     public void deleteStudent(Long id){
              userRepository.deleteById(id);
     }
}
