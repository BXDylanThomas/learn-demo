package com.dylan.mybatisplusdruidview.persistence.model;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author baoxiang
 * @create 2020-06-13 17:33
 */
@Data@Builder@AllArgsConstructor@NoArgsConstructor
public class User {

    @TableId(type = IdType.AUTO)
    private int id ;
    private String name ;
    private String address;
    private int age;
    private int grade;

    @TableField(fill = FieldFill.INSERT)
    private String makeDate;
    @TableField(fill = FieldFill.INSERT)
    private String makeTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private String modifyDate;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private String modifyTime;

}
 