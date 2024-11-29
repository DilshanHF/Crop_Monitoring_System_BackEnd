package lk.ijse.aad67.cropmonitoringsystem_backend.entity.impl;

import jakarta.persistence.*;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.SuperEntity;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.VType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "equipmentTable")
public class EquipmentEntity implements SuperEntity {
    @Id
    private String eq_Id;
    private String eq_Name;
    @Enumerated(EnumType.STRING)
    private VType eq_Type;
    private String status;
    @ManyToOne
    @JoinColumn(name = "staffId",nullable = false)
    private StaffEntity staffEquipment;
    @ManyToOne
    @JoinColumn(name = "FieldId",nullable = false)
    private FieldEntity fieldEquipment;


}
