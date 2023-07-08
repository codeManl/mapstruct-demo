package cn.liulele.demo1;

import cn.liulele.PropertyEntity;
import cn.liulele.PropertyName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String id;
    private PropertyName dtoName;
    private PropertyEntity propertyEntity;
}
