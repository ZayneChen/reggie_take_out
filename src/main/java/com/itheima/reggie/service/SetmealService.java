package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.dto.SetmealDto;
import com.itheima.reggie.entity.Setmeal;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ZayneChen
 * @date 2022年07月20日 16:04
 */
public interface SetmealService extends IService<Setmeal> {
    // 新增套餐，同时需要保存套餐和菜品的关联关系
    void saveWithDish(SetmealDto setmealDto);

    // 删除套餐，同时需要删除套餐和菜品关联的数据
    void removeWithDish(List<Long> ids);
}
