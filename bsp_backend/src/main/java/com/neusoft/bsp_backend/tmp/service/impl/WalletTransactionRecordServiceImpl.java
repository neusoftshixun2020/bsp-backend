package com.neusoft.bsp_backend.tmp.service.impl;

import com.neusoft.bsp_backend.common.base.BaseEntity;
import com.neusoft.bsp_backend.tmp.entity.WalletTransactionRecord;
import com.neusoft.bsp_backend.tmp.mapper.WalletTransactionRecordMapper;
import com.neusoft.bsp_backend.tmp.service.WalletTransactionRecordService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class WalletTransactionRecordServiceImpl implements WalletTransactionRecordService {
    @Autowired
    WalletTransactionRecordMapper walletTransactionRecordMapper;

    @Override
    public int insert(WalletTransactionRecord walletTransactionRecord) {
        return walletTransactionRecordMapper.insert(walletTransactionRecord);
    }

    @Override
    public int update(WalletTransactionRecord walletTransactionRecord) {
        return walletTransactionRecordMapper.update(walletTransactionRecord);
    }

    @Override
    public int delete(int pk) {
        return walletTransactionRecordMapper.delete(pk);
    }

    @Override
    public WalletTransactionRecord getById(int pk) {
        return walletTransactionRecordMapper.getById(pk);
    }

    @Override
    public List<WalletTransactionRecord> getAllByFilter(Map<String, Object> map) {
        return walletTransactionRecordMapper.getAllByFilter(map);
    }

    @Override
    public List<WalletTransactionRecord> getAll() {
        return walletTransactionRecordMapper.getAll();
    }
}
