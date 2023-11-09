package encapsulamentoatividade.gestaopetshop;

public class PetTeste {
    public static void main(String[] args) {
        PetShop petShop01 = new PetShop("Dogs and Gatos");
        Pet pet01 = new Pet("Larissa","Caramelo");

        petShop01.darBanho(pet01,20.00,2);

        System.out.println(pet01);
        System.out.println(petShop01);

    }
}
