/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia_5.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author ldric
 */



@Controller
@Slf4j
public class ControladorInicio {
    @Value("${index.mensaje}")
    String dato;
    @GetMapping("/")
    public String inicio(Model modelo){
        String mensaje = "saludos";
        modelo.addAttribute("mensaje", mensaje);
        modelo.addAttribute("dato", dato);
        log.info("Ejecutando el controlador de inicio");
        return "index";
    }
}
