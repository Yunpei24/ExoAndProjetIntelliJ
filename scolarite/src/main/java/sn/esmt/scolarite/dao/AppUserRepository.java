//DAO signifie "Data Access Object"
//utilisé pour accéder à des données stockées dans une base de données.
package sn.esmt.scolarite.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.esmt.scolarite.entities.AppUserEntity;


//cette annotation marque la classe AppUserRepository comme étant un composant de la couche DAO.
@Repository
//l'interface AppUserRepository qui étend la classe JpaRepository
public interface AppUserRepository extends JpaRepository<AppUserEntity,Integer> {
    AppUserEntity findById(int id);
    AppUserEntity findByEmailAndPassword(String email, String password);

}

