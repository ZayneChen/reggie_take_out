package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.entity.Category;

/**
 * @author ZayneChen
 * @date 2022年07月20日 15:16
 */
public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
