package cn.liulele.demo2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NewUser {

    private String newName;

    private String gender;

    private Integer id;
}
