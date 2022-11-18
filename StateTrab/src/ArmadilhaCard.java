import BenDezState.CartasYuGiOh;

public class ArmadilhaCard implements CartasYuGiOh {
    @Override
    public CartasYuGiOh Montro() {
        System.out.println("carta de monstro");
        return new MonstroCard();
    }

    @Override
    public CartasYuGiOh Magia() {
        System.out.println("carta de magia");
        return new MagiaCard();
    }

    @Override
    public CartasYuGiOh Armadilha() {
        System.out.println("mais uma carta armadilha em adicionada");
        return new ArmadilhaCard();
    }

    @Override
    public CartasYuGiOh Derrota() {
        System.out.println("derrotado");
        return new Derrotado();
    }
}
