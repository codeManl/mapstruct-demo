package cn.liulele.demo5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubUserDto {

    private Integer subUserDtoId;

    private String subUserDtoName;

    private List<SubSubUserDto> subUserDtoList;

}
