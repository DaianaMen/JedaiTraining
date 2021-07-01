package views.agendamento;


import java.util.Scanner;
import controllers.AgendamentoController;


import utils.Console;

public class AgendarTreino {
	
		private static int matricula;
	    private static Scanner sc = new Scanner(System.in);
	
	   
	    public static void renderizar(){
	    	
	    boolean existe = false;
	    
	    do {	
	        System.out.println("---- AGENDAR TREINO ----");
	        System.out.println("\nInforme a matricula do Aluno:");
			matricula = Console.lerInteiro("");
			
			System.out.print("Data do Agendamento: ");
			String data = sc.next();
			System.out.print("Hora do Agendamento: ");
		    String hora = sc.next();
		    
		   try {
			   AgendamentoController.agendar(matricula, data , hora);
			   existe = true;
		   } catch (Exception e) {
			   System.out.println(e.getMessage());
		   }
       
	    }while(!existe);

		   
	}
}

