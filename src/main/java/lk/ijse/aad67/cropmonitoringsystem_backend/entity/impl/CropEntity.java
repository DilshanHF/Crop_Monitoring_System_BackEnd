package lk.ijse.aad67.cropmonitoringsystem_backend.entity.impl;

import jakarta.persistence.*;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.mapping.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "crop_table")
public class CropEntity implements SuperEntity {
    @Id
    private String c_Code;
    private String common_Name;
    private String scientific_Name;
    @Column(columnDefinition = "LONGTEXT")
    private String c_Image;
    private String category;
    private String season;
    @ManyToOne
    @JoinColumn(name = "fieldId", nullable = false)
    private FieldEntity fieldEntity;
    @ManyToOne
    @JoinColumn(name = "logCode", nullable = false)
    private LogsEntity log;

}
