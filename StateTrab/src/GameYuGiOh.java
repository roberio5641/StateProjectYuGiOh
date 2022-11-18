import BenDezState.CartasYuGiOh;

public class GameYuGiOh {

    protected CartasYuGiOh estado;

    public GameYuGiOh(){
        estado = new Duelo();
    }

    public void Monstro(){
        estado = estado.Montro();
    }

    public void Magia(){
        estado = estado.Magia();
    }
    public void Armadilha(){
        estado = estado.Armadilha();
    }
    public void Derrota(){
        estado = estado.Derrota();
    }


}
