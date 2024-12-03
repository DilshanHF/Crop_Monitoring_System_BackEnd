package lk.ijse.aad67.cropmonitoringsystem_backend.entity.impl;

import jakarta.persistence.*;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
@Table(name = "cropTable")
public class CropEntity implements SuperEntity {
    @Id
    private String cropCode;
    private String commonName;
    private String cropScientificName;
    @Column(columnDefinition = "LONGTEXT")
    private String cropImage;
    private String cropCategory;
    private String cropSeason;
    @ManyToOne
    @JoinColumn(name = "fieldId", nullable = false)
    private FieldEntity fieldEntity;
    @ManyToOne
    @JoinColumn(name = "logCode", nullable = false)
    private LogsEntity log;

}
