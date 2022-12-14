package com.ybxt.identityserver.service;

import com.ybxt.identityserver.entity.PersonData;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.transaction.annotation.Transactional;

/**
根据身份证查询个人信息
 */
public interface IdentityService {

    /**
     * 根据身份证查询名字
     * @param person_id 身份证
     * @return  名字
     */
    @Transactional(timeout = 5,rollbackFor = Exception.class)
    @GlobalTransactional
    String GetName(String person_id);

    /**
     * 根据身份证查询性别
     * @param person_id 身份证
     * @return  性别
     */
    @Transactional(timeout = 5,rollbackFor = Exception.class)
    @GlobalTransactional
    String GetGender(String person_id);

    /**
     * 根据身份证查询手机号
     * @param person_id 身份证
     * @return  手机号
     */
    @Transactional(timeout = 5,rollbackFor = Exception.class)
    @GlobalTransactional
    String GetPhone(String person_id);

    /**
     * 根据身份证查询个人信息
     * @param person_id 身份证
     * @return  个人信息
     */
    @Transactional(timeout = 5,rollbackFor = Exception.class)
    @GlobalTransactional
    PersonData GetPersonData(String person_id);
}
