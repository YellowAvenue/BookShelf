package bookshelf.models.dto;

import bookshelf.models.entities.Maker;
import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class MakerDto {
    private long id;
    private String name;

    public MakerDto(Maker maker){
        this.id = maker.getId();
        this.name = maker.getName();
    };
}