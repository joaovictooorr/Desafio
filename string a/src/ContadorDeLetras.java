public class ContadorDeLetras {

    public static Integer contarLetraA(String texto){
        int contador = 0;
        for(int i = 0; i < texto.length(); i++){
            char caractere = texto.charAt(i);
            if(caractere == 'a' || caractere == 'A'){
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args){

        System.out.println(contarLetraA("abelha"));

    }
}
