package cn.liulele.demo4;

import org.mapstruct.MapMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Date;
import java.util.Map;

@Mapper
public interface MapConvert {


    MapConvert INSTANCE = Mappers.getMapper(MapConvert.class);

    @MapMapping(valueDateFormat = "yyyy-MM-dd HH:mm:ss")
    Map<String, String> convert2Map(Map<String, Date> dateMap);
}
