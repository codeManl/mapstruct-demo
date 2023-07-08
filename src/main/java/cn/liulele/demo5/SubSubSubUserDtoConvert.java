package cn.liulele.demo5;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface SubSubSubUserDtoConvert {

    @Mapping(source = "subSubSubUserId", target = "subSubSubUserDtoId")
    @Mapping(source = "subSubSubUserName", target = "subSubSubUserDtoName")
    SubSubSubUserDto convert2SubSubSubUserDto(SubSubSubUser subSubSubUser);
}
