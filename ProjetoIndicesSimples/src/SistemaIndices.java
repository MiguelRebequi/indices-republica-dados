import java.util.Scanner;

/**
 * Menu simples para registrar e apresentar os índices da atividade.
 */
public class SistemaIndices {
    // Scanner utilizado para ler o que o usuário digita no teclado.
    private static final Scanner TECLADO = new Scanner(System.in);

    // Objeto que guarda todos os resultados informados no menu.
    private static final ResultadoIndices RESULTADO = new ResultadoIndices();

    // Método principal: inicia e mantém o menu em funcionamento.
    public static void main(String[] args) {
        // A variável recebe a opção escolhida pelo usuário.
        int opcao;

        // O menu continua aparecendo até que o usuário escolha zero.
        do {
            mostrarMenu();
            opcao = lerInteiro("Escolha uma opção: ");

            // Cada número chama um método diferente do sistema.
            switch (opcao) {
                case 1 -> informarTotalValido();
                case 2 -> informarCandidato();
                case 3 -> informarSatisfacao();
                case 4 -> informarSaude();
                case 5 -> mostrarResultado();
                case 6 -> carregarExemploDaAula();
                case 0 -> System.out.println("Programa encerrado.");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        // Fecha o leitor quando o programa termina.
        TECLADO.close();
    }

    // Exibe as opções disponíveis. Este método apenas imprime textos.
    private static void mostrarMenu() {
        System.out.println("\n=== ÍNDICES DA REPÚBLICA DOS DADOS ===");
        System.out.println("1 - Informar total de registros válidos");
        System.out.println("2 - Informar candidato e quantidade");
        System.out.println("3 - Informar satisfação média");
        System.out.println("4 - Informar quantidade do tema Saúde");
        System.out.println("5 - Mostrar índices e conclusão");
        System.out.println("6 - Carregar exemplo da aula");
        System.out.println("0 - Sair");
    }

    // Recebe e guarda o total válido já encontrado na base tratada.
    private static void informarTotalValido() {
        int total = lerInteiro("Total de registros válidos: ");
        RESULTADO.setTotalValidos(total);
        System.out.println("Total registrado.");
    }

    // Recebe nome, quantidade e percentual já pronto do candidato.
    private static void informarCandidato() {
        System.out.print("Nome do candidato: ");
        String nome = TECLADO.nextLine();
        int quantidade = lerInteiro("Quantidade encontrada: ");
        System.out.print("Percentual já calculado: ");
        String percentual = TECLADO.nextLine();
        RESULTADO.informarCandidato(nome, quantidade, percentual);
        System.out.println("Candidato registrado.");
    }

    // Recebe a média de satisfação já pronta.
    private static void informarSatisfacao() {
        System.out.print("Satisfação média: ");
        String media = TECLADO.nextLine();
        RESULTADO.setSatisfacaoMedia(media);
        System.out.println("Satisfação registrada.");
    }

    // Recebe quantidade e percentual já pronto do tema Saúde.
    private static void informarSaude() {
        int quantidade = lerInteiro("Quantidade do tema Saúde: ");
        System.out.print("Percentual de Saúde já calculado: ");
        String percentual = TECLADO.nextLine();
        RESULTADO.setTotalSaude(quantidade);
        RESULTADO.setPercentualSaude(percentual);
        System.out.println("Tema Saúde registrado.");
    }

    // Exibe tudo que foi digitado e a conclusão escrita na outra classe.
    private static void mostrarResultado() {
        if (RESULTADO.getTotalValidos() == 0) {
            System.out.println("Informe o total de registros válidos primeiro.");
            return;
        }

        System.out.println("\n=== RESULTADO ===");
        System.out.println(RESULTADO.gerarConclusao());
    }

    // Preenche o objeto com os dados reais usados na aula para demonstração.
    private static void carregarExemploDaAula() {
        RESULTADO.setTotalValidos(316);
        RESULTADO.informarCandidato("Carlos Chave Primária", 83, "26,27%");
        RESULTADO.setSatisfacaoMedia("5,60");
        RESULTADO.setTotalSaude(68);
        RESULTADO.setPercentualSaude("21,52%");
        System.out.println("Exemplo carregado. Escolha a opção 5 para visualizar.");
    }

    // Lê números inteiros e repete a pergunta quando a entrada está incorreta.
    private static int lerInteiro(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return Integer.parseInt(TECLADO.nextLine());
            } catch (NumberFormatException erro) {
                System.out.println("Digite um número inteiro.");
            }
        }
    }

}
