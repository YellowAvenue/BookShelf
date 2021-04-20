package bookshelf.models.dto;

import bookshelf.models.entities.Product_type;
import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product_typeDto {
    private long id;
    private String name;

    public Product_typeDto(Product_type product_type){
        this.name = product_type.getName();
    }
}
