package models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Agendamento {
	    
		private Cliente cliente;
		private Instrutor instrutor;
		private Treino treino;
	    private Date data;

	    public Agendamento(Cliente cliente, Instrutor instrutor, String data) {
	        this.cliente = cliente;
	        this.instrutor = instrutor;
	        try {
	            this.data =  new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
	        } catch (ParseException ex) {
	            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    }
	     
	    public Cliente getCliente() {
	        return cliente;
	    }

	    public void setCliente(Cliente cliente) {
	        this.cliente = cliente;
	    }
	    
		public Instrutor getInstrutor() {
			return instrutor;
		}
		
		public void setInstrutor(Instrutor instrutor) {
			this.instrutor = instrutor;
		}
		
		public Treino getTreino() {
			return treino;
		}
		
		public void setTreino(Treino treino) {
			this.treino = treino;
		}
	    public String getDataFormatada(){
	        return new SimpleDateFormat("dd/MM/yyyy").format(data);
	    }

	    public String getHoraFormatada(){
	        return new SimpleDateFormat("HH:mm").format(data);
	    }
	}


