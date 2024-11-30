package lk.ijse.aad67.cropmonitoringsystem_backend.utill;

import lk.ijse.aad67.cropmonitoringsystem_backend.dto.impl.CropDto;
import lk.ijse.aad67.cropmonitoringsystem_backend.dto.impl.EquipmentDto;
import lk.ijse.aad67.cropmonitoringsystem_backend.dto.impl.FieldDto;
import lk.ijse.aad67.cropmonitoringsystem_backend.dto.impl.LogDto;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.impl.CropEntity;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.impl.EquipmentEntity;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.impl.FieldEntity;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.impl.LogsEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Mapping {
    @Autowired
    private ModelMapper modelMapper;

    //for crop mapping
    public CropEntity toCropEntity(CropDto cropDto){
        return modelMapper.map(cropDto,CropEntity.class);
    }
    public CropDto toCropDto(CropEntity cropEntity){
        return modelMapper.map(cropEntity,CropDto.class);
    }
    public List<CropDto> toCropDtoList(List<CropEntity> cropEntityList){
        return modelMapper.map(cropEntityList, new TypeToken<List<CropDto>>(){}.getType());
    }
    //for equipment mapping
    public EquipmentEntity toEquipmentEntity(EquipmentDto equipmentDto){
        return modelMapper.map(equipmentDto,EquipmentEntity.class);
    }
    public EquipmentDto toEquipmentDto(EquipmentEntity equipmentEntity){
        return modelMapper.map(equipmentEntity,EquipmentDto.class);
    }
    public List<EquipmentDto> toEquipmentDtoList(List<EquipmentEntity> equipmentEntityList){
        return modelMapper.map(equipmentEntityList, new TypeToken<List<EquipmentDto>>(){}.getType());
    }
    //for Field mapping
    public FieldEntity toFieldEntity(FieldDto fieldDto){
        return modelMapper.map(fieldDto,FieldEntity.class);
    }
    public FieldDto toFieldDto(FieldEntity fieldEntity){
        return modelMapper.map(fieldEntity,FieldDto.class);
    }
    public List<FieldDto> toFieldDtoList(List<FieldEntity> fieldEntityList){
        return modelMapper.map(fieldEntityList, new TypeToken<List<FieldDto>>(){}.getType());
    }
    //for log mapping
    public LogsEntity toLogEntity(LogDto logDto) {
        return modelMapper.map(logDto, LogsEntity.class);
    }
    public LogDto toLogDto(LogsEntity logEntity) {
        return modelMapper.map(logEntity, LogDto.class);
    }
    public List<LogDto> toLogDtoList(List<LogsEntity> logEntityList){
        return modelMapper.map(logEntityList, new TypeToken<List<LogDto>>(){}.getType());
    }
}
