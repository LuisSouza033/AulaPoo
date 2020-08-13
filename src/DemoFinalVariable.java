public class DemoFinalVariable {
    public static void main(String[] args) {
        FinalVariable obj = new FinalVariable();
        //obj.ERRO = 25; POR ELA SER FINAL NÃO PODE SER INSTANCIADA
        System.out.println(obj.ERRO);
        
        // métodos estáticos eles são constantes, não há necessidade de criar métodos
    }
}
