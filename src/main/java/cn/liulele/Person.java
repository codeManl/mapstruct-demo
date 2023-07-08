package cn.liulele;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String personName;

    private String personAddress;

    private Integer personAge;

    private Integer id;

    private Date birth;
}
