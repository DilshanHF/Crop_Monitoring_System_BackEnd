package lk.ijse.aad67.cropmonitoringsystem_backend.customStatusCode;

import lk.ijse.aad67.cropmonitoringsystem_backend.dto.status.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SelectedErrorStatus implements Status {
    private int statusCode;
    private String message;
}
