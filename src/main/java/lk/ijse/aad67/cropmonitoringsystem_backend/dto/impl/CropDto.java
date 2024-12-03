package lk.ijse.aad67.cropmonitoringsystem_backend.dto.impl;

import lk.ijse.aad67.cropmonitoringsystem_backend.dto.status.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class CropDto implements Status {
    private String cropCode;
    private String cropCategory;
    private String commonName;
    private String cropImage;
    private String cropScientificName;
    private String cropSeason;
    private String logCode;
    private String fieldCode;
}

