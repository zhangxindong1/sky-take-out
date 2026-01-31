package com.sky.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeePageQueryDTO implements Serializable {

    //员工姓名
    private String name;

    //页码
    //@ApiModelProperty("查询的页码")
    private int page;

    //每页显示记录数
    //@ApiModelProperty("分页大小")
    private int pageSize;

}
