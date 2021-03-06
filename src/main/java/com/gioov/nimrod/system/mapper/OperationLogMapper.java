package com.gioov.nimrod.system.mapper;

import com.gioov.nimrod.system.entity.OperationLogEntity;
import com.gioov.tile.mybatis.CrudMapper;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author godcheese [godcheese@outlook.com]
 * @date 2018-02-22
 */
@Component("operationLogMapper")
@Mapper
public interface OperationLogMapper extends CrudMapper<OperationLogEntity, Long> {
    /**
     * 分页获取所有操作日志
     * @return Page<OperationLogEntity>
     */
    Page<OperationLogEntity> pageAll();
}
