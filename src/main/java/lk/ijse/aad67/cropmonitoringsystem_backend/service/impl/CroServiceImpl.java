package lk.ijse.aad67.cropmonitoringsystem_backend.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.aad67.cropmonitoringsystem_backend.dto.impl.CropDto;
import lk.ijse.aad67.cropmonitoringsystem_backend.dto.status.Status;
import lk.ijse.aad67.cropmonitoringsystem_backend.service.CropService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CroServiceImpl implements CropService {


    @Override
    public void saveCrop(CropDto cropDto) {

    }

    @Override
    public void updateCrop(String cropId, CropDto cropDto) {

    }

    @Override
    public void deleteCrop(String cropId) {

    }

    @Override
    public List<CropDto> getCropList() {
        return List.of();
    }

    @Override
    public Status getCropById(String cropId) {
        return null;
    }

    @Override
    public String generateCropId() {
        return "";
    }
}
