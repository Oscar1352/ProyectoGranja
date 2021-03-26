package Granja.Clases;

    public abstract class SerVivo {

        private String nombre;
        private Integer Edad;

        public SerVivo(String nombre, Integer Edad) {
            this.nombre = nombre;
            this.Edad = Edad;
        }
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public String toString() {
            return "SerVivo{" + "nombre=" + nombre + ", edad=" + Edad + '}';
        }



    }
