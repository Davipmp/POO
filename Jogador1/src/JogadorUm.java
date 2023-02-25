
public class JogadorUm {
	
	public String nome;
	public int xp;
	public int hp;
	private boolean envenenado = true;
	
	public JogadorUm() {
		
	}
	
	public JogadorUm(String nome) {
		this.nome = nome;
	}
	
	public int getXp() {
		return xp;
	}
	
	public int getHp() {
		return hp;
	}
	
	public boolean isEnvenenado() {
		return envenenado;
	}
	
	public void receberDanos(int pontos) {
		this.hp -= pontos;
		
	}
	
	public void receberCura(int pontos) {
		this.hp += pontos;
		
	}
	
	public void ganharExperiencia(int pontos) {
		this.xp += pontos;
		
	}
	
	public void receberAntitodo (boolean antitodo) {
		antitodo = !envenenado;
		this.envenenado = antitodo;
	}
}
