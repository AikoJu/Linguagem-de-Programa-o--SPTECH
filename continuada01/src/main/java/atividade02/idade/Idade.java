package continuada01.src.main.java.atividade02.idade;

public class Idade {
    void classificaIdade(Integer idadeUsuario){
        String idade = "";

        if(idadeUsuario <= 2){
            idade ="Bebê";
        } else if (idadeUsuario <=11) {
            idade = "Criança";
        } else if (idadeUsuario <= 19) {
            idade = "Adolescente";
        }else if (idadeUsuario <= 30) {
            idade = "Jovem";
        }else if (idadeUsuario <= 60) {
            idade = "Adulto";
        }else if (idadeUsuario > 60 ) {
            idade = "Idoso";
        }
        System.out.println(String.format("Com %d anos, você é: %s",idadeUsuario, idade));
    }
}
