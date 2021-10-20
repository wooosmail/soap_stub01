package com.nicordesigns.ws;




import com.woosoo.remote.InsuranceResponse;
import com.woosoo.remote.InsuranceRequest;
import org.springframework.stereotype.Service;

public interface InsuranceService {

    void writeInsuranceApplication(InsuranceRequest insuranceRequest);
    InsuranceResponse processInsuranceApplication(InsuranceRequest insuranceApplication);

}

