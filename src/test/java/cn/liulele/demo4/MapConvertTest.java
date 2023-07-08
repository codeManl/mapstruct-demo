package cn.liulele.demo4;

import org.junit.Test;
import org.mapstruct.factory.Mappers;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MapConvertTest {

    @Test
    public void test() {
        Map<String, Date> map = new HashMap<>();

        map.put("key1",new Date());
        map.put("key2",new Date(new Date().getTime()+900000));

        Map<String, String> resultMap = MapConvert.INSTANCE.convert2Map(map);
        System.out.println(resultMap);
    }
}
