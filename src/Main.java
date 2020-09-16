import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
     try{
        Pessoa p1 = new Pessoa("Luís",sdf.parse("20/01/2001"));
        p1.verificaDataNascimento();
    } catch(ParseException e){
         e.getMessage();
     }
}}
