package com.littleyy.sqlSession;

import com.littleyy.pojo.Configuration;
import com.littleyy.pojo.MappedStatement;

import java.util.List;

public interface Executor {

    public <E> List<E> query(Configuration configuration,MappedStatement mappedStatement,Object... params) throws Exception;

    int updateById(Configuration configuration,MappedStatement mappedStatement,Object... params) throws Exception;

    boolean deleteById(Configuration configuration,MappedStatement mappedStatement,Object... params) throws Exception;

    boolean insertOne(Configuration configuration,MappedStatement mappedStatement,Object... params) throws Exception;

}
