package com.zhsj.demo.dao;

import org.springframework.stereotype.Component;

import com.zhsj.demo.util.db.DS;
import com.zhsj.demo.util.db.DynamicDataSource;

@Component
@DynamicDataSource(DS.DB_MANAGE)
public interface UserDao {

	int insert();
}
