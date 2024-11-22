package lk.ijse.aad67.cropmonitoringsystem_backend.entity.impl;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

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
}
