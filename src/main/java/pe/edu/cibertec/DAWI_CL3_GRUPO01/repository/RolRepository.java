package pe.edu.cibertec.DAWI_CL3_GRUPO01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.cibertec.DAWI_CL3_GRUPO01.model.bd.Rol;



@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {

}
