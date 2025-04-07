package kz.iitu.csse241.burkutbayeva;

import kz.iitu.csse241.burkutbayeva.database.Users;
import kz.iitu.csse241.burkutbayeva.repository.UserRepository;
import kz.iitu.csse241.burkutbayeva.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class UserServiceTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    public UserServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllUsers() {
        when(userRepository.findAll()).thenReturn(Collections.singletonList(new Users()));
        assertEquals(1, userService.getAllUsers().size());
    }
}
