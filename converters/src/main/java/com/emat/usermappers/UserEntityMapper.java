package com.emat.usermappers;

import com.emat.entities.user.UserEntity;
import com.emat.webapi.domain.UserCommand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserEntityMapper {
    UserEntityMapper INSTANCE = Mappers.getMapper(UserEntityMapper.class);
    UserCommand userToUserCommand(UserEntity user);
    UserEntity userCommandToUser(UserCommand command);
}
