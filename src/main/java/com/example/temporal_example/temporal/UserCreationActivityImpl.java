package com.example.temporal_example.temporal;

import com.example.temporal_example.model.Customer;
import com.example.temporal_example.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class UserCreationActivityImpl implements UserCreationActivity {
    final CustomerRepository customerRepository;

    @Override
    public void persist(Customer customer) {
        System.out.println("Persisting customer: " + customer);
        customerRepository.save(customer).subscribe(
            savedCustomer -> System.out.println("Customer saved: " + savedCustomer),
            error -> System.err.println("Error saving customer: " + error.getMessage())
        );
    }
}
