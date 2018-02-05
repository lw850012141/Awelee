package com.awelee.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/***
 *
 * @描述: AweleeMapper.
 * @作者: Awelee.
 * @创建时间: 2018/2/4, 15:15 .
 * @版本: V1.0.
 *
 */
public interface AweleeMapper<T> extends Mapper<T>, MySqlMapper<T> {
    //TODO
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
}
