package gohorse;

public class RelatorioConfig {

    // obrigatório
    private final String titulo;

    // opcional
    private final String subtitulo;

    // opcional (default true)
    private final boolean incluirCabecalho;

    // opcional (default true)
    private final boolean incluirRodape;

    // opcional (default "RETRATO")
    private final String orientacao;

    // obrigatório
    private final String usuario;

    public RelatorioConfig(String titulo, String usuario) {
        this(titulo, usuario, null, true, true, "RETRATO");
    }

    public RelatorioConfig(String titulo, String usuario, String subtitulo) {
        this(titulo, usuario, subtitulo, true, true, "RETRATO");
    }

    public RelatorioConfig(String titulo, String usuario, String subtitulo, boolean incluirCabecalho) {
        this(titulo, usuario, subtitulo, incluirCabecalho, true, "RETRATO");
    }

    public RelatorioConfig(String titulo, String usuario, String subtitulo, boolean incluirCabecalho, boolean incluirRodape) {
        this(titulo, usuario, subtitulo, incluirCabecalho, incluirRodape, "RETRATO");
    }

    public RelatorioConfig(String titulo, String usuario, String subtitulo, boolean incluirCabecalho, boolean incluirRodape, String orientacao) {
        this.titulo = titulo;
        this.usuario = usuario;
        this.subtitulo = subtitulo;
        this.incluirCabecalho = incluirCabecalho;
        this.incluirRodape = incluirRodape;
        this.orientacao = orientacao;
    }

    @Override
    public String toString() {
        return "gohorse.RelatorioConfig [titulo=" + titulo + ", subtitulo=" + subtitulo +
                ", incluirCabecalho=" + incluirCabecalho + ", incluirRodape=" + incluirRodape +
                ", orientacao=" + orientacao + ", usuario=" + usuario + "]";
    }
}