package cn.liulele;


import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UserDtoConvert {

    UserDto userToUserDto(User user);


    List<UserDto> userToUserDto(List<User> list);
}
