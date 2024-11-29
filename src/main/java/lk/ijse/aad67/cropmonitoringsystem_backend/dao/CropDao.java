package lk.ijse.aad67.cropmonitoringsystem_backend.dao;

import lk.ijse.aad67.cropmonitoringsystem_backend.entity.impl.CropEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CropDao extends JpaRepository<CropEntity,String> {
}
