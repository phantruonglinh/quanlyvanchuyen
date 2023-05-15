package com.example.quanlyvanchuyen.service;

import com.example.quanlyvanchuyen.entity.Batch;
import com.example.quanlyvanchuyen.entity.Customer;

import java.util.List;

public interface BatchService {
    List<Batch> listBatch();
    Batch addBatch(Batch batch);
    Batch updateBatch(Batch batch,Long id);
    public boolean deleteBatch(Long id);
}
