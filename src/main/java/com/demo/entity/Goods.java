package com.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName:
 * @Description:
 * @author: baoguangyu
 * @date: 2020-09-01 09:17
 * @version: 1.0
 */
@Entity
@Table(name = "goods")
@Data
public class Goods {
    @Id
    private Long goodsId;

    private String goodsName;

    private Long goodsType;


}
