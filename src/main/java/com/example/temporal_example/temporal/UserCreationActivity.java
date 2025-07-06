package com.example.temporal_example.temporal;

import com.example.temporal_example.model.Customer;
import io.temporal.activity.ActivityInterface;

@ActivityInterface
public interface UserCreationActivity {
    void persist(Customer customer);
}
