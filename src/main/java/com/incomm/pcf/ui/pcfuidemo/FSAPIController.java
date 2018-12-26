package com.incomm.pcf.ui.pcfuidemo;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
;
@RestController
public class FSAPIController {


    /*@RequestMapping("/fsapi")
    public ResponseEntity callFsapi() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://10.42.81.163:9000/cxf/v1/apisecurity/partners", String.class);
        System.out.println("Response from FSAPI :: "+responseEntity.getBody());
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccessControlAllowOrigin("*");
        return responseEntity;
    }*/

    @RequestMapping("/fsapi")
    public String callFsapi() {
        //RestTemplate restTemplate = new RestTemplate();
        //ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://10.42.81.163:9000/cxf/v1/apisecurity/partners", String.class);
        //System.out.println("Response from FSAPI :: "+responseEntity.getBody());
        /*HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccessControlAllowOrigin("*");*/
        String json = "{\"transId\":\"abc123\",\"amount\":\"1234\"}";
        System.out.println("Response from FSAPI :: "+json);
        return json;
    }
}