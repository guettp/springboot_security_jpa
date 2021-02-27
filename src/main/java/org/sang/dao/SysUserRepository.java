package org.sang.dao;

import org.sang.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by guettp on 2021/2/27.
 */
public interface SysUserRepository extends JpaRepository<SysUser, Long> {
    SysUser findByUsername(String username);
}
