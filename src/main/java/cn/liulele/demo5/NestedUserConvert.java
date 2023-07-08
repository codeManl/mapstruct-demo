package cn.liulele.demo5;

import cn.liulele.demo2.NewUserConvert;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NestedUserConvert {

    NestedUserConvert INSTANCE = Mappers.getMapper(NestedUserConvert.class);


    @Mapping(source = "userId", target = "userDtoId")
    @Mapping(source = "userName", target = "userDtoName")
    @Mapping(source = "subUserList",target = "subUserDtoList")
    UserDto convert2UserDto(User user);

    @Mapping(source = "subUserId", target = "subUserDtoId")
    @Mapping(source = "subUserName", target = "subUserDtoName")
    @Mapping(source = "subSubUserList",target = "subUserDtoList")
    SubUserDto convert2SubUserDto(SubUser subUser);


    @Mapping(source = "subSubUserId", target = "subSubUserDtoId")
    @Mapping(source = "subSubUserName", target = "subSubUserDtoName")
    @Mapping(source = "subSubSubUserList", target = "subSubSubUserDtoList")
    SubSubUserDto convert2SubSubUserDto(SubSubUser subSubUser);


    @Mapping(source = "subSubSubUserId", target = "subSubSubUserDtoId")
    @Mapping(source = "subSubSubUserName", target = "subSubSubUserDtoName")
    SubSubSubUserDto convert2SubSubSubUserDto(SubSubSubUser subSubSubUser);
}
