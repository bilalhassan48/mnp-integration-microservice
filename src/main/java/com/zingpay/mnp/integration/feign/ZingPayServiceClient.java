package com.zingpay.mnp.integration.feign;

import com.zingpay.mnp.integration.util.Status;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * @author Bilal Hassan on 01-Mar-21
 * @project mnp-integration-microservice
 */

@FeignClient(value = "${feign.zingpay.name}", url = "${feign.zingpay.url:#{null}}")
public interface ZingPayServiceClient {
    @GetMapping("/validate/service/user/{accountId}/amount/{amount}")
    Status validateUser(@RequestHeader("Authorization") String token,
                        @PathVariable(name = "accountId") int accountId,
                        @PathVariable(name = "amount") double amount);
}
