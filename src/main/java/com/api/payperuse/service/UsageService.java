package com.api.payperuse.service;

import com.api.payperuse.model.UsageRecord;
import com.api.payperuse.repository.UsageRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsageService {
    @Autowired
    private UsageRecordRepository usageRecordRepository;

    public Iterable<UsageRecord> getAllUsageRecords() {
        return usageRecordRepository.findAll();
    }

    public UsageRecord saveUsageRecord(UsageRecord usageRecord) {
        return usageRecordRepository.save(usageRecord);
    }

    public void deleteUsageRecord(Long id) {
        usageRecordRepository.deleteById(id);
    }

    public UsageRecord getUsageRecordById(Long id) {
        return usageRecordRepository.findById(id).orElse(null);
    }
}
