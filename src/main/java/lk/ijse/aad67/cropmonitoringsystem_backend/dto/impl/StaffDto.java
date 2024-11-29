package lk.ijse.aad67.cropmonitoringsystem_backend.dto.impl;

import lk.ijse.aad67.cropmonitoringsystem_backend.dto.status.Status;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.Designation;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.Gender;
import lk.ijse.aad67.cropmonitoringsystem_backend.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StaffDto implements Status {
    private String staffId;
    private String firstName;
    private String lastName;
    private Designation staffDesignation;
    private Gender gender;
    private String joinedDate;
    private String DOB;
    private String AddressLine01;
    private String AddressLine02;
    private String AddressLine03;
    private String AddressLine04;
    private String AddressLine05;
    private String contact;
    private String email;
    private Role jobRole;
    private List<String> fields;
    private List<VehicleDto> vehicles;
    private String logCode;
}
