package cn.liulele.demo1;

import cn.liulele.FieldEntity;
import cn.liulele.FieldName;
import cn.liulele.PropertyEntity;
import cn.liulele.PropertyName;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserConvert {

    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);

    @Mapping( expression = "java(cn.liulele.StrUtil.integer2String(user.getId()))",target = "id")
    @Mapping(source = "name", target = "dtoName")
    @Mapping(source = "fieldEntity", target = "propertyEntity")
    UserDto convertToUserDto(User user);


    default PropertyEntity fieldEntityToPropertyEntity(FieldEntity fieldEntity) {
        if (fieldEntity == null) {
            return null;
        }
        PropertyEntity propertyEntity = new PropertyEntity();
        propertyEntity.setPropertyName(fieldEntity.getFieldName());
        propertyEntity.setPropertyType(fieldEntity.getFieldType());
        return propertyEntity;

    }

    default PropertyName fieldNameToPropertyName(FieldName fieldName) {
        if (fieldName == null) {
            return null;
        }

        PropertyName propertyName = new PropertyName();
        propertyName.setPropertyName(fieldName.getFieldName());
        return propertyName;

    }


}
