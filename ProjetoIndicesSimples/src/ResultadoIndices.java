/**
 * Guarda os resultados principais encontrados na base tratada.
 *
 * A classe não lê JSON e não faz uma auditoria completa. Os valores já
 * calculados pelos alunos são digitados no menu e armazenados neste objeto.
 */
public class ResultadoIndices {
    // Quantidade de registros que permaneceram depois do tratamento da base.
    private int totalValidos;

    // Nome do candidato que será apresentado no resultado.
    private String nomeCandidato;

    // Quantidade já contada para o candidato.
    private int totalCandidato;

    // Percentual do candidato já calculado na planilha.
    private String percentualCandidato;

    // Média de satisfação já calculada na planilha.
    private String satisfacaoMedia;

    // Quantidade já contada para o tema Saúde.
    private int totalSaude;

    // Percentual de Saúde já calculado na planilha.
    private String percentualSaude;

    // Construtor: cria um objeto vazio que será preenchido pelo menu.
    public ResultadoIndices() {
        this.totalValidos = 0;
        this.nomeCandidato = "Não informado";
        this.totalCandidato = 0;
        this.percentualCandidato = "Não informado";
        this.satisfacaoMedia = "Não informada";
        this.totalSaude = 0;
        this.percentualSaude = "Não informado";
    }

    // Retorna o total de registros válidos armazenado no objeto.
    public int getTotalValidos() {
        return totalValidos;
    }

    // Guarda o total de registros válidos informado pelo usuário.
    public void setTotalValidos(int totalValidos) {
        this.totalValidos = totalValidos;
    }

    // Retorna o nome do candidato armazenado.
    public String getNomeCandidato() {
        return nomeCandidato;
    }

    // Retorna a quantidade armazenada para o candidato.
    public int getTotalCandidato() {
        return totalCandidato;
    }

    // Retorna o percentual pronto do candidato.
    public String getPercentualCandidato() {
        return percentualCandidato;
    }

    // Guarda, de uma só vez, os três dados do candidato.
    public void informarCandidato(String nomeCandidato, int totalCandidato, String percentualCandidato) {
        this.nomeCandidato = nomeCandidato;
        this.totalCandidato = totalCandidato;
        this.percentualCandidato = percentualCandidato;
    }

    // Retorna a satisfação média armazenada.
    public String getSatisfacaoMedia() {
        return satisfacaoMedia;
    }

    // Guarda a satisfação média já calculada.
    public void setSatisfacaoMedia(String satisfacaoMedia) {
        this.satisfacaoMedia = satisfacaoMedia;
    }

    // Retorna a quantidade armazenada para o tema Saúde.
    public int getTotalSaude() {
        return totalSaude;
    }

    // Guarda a quantidade do tema Saúde.
    public void setTotalSaude(int totalSaude) {
        this.totalSaude = totalSaude;
    }

    // Retorna o percentual pronto do tema Saúde.
    public String getPercentualSaude() {
        return percentualSaude;
    }

    // Guarda o percentual de Saúde já calculado.
    public void setPercentualSaude(String percentualSaude) {
        this.percentualSaude = percentualSaude;
    }

    // Monta um texto com todos os dados. Nenhum cálculo acontece aqui.
    public String gerarConclusao() {
        return String.format(
            "Na base tratada, %s apareceu %d vezes (%s de %d registros válidos).%n" +
            "A satisfação média foi %s de 10.%n" +
            "O tema Saúde apareceu %d vezes (%s).%n" +
            "Conclusão: os números descrevem apenas a base da atividade e não uma eleição real.",
            nomeCandidato,
            totalCandidato,
            percentualCandidato,
            totalValidos,
            satisfacaoMedia,
            totalSaude,
            percentualSaude
        );
    }
}
