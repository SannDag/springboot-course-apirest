package propertyDTO.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import propertyDTO.entity.Property;
import propertyDTO.entity.PropertyDTO;
import propertyDTO.entity.Tenant;

@RestController
public class Controller {

    @GetMapping("/property/{id}")
    public PropertyDTO getProperty(@PathVariable Long id){
        Property prop = new Property(15487L, "Home", "308 Black Avenue", 200.0, 40000.0);
        Tenant ten = new Tenant(1L, "126465", "Richard", "Zuri", "Builder");

        PropertyDTO propDTO = new PropertyDTO();
        propDTO.setPropertyId(prop.getPropertyId());
        propDTO.setPropertyType(prop.getPropertyType());
        propDTO.setAddress(prop.getAddress());
        propDTO.setRentalValue(prop.getRentalValue());

        propDTO.setName(ten.getName());
        propDTO.setLastname(ten.getLastname());

        return propDTO;
    }

}
