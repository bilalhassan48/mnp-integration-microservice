package com.zingpay.mnp.integration.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * @author Bilal Hassan on 01-Mar-21
 * @project mnp-integration-microservice
 */

@FeignClient(value = "${feign.auth.name}", url = "${feign.auth.url:#{null}}")
public interface AuthServiceClient {
    @GetMapping("/fetch-email-against-token")
    String fetchEmail(@RequestHeader(name = "Authorization") String token);
    /*@GetMapping("/fetch-authorities-against-token")
    List<Authority> fetchAuthorities(@RequestHeader(name = "Authorization") String token);*/

    @GetMapping("/fetch-accountId-against-token")
    int fetchAccountId(@RequestHeader(name = "Authorization") String token);
}
