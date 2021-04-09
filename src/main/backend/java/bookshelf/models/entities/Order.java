package bookshelf.models.entities;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Component
@Entity
@Table( name = "orders")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;
    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY)
    private List<Product> products;
    private Date orders_time;
}
