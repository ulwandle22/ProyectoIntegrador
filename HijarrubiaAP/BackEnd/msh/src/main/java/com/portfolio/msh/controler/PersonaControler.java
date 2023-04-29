
package com.portfolio.msh.controler;

import com.portfolio.msh.entity.Persona;
import com.portfolio.msh.interfase.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class PersonaControler {
    @Autowired IPersonaService IPersonaService; 
    private String NuevoNombre;
    private String NuevoApellido;
    private String NuevoImg;
    
    @GetMapping ("/personas/traer")
    public List<Persona> getPersona(){
        return IPersonaService.getPersona();
    } 
    
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        IPersonaService.savePersona(persona);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping ("/personas/borrar(id)")
    public String deletePersona (@PathVariable Long id){
        IPersonaService.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    //URL: PUERTO/ personas/ editar/4/nombre & apellido & img
    
    @PutMapping ("/personas/editar/(id)")
    public Persona editPersona(@PathVariable Long id, 
                               @RequestParam ("nombre") String nuevoNombre,
                               @RequestParam ("apellido") String nuevoApellido,
                               @RequestParam ("img") String nuevoImg){
    
    Persona persona = IPersonaService.findPersona(Long.MIN_VALUE);
        
    persona.setNombre(NuevoNombre);
    persona.setApellido(NuevoApellido);
    persona.setImg(NuevoImg);
    
    IPersonaService.savePersona(persona);
    return persona;
}
}
