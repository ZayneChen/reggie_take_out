package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ZayneChen
 * @date 2022年07月18日 8:41
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
