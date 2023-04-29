
package com.portfolio.msh.interfase;

import com.portfolio.msh.entity.Persona;
import java.util.List;


public interface IPersonaService {
 //Traer persona
    public List<Persona> getPersona();  
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona) ;
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona (Long id) ;
    
    //Buscar persona por id
    public Persona findPersona(Long id) ;
    
}
