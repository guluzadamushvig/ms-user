package az.mushvig.msuser.service;

import az.mushvig.msuser.dto.UserAddDto;
import az.mushvig.msuser.dto.UserGetDto;
import az.mushvig.msuser.mapper.UserMapper;
import az.mushvig.msuser.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public UserGetDto getUserByUserName(String username){
        var user = userRepository.findByUsername(username);
        return UserMapper.userEntityToUserGetDto(user);
    }

    public void saveUser(UserAddDto dto) {
        userRepository.save(UserMapper.userRequestToUserEntity(dto));
    }
}
