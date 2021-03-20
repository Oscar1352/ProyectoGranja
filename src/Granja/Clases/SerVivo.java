package Granja.Clases;

    public abstract class SerVivo {

        private String nombre;
        private Integer TiempoDeVida;

        public SerVivo(String nombre, Integer TiempoDeVida) {
            this.nombre = nombre;
            this.TiempoDeVida = TiempoDeVida;
        }
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Integer getTiempoDeVida() {
            return TiempoDeVida;
        }

        public void setTiempoDeVida(Integer TiempoDeVida) {
            this.TiempoDeVida = TiempoDeVida;
        }

        @Override
        public String toString() {
            return "SerVivo{" + "nombre=" + nombre + ", edad=" + TiempoDeVida + '}';
        }



    }
