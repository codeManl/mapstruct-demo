package cn.liulele.demo1;

import cn.liulele.FieldEntity;
import cn.liulele.FieldName;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private Integer id;
    private FieldName name;

    private FieldEntity fieldEntity;
}
