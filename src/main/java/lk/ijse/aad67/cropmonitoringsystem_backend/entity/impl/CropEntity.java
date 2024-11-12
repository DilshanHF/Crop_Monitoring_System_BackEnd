package lk.ijse.aad67.cropmonitoringsystem_backend.entity.impl;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.mapping.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "crop")
public class CropEntity implements SuperEntity {
    @Id
    private String c_Code;
    private String common_Name;
    private String scientific_Name;
    @Column(columnDefinition = "LONGTEXT")
    private String c_Image;
    private String category;
    private String season;
    private List f_Code;
}
