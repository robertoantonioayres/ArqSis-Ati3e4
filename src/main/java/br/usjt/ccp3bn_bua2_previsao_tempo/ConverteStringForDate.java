package br.usjt.ccp3bn_bua2_previsao_tempo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConverteStringForDate {
	
		public Date convertDate(String dataString) {
			
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm"); 
			Date data = null;
			try {
				data = formato.parse(dataString);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return data;
			
			
		}

}
