package com.example.demo.service;

import com.example.demo.entity.RecordEntity;
import com.example.demo.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordService {

    @Autowired
    private RecordRepository recordRepository;

    public RecordEntity saveRecord(RecordEntity record) {
        return recordRepository.save(record);
    }

    public List<RecordEntity> getAllRecords() {
        return recordRepository.findAll();
    }
}
