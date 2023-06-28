package propertyDTO.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PropertyDTO {
    private Long propertyId;
    private String propertyType;
    private String address;
    private Double rentalValue;
    private String name;
    private String lastname;
}
