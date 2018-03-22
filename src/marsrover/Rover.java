package marsrover;

import marsrover.Mapa.Coordenadas;
import marsrover.Mapa.Direcao;

/**
 *
 * @author PedroFranceschinideF
 */
public class Rover {

    private Posicao posicao = null;

    public enum Command {
        R, L, M;

        private void process(Posicao posicao) {
            switch (this) {
                case R:
                    posicao.setDirecaoR();
                    break;
                case L:
                    posicao.setDirecaoL();
                    break;
                case M:
                    switch (posicao.getDirecao()) {
                        case N:
                            posicao.getPosicaoY().incrementar();
                            break;
                        case E:
                            posicao.getPosicaoX().incrementar();
                            break;
                        case S:
                            posicao.getPosicaoY().decrementar();
                            break;
                        case W:
                            posicao.getPosicaoX().decrementar();
                    }
            }
        }
    }

    public Rover(Coordenadas x, Coordenadas y, Direcao direction) {
        this.posicao = new Posicao(x, y, direction);
    }

    public void processCommands(Command[] commands) {
        for(int i = 0; i < commands.length; i++) {
            commands[i].process(posicao);
        }
    }

    public Mapa getPosicao() {
        return posicao;

    }

    public static void main(String[] args) {
        //LMLMLMLMM
        Rover rover1 = new Rover(new Mapa.Coordenadas(1), new Mapa.Coordenadas(2), Direcao.N);

        rover1.processCommands(new Command[]{Command.L, Command.M,
            Command.L, Command.M, Command.L, Command.M,
            Command.L, Command.M, Command.M});

        
        System.out.println(rover1.getPosicao());

        
        
        //MMRMMRMRRM
        Rover rover2 = new Rover(new Mapa.Coordenadas(3), new Mapa.Coordenadas(3), Direcao.E);
        
        rover2.processCommands(new Command[]{Command.M, Command.M,
            Command.R, Command.M, Command.M, Command.R,
            Command.M, Command.R, Command.R, Command.M});
        
        
        System.out.println(rover2.getPosicao());
    }
}
