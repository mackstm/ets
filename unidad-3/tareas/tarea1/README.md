<div align="justify">

# Instalación de JDK en el SO

## Índice

- [Instalación de java](#index01)
- [Instalación de una versión específica](#index02)
- [Configuración de variables de entorno](#index03)
  - [Listar versiones de openjdk instaladas](#index03-01)
  - [Actualización de variables de entorno](#index03-02)

## Instalación de java <a name="index01"></a>

1. Actualizamos el sistema.
2. Instalamos java
3. Comprobamos la versión


<details> <summary>Pasos</summary>

- __sudo apt update__
- __sudo apt install default-jdk__
- __java --version__

<details> <summary>Salida</summary>

```console
openjdk 11.0.20.1 2023-08-24
OpenJDK Runtime Environment (build 11.0.20.1+1-post-Ubuntu-0ubuntu122.04)
OpenJDK 64-Bit Server VM (build 11.0.20.1+1-post-Ubuntu-0ubuntu122.04, mixed mode, sharing)
```

</details>

</details>

## Instalación de una versión específica <a name="index02"></a>

Para instalar Ubuntu Java Open JDK ("la que utilizaremos en 1º"). La versión en la que queremos trabajar es la 11.

<details> <summary>Pasos</summary>

- __sudo apt install openjdk-11-jdk__
- __sudo apt install openjdk-13-jdk__

<details> <summary>Salida</summary>

```console
Reading package lists... Done
Building dependency tree... Done
Reading state information... Done
E: Unable to locate package openjdk-13-jdk
```

</details>

- __sudo apt install openjdk-8-jdk__

</details>

- __java --version__

<details> <summary>Salida</summary>

```console
openjdk 11.0.20.1 2023-08-24
OpenJDK Runtime Environment (build 11.0.20.1+1-post-Ubuntu-0ubuntu122.04)
OpenJDK 64-Bit Server VM (build 11.0.20.1+1-post-Ubuntu-0ubuntu122.04, mixed mode, sharing)
```

</details>

## Instalación de una versión específica <a name="index03"></a>

El siguiente paso consiste en establecer las variables de entorno. Es necesario porque cuando se usa Java, Linux necesita saber dónde está ubicado el programa para ejecutarlo y qué versión de Java usar de forma predeterminada.

### Listar versiones de openjdk instaladas <a name="index03-01"></a>

Verificar que se han instalado las versiones (En mi caso no se instaló la 13).

<details> <summary>Pasos</summary>

- __ls /usr/lib/jvm__

<details> <summary>Salida</summary>

```console
default-java  java-1.11.0-openjdk-amd64  java-11-openjdk-amd64  java-1.8.0-openjdk-amd64  java-8-openjdk-amd64  openjdk-11
```

</details>

</details>

### Actualización de variables de entorno <a name="index03-02"></a>

1. Edita y modifica el fichero profile
2. Selecciona la versión 11

<details> <summary>Pasos</summary>

- __sudo update-alternatives --config java__

<details> <summary>Salida</summary>

```console
There are 2 choices for the alternative java (providing /usr/bin/java).

  Selection    Path                                            Priority   Status
------------------------------------------------------------
* 0            /usr/lib/jvm/java-11-openjdk-amd64/bin/java      1111      auto mode
  1            /usr/lib/jvm/java-11-openjdk-amd64/bin/java      1111      manual mode
  2            /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java   1081      manual mode

Press <enter> to keep the current choice[*], or type selection number:
```

</details>

- Introducir '0'.

</details>

</div>