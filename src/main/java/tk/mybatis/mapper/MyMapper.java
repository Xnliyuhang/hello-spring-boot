package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @program: hello-spring-boot
 * @description:
 * @author: Alex
 * @create: 2020-01-14 10:08
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
