package com.nicordesigns.ws;


import com.woosoo.remote.ApplicantType;
import com.woosoo.remote.InsuranceRequest;
import com.woosoo.remote.InsuranceResponse;
import com.woosoo.remote.WidgetInfoType;
import org.springframework.stereotype.Service;

@Service
public class InsuranceServiceImpl implements InsuranceService {
    @Override
    public void writeInsuranceApplication(InsuranceRequest insuranceRequest) {

        ApplicantType applicantType = insuranceRequest.getApplicant();
        System.out.println("Insur... Applicant : "+ applicantType.getFirstName());
        System.out.println("Insur... Applicant : "+ applicantType.getLastName());
        System.out.println("Insur... Applicant : "+ applicantType.getSSN());

        WidgetInfoType widgetInfoType = insuranceRequest.getWidgetInfo();
        System.out.println("Insur... Widge.. : " + widgetInfoType.getWgtAmount());
        System.out.println("Insur... Widge.. : " + widgetInfoType.getWgtContractNumber());

    }

    @Override
    public InsuranceResponse processInsuranceApplication(InsuranceRequest insuranceApplication) {
        InsuranceResponse insuranceResponse = new InsuranceResponse();

        insuranceResponse.setValue("?");
        insuranceResponse.setAmount("999,999");
        insuranceResponse.setUserID("191765");
        return insuranceResponse;
    }
}