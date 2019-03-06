package com.bupt.web.admin.service;

import com.bupt.commons.dto.BaseResult;
import com.bupt.commons.dto.PageInfo;
import com.bupt.domain.TbUser;

import java.util.List;

public interface TbUserService {

    /**
     *  查询全部
     * @return
     */
    public List<TbUser> sellectAll();

    /**
     * 保存信息
     * @param tbUser
     */
    BaseResult save(TbUser tbUser);

    /**
     *  删除用户信息
     * @param id
     */
    void delete(Long id);

    /**
     *  根据 ID 获取信息
     * @param id
     * @return
     */
    TbUser getById(Long id);

    /**
     *  更新信息
     * @param tbUser
     */
    void update (TbUser tbUser);

    /**
     *  批量删除
     * @param ids
     */
    void deleteMulti(String[] ids);

    /**
     *  分页查询
     * @param start
     * @param length
     * @param draw
     * @param tbUser
     * @return
     */
    PageInfo<TbUser> page(int start, int length, int draw, TbUser tbUser);

    /**
     *  查询总笔数
     * @param tbUser
     * @return
     */
    int count(TbUser tbUser);

    /**
     * 用户登录
     * @param email
     * @param password
     * @return
     */
    TbUser login(String email,String password);
}
