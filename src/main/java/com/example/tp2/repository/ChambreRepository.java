package com.example.tp2.repository;

import com.example.tp2.entities.Bloc;
import com.example.tp2.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {

    List<Chambre> findAllByNumeroChambreIn(List<Long> numeroChambre);
    Chambre findByNumeroChambre(Long numeroChambre);
    public List<Chambre> findChambresByBloc (Bloc bloc);



}
