package flyweight;

import flyweight.FlyweightFactory.Sprites;

public class Client {
	/*

	 *** Exemplo:

	 No desenvolvimento de jogos são utilizadas várias imagens.
	 Elas representam as entidades que compõe o jogo, por exemplo, cenários, 
	 jogadores, inimigos, entre outros.
	 Ao criar classes que representam estas entidades,
	 é necessário vincular a elas um conjunto de imagens, que representam as animações.
	 
	 Quem desenvolve jogos pode ter pensado na duplicação de informação quando
	 as imagens são criadas pelos objetos que representam estas entidades, por exemplo,
	 a classe que representa um inimigo carrega suas imagens.
	 Quando são exibidos vários inimigos do mesmo tipo na tela,
	 o mesmo conjunto de imagens é criado repetidamente.
	 
	 A solução para esta situação de duplicação de informações pelos objetos
	 é a utilização do padrão Flyweight.
	 
	 *** Intenção do padrão:

	 Pela intenção percebemos que o padrão Flyweight
	 cria uma estrutura de compartilhamento de objetos pequenos.
	 Para o exemplo citado, o padrão será utilizado no compartilhamento de imagens entre as entidades.
	 
	 *** O que precisa ser levado em consideração:

	 A solução implementada pelo padrão Flyweight é bem intuitiva.
	 No entanto vale a pena comentar alguns detalhes.
	 Percebeu que, na classe fábrica fica centralizado o acesso a todos os objetos compartilhados?
	 O aconteceria se houvessem duas ou mais instâncias desta classe?
	 Seriam criados vários objetos, sem nenhuma necessidade.

	 Para evitar este problema vale a pena dar uma olhada em outro padrão, o Singleton.
	 Aplicando este padrão na classe fábrica, garantimos que apenas uma instância dela será utilizada
	 em todo o projeto.

	 O ponto fraco do padrão é que, dependendo da quantidade e da organização dos objetos
	 a serem compartilhados, pode haver um grande custo para procura dos objetos compartilhados.
	 Então ao utilizar o padrão deve ser analisado qual a prioridade no projeto, espaço ou tempo de execução.
 
	*/

	public static void main(String[] args) {
		
		FlyweightFactory factory = new FlyweightFactory();
		 
	    factory.getFlyweight(Sprites.CENARIO_1).desenharImagem(new Ponto(0, 0));
	 
	    factory.getFlyweight(Sprites.JOGADOR).desenharImagem(new Ponto(10, 10));
	 
	    factory.getFlyweight(Sprites.INIMIGO_1).desenharImagem(new Ponto(100, 10));
	    factory.getFlyweight(Sprites.INIMIGO_1).desenharImagem(new Ponto(120, 10));
	    factory.getFlyweight(Sprites.INIMIGO_1).desenharImagem(new Ponto(140, 10));
	 
	    factory.getFlyweight(Sprites.INIMIGO_2).desenharImagem(new Ponto(60, 10));
	    factory.getFlyweight(Sprites.INIMIGO_2).desenharImagem(new Ponto(50, 10));
	 
	    factory.getFlyweight(Sprites.INIMIGO_3).desenharImagem(new Ponto(170, 10));

	}

}
