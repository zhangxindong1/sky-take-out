package com.sky.service;

import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.SetmealVO;

import java.util.List;

public interface SetmealService {

    /**
     * 新增套餐同时保存新增套餐与菜品的关联关系
     * @param setmealDTO
     */
    void saveWithDish(SetmealDTO setmealDTO);

    /**
     * 分页查询
     * @param setmealPageQueryDTO
     * @return
     */
    PageResult pageQuery(SetmealPageQueryDTO setmealPageQueryDTO);

    /**
     * 套餐批量删除
     * @param ids
     */
    void delete(List<Long> ids);

    SetmealVO getByIdWithDish(Integer id);

    void update(SetmealDTO setmealDTO);

    /**
     * 启售、停售
     * @param status
     * @param id
     */
    void startOrStop(Integer status, Long id);
}
