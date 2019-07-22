CANDIDATO: DAVID R. BERAUN

COMO MONTAR EL PROYECTO LOCALMENTE
----------------------------------

1.- Se debe contar con servidor apache local, versión 8.5 + en ejecución en el puerto 8080.
2.- MySql versión 8.0.16 en ejecución.
3.- Eclipse con las capacidades web, xml, javaEE disponibles y el servidor del punto 1
    incorporado.
4.- Descargar el proyecto en directorio local: C:\Projects
5.- Importar el proyecto en Eclipse
6.- Abierto el proyecto en Eclipse, selección la opción Run As del proyecto y ejecutar
     los comandos "clean install", para descargar y actualizar las dependencias necesarias.
7.- Crear el esquema (base de datos) "restaurant" en mysql. El usuario de conexion a la base 
	de datos debe ser:
    root, el password: Db3r4un1.0  
	ó si se tiene uno propio cambiarlo en el archivo 
	application.properties de la ruta de proyecto: src/main/resources. Igualmente el puerto
	de ejecución es el 3036 o cambiarlo en el mismo archivo en la url de la db.
8.- Una vez completado el punto anterior, ejecutar el proyecto seleccionando click
    derecho sobre la clase com.sistemaventasrestaurant.SistemaVentasRestaurantApp.java y
	seleccionar la opción Run As y seleccionar de la lista la opción Java Application. Con esto
	se crearan las tablas del esquema restaurant.
10.- Ejecutar en la base de datos (puede ser ediante el workbench) los siguientes son las queries
     necesarias a ejecutar:
	 
	 INSERT INTO restaurant.usuario (id_usuario, nombre_usuario, password, activo) values (1,'dberaun','$2a$04$MA2AvKXX7UmGEhpR2LIfrOGcxcxMeHvge4IvPFq6k3AKvj2H8qxpm',true);

INSERT INTO restaurant.usuario (id_usuario, nombre_usuario, password, activo) values (1,'dberaun','$2a$04$MA2AvKXX7UmGEhpR2LIfrOGcxcxMeHvge4IvPFq6k3AKvj2H8qxpm',true);

INSERT INTO restaurant.producto (id_producto, nombre_producto, precio, activo) values (1, 'CARNE AL AJILLO', 6000, true);

INSERT INTO restaurant.producto (id_producto, nombre_producto, precio, activo) values (2, 'OSTIONES A LA PARMESANA', 8000, true);

INSERT INTO restaurant.producto (id_producto, nombre_producto, precio, activo) values (3, 'CEBICHE DE ATUN', 7000, true);

INSERT INTO restaurant.producto (id_producto, nombre_producto, precio, activo) values (4, 'CRUDO', 6500, true);

INSERT INTO restaurant.producto (id_producto, nombre_producto, precio, activo) values (5, 'MACHAS A LA PARMESANA', 8000, true);


insert into restaurant.comanda(id_comanda,dia_contable,fecha,hora,nro_comanda) values(1,1,'2019-07-19','21:59:50',1);

insert into restaurant.comanda(id_comanda,dia_contable,fecha,hora,nro_comanda) values(2,1,'2019-07-19','21:59:50',2);

insert into restaurant.comanda(id_comanda,dia_contable,fecha,hora,nro_comanda) values(3,1,'2019-07-19','22:01:00',3);

insert into restaurant.comanda(id_comanda,dia_contable,fecha,hora,nro_comanda) values(4,1,'2019-07-19','22:05:00',4);
insert into restaurant.comanda(id_comanda,dia_contable,fecha,hora,nro_comanda) values(5,1,'2019-07-19','22:09:00',5);

insert into restaurant.comanda(id_comanda,dia_contable,fecha,hora,nro_comanda) values(6,1,'2019-07-19','22:10:00',6);

insert into restaurant.comanda(id_comanda,dia_contable,fecha,hora,nro_comanda) values(7,1,'2019-07-19','22:11:00',7);

insert into restaurant.comanda(id_comanda,dia_contable,fecha,hora,nro_comanda) values(8,1,'2019-07-19','22:15:00',8);

insert into restaurant.comanda(id_comanda,dia_contable,fecha,hora,nro_comanda) values(9,1,'2019-07-19','22:16:00',9);

insert into restaurant.comanda(id_comanda,dia_contable,fecha,hora,nro_comanda) values(10,1,'2019-07-19','22:20:00',10);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(1,1);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(1,2);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(1,3);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(1,4);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(1,5);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(2,2);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(2,3);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(2,4);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(2,5);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(3,3);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(3,4);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(3,5);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(4,4);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(4,5);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(5,5);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(6,5);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(7,4);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(7,5);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(8,3);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(8,4);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(8,5);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(9,2);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(9,3);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(9,4);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(9,5);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(10,1);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(10,2);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(10,3);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(10,4);

insert into restaurant.comanda_productos(comanda_id_comanda,productos_id_producto) values(10,5);

