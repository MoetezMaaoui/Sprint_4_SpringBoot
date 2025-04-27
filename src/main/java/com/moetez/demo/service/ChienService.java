package com.moetez.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.moetez.demo.dto.ChienDTO;
import com.moetez.demo.entities.Chien;
import com.moetez.demo.entities.Veterinaire;

public interface ChienService {
	ChienDTO saveChien(ChienDTO c);
	ChienDTO updateChien(ChienDTO c);
    void deleteChien(Chien c);
    void deleteChienById(Long id);
    ChienDTO getChien(Long id);
    List<ChienDTO> getAllChiens();
    
    public Page<Chien> getChiensParPage(int page, int size);
    
    List<Chien> findByNomChien(String nom);
    List<Chien> findByNomChienContains(String nom);
    List<Chien> findByNomAge(String nom, Integer age);
    List<Chien> findByVeterinaire(Veterinaire veterinaire);
    List<Chien> findByVeterinaireIdVet(Long id);
    List<Chien> findByOrderByNomChienAsc();
    List<Chien> trierChiensNomsAge();

    List<Veterinaire> getAllVeterinaires();
    
    ChienDTO convertEntityToDto (Chien chien);
    Chien convertDtoToEntity (ChienDTO chienDTO);

  

}