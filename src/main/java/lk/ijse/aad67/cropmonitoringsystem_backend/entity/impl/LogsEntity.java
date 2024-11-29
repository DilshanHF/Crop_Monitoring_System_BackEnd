package lk.ijse.aad67.cropmonitoringsystem_backend.entity.impl;

import jakarta.persistence.*;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="logs")
public class LogsEntity implements SuperEntity {
    @Id
    private String log_code;
    private Date log_date;
    private  String log_details;
    @Column(columnDefinition = "LONGTEXT")
    private String ObservedImage;
    @OneToMany(mappedBy = "log")
    private List<StaffEntity> staff;

    @OneToMany(mappedBy = "logField")
    private List<FieldEntity> logField;

    @OneToMany(mappedBy = "log")
    private List<CropEntity> cropEntitiesCrop;
}
