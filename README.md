# Trainning-Maven
Training Maven WWCODE

Comenzando 鉁掞笍

Con este proyecto se desea realizar una automatizaci贸n WEB basandonos en los principios SOLID y FIRST, para un mejor entendimiento en los resportes se utiliza BDD, Cucumber y serenity con el gestor de dependencias Maven.

Pre-requisitos 馃搵

Para la ejecuci贸n de este proyecto desdemos tener presente que debemos tener instalado el JDK de java y las variables de entorno, las cuales son:

JAVA_HOME: Descarga el JDK de Java y adjuntamos la ruta en donde se encuentra la carpeta, en mi caso la tengo en C:\Program Files (x86)\Java\jdk1.8.0_251

MAVEN_HOME: Descarga el Apache Maven y se adjunta la ruta en donde se encuentre la carpeta, en mi caso la tengo en C:\Program Files\apache-maven-3.6.3-bin\apache-maven-3.6.3
Tener un IDE instalado para la observaci贸n o modificaci贸n del c贸digo.

En la raiz de proyecto debemos tener 3 archivos, los cuales son:

serenity.properties

chromedriver.exe : Este archivo debe ser compatible con la versi貌n que se tenga en la maquina.

Ejecutando las pruebas 鈿欙笍

Para la ejecuci贸n del proyecto debe tener presente que las variables de entornos se encuentre bien configuradas, adicional debe tener las dependencias descargadas la cual se encuentra en el archivo pom.xml.

La prueba se puede ejecutar por medio del package runners, la cual esta ubicada en src\test\java\co\certificacion\automatizacion\runner o por medio de la consola del proyecto con el comando

   mvn clean verify
   
Reporte 馃搵

Para generar el reporte de las evidencias se debe ejecutar el comando mvn serenity:agregate, las evidencias de las pruebas se encunetran en la ruta Reporte\site\serenity y buscar archivo Index que se encuentra en la carpeta.
