package az.mushvig.msuser.mapper;

import az.mushvig.msuser.dto.UserAddDto;
import az.mushvig.msuser.dto.UserGetDto;
import az.mushvig.msuser.model.UserEntity;

import java.time.LocalDateTime;

public class UserMapper {
    public static UserEntity userRequestToUserEntity(UserAddDto userAddDto){
        return UserEntity.builder()
                        .updatedAt(LocalDateTime.now())
                                .status(1)
                                        .createdAt(LocalDateTime.now())
                                                .password(userAddDto.getPassword())
                                                        .username(userAddDto.getUsername())
                .build();
    }

    public static UserGetDto userEntityToUserGetDto(UserEntity userEntity){
        return UserGetDto.builder().id(userEntity.getId()).build();
    }


}
