<<<<<<< HEAD
package marsrover;


public class Posicao implements Mapa {

    private Coordenadas x = null;
    private Coordenadas y = null;
    private Direcao direcao = null;

    public Posicao(Coordenadas x, Coordenadas y, Direcao direcao) {
        this.direcao = direcao;
        this.x = x;
        this.y = y;
    }

    public void setDirecaoR() {
        direcao = direcao.R();
    }

    public void setDirecaoL() {
        direcao = direcao.L();
    }

    @Override
    public Coordenadas getPosicaoX() {
        return x;
    }

    @Override
    public Coordenadas getPosicaoY() {
        return y;
    }

    @Override
    public Direcao getDirecao() {
        return direcao;
    }

    @Override
    public String toString() {
        return getPosicaoX().getCoordenadas() + "-" + getPosicaoY().getCoordenadas() + "-"
                + getDirecao().name();
    }

=======
package marsrover;


public class Posicao implements Mapa {

    private Coordenadas x = null;
    private Coordenadas y = null;
    private Direcao direcao = null;

    public Posicao(Coordenadas x, Coordenadas y, Direcao direcao) {
        this.direcao = direcao;
        this.x = x;
        this.y = y;
    }

    public void setDirecaoR() {
        direcao = direcao.R();
    }

    public void setDirecaoL() {
        direcao = direcao.L();
    }

    @Override
    public Coordenadas getPosicaoX() {
        return x;
    }

    @Override
    public Coordenadas getPosicaoY() {
        return y;
    }

    @Override
    public Direcao getDirecao() {
        return direcao;
    }

    @Override
    public String toString() {
        return getPosicaoX().getCoordenadas() + "-" + getPosicaoY().getCoordenadas() + "-"
                + getDirecao().name();
    }

>>>>>>> refs/remotes/origin/master
}