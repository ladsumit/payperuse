package com.api.payperuse.controller;

import com.api.payperuse.model.UsageRecord;
import com.api.payperuse.service.UsageService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/usage")
public class UsageController {
    private final UsageService service;

    public UsageController(UsageService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<UsageRecord> saveUsageRecord(@RequestBody UsageRecord record) {
        return ResponseEntity.ok(service.saveUsageRecord(record));
    }
}
