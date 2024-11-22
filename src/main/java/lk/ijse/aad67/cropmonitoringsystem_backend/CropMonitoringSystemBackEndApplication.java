package lk.ijse.aad67.cropmonitoringsystem_backend;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CropMonitoringSystemBackEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(CropMonitoringSystemBackEndApplication.class, args);
    }
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
