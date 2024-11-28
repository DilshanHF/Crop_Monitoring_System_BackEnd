package lk.ijse.aad67.cropmonitoringsystem_backend.entity.impl;

import jakarta.persistence.*;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "vehicle")
public class VehicleEntity implements SuperEntity {
    @Id
    private String vehicle_Code;
    private String vehicle_Number;
    private String vehicle_Category;
    private String fuel_Type;
    private String status;
    @ManyToOne
    @JoinColumn(name = "staffId",nullable = false)
    private StaffEntity staffEntity;
    private String remarks;


}
