package cn.liulele.demo2;

import org.junit.Assert;
import org.junit.Test;

public class NewUserConvertTest {


    @Test
    public void testConvert() {
        UserA userA = new UserA(1, "name1", "male1");
        UserB userB = new UserB(2, "name2", "female2");

        NewUser newUser = NewUserConvert.INSTANCE.convert2NewUser(userA, userB);
        System.out.println(newUser);

        Assert.assertEquals(newUser.getId(), userB.getId());
        Assert.assertEquals(newUser.getNewName(),userB.getBbName());
        Assert.assertEquals(newUser.getGender(),userA.getGender());


    }

    @Test
    public void testConvertWhileNull() {
        UserA userA = new UserA(1, "name1", "male1");
        UserB userB = null;
        NewUser newUser = NewUserConvert.INSTANCE.convert2NewUser(userA, userB);
        System.out.println(newUser);

        Assert.assertNotNull(newUser);

    }

    @Test
    public void testConvertWhileAllNull() {
        UserA userA = null;
        UserB userB = null;
        NewUser newUser = NewUserConvert.INSTANCE.convert2NewUser(userA, userB);

        System.out.println(newUser);

        Assert.assertNull(newUser);

    }
}
