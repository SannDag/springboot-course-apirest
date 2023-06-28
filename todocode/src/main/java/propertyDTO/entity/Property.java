package propertyDTO.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Property {
    private Long propertyId;
    private String propertyType;
    private String address;
    private Double squareMeters;
    private Double rentalValue;
}
