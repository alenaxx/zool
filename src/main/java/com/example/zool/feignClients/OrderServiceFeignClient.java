package com.example.zool.feignClients;
import com.example.zool.dto.OrderDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;
@FeignClient(name = "order-client")
public interface OrderServiceFeignClient {
    @GetMapping("/{id}/items")
    ResponseEntity<OrderDto> getOrderItems(@PathVariable("id") UUID id);


}
