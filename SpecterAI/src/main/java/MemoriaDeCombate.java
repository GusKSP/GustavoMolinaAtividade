import java.util.ArrayList;

public class MemoriaDeCombate {
  private String estiloAssinatura;
  private ArrayList<String> historicoAcoes;

  public MemoriaDeCombate(String estiloAssinatura) {
    this.estiloAssinatura = estiloAssinatura;
    this.historicoAcoes = new ArrayList<>();
  }

  public void registrarAcao(String acao) {
    historicoAcoes.add(acao);
  }

  public String getEstiloAssinatura() {
    return estiloAssinatura;
  }

  public ArrayList<String> getHistoricoAcoes() {
    return new ArrayList<>(historicoAcoes);
  }
}
