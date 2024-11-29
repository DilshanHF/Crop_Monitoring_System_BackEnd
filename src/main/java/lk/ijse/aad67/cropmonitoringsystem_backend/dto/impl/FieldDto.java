package lk.ijse.aad67.cropmonitoringsystem_backend.dto.impl;

import jakarta.persistence.*;
import lk.ijse.aad67.cropmonitoringsystem_backend.dto.status.Status;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.impl.CropEntity;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.impl.EquipmentEntity;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.impl.LogsEntity;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.impl.StaffEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class FieldDto implements Status {
    private String fieldCode;
    private String fieldName;
    private int fieldLocation;
    private Double fieldSize;
    private List<String> crops;
    private List<String> staffField;
    private String image1;
    private String image2;
    private String logCode;
}
