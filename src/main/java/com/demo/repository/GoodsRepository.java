package com.demo.repository;

import com.demo.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName:
 * @Description:
 * @author: baoguangyu
 * @date: 2020-09-01 09:29
 * @version: 1.0
 */
public interface GoodsRepository extends JpaRepository<Goods, Long> {

    List<Goods> findAllByGoodsIdIn(List<Long> goodsIds);

}
