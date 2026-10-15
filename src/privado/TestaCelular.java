package privado;

public class TestaCelular {
    public static void main(String[] args){
        Celular meuCelular = new Celular();
        meuCelular.setMarca("Samsung");
        meuCelular.setModelo("A15");
        meuCelular.setAno(2022);
        System.out.println("Marca: " + meuCelular.getMarca());
        System.out.println("Modelo: " + meuCelular.getModelo());
        System.out.println("Ano: " + meuCelular.getAno());
    }
}
