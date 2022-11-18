import BenDezState.CartasYuGiOh;

public class MagiaCard implements CartasYuGiOh {
    @Override
    public CartasYuGiOh Montro() {
        System.out.println("carta de monstro");
        return new MonstroCard();
    }

    @Override
    public CartasYuGiOh Magia() {
        System.out.println("mais uma carta de magia adicionada");
        return new MagiaCard();
    }

    @Override
    public CartasYuGiOh Armadilha() {
        System.out.println("carta armadilha");
        return new ArmadilhaCard();
    }

    @Override
    public CartasYuGiOh Derrota() {
        System.out.println("derrotado");
        return new Derrotado();
    }
}
