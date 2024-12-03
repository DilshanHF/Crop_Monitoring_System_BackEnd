package lk.ijse.aad67.cropmonitoringsystem_backend.entity.impl;

import jakarta.persistence.*;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "field")
public class FieldEntity implements SuperEntity {
    @Id
    private String fieldCode;
    private String fieldName;
    private int  fieldLocation;
    private Double fieldSize;
    @OneToMany(mappedBy = "fieldEntity")
    private List<CropEntity> cropEntityList;
    @Column(columnDefinition = "LONGTEXT")
    private String field_Image1;
    @Column(columnDefinition = "LONGTEXT")
    private String field_Image2;
    @ManyToOne
    @JoinColumn(name = "logCodeField")
    private LogsEntity logField;

    @ManyToMany(mappedBy = "fieldAssigned",cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private List<StaffEntity> staffAssigned = new ArrayList<>();
    @OneToMany(mappedBy = "fieldEquipment")
    private List<EquipmentEntity> equipmentEntities;


}
