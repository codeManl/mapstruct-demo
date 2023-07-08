package cn.liulele;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface BossConvert {


    @Mappings({
            @Mapping(source = "name", target = "bossName"),
            @Mapping(source = "userList",target = "userDtoList")
    })
    public Boss employeeToBoss(Employee employee);
}
