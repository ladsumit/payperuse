package com.api.payperuse.repository;

import com.api.payperuse.model.UsageRecord;
import org.springframework.data.repository.CrudRepository;;

public interface UsageRecordRepository extends CrudRepository<UsageRecord, Long> {
}
