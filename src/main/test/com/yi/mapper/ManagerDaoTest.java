package com.yi.mapper;

import com.yi.entity.Manager;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ManagerDaoTest extends BaseTest {

    @Autowired
    private ManagerMapper managerMapper;

    @Test
    public void testInsertManager() throws Exception {
        int id = 2;
        int roleId = 1;
        String name = "管理员1";
        String password = "1234";

        Manager manager = new Manager();
        manager.setId(id);
        manager.setRoleId(roleId);
        manager.setName(name);
        manager.setPassword(password);
        manager.setPhone("");
        int insert = managerMapper.insert(manager);
        System.out.println("insert=" + insert);
    }

    @Test
    public void testQueryById() throws Exception{
        int id = 0;
        Manager manager = managerMapper.selectByPrimaryKey(id);
        System.out.println(manager.getName());
    }

}
