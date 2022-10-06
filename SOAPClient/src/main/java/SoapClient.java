import utez.BeanPerson;
import utez.Service;
import utez.ServiceService;

import java.util.Scanner;

public class SoapClient {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceService service = new ServiceService();
        Service port = service.getServicePort();


        String response;
        do {
            System.out.println("Dime el numero");
            int v1 = sc.nextInt(); //4
            response = port.guessNumber(v1);
            System.out.println(response);
        } while (!response.equals("No today, try again"));//!= para numericos  if(x==1){...}


/*
        //para quitar las vocales
        System.out.println("Dime la palabra");
        String nom = sc.next();
        String response1 = port.getConsonants(nom);
        System.out.println(response1);
        System.out.println("\n");

        //para el RFC
        BeanPerson person = new BeanPerson();
        System.out.println("Dime el nombre");
        String name = sc.next();
        System.out.println("Dime el apellido paterno");
        String paterno = sc.next();
        System.out.println("Dime el apellido materno");
        String materno = sc.next();
        System.out.println("Dime la fecha de tu nacimiento");
        String date = sc.next();

        person.setName(name);
        person.setPaterno(paterno);
        person.setMaterno(materno);
        person.setDate(date);
        String response2 = port.rfc(person);
        System.out.println(response2);*/
    }
}


/*
public static void main (String[] args){
        ServiceService service = new ServiceService();
        Service port = service.getServicePort();
        String response = port.responseMessage("Henrry");
        System.out.println(response);
    }
 */