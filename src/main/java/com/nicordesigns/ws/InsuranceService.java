package com.nicordesigns.ws;



import org.springframework.stereotype.Service;

public interface InsuranceService {

    void writeInsuranceApplication(InsuranceRequest insuranceRequest);
    InsuranceResponse processInsuranceApplication(InsuranceRequest insuranceApplication);

}

