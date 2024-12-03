package lk.ijse.aad67.cropmonitoringsystem_backend.service.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import lk.ijse.aad67.cropmonitoringsystem_backend.customStatusCode.SelectedErrorStatus;
import lk.ijse.aad67.cropmonitoringsystem_backend.dao.CropDao;
import lk.ijse.aad67.cropmonitoringsystem_backend.dao.FieldDao;
import lk.ijse.aad67.cropmonitoringsystem_backend.dao.LogsDao;
import lk.ijse.aad67.cropmonitoringsystem_backend.dto.impl.CropDto;
import lk.ijse.aad67.cropmonitoringsystem_backend.dto.status.Status;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.impl.CropEntity;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.impl.FieldEntity;
import lk.ijse.aad67.cropmonitoringsystem_backend.exceptions.DataPersistException;
import lk.ijse.aad67.cropmonitoringsystem_backend.exceptions.NotFoundException;
import lk.ijse.aad67.cropmonitoringsystem_backend.service.CropService;
import lk.ijse.aad67.cropmonitoringsystem_backend.utill.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CropServiceImpl implements CropService {
    @Autowired
    private CropDao cropDao;
    @Autowired
    private Mapping mapping;
    @Autowired
    private FieldDao fieldDao;
    @Autowired
    private LogsDao logsDao;
    @PersistenceContext
    private EntityManager entityManager;





    @Override
    public void saveCrop(CropDto cropDto) {
        System.out.println("calling the crop save service layer");

//        CropEntity cropEntity = new CropEntity();
//
//        cropEntity.setLog(logsDao.getReferenceById(cropDto.getLogCode()));
//        cropEntity.setFieldEntity(fieldDao.getReferenceById(cropDto.getFieldCode()));
//
//       cropEntity.setCropCode(cropDto.getCropCode());
//
//       cropEntity.setCommonName(cropDto.getCommonName());
//
//       cropEntity.setCropScientificName(cropDto.getCropScientificName());
//
//       cropEntity.setCropImage(cropDto.getCropImage());
//       cropEntity.setCropSeason(cropDto.getCropSeason());
//
//       cropDao.save(cropEntity);

        if ( cropDao.save(mapping.toCropEntity(cropDto)) == null) {
            throw new DataPersistException();
        }







    }

    @Override
    public void updateCrop(String cropId, CropDto cropDto) {
        Optional<CropEntity> findCrop = cropDao.findById(cropId);
        if(!findCrop.isPresent()){
            throw new NotFoundException("CropId: " + cropId + " not found");
        }else {
//            findCrop.get().setC_Code(cropDto.getCropCode());
//            findCrop.get().setCategory(cropDto.getCropCategory());
//            findCrop.get().setCommonName(cropDto.getCropCommonName());
//            findCrop.get().setCropImage(cropDto.getCropImage());
//            findCrop.get().setScientificName(cropDto.getCropScientificName());
//            findCrop.get().setSeason(cropDto.getCropSeason());
//            findCrop.get().setFieldEntity(fieldDao.getReferenceById(cropDto.getFieldCode()));
//            findCrop.get().setLog(logsDao.getReferenceById(cropDto.getLogCode()));
        }
    }

    @Override
    public void deleteCrop(String cropId) {
        Optional<CropEntity> foundCrop = cropDao.findById(cropId);

        if(!foundCrop.isPresent()){
            throw new NotFoundException("CropId: " + cropId + " not found");
        }else {
            cropDao.deleteById(cropId);
        }

    }

    @Override
    public List<CropDto> getCropList() {
        return mapping.asCropDtoList(cropDao.findAll());
    }

    @Override
    public Status getCropById(String cropId) {
        if(cropDao.existsById(cropId)){
            CropEntity cropEntity = cropDao.getReferenceById(cropId);
            return mapping.toCropDto(cropEntity);
        }else {
            return new SelectedErrorStatus(5,"Crop not found");
        }
    }

    /*@Override
    public String generateCropId() {
        TypedQuery<String> query = entityManager.createQuery(
                "SELECT c.cropCode FROM CropEntity c ORDER BY c.cropCode DESC ", String.class);
        query.setMaxResults(1);


        String lastCropId = query.getResultStream().findFirst().orElse(null);

        if (lastCropId != null) {

            int generatedCropId = Integer.parseInt(lastCropId.replace("C00-", "")) + 1;
            return String.format("C00-%03d", generatedCropId);
        } else {

            return "C00-001";
        }
    }*/
}
