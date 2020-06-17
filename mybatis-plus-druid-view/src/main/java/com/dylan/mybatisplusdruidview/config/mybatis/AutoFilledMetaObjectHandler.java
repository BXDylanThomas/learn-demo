package com.dylan.mybatisplusdruidview.config.mybatis;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.dylan.mybatisplusdruidview.util.DateUtils;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.Configuration;

/**
 * @author baoxiang
 * @create 2020-06-15 13:54
 */
@Configuration
public class AutoFilledMetaObjectHandler implements MetaObjectHandler {
    public AutoFilledMetaObjectHandler() {}

    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("makeDate", DateUtils.currentDate(), metaObject);
        this.setFieldValByName("makeTime", DateUtils.currentTime(), metaObject);
        this.setFieldValByName("modifyDate", DateUtils.currentTime(), metaObject);
        this.setFieldValByName("modifyTime", DateUtils.currentTime(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("modifyDate", DateUtils.currentTime(), metaObject);
        this.setFieldValByName("modifyTime", DateUtils.currentTime(), metaObject);
    }
}
 