# ImpactScope Repository B
Scope-isolation repository. It intentionally contains `OrderService#createOrder(String, BigDecimal)`, the same simple method name/signature as Repository A, but under FQCN `com.acme.b.service.OrderService`.

Evidence is intentionally different:
- API: `POST /api/partner-orders`
- Kafka: `partner.orders.created.v1`
- Database: `partner_orders`
