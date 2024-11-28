package lk.ijse.aad67.cropmonitoringsystem_backend.entity.impl;

import jakarta.persistence.*;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "field")
public class FieldEntity implements SuperEntity {
    @Id
    private String f_Code;
    private String f_Name;
    private Point f_Location;
    private Double f_Size;
    private List c_Code;
    private List s_Code;
    @Column(columnDefinition = "LONGTEXT")
    private String field_Image1;
    @Column(columnDefinition = "LONGTEXT")
    private String field_Image2;
    @ManyToOne
    private FieldEntity fieldEntity;

}
