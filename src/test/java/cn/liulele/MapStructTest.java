package cn.liulele;

import org.junit.Assert;
import org.junit.Test;
import org.mapstruct.factory.Mappers;
import java.util.Collections;
import java.util.Date;

public class MapStructTest {


    @Test
    public void testConvertUserToUserDto() {
        User user = new User();

        user.setId(1);
        user.setName("name1");
        user.setBirth(new Date());
        user.setAddress("address1");

        UserDtoConvert userDtoConvert = Mappers.getMapper(UserDtoConvert.class);
        UserDto userDto = userDtoConvert.userToUserDto(user);
        Assert.assertNotNull(userDto);
        System.out.println(userDto);
    }

    @Test
    public void testConvertUserToPerson() {
        User user = new User(2, "name2", "address2", new Date());
        PersonConvert mapper = Mappers.getMapper(PersonConvert.class);
        Person person = mapper.userToPerson(user);
        Assert.assertNotNull(person);
        System.out.println(person);
    }

    @Test
    public void testConvertEmployeeToBoss() {
        Employee employee = new Employee(3, "name3", Collections.singletonList(new User(4, "userName", "address", new Date())));
        BossConvert convert = Mappers.getMapper(BossConvert.class);
        Boss boss = convert.employeeToBoss(employee);
        Assert.assertNotNull(boss);
        System.out.println(boss);
    }

}
