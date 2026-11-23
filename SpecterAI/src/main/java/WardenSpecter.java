public class WardenSpecter extends SpecterIA {

  public WardenSpecter(MemoriaDeCombate memoria) {
    super(memoria);
  }

  @Override
  public void executarTurno() {
    if (!estaAtivo()) return;
    registrarNaMemoria("Warden segurou a linha");
    System.out.println("Warden controla o ritmo e segura a linha!");
  }
}
