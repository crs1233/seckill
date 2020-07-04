package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

public interface SeckillDao {

    /**
     * 减少库存
     * @param seckillId 商品ID
     * @param killTime 秒杀商品时间
     * @return 数量
     */
    int reduceSeckill(@Param("seckillId") long seckillId ,@Param("killTime") Date killTime);

    /**
     * 查看秒杀商品
     * @param seckillId
     * @return
     */
    Seckill querySeckillById(@Param("seckillId")long seckillId);

    /**
     * 查询列表
     * @param offest
     * @param limit
     * @return
     */
    List<Seckill> queryAll(int offest,int limit);

}
