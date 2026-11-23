# Specter League — Night Patch Cell
 
> **Disciplina / Atividade:** Aula Prática POO em Java — SP Tech (24/11/2026)

## Sobre a Modelagem

Modelamos em Java o núcleo de combate da **Specter League**, substituindo a lógica anterior por uma arquitetura orientada a objetos extensível e livre de *desyncs*. A classe abstrata `SpecterIA` encapsula o estado vital (`energia` e `sincronizado`) e define o contrato polimórfico `executarTurno()`, implementado de forma distinta pelas subclasses `WardenSpecter` e `AssassinSpecter`. Além disso, separamos o histórico e estilo de luta na classe `MemoriaDeCombate`, aplicada via **composição** (`SpecterIA` *tem uma* memória).

---

## Papéis XP da Squad

| Integrante | Papel XP | Responsabilidade |
| :--- | :--- | :--- |
| **Lucas Ricardo** | Driver | Codificação direta na IDE, estruturação das classes Java e commits |
| **Enzo Martelozzo** | Navigator | Revisão em tempo real da lógica, tipos e cumprimento dos requisitos OOP |
| **Pedro Rosário** | AI Operator | Formulação dos prompts na IA generativa e filtragem das sugestões |
| **Beatriz Mustafa** | Tracker / Prompt | Controle do tempo (40 min), checklist de entrega e rastreio dos prompts |
| **Gus Kenzo** | Coach | Facilitação da squad, alinhamento conceitual e preparação do pitch |

---

## Uso Responsável de IA Generativa

* **Ferramenta utilizada:** Gemini
* **Prompts utilizados pelo grupo:**
  1. *"Analise o .md dentro da minha pasta do obsidian chamado: Aula Prática - SP Tech (24-11-2026)"*
  2. *"Eu quero que vc execute os comandos de IA permitidos. Me de o passo a passo. Crie dois .mds dentro da minha pasta do obsidian. O primeiro explicando o que é para fazer. O segundo com os resultados dos códigos executados."*
  3. *"A partir das informações dadas, crie um diagrama de classe de acordo com as regras."*



