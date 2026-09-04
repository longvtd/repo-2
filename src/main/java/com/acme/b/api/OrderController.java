package com.acme.b.api;
import com.acme.b.service.OrderService;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;
@RestController
@RequestMapping("/api/partner-orders")
public class OrderController {
 private final OrderService service; public OrderController(OrderService service){this.service=service;}
 @PostMapping public long createOrder(@RequestParam String customerId,@RequestParam BigDecimal amount){return service.createOrder(customerId,amount);}
 @GetMapping("/health") public String health(){return "B-OK";}
}
