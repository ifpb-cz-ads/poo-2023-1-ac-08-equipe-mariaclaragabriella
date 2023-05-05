## BMQuestao03

#### Explique, com suas palavras, por que construtores de superclasses não são herdados por subclasses.

Constutores são métodos especiais únicos a cada classe utilizados
com o objetivo de criar novos 
objetos e atribuir valor aos seus campos. Esses elementos
possuem o mesmo nome da classe à que pertencem e não possuem
nenhum tipo de retorno explicíto. Quando uma classe(subclasse)
estende a outra(superclasse), apenas os métodos e atributos são
herdados. Isso ocorre porque cada classe precisa ter seu construtor
próprio para inicializar seus atributos. Embora os construtores da
superclasse não possam ser herdados, o método "super" permite que
esse construtor seja chamado dentro de uma subclasse.

