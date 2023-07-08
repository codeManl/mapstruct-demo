package cn.liulele.demo5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NestedUserConvertTest {



    @Test
    public void test() {

        List<SubSubSubUser> subSubSubUserListA = new ArrayList<>();
        List<SubSubSubUser> subSubSubUserListB = new ArrayList<>();
        List<SubSubSubUser> subSubSubUserListC = new ArrayList<>();
        List<SubSubSubUser> subSubSubUserListD = new ArrayList<>();

        SubSubSubUser subSubSubUserA = new SubSubSubUser(1111, "subSubSub1111");
        SubSubSubUser subSubSubUserB = new SubSubSubUser(1112, "subSubSub1112");
        SubSubSubUser subSubSubUserC = new SubSubSubUser(1121, "subSubSub1121");
        SubSubSubUser subSubSubUserD = new SubSubSubUser(1122, "subSubSub1122");
        SubSubSubUser subSubSubUserE = new SubSubSubUser(1211, "subSubSub1211");
        SubSubSubUser subSubSubUserF = new SubSubSubUser(1212, "subSubSub1212");
        SubSubSubUser subSubSubUserG = new SubSubSubUser(1221, "subSubSub1221");
        SubSubSubUser subSubSubUserH = new SubSubSubUser(1222, "subSubSub1222");


        subSubSubUserListA.add(subSubSubUserA);
        subSubSubUserListA.add(subSubSubUserB);

        subSubSubUserListB.add(subSubSubUserC);
        subSubSubUserListB.add(subSubSubUserD);
        subSubSubUserListC.add(subSubSubUserE);
        subSubSubUserListC.add(subSubSubUserF);
        subSubSubUserListD.add(subSubSubUserG);
        subSubSubUserListD.add(subSubSubUserH);

        List<SubSubUser> subSubUserListA = new ArrayList<>();
        List<SubSubUser> subSubUserListB = new ArrayList<>();
        subSubUserListA.add(new SubSubUser(111, "subSubSubUserName111", subSubSubUserListA));
        subSubUserListA.add(new SubSubUser(112, "subSubSubUserName112", subSubSubUserListB));
        subSubUserListB.add(new SubSubUser(121, "subSubSubUserName121", subSubSubUserListC));
        subSubUserListB.add(new SubSubUser(122, "subSubSubUserName122", subSubSubUserListD));


        List<SubUser> subUserList = new ArrayList<>();
        SubUser subUserA = new SubUser(11, "subUserName11", subSubUserListA);
        SubUser subUserB = new SubUser(12, "subUserName12", subSubUserListB);

        subUserList.add(subUserA);
        subUserList.add(subUserB);
        User user = new User(1, "userName1", subUserList);

        UserDto userDto = NestedUserConvert.INSTANCE.convert2UserDto(user);

        System.out.println(userDto);
    }



    @Test
    public void test2() {

        List<SubSubSubUser> subSubSubUserListA = new ArrayList<>();
        List<SubSubSubUser> subSubSubUserListB = new ArrayList<>();
        List<SubSubSubUser> subSubSubUserListC = new ArrayList<>();
        List<SubSubSubUser> subSubSubUserListD = new ArrayList<>();

        SubSubSubUser subSubSubUserA = new SubSubSubUser(1111, "subSubSub1111");
        SubSubSubUser subSubSubUserB = new SubSubSubUser(1112, "subSubSub1112");
        SubSubSubUser subSubSubUserC = new SubSubSubUser(1121, "subSubSub1121");
        SubSubSubUser subSubSubUserD = new SubSubSubUser(1122, "subSubSub1122");
        SubSubSubUser subSubSubUserE = new SubSubSubUser(1211, "subSubSub1211");
        SubSubSubUser subSubSubUserF = new SubSubSubUser(1212, "subSubSub1212");
        SubSubSubUser subSubSubUserG = new SubSubSubUser(1221, "subSubSub1221");
        SubSubSubUser subSubSubUserH = new SubSubSubUser(1222, "subSubSub1222");


        subSubSubUserListA.add(subSubSubUserA);
        subSubSubUserListA.add(subSubSubUserB);

        subSubSubUserListB.add(subSubSubUserC);
        subSubSubUserListB.add(subSubSubUserD);
        subSubSubUserListC.add(subSubSubUserE);
        subSubSubUserListC.add(subSubSubUserF);
        subSubSubUserListD.add(subSubSubUserG);
        subSubSubUserListD.add(subSubSubUserH);

        List<SubSubUser> subSubUserListA = new ArrayList<>();
        List<SubSubUser> subSubUserListB = new ArrayList<>();
        subSubUserListA.add(new SubSubUser(111, "subSubSubUserName111", subSubSubUserListA));
        subSubUserListA.add(new SubSubUser(112, "subSubSubUserName112", subSubSubUserListB));
        subSubUserListB.add(new SubSubUser(121, "subSubSubUserName121", subSubSubUserListC));
        subSubUserListB.add(new SubSubUser(122, "subSubSubUserName122", subSubSubUserListD));


        List<SubUser> subUserList = new ArrayList<>();
        SubUser subUserA = new SubUser(11, "subUserName11", subSubUserListA);
        SubUser subUserB = new SubUser(12, "subUserName12", subSubUserListB);

        subUserList.add(subUserA);
        subUserList.add(subUserB);
        User user = new User(1, "userName1", subUserList);

        UserDto userDto = UserDtoConvert.INSTANCE.convert2UserDto(user);

        System.out.println(userDto);
    }
}
