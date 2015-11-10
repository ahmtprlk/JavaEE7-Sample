/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.teias.egitim.adresdefteri;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.Dependent;
import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.Repository;
import tr.gov.teias.egitim.adresdefteri.entities.Adres;

/**
 *adres kayıtları için repository servisi
 * @author ahmet
 */
@Repository 
@Dependent
public abstract class AdresRepository extends AbstractEntityRepository<Adres, Long>{
    
    /**
     * verilen tckn ye sahip adres kayıt listesini döndürür
     * @param tckn
     * @return eğer kayıt bulamazsa içi boş liste döner
     */
    //Select c from Adres c where c.tckn=:tckn
    public abstract List<Adres> findByTckn(String tckn);
}
