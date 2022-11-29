package az.mushvig.msuser.controller;

import az.mushvig.msuser.dto.UserAddDto;
import az.mushvig.msuser.dto.UserGetDto;
import az.mushvig.msuser.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping()
    public UserGetDto getUserName(@RequestParam String username) {
        return userService.getUserByUserName(username);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUser(@RequestBody UserAddDto dto) {
        userService.saveUser(dto);
    }
}
