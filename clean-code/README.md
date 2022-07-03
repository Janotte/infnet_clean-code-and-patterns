# Trabalho de Clean Code e Design Patterns



## SOLID

**S - Single-responsibility Principle:** Princípio da responsabilidade única
Uma classe deve ter apenas um motivo para mudar, ter uma única responsabilidade, isso a torna mais simples e organizada, com menos funcionalidade terá menos dependências e será mais simples de testa-lá.
-> Utilizado na entidade Funcionario, 

**O - Open-closed Principle:** (Princípio do aberto-fechado)
As classes devem ser abertas para extensão, mas fechadas para modificação. Esse principio busca impedir a geração de bugs a um código que já está funcionando.
-> Utilizado no FuncionarioService

**L - Liskov Substitution Principle (Princípio da substituição de Liskov)**
A substituição de Liskov é o mais difícil de ser compreendido. Ele diz que se a classe **A** for um subtipo da classe **B** , devemos ser capazes de substituir **B** por **A** sem interromper o comportamento do nosso programa.
-> Funcionario, FuncionarioTerceirizado

**I - Interface Segregation Principle:** (Princípio da segregação de interfaces)
Esse principio diz que interfaces maiores devem ser divididas em interfaces menores. Dessa forma iremos garantir que classes de implementação se tornem especialista para uma funcionalidade, tornando-a mais simples e fácil de ser mantida. 
-> Beneficio, AuxilioAlimentação, AuxilioEducacao e AuxilioTransporte.

**D - Dependency Inversion Principle:** (Princípio da inversão de dependência)
O principio de inversão de dependência trata do desacoplamento de módulos, assim módulos de alto nível não dependem dos de baixo nível, dessa forma ambos dependerão de abstrações.
-> ValidaReajuste






