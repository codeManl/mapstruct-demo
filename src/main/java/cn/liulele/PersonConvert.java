package cn.liulele;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface PersonConvert {


    @Mappings(
            {
                    @Mapping(source = "name",target = "personName")
            }
    )
    Person userToPerson(User user);
}
