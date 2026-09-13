public class Personagem {
    private String nome;
    private String tipo;
    private int nivel;
    private int vida;
    private int energia;

    public Personagem(String nome, String tipo, int nivel, int vida, int energia) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = (nivel >= 1) ? nivel : 1;
        this.vida = (vida >= 0 && vida <= 100) ? vida : 100;
        setEnergia(energia);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getNivel() { return nivel; }
    public void setNivel(int nivel) {
        if (nivel >= 1) {
            this.nivel = nivel;
        }
    }

    public int getVida() { return vida; }
    public void setVida(int vida) {
        if (vida >= 0 && vida <= 100) {
            this.vida = vida;
        }
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if (energia >= 0 && energia <= 100) {
            this.energia = energia;
        }
    }

    public boolean podeUsarHabilidade(int custo) {
        return custo > 0 && energia >= custo;
    }

    public void usarHabilidade(String habilidade, int custo) {
        if (podeUsarHabilidade(custo)) {
            energia -= custo;
            System.out.println(nome + " usou " + habilidade + "!");
        } else {
            System.out.println("Energia insuficiente!");
        }
    }

    public void descansar(int pontos) {
        if (pontos > 0) {
            int energiaAnterior = energia;
            energia += pontos;
            if (energia > 100) {
                energia = 100;
            }
            int recuperados = energia - energiaAnterior;
            System.out.println(nome + " descansou e recuperou " + recuperados + " pontos de energia!");
        }
    }

    @Override
    public String toString() {
        return "Personagem: " + nome 
             + " | Tipo: " + tipo 
             + " | Nível: " + nivel 
             + " | Vida: " + vida 
             + " | Energia: " + energia;
    }
}