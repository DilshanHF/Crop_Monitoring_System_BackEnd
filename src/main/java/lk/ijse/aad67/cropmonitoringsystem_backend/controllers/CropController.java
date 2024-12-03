package lk.ijse.aad67.cropmonitoringsystem_backend.controllers;

import lk.ijse.aad67.cropmonitoringsystem_backend.dto.impl.CropDto;
import lk.ijse.aad67.cropmonitoringsystem_backend.exceptions.DataPersistException;
import lk.ijse.aad67.cropmonitoringsystem_backend.service.CropService;
import lk.ijse.aad67.cropmonitoringsystem_backend.utill.AppUtill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("api/v1/crop")
public class CropController {
    @Autowired
    private CropService cropService;

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> saveCrop(
            @RequestPart("cropCode") String cropCode,
            @RequestPart ("cropCommonName") String cropCommonName,
            @RequestPart ("cropScientificName") String cropScientificName,
            @RequestPart ("cropCategory") String cropCategory,
            @RequestPart ("cropImage") MultipartFile cropImage,
            @RequestPart ("cropSeason") String cropSeason,
            @RequestPart ("fieldCode") String fieldCode,
            @RequestPart ("logCode") String logCode
    ){
        System.out.println("print crop code: " + fieldCode);
        try {
            CropDto cropDto = new CropDto();
            cropDto.setCropCode(cropCode);
            cropDto.setCommonName(cropCommonName);
            cropDto.setCropScientificName(cropScientificName);
            cropDto.setCropCategory(cropCategory);
            cropDto.setCropImage(AppUtill.convertImage(cropImage));
            cropDto.setCropSeason(cropSeason);
            cropDto.setFieldCode(fieldCode);
            cropDto.setLogCode(logCode);
           // System.out.println("Dto print crop saved method:"+cropDto);

            cropService.saveCrop(cropDto);

            return new ResponseEntity<>(HttpStatus.CREATED);

        } catch (IOException | DataPersistException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }



}
