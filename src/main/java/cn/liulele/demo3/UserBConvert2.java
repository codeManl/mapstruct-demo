package cn.liulele.demo3;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserBConvert2 {

    UserBConvert2 INSTANCE = Mappers.getMapper(UserBConvert2.class);


    /**
     * @MappingTarget 作用是将被标注的参数作为返回值，只支持字段名相同的,如果有同名的参数会覆盖
     * 如本例中就是将userA中的参数转换为userB中的参数，userA中的id会覆盖userB中的id
     */
    UserB convert2UserB(UserA userA, @MappingTarget UserB userB);

}
