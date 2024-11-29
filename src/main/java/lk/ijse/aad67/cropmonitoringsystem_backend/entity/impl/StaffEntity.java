package lk.ijse.aad67.cropmonitoringsystem_backend.entity.impl;

import jakarta.persistence.*;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.Designation;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.Gender;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.Role;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.SuperEntity;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.composite.Address;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.composite.SName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "staff")
public class StaffEntity implements SuperEntity {
    @Id
    private String staffId;
    @Embedded
    private SName name;
    @Enumerated(EnumType.STRING)
    private Designation designation;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Date joinedDate;
    private Date DOB;
    @Embedded
    private Address address;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String contact;
    private String email;

    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(
            name = "staff_field",
            joinColumns = @JoinColumn(name = "staff_id"),
            inverseJoinColumns = @JoinColumn(name = "field_id")
    )
    private List<FieldEntity> fieldAssigned = new ArrayList<>();

    @OneToMany(mappedBy = "staffEntity")
    private List<VehicleEntity> vehicleEntity;

    @OneToMany(mappedBy = "staffEquipment")
    private List<EquipmentEntity> staffEquipment;



    @ManyToOne
    @JoinColumn(name = "logCode",nullable = false)
    private LogsEntity log;


}
