package cn.liulele.demo5;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = SubSubUserDtoConvert.class)
public interface SubUserDtoConvert {

    @Mapping(source = "subUserId", target = "subUserDtoId")
    @Mapping(source = "subUserName", target = "subUserDtoName")
    @Mapping(source = "subSubUserList",target = "subUserDtoList")
    SubUserDto convert2SubUserDto(SubUser subUser);
}
