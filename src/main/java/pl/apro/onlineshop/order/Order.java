package pl.apro.onlineshop.order;


import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
    )
    protected Integer id;
    protected String model;
    protected Integer production_year;
    protected Integer engine;
    protected Float price;

}
