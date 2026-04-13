package com.quiz.quiz_GonzalezDiaz_GutierrezR.config;

import com.quiz.quiz_GonzalezDiaz_GutierrezR.entity.Truck;
import com.quiz.quiz_GonzalezDiaz_GutierrezR.repository.TruckRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    public CommandLineRunner loadData(TruckRepository truckRepository) {
        return args -> {
            if (truckRepository.count() == 0) {
                truckRepository.save(new Truck("Truck 1", "Volvo", 12.5, "Blanco", "ABC123", "Juan Pérez"));
                truckRepository.save(new Truck("Truck 2", "Scania", 18.0, "Azul", "XYZ789", "Laura Gómez"));
            }
        };
    }
}
