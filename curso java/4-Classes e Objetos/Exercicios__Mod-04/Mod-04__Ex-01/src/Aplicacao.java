

public class Aplicacao {

	public static void main(String[] args) {
		
		//cria o relógio r1
		Relogio r1 = new Relogio();
		
		//acerta o relógio com o horário 3:30:50
		r1.acertarRelogio(3, 30, 50);
		
		//mostra as posições dos ponteiros do relógio
		System.out.println("relógio 1");
		System.out.println("Posição da hora: " + r1.ponteiroHora.posicao);
		System.out.println("Posição do minuto: " + r1.ponteiroMinuto.posicao);
		System.out.println("Posição do segundo: " + r1.ponteiroSegundo.posicao);
		
		//mostra a hora, minuto e segundo do relógio, que devem ser 3, 30 e 50.
		int hora = r1.lerHora();
		int minuto = r1.lerMinuto();
		int segundo = r1.lerSegundo();
		
		System.out.println("Hora: " + hora);
		System.out.println("Minuto: " + minuto);
		System.out.println("Segundo: " + segundo);
		
		//cria o relógio r2
		Relogio r2 = new Relogio();
		
		//acerta o relógio com o horário 22:00:00. O código transformará automaticamente para 10h
		r2.acertarRelogio(22, 35, 21);
		
		//lê a hora do relógio, que deve ser 10.
		System.out.println("relógio 2");
		System.out.println("Posição da hora: " + r2.ponteiroHora.posicao);
		System.out.println("Posição do minuto: " + r2.ponteiroMinuto.posicao);
		System.out.println("Posição do segundo: " + r2.ponteiroSegundo.posicao);
		
		int hora2 = r2.lerHora();
		int minuto2 = r2.lerMinuto();
		int segundo2 = r2.lerSegundo();
		
		System.out.println("Hora: " + hora2);
		System.out.println("Minuto: " + minuto2);
		System.out.println("Segundo: " + segundo2);
	}
}
