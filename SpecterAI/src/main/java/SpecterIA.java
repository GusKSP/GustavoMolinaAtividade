public abstract class SpecterIA {

  private int energia;
  private boolean sincronizado;
  private MemoriaDeCombate memoria; // composição: TEM UMA

  public SpecterIA(MemoriaDeCombate memoria) {
    this.energia = 100;
    this.sincronizado = true;
    this.memoria = memoria;
  }

  public abstract void executarTurno();

  public void receberDano(int valor) {
    if (valor < 0) return;
    energia = Math.max(0, energia - valor);
  }

  public boolean estaAtivo() {
    return energia > 0 && sincronizado;
  }

  public void dessincronizar() {
    sincronizado = false;
  }

  public void sincronizar() {
    sincronizado = true;
  }

  public int getEnergia() {
    return energia;
  }

  protected void registrarNaMemoria(String acao) {
    memoria.registrarAcao(acao);
  }
}
