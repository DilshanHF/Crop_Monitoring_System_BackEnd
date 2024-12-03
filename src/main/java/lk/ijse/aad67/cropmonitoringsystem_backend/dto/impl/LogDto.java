package lk.ijse.aad67.cropmonitoringsystem_backend.dto.impl;

import lk.ijse.aad67.cropmonitoringsystem_backend.dto.status.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LogDto implements Status {
    private String logCode;
    private String logDate;
    private String logDetails;
    private String observedImage;
    private List<FieldDto> fieldCode;
    private List<CropDto> cropCode;
    private List<StaffDto> staffId;
}
