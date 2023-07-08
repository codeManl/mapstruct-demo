package cn.liulele.demo2;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NewUserConvert {
    NewUserConvert INSTANCE = Mappers.getMapper(NewUserConvert.class);


    @Mapping(source = "userA.gender", target = "gender")
    @Mapping(source = "userB.id", target = "id")
    @Mapping(source = "userB.bbName", target = "newName")
    NewUser convert2NewUser(UserA userA, UserB userB);
}
