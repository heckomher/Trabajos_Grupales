# USO DE PRINCIPIOS SOLID

## Principio de Responsabilidad Única (SRP):
Cada clase tiene una única responsabilidad bien definida.

* La clase Usuario se encarga de representar y gestionar los datos básicos de un usuario.

* Las clases Cliente, Administrativo y Profesional se centran en los datos específicos de cada tipo de usuario.

* La clase Listado se encarga de gestionar una lista de usuarios y proporciona métodos para agregar y listar usuarios.

## Principio de Abierto/Cerrado (OCP):

* Las clases son fácilmente extensibles sin necesidad de modificar su implementación.
* Las subclases como Cliente, Administrativo y Profesional pueden agregar nuevos atributos y comportamientos específicos sin modificar la clase base Usuario.

## Principio de Sustitución de Liskov (LSP):
* Las subclases Cliente, Administrativo y Profesional se pueden utilizar en lugar de la clase base Usuario sin afectar la funcionalidad.
* Esto permite tratar a los objetos de las subclases como objetos de la clase base.

## Principio de Segregación de Interfaces (ISP):
* La interfaz Asesoria define un único método analizarUsuario() que es implementado por todas las clases relevantes.
Esto evita la dependencia de métodos innecesarios y garantiza una interfaz cohesiva y específica para el análisis de usuarios.

## Principio de Inversión de Dependencia (DIP):
* Las clases de alto nivel, como Usuario, no dependen de las clases de bajo nivel, como Cliente, Administrativo y Profesional.
* En cambio, las clases de alto nivel dependen de abstracciones como la interfaz Asesoria.
* Esto permite una mayor flexibilidad, ya que se puede cambiar o extender la implementación de las clases de bajo nivel sin afectar a las clases de alto nivel.