package com.example.quanlyvanchuyen.service.serviceimpl;

import com.example.quanlyvanchuyen.entity.Batch;
import com.example.quanlyvanchuyen.entity.Customer;
import com.example.quanlyvanchuyen.error.DataNotFoundException;
import com.example.quanlyvanchuyen.repository.BatchRepository;
import com.example.quanlyvanchuyen.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BatchServiceImpl implements BatchService {
    @Autowired
    BatchRepository batchRepository;

    @Override
    public List<Batch> listBatch() {
        return batchRepository.findAll();
    }

    @Override
    public Batch addBatch(Batch batch) {
        return  batchRepository.save(batch);


    }

    @Override
    public Batch updateBatch(Batch batch, Long id) {
        return null;
    }

    @Override
    public boolean deleteBatch(Long id) {
        return false;
    }
}
