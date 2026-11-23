public class AssassinsSpecter extends SpecterIA {
    public AssassinsSpecter(MemoriaDeCombate memoria) { super(memoria); }

    @Override
    public void executarTurno() {
      if (!estaAtivo()) return;
      registrarNaMemoria("Assassin executou combo");
      System.out.println("Assassin entra em stealth e explode o combo!");
    }
}
