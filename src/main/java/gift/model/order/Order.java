package gift.model.order;

import gift.model.product.Option;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(nullable = false, name = "option_id")
    private Option option;

    @Column(nullable = false, columnDefinition = "integer COMMENT '주문 수량'")
    private int quantity;

    @Column(name = "order_date_time", nullable = false)
    private LocalDateTime orderDateTime;

    @Column(columnDefinition = "VARCHAR(255) COMMENT '상품 주문 관련 메시지'")
    private String message;

    protected Order(Option option, int quantity, LocalDateTime orderDateTime,String message){
        this.option = option;
        this.quantity = quantity;
        this.orderDateTime = orderDateTime;
        this.message = message;
    }

    public Order() {}

    public Long getId() {
        return id;
    }

    public Option getOption() {
        return option;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }

    public String getMessage() {
        return message;
    }
}