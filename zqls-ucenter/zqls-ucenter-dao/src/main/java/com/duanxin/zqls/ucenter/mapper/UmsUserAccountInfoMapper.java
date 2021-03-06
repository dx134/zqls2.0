package com.duanxin.zqls.ucenter.mapper;

import com.duanxin.zqls.ucenter.model.UmsUserAccountInfo;
import tk.mybatis.mapper.common.Mapper;

/**
 * 用户账户信息DAO层接口
 * @author duanxin
 * @version 1.0
 * @date 2019/10/15 10:14
 */
public interface UmsUserAccountInfoMapper extends Mapper<UmsUserAccountInfo> {
    /**
     * 根据学工号查询用户账户信息
     * @param jobNumber 学工号
     * @date 2019/11/23 11:36
     * @return com.duanxin.zqls.ucenter.model.UmsUserAccountInfo
     **/
    UmsUserAccountInfo selectByJobNumber(String jobNumber);
}
