package bookshelf.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class ProductSectionIdDTO {
    @JsonProperty(value = "productsId")
    List<Long> id = new ArrayList<>();

    public List<Long> getId() {
        return id;
    }

    public ProductSectionIdDTO(List<Long> id) {
        this.id = id;
    }

    public ProductSectionIdDTO() {
    }
}
