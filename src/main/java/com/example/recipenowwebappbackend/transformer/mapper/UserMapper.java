package com.example.recipenowwebappbackend.transformer.mapper;

import com.example.recipenowwebappbackend.dto.UserDto;
import com.example.recipenowwebappbackend.entity.User;
import com.example.recipenowwebappbackend.transformer.mapper.base.BaseMapper;
import com.example.recipenowwebappbackend.transformer.mapper.base.GenericMapperConfiguration;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, config = GenericMapperConfiguration.class)
public interface UserMapper extends BaseMapper<User, UserDto> {
}