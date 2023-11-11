package continuada03.atividades.atividade0111.consultoria;

public class Teste {
    public static void main(String[] args) {
        Consultoria consultoria01 = new Consultoria("Luz",5);
        Consultoria consultoria02 = new Consultoria("Elere",50);

        Dev dev01 = new Dev("Maria",50,25.00);
        Dev dev02 = new Dev("Fátima",10,10.00);
        Dev dev03 = new Dev("Carla",40,30.00);
        DevMobile devMobile01 = new DevMobile("Larissa",180,5.0,10,20.0);
        DevMobile devMobile02 = new DevMobile("Thais",30,55.0,18,16.0);
        DevMobile devMobile03 = new DevMobile("Luiza",73,100.0,4,32.0);

        System.out.println(dev01.getSalario());
        System.out.println(devMobile03.getSalario());

        consultoria01.contratar(dev01);
        consultoria01.contratar(dev02);
        consultoria01.contratar(devMobile02);

        consultoria02.contratar(dev03);
        consultoria02.contratar(devMobile01);
        consultoria02.contratar(devMobile03);

        System.out.println(consultoria01.existePorNome("Arnaldo"));
        System.out.println(consultoria02.getDevPorNome("Larissa"));
        System.out.println(consultoria01.getDevPorNome("Carla"));

        System.out.println(consultoria01.getTotalSalarios());
        System.out.println(consultoria02.getTotalSalarios());


        System.out.println(consultoria01.getQuantidadeDevsMobile());
        System.out.println(consultoria01.getQuantidadeDevs());
        System.out.println(consultoria02.getQuantidadeDevsMobile());

        System.out.println(consultoria02.getVagas());

    }
}
