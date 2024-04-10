package org.example.trainingjavaspringboot;

import org.example.trainingjavaspringboot.repository.User;
import org.example.trainingjavaspringboot.repository.UserRepository;
import org.example.trainingjavaspringboot.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;


    @Test
    public void testGetUserById(){
        User user1 = new User(1L, "Vu Hoang Anh", "anh173@gmail.com");
        User user2 = new User(2L, "Hoang Anh", "anh@gmail.com");
        userService.createUser(user1);
        userService.createUser(user2);
        Mockito.when(userRepository.findById(2L)).thenReturn(java.util.Optional.of(user2));
        Assertions.assertEquals(user2, userService.getUserById(2L));
    }

    @Test
    public void testCreateUser(){
        User user = new User(2L, "Vu Hoang Anh", "anh173@gmail.com");
        Mockito.when(userRepository.save(user)).thenReturn(user);

        User createdUser = userService.createUser(user);
        Assertions.assertEquals(user, createdUser);
    }

    @Test
    public void testDeleteUser(){
        User user1 = new User(1L, "Vu Hoang Anh", "anh173@gmail.com");
        User user2 = new User(2L, "Hoang Anh", "anh@gmail.com");
        userService.createUser(user1);
        userService.createUser(user2);
        Mockito.doNothing().when(userRepository).deleteById(2L);

        userService.deleteUser(2L);
        Assertions.assertNull(userService.getUserById(2L));
    }
}
