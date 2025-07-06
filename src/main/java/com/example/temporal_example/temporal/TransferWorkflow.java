package com.example.temporal_example.temporal;

import com.example.temporal_example.model.Transaction;
import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;

@WorkflowInterface
public interface TransferWorkflow {
    @WorkflowMethod
    public void transfer(Transaction transaction);
}
