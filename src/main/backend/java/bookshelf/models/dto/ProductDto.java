package bookshelf.models.dto;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductDto {
    private int id;
    private String name;
    private int cost;
    private String img_path;
    private String description;
    private String short_description;
    private MakerDto maker;
    private Product_typeDto product_type;
}
