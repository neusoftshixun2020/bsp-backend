package com.neusoft.bsp_backend.product.mapper;

import com.neusoft.bsp_backend.common.base.BaseMapper;
import com.neusoft.bsp_backend.product.entity.Price;
import com.neusoft.bsp_backend.product.entity.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceMapper extends BaseMapper<Integer, Price> {
}
