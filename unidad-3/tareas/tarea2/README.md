<div align="justify">

# Instalación de  en el SO

## Índice

- [Instalar Apache Maven](#index01)
- [Instalar una versión concreta de Apache Maven](#index02)
- [Establecer variables de entorno](#index03)
- [Verificar la instalación](#index04)

## Instalar Apache Maven <a name="index01"></a>

1. Actualice el índice del paquete e instale Maven.
2. Verificar la instalación.

<details> <summary>Pasos</summary>

- __sudo apt update__
- __sudo apt install maven__
- __mvn -version__

<details> <summary>Salida</summary>

```console
Apache Maven 3.6.3
Maven home: /usr/share/maven
Java version: 11.0.20.1, vendor: Ubuntu, runtime: /usr/lib/jvm/java-11-openjdk-amd64
Default locale: en_US, platform encoding: UTF-8
OS name: "linux", version: "5.15.0-87-generic", arch: "amd64", family: "unix"
```

</details>

</details>

## Instalar una versión concreta de Apache Maven <a name="index02"></a>

1. Descargue Apache Maven en el directorio /tmp:
2. Una vez que se complete la descarga, extraiga el archivo en el directorio /opt
3. Para tener más control sobre las versiones y actualizaciones de Maven, que a crear un maven enlace simbólico que apunte al directorio de instalación de Maven:

<details> <summary>Pasos</summary>

- __wget https://downloads.apache.org/maven/maven-3/3.8.8/binaries/apache-maven-3.8.8-bin.tar.gz -P /tmp__
- __sudo tar xf /tmp/apache-maven-*.tar.gz -C /opt__
- __sudo ln -s /opt/apache-maven-3.8.8 /opt/maven__

</details>

## Establecer variables de entorno <a name="index03"></a>

1. A continuación, necesitaremos establecer las variables de entorno. Para hacer esto, abra su editor de texto y cree un nuevo archivo llamado mavenenv.sh en el directorio /etc/profile.d/
2. Haga el script.
3. Guarde y cierre el archivo. Este script se utilizará al iniciar el shell.
4. Haga que el script sea ejecutable con chmod:
5. Finalmente, cargue las variables de entorno usando el comando de source

<details> <summary>Pasos</summary>

- __sudo vi /etc/profile.d/maven.sh__
- Pegar:

```console
export M2_HOME=/opt/maven
export MAVEN_HOME=/opt/maven
export PATH=${M2_HOME}/bin:${PATH}
```

- __sudo chmod +x /etc/profile.d/maven.sh__
- __source /etc/profile.d/maven.sh__

</details>

## Verificar la instalación <a name="index04"></a>

- __mvn -version__

<details> <summary>Salida</summary>

```console
Apache Maven 3.8.8 (4c87b05d9aedce574290d1acc98575ed5eb6cd39)
Maven home: /opt/maven
Java version: 11.0.20.1, vendor: Ubuntu, runtime: /usr/lib/jvm/java-11-openjdk-amd64
Default locale: en_US, platform encoding: UTF-8
OS name: "linux", version: "5.15.0-87-generic", arch: "amd64", family: "unix"
```

</details>

</div>