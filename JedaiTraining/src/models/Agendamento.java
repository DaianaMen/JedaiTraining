package models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Agendamento {

	private Cliente cliente;
	private Date data;


	public Agendamento(Cliente cliente, String data) {
		this.cliente = cliente;
		try {
			this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
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

	public String getDataFormatada() {
		return new SimpleDateFormat("dd/MM/yyyy").format(data);
	}

	public String getHoraFormatada() {
		return new SimpleDateFormat("HH:mm").format(data);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agendamento other = (Agendamento) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}
}


