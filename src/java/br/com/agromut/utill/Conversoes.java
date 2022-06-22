package br.com.agromut.utill;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversoes {

     public static Date converterData(String data)  {
        if(!data.trim().equals("") || data != null){
            try{
                SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
                return fmt.parse(data);  
            }catch(Exception ex){
                System.out.println("Problemas ao converter Data! Erro: "+ex.getMessage());
                ex.printStackTrace();
                return null;
            }
        }else{
            return null;
        }
    }
}
