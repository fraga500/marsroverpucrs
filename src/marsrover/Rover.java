package marsrover;

import java.util.Scanner;
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
       /* Rover rover1 = new Rover(new Mapa.Coordenadas(1), new Mapa.Coordenadas(2), Direcao.N);

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
      */
    	menu();
}
    
     public static void menu() {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Digite o tamanho da dimensao x do planalto: ");
    	int x = in.nextInt();
    	System.out.println("Digite o tamanho da dimensao y do planalto: ");
    	int y = in.nextInt();
    	
    	Plateau planalto = new Plateau(x,y);
    	System.out.println(planalto.toString());
    	int control = 0;
    	int c = 1;
    	while(c!=0) {
    		System.out.println("Digite a posicao x do rover: ");
    		int posX = in.nextInt();
    		System.out.println("Digite a posicao y do rover: ");
    		int posY = in.nextInt();
    		
    		
    		System.out.println("Digite a direcao que o rover esta apontado ");
    		String dir = in.next();
    		Rover rover = null;
    		if(dir.charAt(0)=='N' || dir.charAt(0)=='n'){
    			rover = new Rover(new Mapa.Coordenadas(posX),new Mapa.Coordenadas(posY), Direcao.N);
    		}else if(dir.charAt(0)=='S'|| dir.charAt(0)=='s') {
    			rover = new Rover(new Mapa.Coordenadas(posX),new Mapa.Coordenadas(posY), Direcao.S);
    		}else if(dir.charAt(0)=='W' || dir.charAt(0)=='w') {
    			rover = new Rover(new Mapa.Coordenadas(posX),new Mapa.Coordenadas(posY), Direcao.W);
    		}else if(dir.charAt(0)=='E' || dir.charAt(0)=='l') {
    			rover = new Rover(new Mapa.Coordenadas(posX),new Mapa.Coordenadas(posY), Direcao.E);
    		}else {
    			System.out.println("Voce digitou alguma informa�ao errada...");
    			control = 1;
    			break;
    		}
    		
    	
    		if(control==0) {
    			System.out.println("Digite os comandos para mexer o rover: ");
    			String texto = in.next();
    			char[] comandos = texto.toCharArray();
    			Command[] comando = new Command[comandos.length];
    			for(int i =0;i<comandos.length;i++){
    				if(comandos[i]=='M' || comandos[i]=='m') {
    					comando[i] = Command.M;
    				}else if (comandos[i]=='R' || comandos[i]=='r') {
    					comando[i] = Command.R;
    				}else if (comandos[i]=='L' || comandos[i]=='l') {
    					comando[i] = Command.L;
    				}else {
    					System.out.println("Comando Invalido!");
    					break;
    				}
    			}
    			rover.processCommands(comando);
    			System.out.println(rover.getPosicao());
    		}
    	    	
    	
    	System.out.println("Deseja comandar mais um rover ? (Digite 1-sim e 0-n�o)");
    	c = in.nextInt();
    	}
    	
    	
    	
    	
    	
    	
    	
    }
}
