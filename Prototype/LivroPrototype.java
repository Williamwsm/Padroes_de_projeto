package Padroes.Prototype;

public  abstract  class LivroPrototype {
        private String dedicatoria;
        private String autor;
        private  String assunto;
        private String titulo;
        private  String categotia;
        public abstract String exibirInfo();

        public  void setDedicatoria(String dedicatoria){
                this.dedicatoria = dedicatoria;
        }

        public String getDedicatoria() {
                return dedicatoria;
        }

        public String getAutor() {
                return autor;
        }

        public void setAutor(String autor) {
                this.autor = autor;
        }

        public String getAssunto() {
                return assunto;
        }

        public void setAssunto(String assunto) {
                this.assunto = assunto;
        }

        public String getTitulo() {
                return titulo;
        }

        public void setTitulo(String titulo) {
                this.titulo = titulo;
        }

        public String getCategotia() {
                return categotia;
        }

        public void setCategotia(String categotia) {
                this.categotia = categotia;
        }

        public abstract   LivroPrototype clonar();

}