11.- Los request (ejecutado con Postman) a los apis son los siguientes:

Api 1 login: 
    method: POST    
	URL: http://localhost:8080/oauth/token 
	Authorizacion: Basic Auth, Username: dberaun, password: secret
	Body (parametros multipart/form-data):  
	1.- key: grant_type | value: password
	2.- key: username   | value: dberaun
	3.- key: password   | value: admin123
	
Api 2 Crear venta
	methor: POST
	URL: http://localhost:8080/restaurant/ventas?access_token=<Token Obtenido del api login>
	Content-Type: application/json
	Cache-Control: no-cache
	Body:
	{
		"id_comanda":3,
		"tipoDocumento":1,
		"dcto":4.0
	}
	
Api 3 obtener lista de ventas por dia:
	method: GET
	URL: http://localhost:8080/restaurant/ventas?fecha=2019-07-22&access_token=<Token Obtenido del api login>
	


ANALISIS DE LA SOLUCION PROPUESTA:

	El flujo funcional de la solución comprende 3 casos de uso:
	
	Autenticar Usuario (API 1)
	Crear Venta de Comanda (API 2)
	Obtener Ventas por día (API 3)
	
	El flujo principal para el API 1 es el siguiente:
	1.- Se obtiene un access-token al ejecutar el logín mediante el API 1, con el request indicado. El tiempo de expiración de dicho api es de 300
	    segundos (5 minutos). La información del usuario se encuentra ingresada en la base de datos previamente, y su clave cifrada y guardada de 
		manera segura con OAuth2.
	2.- Con el access-token se invoca el API 2 o el API 3.
	
	El flujo principal para el API 2 es el siguiente:
	1.- Al recibir la invocación con un token válido, el API obtiene la comanda indicada en el atributo id_comanda del JSON de request.
	2.- Con la comanda lee los productos asociados a esta y realiza la sumatoria de los mismos
	3.- Con la comanda puebla un objeto de tipo Venta, colocando la fecha actual  y creando un nro de documento, y asignando el tipo de documento 
	    informado en el request. Tambien calcula el subtotal, Iva y total considerando el dcto (% de dcto) informado.
	4.- Crea la venta en la bd.
	
	El flujo principal para el API 3 es el siguiente:
	1.- Al recibir la invocación con el token válido, el API obtiene el valor del campo fecha del argumento del request.
	2.- Con el valor de la fecha procede a obtener todas las ventas del día consultando la bd.
	3.- Con el resultado elabora una lista de objetos Venta los que se devuelven como lista JSON al invocador del API.

ENTIDADES CONSIDERADAS:

	SEGURIDAD:

	Usuario
	ROL
	
	NEGOCIO:
	
	Comanda
	Producto
	Venta
	
OBJETOS DE APOYO:

	TipoDocumento (Enumeración)
	
CONSIDERACIONES DE NEGOCIO:

	1.- La solicitud es para un sistema de restaurante, por lo que se trabaja con una comanda que vendría a ser el pedido que contiene los productos.
	    Cuando se solicita la cuenta, en base a la comanda se genera la boleta o factura. Para el caso de este sistema, los productos vienen pre llenados y
		las comanas vienen pre llenadas. Se cuenta con 10 comandas de ejemplo y 5 productos, las comandas ya tienen productos prellenados.
		
	2.- Dado que la mayor seguridad a nivel bancario es tratar de enviar la menor cantidad de información sensible posible, es que se consideró solo enviar
	    ID de comanda y token como los datos mas sensibles posible. Se aprovecha que la generación de la venta es parte del flujo de negocios del restaurant.
		
	3.- El descuento puede ser 0 un número deciman, pero representa porciento, por lo que si se indica 5, será 5% de dcto el que se aplica al total despues
	    de aplicado el IVA.
	
	
CONSIDERACIONES TÉCNICAS:

	Se eligió OAuth2 como framework para almacenar claves de forma segura que contiene transformación cifrada, y se considero el flujo con Token para 
	securitizar APIS, esto debido a  que es una framework probada, de fácil desarrollo y con un esquema de token utilizado en banca, donde tradicionalmente
	existian desarrollos propios para esto, más conocido en su momento como "SEMILLA".
	
	Se eligió trabajar con APIs REST por su fácilidad en las transformaciones de mensajería y porque su utilización se circunscribe a un negocio local y no
	un negocio público web.
	
	En base a mejores prácticas para APIS:
	Se trabajan los las rutas de los apis REST de esta forma: GET dominio\restaurant\ventas  Se obtendría todas las ventas (no se recomienda por la cantidad
	de datos a obtener, por lo tanto no se implementó). POST dominio\restaurant\ventas creación de una venta. GET dominio\restaurant\ventas?fecha=<fecha>
	obtiene las fechas por la fecha actual.
	
	
	
	
    	


	

	 
	 
	 