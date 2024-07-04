package desafio.dominio;

public class Curso extends Conteudo {

    private int cargahoraria;

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }
        @Override
        public double calcularXp() {
            return XP_PADRAO * cargahoraria;
        }
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargahoraria=" + cargahoraria +
                '}';
    }
}
