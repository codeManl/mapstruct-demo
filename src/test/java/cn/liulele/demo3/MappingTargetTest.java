package cn.liulele.demo3;

import cn.liulele.demo3.UserA;
import cn.liulele.demo3.UserB;
import cn.liulele.demo3.UserBConvert;
import cn.liulele.demo3.UserBConvert2;
import org.junit.Assert;
import org.junit.Test;

public class MappingTargetTest {

    @Test
    public void test() {
        UserA userA = new UserA(1, "aName", "male");
        UserB userB = new UserB();
        userB.setBbName("bName");
        UserBConvert.INSTANCE.convert2UserB(userA, userB);

        System.out.println(userB);

        Assert.assertEquals("bName",userB.getBbName());
        Assert.assertEquals(userB.getId(),userA.getId());
        Assert.assertEquals(userB.getGender(),userA.getGender());

    }

    @Test
    public void test2() {
        UserA userA = new UserA(1, "aName", "male");
        UserB userB = new UserB();
        userB.setBbName("bName");
        userB.setId(2);
        UserBConvert.INSTANCE.convert2UserB(userA, userB);

        System.out.println(userB);

        Assert.assertEquals("bName",userB.getBbName());
        Assert.assertEquals(userB.getId(),userA.getId());
        Assert.assertEquals(userB.getGender(),userA.getGender());

    }

    @Test
    public void test3() {
        UserA userA = new UserA(1, "aName", "male");
        UserB userB = new UserB();
        userB.setBbName("bName");
        userB.setId(2);
        UserB convertedUserB = UserBConvert2.INSTANCE.convert2UserB(userA, userB);

        System.out.println(convertedUserB);

        Assert.assertEquals("bName",convertedUserB.getBbName());
        Assert.assertEquals(convertedUserB.getId(),userA.getId());
        Assert.assertEquals(convertedUserB.getGender(),userA.getGender());

    }
}
