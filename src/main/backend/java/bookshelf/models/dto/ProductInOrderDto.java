package bookshelf.models.dto;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductInOrderDto {
    private long id;
    private OrderDto order;
    private ProductDto product;
    private int num_of_product;
}
