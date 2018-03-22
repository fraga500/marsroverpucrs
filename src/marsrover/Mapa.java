<<<<<<< HEAD
package marsrover;

/**
 *
 * @author PedroFranceschinideF
 */
public interface Mapa {

    public static class Coordenadas {

        int pos = 0;

        public Coordenadas(int pos) {
            this.pos = pos;
        }

        protected void incrementar() {
            pos++;
        }

        protected void decrementar() {
            pos--;
        }

        public int getCoordenadas() {
            return pos;
        }
    }

    public enum Direcao {

        N {
            @Override
            public Direcao R() {
                return E;
            }

            @Override
            public Direcao L() {
                return W;
            }
        },
        E {
            @Override
            public Direcao R() {
                return S;
            }

            @Override
            public Direcao L() {
                return N;
            }
        },
        S {
            @Override
            public Direcao R() {
                return W;
            }

            @Override
            public Direcao L() {
                return E;
            }
        },
        W {
            @Override
            public Direcao R() {
                return N;
            }

            @Override
            public Direcao L() {
                return S;
            }
        };

        public abstract Direcao R();

        public abstract Direcao L();
    }

    public Coordenadas getPosicaoX();

    public Coordenadas getPosicaoY();

    public Direcao getDirecao();

    @Override
    public String toString();

}
=======
package marsrover;

/**
 *
 * @author PedroFranceschinideF
 */
public interface Mapa {

    public static class Coordenadas {

        int pos = 0;

        public Coordenadas(int pos) {
            this.pos = pos;
        }

        protected void incrementar() {
            pos++;
        }

        protected void decrementar() {
            pos--;
        }

        public int getCoordenadas() {
            return pos;
        }
    }

    public enum Direcao {

        N {
            @Override
            public Direcao R() {
                return E;
            }

            @Override
            public Direcao L() {
                return W;
            }
        },
        E {
            @Override
            public Direcao R() {
                return S;
            }

            @Override
            public Direcao L() {
                return N;
            }
        },
        S {
            @Override
            public Direcao R() {
                return W;
            }

            @Override
            public Direcao L() {
                return E;
            }
        },
        W {
            @Override
            public Direcao R() {
                return N;
            }

            @Override
            public Direcao L() {
                return S;
            }
        };

        public abstract Direcao R();

        public abstract Direcao L();
    }

    public Coordenadas getPosicaoX();

    public Coordenadas getPosicaoY();

    public Direcao getDirecao();

    @Override
    public String toString();

}
>>>>>>> refs/remotes/origin/master
