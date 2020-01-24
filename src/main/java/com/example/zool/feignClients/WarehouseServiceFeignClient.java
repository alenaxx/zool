package com.example.zool.feignClients;



import com.example.zool.dto.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;
@FeignClient(name = "warehouse-client")
public interface WarehouseServiceFeignClient {

    @GetMapping(path = "/items/{id}/amount")
    Item getItemById(@PathVariable("id") UUID id) ;
}

