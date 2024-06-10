/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import modelo.Computadora;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Julieth
 */
@Controller
@RequestMapping("/ver.htm")
public class VerController {

    @RequestMapping(method = RequestMethod.GET)
    public String otroMetodo(Model model) {
        return "index";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String recibir(@RequestParam("txtID") String id, Model model) {
        if (id.trim() .equals("")){
        String a = "Campos vacios";
            model.addAttribute("err", a);
            return "error";
        }else{
            Computadora pc = new Computadora(1, "Dell", "Negro");
            model.addAttribute("pc", pc);
            return "exito";
            }
    }

}
