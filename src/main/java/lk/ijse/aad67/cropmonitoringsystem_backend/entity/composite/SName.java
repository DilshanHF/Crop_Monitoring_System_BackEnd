package lk.ijse.aad67.cropmonitoringsystem_backend.entity.composite;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class SName {
    private String firstName;
    private String lastName;
}