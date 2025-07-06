package com.example.temporal_example.temporal;

import com.example.temporal_example.model.Customer;
import io.temporal.workflow.QueryMethod;
import io.temporal.workflow.SignalMethod;
import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;

@WorkflowInterface
public interface UserCreationWorkflow {
    @WorkflowMethod
    void newUserFlow(Customer customer);

    @SignalMethod
    void approved(Customer customer);

    @SignalMethod
    void rejected(Customer customer);

    @QueryMethod
    Customer getCustomer();
}
