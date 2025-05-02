# Patron-Fachada

1)¿Que es el patron de diseño Facade?

Es un patron estructural que proporciona una interfaz simplificada y unificada a un conjunto de interfaces mas complejas en un sistema o subsistema.
su objetivo principal es ocultar la complejidad de dicho sistema y proporcionar una forma mas facil de interactuar con el. en lugar de que el cliente interactue directamente con multiples clases y metodos complejos, se le da acceso a traves de una unica clase fachada que se encarga de coordinar las operaciones.

________________________________________________________________________________________________________________________________________________________________________

2)¿Cual es el proposito principal de patron Facade?

su proposito principal es simplificar el acceso a sistemas complejos, proporcionando una interfaz unificada y facil de usar. esto para reducir el acomplamiento y mejora la legibilidad y mantenimiento del codigo.

________________________________________________________________________________________________________________________________________________________________________

3)¿En que tipo de sutaciones es recomendable usar el patron Facade?

El patron es recomendable usar en sistemas complejo o un subsistema complejos el cual tiene muchas clases o API, ya que si dicho sistemas tiene muchos componentes que deben ser usados de una forma esecifica, la fachada oculta dicha complejidad y proporciona un acceso sencillo. 
tambien puede ser recomendado usar al momento de mejorar la legibilidad del codigo, al encapsular operaciones comunes dentro de una fachada, el codigo cliente se vuelve mas caro y enfocado, esto para evitar llamadas repetitivas a metodos de distintas clases.

________________________________________________________________________________________________________________________________________________________________________

4)Menciona una ventaja de utilizar el patron Facade:

una gran ayuda para los desarrolladores de usar el patron facade es ayudar a separar responsabilidades, dividiendo el sistema en artes manejables y mejor estructuradas esto para mejorar la organizacion del codigo.

________________________________________________________________________________________________________________________________________________________________________

5)¿Como se relaciona el Patron Facade con el principio de menor conocimiento?

el principio de Menor Conocimiento establece que: "un Objeto debe conocer lo menos posible sobre otros objetos", o sea cada clase o modulo debe interactuar solo con sus colaboradores directos, sin acceder profundamente a estructuras internas de otros objetos.
y pues su relacion es que el patron fachada implementa este principio al actuar como un intermediario entre el cliente y el subsistema como por ejemlo; el cliente no 
necesita conocer ni acceder directamente a multiples clases del subsistemas.

________________________________________________________________________________________________________________________________________________________________________

6)¿Que elementos componen el patron Facade?

el patron facade esta compuesto por algunos elementos claves los cuales son:
1) Fachada:
es la clase pincipal del patron, esta proporciona una interfaz simple y unificada al cliente para acceder a las funcionalidades del subsistema. se encarga de coordinar las llamadas a las clases internas.

2)Subsistemas:
son las clases internas o componentes que realizan el trabajo real, cada clase del subsistema tiene su propia funcionalidad, y puede funcionar de forma independiente, pero la fachada los orquesta para ofrecer operaciones mas simples.

3)Ciente:
es el usuario del patron, es decir, el codigo que interactua con la fachada. el cliente no necesita conocer las clases internas ni como se comunican entre si.

________________________________________________________________________________________________________________________________________________________________________

7)Explica como implementar el patron facade en un sistema complejo

el patron se puede aplicar en un sistema de gestion de ordenes para un comercio en linea, donde dicho proceso involucra varias estaas como el pago, la verificacion de inventario, y la gestion de envios.
paso 1: Subsistemas (inventario, pago, envio): estos son los componentes internos del sistema, cada uno realiza una tarea especifica en donde podemos hacer "verificacion de disponibilidad, procesamiento de pagos, y logistica de envio".
paso 2: Fachada (sistema de pedidos): la fachada encapsula la logica complejo de los subsistemas. ofrece un metodo para que gestione el flujo complejo de pedido donde puede "verificar inventario, procesos de pagos y organizacion de envios" sin que el cliente necesite interactuar diferctamente con cada subsistema.
paso 3: Cliente: el cliente solo llama a un unico metodo en la fachada para relaizar dicho pedido, sin preocuparse por los detalles internos de como funciona dicho sistema.

________________________________________________________________________________________________________________________________________________________________________

8)¿Que diferencias existen entre un Facade y un Adapter?

Fachada tiene como objetivo ofrecer una interfaz unificada y simplificada para interactuar con un sistema o subsistema complejo, ocultando la complejidada interna.
Adapter: Convierte interfaces incompatibles este permite que dos interfaces incompatibles trabajen juntas, actua como un intermediario para traducir las solicitudes de un cliente que espera una interfaz particular hacia la forma en que un sistema ya existe las puede procesar.
Fachada: el cliente solo interactua con la fachada y no sabe nada sobre los susbsistemas internos.
Adapter: transoma la interfaz en una clase existente para que sea compatible con el cleinte que requiere otro tipo de interfaz.

________________________________________________________________________________________________________________________________________________________________________

9)¿Como contribuye el patron Facade a la mantenibilidad del codigo?

contribuye en gran valor gracias a su ventaja de simplicidad y legibilidad de codigo.
el patron fachada simplifica el codigo cliente. los clientes solo llaman a metodos sencillos y bien definidos en la fachada, lo que hace que el codigo sea mas claro y facil de entender.
tambien la logica compleja que involucra la interaccion entre multiples subsistemas puede ser gestionada de manera centralizada en la fachada.
esto permite que el codigo de mantenimiento se enfoque en una unica clase (la fachada), en lugar de tener que buscar y modificar multiples clases distribuidas en el sistema. si la logica necesita ser modificada o mejorada, puedes hacerlo en un solo lugar.

________________________________________________________________________________________________________________________________________________________________________

10)Da un ejemplo practico donde usarias el patron Facade. 

por ejemplo se podria usar en un sistema de reserva de vuelos para una agencia de viajes en linea.
esto por que una reserva de vuelos en linea puede tener una complejidad bastante amplia debido a sus subsistemas lo cuales podrina ser:
1 Sistema de busqueda de vuelos.
2 Sistema de gestion de reservas
3 Sistema de pagos
4 Sistema de emision de boletos
5 Sistema de notificaciones

y el patron fachada se puede usar para proporcionar una interfaz simple al cliente (el usuario), de manera que pueda realizar el proceso de reserva sin tener que preocuparse por los detalles internos de cada subsistemas.
el patron fachada ayuda en varias ocaciones como Simplificacion del uso del sistema, desacomplamiento, facilidad de mantenimiento y extensibiidad.
