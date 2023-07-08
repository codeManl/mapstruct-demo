package cn.liulele.demo5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubSubUserDto {

    private Integer subSubUserDtoId;

    private String subSubUserDtoName;

    private List<SubSubSubUserDto> subSubSubUserDtoList;
}
