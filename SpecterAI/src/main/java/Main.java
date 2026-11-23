public class Main {
  public static void main(String[] args) {
    MemoriaDeCombate memoriaWarden = new MemoriaDeCombate("Defensivo");
    MemoriaDeCombate memoriaAssassin = new MemoriaDeCombate("Agressivo");

    SpecterIA[] arena = {
        new WardenSpecter(memoriaWarden),
        new AssassinsSpecter(memoriaAssassin)
    };

    for (SpecterIA specter : arena) {
      specter.executarTurno();
    }

    arena[0].receberDano(120);
    System.out.println("Energia do Warden: " + arena[0].getEnergia());
    System.out.println("Warden ativo: " + arena[0].estaAtivo());
    arena[0].executarTurno();

    arena[1].dessincronizar();
    System.out.println("Assassin ativo durante DESYNC: " + arena[1].estaAtivo());
    arena[1].executarTurno();
    arena[1].sincronizar();
    arena[1].executarTurno();

    System.out.println("Histórico do Warden: " + memoriaWarden.getHistoricoAcoes());
    System.out.println("Histórico do Assassin: " + memoriaAssassin.getHistoricoAcoes());
  }
}
