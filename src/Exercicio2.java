public class Exercicio2 {
    public static void main(String[] args) {
        boolean existe = false;
        int quantidade = 0;
        String frase= "banco de dados";
        for(int i = 0; i < frase.length(); i++){
            char letra = frase.charAt(i);
            if(letra == 'a' || letra == 'A'){
                existe = true;
                quantidade++;
            }
        }
        if(existe){
            System.out.println("Existe");
        }
        System.out.println("Quantidade: " + quantidade);
    }
}
