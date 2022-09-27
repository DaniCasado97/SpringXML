/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.test.springxml;

import com.test.beans.Chalet;
import com.test.beans.Persona;
import com.test.beans.Piso;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Daniel Casado
 */
public class App {

    public static void main(String[] args) {

        System.out.println("--------------------------------------------------------------------");

        Scanner scan = new Scanner(System.in);
        System.out.println("Elija una vivienda: 1- Piso 2- Chalet");
        int respuesta = scan.nextInt();

        ApplicationContext appContext = new ClassPathXmlApplicationContext("file:src/main/resources/beans.xml");
        Persona persona = (Persona) appContext.getBean("persona1");

        switch (respuesta) {

            case 1:
                persona.setVivienda(new Piso());
                break;
            case 2:
                persona.setVivienda(new Chalet());
                break;
            default:

                break;
        }

        System.out.println(persona.getId() + " " + persona.getNombre() + " " + persona.getVivienda().show() + " " + persona.getCiudad().getNombre() + " " + persona.getCiudad().getPais().getNombre());

        ((ConfigurableApplicationContext) appContext).close();
    }
}
