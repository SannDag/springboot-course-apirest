package propertyDTO.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tenant {
    private Long tenantId;
    private String dni;
    private String name;
    private String lastname;
    private String profession;
}
