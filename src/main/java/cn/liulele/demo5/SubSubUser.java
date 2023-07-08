package cn.liulele.demo5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubSubUser {

    private Integer subSubUserId;

    private String  subSubUserName;

    private List<SubSubSubUser> subSubSubUserList;
}
