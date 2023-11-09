package continuada03.exemploclasseabstrata.funcionario;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionaFunc(Funcionario f){
        funcionarios.add(f);
    }

    public void exibeTodos(){
        for (Funcionario funcionario: funcionarios){
            System.out.println(funcionario);
        }
    }

    public void exibeTotalSalario(){
        Double total = 0.0;
        for (Funcionario funcionario: funcionarios) {
            total += funcionario.calcSalario();
        }

        System.out.println(total);

    }

}
