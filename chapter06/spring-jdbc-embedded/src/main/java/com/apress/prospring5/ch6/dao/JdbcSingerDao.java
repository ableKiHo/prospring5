package com.apress.prospring5.ch6.dao;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.InitializingBean;

import javax.sql.DataSource;

public class JdbcSingerDao implements SingerDao, InitializingBean {
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String findNameById(Long id) {
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        if (dataSource == null) {
            throw new BeanCreationException("SingerDao에 dataSource를 구성해야 합니다.");
        }
    }
}
