<div align="justify">

# Gestión básica de Git

## Índice

- [Tarea: Configuración](#index1)
- [Tarea: Creación de un repositorio](#index2)
- [Tarea: Comprobar el estado del repositorio](#index3)
- [Tarea: Realizando Commits](#index4)
- [Tarea: Modificación de ficheros](#index5)
- [Tarea: Historial](#index6)

## Tarea: Configuración <a name="index1"></a>

Configurar Git definiendo el nombre del usuario, el correo electrónico y activar el coloreado de la salida. Mostrar la configuración final.

Operaciones a realizar:

```code
  git config --global user.name "Your-Full-Name"
  git config --global user.email "your-email-address"
  git config --global color.ui auto
  git config --list
```

- __git config --global user.name "mackstm"__
- Salida:

```
```

- __git config --global user.email "thelewyntm@gmail.com"__
- Salida:

```
```

- __git config --global color.ui auto__
- Salida:

```
```

- __git config --list__
- Salida:

```code
  user.name=mackstm
  user.email=thelewyntm@gmail.com
  color.ui=auto
```

## Tarea: Creación de un repositorio <a name="index2"></a>

Crear un repositorio nuevo con el nombre dpl y mostrar su contenido.

```code
  mkdir dpl
  cd dpl
  git init
  ls -la
```

- __mkdir dpl__
- Crea el directorio dpl
- __cd dpl__
- Cambia nuestra posición al directorio dpl
- __git init__
- Salida:

```code
ayuda: Usando 'master' como el nombre de la rama inicial. Este nombre de rama predeterminado
ayuda: está sujeto a cambios. Para configurar el nombre de la rama inicial para usar en todos
ayuda: de sus nuevos repositorios, reprimiendo esta advertencia, llama a:
ayuda: 
ayuda: 	git config --global init.defaultBranch <nombre>
ayuda: 
ayuda: Los nombres comúnmente elegidos en lugar de 'master' son 'main', 'trunk' y
ayuda: 'development'. Se puede cambiar el nombre de la rama recién creada mediante este comando:
ayuda: 
ayuda: 	git branch -m <nombre>
Inicializado repositorio Git vacío en /home/dam/dpl/.git/
```

- __ls -la__
- Salida:

```code
total 12
drwxrwxr-x  3 dam dam 4096 oct  3 14:57 ./
drwxr-x--- 34 dam dam 4096 oct  3 14:57 ../
drwxrwxr-x  7 dam dam 4096 oct  3 14:57 .git/
```

## Tarea: Comprobar el estado del repositorio <a name="index3"></a>

- Comprobar el estado del repositorio.

- Crear un fichero indice.txt con el siguiente contenido:
  - Capítulo 1: Instalación de Git por el alumno XXX (donde XXX es el nombre del alumno)
  - Capítulo 2: Flujo de trabajo básico

- Comprobar de nuevo el estado del repositorio.

- Añadir el fichero a la zona de intercambio temporal.

- Volver a comprobar una vez más el estado del repositorio.

```code
  git status
  cat > indice.txt
  Capítulo 1: Instalación de Git por el alumno XXX
  Capítulo 2: Flujo de trabajo básico
  Ctrl+D
  git status
  git add indice.txt
  git status
```

- __git status__
- Salida:

```code
  En la rama master

  No hay commits todavía

  no hay nada para confirmar (crea/copia archivos y usa "git add" para hacerles seguimiento)
```

- __cat > indice.txt__
- Escribimos:

```code
  Capítulo 1: Instalación de Git por el alumno José Maximiliano Boada Martín
  Capítulo 2: Flujo de trabajo básico
```

- Salimos con Ctrl+D
- __git status__
- Salida:

```
  En la rama master

  No hay commits todavía

  Archivos sin seguimiento:
    (usa "git add <archivo>..." para incluirlo a lo que se será confirmado)
    indice.txt

  no hay nada agregado al commit pero hay archivos sin seguimiento presentes (usa "git add" para hacerles seguimiento)
```

- __git add indice.txt__
- __git status__
- Salida:

```
  En la rama master

  No hay commits todavía

  Cambios a ser confirmados:
    (usa "git rm --cached <archivo>..." para sacar del área de stage)
  	nuevos archivos: indice.txt
```

## Tarea: Realizando Commits <a name="index4"></a>

Realizar un commit de los últimos cambios con el mensaje Añadido índice de la asignatura DPL. y ver el estado del repositorio.

```code
  git commit -m "Añadido índice de la asignatura DPL."
  git status
```

- __git commit -m "Añadido índice de la asignatura DPL."__
- Salida:

```code
  [master (commit-raíz) 9678744] Añadido índice de la asignatura DPL.
   1 file changed, 2 insertions(+)
   create mode 100644 indice.txt
```

- __git status__
- Salida:

```code
En la rama master
nada para hacer commit, el árbol de trabajo está limpio
```

## Tarea: Modificación de ficheros <a name="index5"></a>

- Cambiar el fichero indice.txt para que contenga lo siguiente:
  - Capítulo 1: Instalación de Git por el alumno XXX
  - Capítulo 2: Flujo de trabajo básico
  - Capítulo 3: Gestión de ramas
  - Capítulo 4: Repositorios remotos
- Mostrar los cambios con respecto a la última versión guardada en el repositorio.
- Hacer un commit de los cambios con el mensaje Añadido los capitulos 3 y 4.

```code
  cat > indice.txt
  Capítulo 1: Instalación de Git por el alumno XXX _(donde XXX es el nombre del alumno)_
  Capítulo 2: Flujo de trabajo básico
  Capítulo 3: Gestión de ramas
  Capítulo 4: Repositorios remotos
  Ctrl+D
  git diff
  git add indice.txt
  git commit -m "Añadido los capitulos 3 y 4"
```

- __cat > indice.txt__
- Escribimos:

```code
  Capítulo 1: Instalación de Git por el alumno José Maximiliano Boada Martín
  Capítulo 2: Flujo de trabajo básico
  Capítulo 3: Gestión de ramas
  Capítulo 4: Repositorios remotos
```

- Salimos con Ctrl+D
- __git diff__
- Salida:

```code
  diff --git a/indice.txt b/indice.txt
  index 26f9025..a762fc9 100644
  --- a/indice.txt
  +++ b/indice.txt
  @@ -1,2 +1,4 @@
   Capítulo 1: Instalación de Git por el alumno José Maximiliano Boada Martín
  -Capítulo 2: Flujo de trabajo básico
  \ No newline at end of file
  +Capítulo 2: Flujo de trabajo básico
  +Capítulo 3: Gestión de ramas
  +Capítulo 4: Repositorios remotos
  \ No newline at end of file
```

- __git add indice.txt__
- __git commit -m "Añadido los capitulos 3 y 4"__
- Salida:

```code
[master 8bb42c2] Añadido los capitulos 3 y 4
 1 file changed, 3 insertions(+), 1 deletion(-)
```

## Tarea: Historial <a name="index6"></a>

- Mostrar los cambios de la última versión del repositorio con respecto a la anterior.
- Cambiar el mensaje del último commit por Añadido el capitulo sobre gestión de ramas al índice.
- Volver a mostrar los últimos cambios del repositorio.

```code
  git show
  git commit --amend -m "Añadido el capitulo sobre gestión de ramas al índice."
  git show
```

- __git show__
- Salida:

```code
  commit 8bb42c22cd3d9412da456d9a92926f56d9551675 (HEAD -> master)
  Author: mackstm <thelewyntm@gmail.com>
  Date:   Tue Oct 3 16:21:20 2023 +0100

      Añadido los capitulos 3 y 4

  diff --git a/indice.txt b/indice.txt
  index 26f9025..a762fc9 100644
  --- a/indice.txt
  +++ b/indice.txt
  @@ -1,2 +1,4 @@
   Capítulo 1: Instalación de Git por el alumno José Maximiliano Boada Martín
  -Capítulo 2: Flujo de trabajo básico
  \ No newline at end of file
  +Capítulo 2: Flujo de trabajo básico
  +Capítulo 3: Gestión de ramas
  +Capítulo 4: Repositorios remotos
  \ No newline at end of file
```

- __git commit --amend -m "Añadido el capitulo sobre gestión de ramas al índice."__
- Salida:

```code
  [master 64c687d] Añadido el capitulo sobre gestión de ramas al índice.
   Date: Tue Oct 3 16:21:20 2023 +0100
   1 file changed, 3 insertions(+), 1 deletion(-)
```

- __git show__
- Salida:

```code
  commit 64c687d2fa9400de4656ed3f36115acb4660dad6 (HEAD -> master)
  Author: mackstm <thelewyntm@gmail.com>
  Date:   Tue Oct 3 16:21:20 2023 +0100

      Añadido el capitulo sobre gestión de ramas al índice.

  diff --git a/indice.txt b/indice.txt
  index 26f9025..a762fc9 100644
  --- a/indice.txt
  +++ b/indice.txt
  @@ -1,2 +1,4 @@
   Capítulo 1: Instalación de Git por el alumno José Maximiliano Boada Martín
  -Capítulo 2: Flujo de trabajo básico
  \ No newline at end of file
  +Capítulo 2: Flujo de trabajo básico
  +Capítulo 3: Gestión de ramas
  +Capítulo 4: Repositorios remotos
  \ No newline at end of file
```

</div>