package cn.liulele.demo5;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = SubUserDtoConvert.class)
public interface UserDtoConvert {
    UserDtoConvert INSTANCE = Mappers.getMapper(UserDtoConvert.class);

    @Mapping(source = "userId", target = "userDtoId")
    @Mapping(source = "userName", target = "userDtoName")
    @Mapping(source = "subUserList", target = "subUserDtoList")
    UserDto convert2UserDto(User user);

}
