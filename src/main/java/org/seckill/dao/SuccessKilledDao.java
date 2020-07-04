package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

public interface SuccessKilledDao {

    /**
     * 秒杀商品
     * @param seckillId 商品ID
     * @param userPhone 用户手机
     * @return
     */
    int insertSuccessKill(long seckillId,long userPhone);

    /**
     * 根据id查询SuccessKilled并携带秒杀产品对象实体
     * @param seckillId 商品ID
     * @param userPhone 用户手机
     * @return
     */
    SuccessKilled queryByIdWithSeckill(long seckillId,long userPhone);
}
