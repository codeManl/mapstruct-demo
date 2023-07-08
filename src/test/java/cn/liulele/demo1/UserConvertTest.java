package cn.liulele.demo1;

import cn.liulele.FieldEntity;
import cn.liulele.FieldName;
import org.junit.Assert;
import org.junit.Test;

public class UserConvertTest {


    @Test
    public void testConvert() {
        User user = new User(1, new FieldName("name1"), new FieldEntity("fieldName1", "fieldType1"));
        UserDto userDto = UserConvert.INSTANCE.convertToUserDto(user);
        Assert.assertNotNull(userDto);
        System.out.println(userDto);
    }
}
