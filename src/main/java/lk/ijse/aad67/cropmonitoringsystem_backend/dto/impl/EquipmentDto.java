package lk.ijse.aad67.cropmonitoringsystem_backend.dto.impl;

import lk.ijse.aad67.cropmonitoringsystem_backend.dto.status.Status;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.VType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EquipmentDto implements Status {
    private String equipment_Id;
    private String equipmentName;
    private VType equipmentType;
    private String equipmentStatus;
    private String staffId;
    private String fieldCode;
}
