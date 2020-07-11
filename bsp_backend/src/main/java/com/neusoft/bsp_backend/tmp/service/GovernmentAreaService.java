package com.neusoft.bsp_backend.tmp.service;


import com.neusoft.bsp_backend.tmp.entity.GovernmentArea;

import java.util.List;
import java.util.Map;

public interface GovernmentAreaService {

    int insert(GovernmentArea governmentArea);

    int update(GovernmentArea governmentArea);

    int delete(int pk);

    GovernmentArea getById(int pk);

    List<GovernmentArea> getAllByFilter(Map<String, Object> map);

    List<GovernmentArea> getAll();

}
