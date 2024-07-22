package com.example.demo.controller;

import com.example.demo.entity.RecordEntity;
import com.example.demo.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/records")
public class RecordController {

    @Autowired
    private RecordService recordService;

    @PostMapping
    public RecordEntity createRecord(@RequestBody RecordEntity record) {
        return recordService.saveRecord(record);
    }

    @GetMapping
    public List<RecordEntity> getAllRecords() {
        return recordService.getAllRecords();
    }
}