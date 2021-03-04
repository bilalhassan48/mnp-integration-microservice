package com.zingpay.mnp.integration.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author Bilal Hassan on 01-Mar-21
 * @project mnp-integration-microservice
 */

@Getter
@Setter
public class TransactionDTO {
    private int accountId;
    private long serviceId;
    private Double amount;
    private String serviceProvider;
    private String retailerRefNumber; //MOBILE-10 digits random number or WEB-10 digits random number
    private String refTo;
    private String bundleId;
    private Date dateTime;
    private boolean success;
    //this fields is just for cardwalla
    private String email;
}
