package com.huawei.todo.mapper.v1;

import com.huawei.todo.dto.v1.BaseEntityDto;
import com.huawei.todo.entity.BaseEntity;
import org.mapstruct.Mapper;

/**
 * @time 10:25 AM
 * @since 12/13/2019, Fri
 */
@Mapper
public interface BaseEntityMapper {
    BaseEntityDto baseEntityToBaseEntityDto(BaseEntity baseEntity);
    BaseEntity baseEntityDtoToBaseEntity(BaseEntityDto baseEntityDto);
}
