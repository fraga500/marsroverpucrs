package marsrover;

import marsrover.Mapa.Coordenadas;
import marsrover.Mapa.Direcao;


public class Rover {

    private Posicao position = null;

    public enum Command {
        R, L, M;

        private void process(Posicao position) {
            switch (this) {
                case R:
                    position.setDirecaoR();
                    break;
                case L:
                    position.setDirecaoL();
                    break;
                case M:
                    switch (position.getDirecao()) {
                        case N:
                            position.getPosicaoY().incrementar();
                            break;
                        case E:
                            position.getPosicaoX().incrementar();
                            break;
                        case S:
                            position.getPosicaoY().decrementar();
                            break;
                        case W:
                            position.getPosicaoX().decrementar();
                    }
            }
        }
    }

    public Rover(Coordenadas x, Coordenadas y, Direcao direction) {
        this.position = new Posicao(x, y, direction);
    }

    public void processCommands(Command[] commands) {
        for(int i = 0; i < commands.length; i++) {
            commands[i].process(position);
        }
    }

    public Mapa getPosition() {
        return position;

    }

    public static void main(String[] args) {
        // Teste 1 LMLMLMLMM
        Rover rover1 = new Rover(new Mapa.Coordenadas(1), new Mapa.Coordenadas(2), Direcao.N);

        rover1.processCommands(new Command[]{Command.L, Command.M,
            Command.L, Command.M, Command.L, Command.M,
            Command.L, Command.M, Command.M});

        System.out.println(rover1.getPosition());

        // Teste 2 MMRMMRMRRM
        Rover rover2 = new Rover(new Mapa.Coordenadas(3), new Mapa.Coordenadas(3), Direcao.E);
        
        rover2.processCommands(new Command[]{Command.M, Command.M,
            Command.R, Command.M, Command.M, Command.R,
            Command.M, Command.R, Command.R, Command.M});
        
        System.out.println(rover2.getPosition());
    }
}
