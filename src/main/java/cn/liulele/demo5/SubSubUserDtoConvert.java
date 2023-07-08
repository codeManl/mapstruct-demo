package cn.liulele.demo5;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = SubSubSubUserDtoConvert.class)
public interface SubSubUserDtoConvert {

    @Mapping(source = "subSubUserId", target = "subSubUserDtoId")
    @Mapping(source = "subSubUserName", target = "subSubUserDtoName")
    @Mapping(source = "subSubSubUserList", target = "subSubSubUserDtoList")
    SubSubUserDto convert2SubSubUserDto(SubSubUser subSubUser);
}
