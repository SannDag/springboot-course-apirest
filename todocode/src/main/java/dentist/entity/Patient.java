package dentist.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    private int id;
    private int dni;
    private String name;
    private String lastname;
    private LocalDate date;

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", dni=" + dni +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", date=" + date +
                '}';
    }
}
