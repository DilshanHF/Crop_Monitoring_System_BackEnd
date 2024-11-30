package lk.ijse.aad67.cropmonitoringsystem_backend.service;

import lk.ijse.aad67.cropmonitoringsystem_backend.dto.impl.CropDto;
import lk.ijse.aad67.cropmonitoringsystem_backend.dto.status.Status;

import java.util.List;

public interface CropService {
    void saveCrop(CropDto cropDto);
    void updateCrop(String cropId,CropDto cropDto);
    void deleteCrop(String cropId);
    List<CropDto> getCropList();
    Status getCropById(String cropId);
    String generateCropId();

}
