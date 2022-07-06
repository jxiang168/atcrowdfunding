package org.jxiang.crowd.service.api;

import org.jxiang.crowd.entity.Admin;
import java.util.List;

/**
 * TODO
 *
 * @author Jxiang
 * @version 1.0
 * @create 2022-07-06 13:49
 */
public interface AdminService {

    public List<Admin> getAll();
    public void saveAdmin(Admin admin);
}
