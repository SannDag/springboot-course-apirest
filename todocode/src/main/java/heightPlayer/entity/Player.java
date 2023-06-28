package heightPlayer.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    private Long id;
    private Integer dni;
    private Integer age;
    private Double weight;
    private Double height;
    private String name;
    private String lastname;
}
