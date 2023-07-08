package cn.liulele.demo5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor@NoArgsConstructor
public class SubUser {

    private Integer subUserId;

    private String subUserName;

    private List<SubSubUser> subSubUserList;
}
