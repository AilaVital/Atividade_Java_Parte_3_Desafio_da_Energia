public class Main {
    public static void main(String[] args) {
        Personagem p1 = new Personagem("Luna", "Maga", 3, 100, 60);
        Personagem p2 = new Personagem("Kael", "Guerreiro", 2, 90, 25);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println();

        p1.usarHabilidade("Bola de Fogo", 30);

        p1.usarHabilidade("Tempestade", 50);

        p1.descansar(80);

        p2.usarHabilidade("Golpe Pesado", 25);

        p2.setEnergia(150);
        System.out.println();

        System.out.println(p1);
        System.out.println(p2);
    }
}