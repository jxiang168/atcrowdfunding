package org.jxiang.crowd.service.impl;

import org.jxiang.crowd.entity.Admin;
import org.jxiang.crowd.mapper.AdminMapper;
import org.jxiang.crowd.service.api.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO
 *
 * @author Jxiang
 * @version 1.0
 * @create 2022-07-06 13:49
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;

    public List<Admin> getAll() {
        return adminMapper.selectByExample(null);
    }

    @Override
    public void saveAdmin(Admin admin) {
        adminMapper.insert(admin);
    }
}
