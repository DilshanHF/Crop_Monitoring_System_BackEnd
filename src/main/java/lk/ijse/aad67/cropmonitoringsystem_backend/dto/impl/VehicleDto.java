package lk.ijse.aad67.cropmonitoringsystem_backend.dto.impl;

import lk.ijse.aad67.cropmonitoringsystem_backend.dto.status.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VehicleDto implements Status {
    private String vehicleCode;
    private String plateNumber;
    private String vehicleCategory;
    private String fuelType;
    private String vehicleStatus;
    private String staffId;
    private String remarks;
}
