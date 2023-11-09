package continuada01.src.main.java.atividade02.classesocial;

public class CalculoIBGE {
    Double quantidadeSalariosMinimos(Double renda){
        Double resultado = renda / 1045.00;
        return resultado;
    };

    String classeSocial(Double resultado){
        String classe = "";
        if(resultado <= 2.0 ){
            classe = "E";
            return classe;
        } else if (resultado <= 4.0) {
            classe = "D";
            return classe;
        } else if (resultado <= 10.0 ) {
            classe = "C";
            return classe;
        } else if(resultado <= 20.0){
            classe = "B";
            return classe;
        }else{
            classe = "A";
            return classe;
        }

    };
}
