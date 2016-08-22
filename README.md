# Decorator Pattern

Example by packge br.com.decoratorpatter site: http://www.tutorialspoint.com/design_pattern/decorator_pattern.htm
Example by packge br.com.decoratorpatter2 Este exemplo é de autoria prórpia, com base no conceito aprendido sobre decorator.

O decorator é muito semelhante ao pattern proxy, onde ambos implementam o mesmo contrato (Interface). Ele tem como agregar funções
dinânmicamente em tempo de execução, criando assim um baixo acoplamento e design flexível. Como mostrado no exemplo do package 
br.com.decoratorpatter2 é criado uma Decorator de uma abstração (Interface TextViewInterface). 

Para criação do decorator é obrigatório a criação de um TextView, passando ele como parametro no Decorator. O decorator possui
uma lista decoradores, neste exemplo o tipo desta lista é abstração TextViewInterface, deixando assim o design mais abastrato para 
receber uma subclasse que herda de TextViewDecorator ou uma classe que implementa TextViewInterface. 
