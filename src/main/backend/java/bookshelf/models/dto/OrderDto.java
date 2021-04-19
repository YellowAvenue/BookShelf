package bookshelf.models.dto;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderDto {
    private long id;
    private UserDto user;
    private Date orders_time;
}