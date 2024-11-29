package lk.ijse.aad67.cropmonitoringsystem_backend.dao;

import lk.ijse.aad67.cropmonitoringsystem_backend.entity.impl.LogsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogsDao extends JpaRepository<LogsEntity,String> {
}
