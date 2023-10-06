<div align="justify">

# Manipulación avanzada en git

### José Maximiliano Boada Martín

## Índice

- [Ejercicio 1](#ejercicio1)
- [Ejercicio 2](#ejercicio2)
- [Ejercicio 3](#ejercicio3)
- [Ejercicio 4](#ejercicio4)
- [Ejercicio 5](#ejercicio5)
- [Ejercicio 6](#ejercicio6)
- [Ejercicio 7](#ejercicio7)

## Ejercicio 1 <a name="ejercicio1"></a>

- Mostrar el historial de cambios del repositorio.
- Crear la carpeta capítulos y crear dentro de ella el fichero capitulo1.txt con el siguiente texto.

```code
Git es un sistema de control de versiones ideado por Linus Torvalds.
```

- Añadir los cambios a la zona de intercambio temporal.
- Hacer un commit de los cambios con el mensaje Añadido capítulo 1.
- Volver a mostrar el historial de cambios del repositorio.

<details> <summary>Pulse para ver la solución</summary>

```code
  git log
  mkdir capitulos
  cat > capitulos/capitulo1.txt
  Git es un sistema de control de versiones ideado por Linus Torvalds.
```

__Nota__: __Ctrl+D__ nos permite salir del cat.

```code
  git add .
  git commit -m "Añadido capítulo 1."
  git log
```
__Nota__: __git add__ permite añadir elementos al especio de intercambio. __git log__ permite ver el historico de cambios.
</details>

<details> <summary>Pulse para ver los pasos</summary>

- __git log__
<details> <summary>Salida:</summary>

```code
  commit 1016a8a4e53ee1167750094aaac7d2018063a264 (HEAD -> main, origin/main, origin/HEAD)
  Author: Joatham Pérez Expósito <jpe.gsc@gmail.com>
  Date:   Wed Sep 27 15:50:15 2023 +0100

      se añade la segunda carpeta

  commit 3f26704336e8d586f91aca272c89218d96e61d98
  Author: Joatham Pérez Expósito <jpe.gsc@gmail.com>
  Date:   Wed Sep 27 15:21:53 2023 +0100

      mensaje

  commit 8a81c55462cc731099b5842f2cd38fbc47105d56
  Author: Joatham Pérez Expósito <jpe.gsc@gmail.com>
  Date:   Mon Oct 10 18:18:08 2022 +0100

      Se añade un título

  commit fbe91b280cfbc50352ee18627a4339d4aa7e91c4
  Author: Joatham Pérez Expósito <jpe.gsc@gmail.com>
  Date:   Mon Oct 10 18:14:01 2022 +0100

      closed #1

  commit 3ea9800cc58f6e37a0ff3e6878bf9cc99dd17ced (origin/1)
  Author: Joatham Pérez Expósito <jpe.gsc@gmail.com>
  Date:   Mon Oct 10 17:58:02 2022 +0100

      se crea la carpeta img #1

  commit 4dcb74b18a32f24061bc2e7c415f09f7aaff4971
  Author: Joatham Pérez Expósito <jpe.gsc@gmail.com>
  Date:   Mon Sep 27 11:57:59 2021 +0100

      Initial commit

```
</details>

- __mkdir capitulos__
- __cat > capitulos/capitulos.txt__
- Escribir: 

```code
"Git es un sistema de control de versiones ideado por Linus Torvalds."
```

- __Ctrl + D__
- __git add .__
- __git commit -m "Añadido capítulo 1."__

<details> <summary>Salida</summary>

```code
  [main 3297b1f] Añadido capítulo 1.
   1 file changed, 1 insertion(+)
   create mode 100644 capitulos/capitulo1.txt
```

</details>

- __git log__

<details> <summary>Salida:</summary>

```code
  commit 3297b1f6f1778c24e159aa99d18bee2e6108370a (HEAD -> main)
  Author: mackstm <thelewyntm@gmail.com>
  Date:   Fri Oct 6 19:16:17 2023 +0100

      Añadido capítulo 1.

  commit 1016a8a4e53ee1167750094aaac7d2018063a264 (origin/main, origin/HEAD)
  Author: Joatham Pérez Expósito <jpe.gsc@gmail.com>
  Date:   Wed Sep 27 15:50:15 2023 +0100

      se añade la segunda carpeta

  commit 3f26704336e8d586f91aca272c89218d96e61d98
  Author: Joatham Pérez Expósito <jpe.gsc@gmail.com>
  Date:   Wed Sep 27 15:21:53 2023 +0100

      mensaje

  commit 8a81c55462cc731099b5842f2cd38fbc47105d56
  Author: Joatham Pérez Expósito <jpe.gsc@gmail.com>
  Date:   Mon Oct 10 18:18:08 2022 +0100

      Se añade un título

  commit fbe91b280cfbc50352ee18627a4339d4aa7e91c4
  Author: Joatham Pérez Expósito <jpe.gsc@gmail.com>
  Date:   Mon Oct 10 18:14:01 2022 +0100

      closed #1

  commit 3ea9800cc58f6e37a0ff3e6878bf9cc99dd17ced (origin/1)
  Author: Joatham Pérez Expósito <jpe.gsc@gmail.com>
  Date:   Mon Oct 10 17:58:02 2022 +0100

      se crea la carpeta img #1

  commit 4dcb74b18a32f24061bc2e7c415f09f7aaff4971
  Author: Joatham Pérez Expósito <jpe.gsc@gmail.com>
  Date:   Mon Sep 27 11:57:59 2021 +0100

      Initial commit
```
</details>

</details>

## Ejercicio 2 <a name="ejercicio2"></a>


- Crear el fichero capitulo2.txt en la carpeta capítulos con el siguiente texto.
```code
El flujo de trabajo básico con Git consiste en: 1- Hacer cambios en el repositorio. 2- Añadir los cambios a la zona de intercambio temporal. 3- Hacer un commit de los cambios.
```

- Añadir los cambios a la zona de intercambio temporal.
- Hacer un commit de los cambios con el mensaje Añadido capítulo 2.
- Mostrar las diferencias entre la última versión y dos versiones anteriores.

<details><summary>Pulse para ver la solución</summary>

```code
  cat > capitulos/capitulo2.txt
  El flujo de trabajo básico con Git consiste en:
  1- Hacer cambios en el repositorio.
  2- Añadir los cambios a la zona de intercambio temporal.
  3- Hacer un commit de los cambios.
```
__Nota__: __Ctrl+D__, sale del cat.

```code
git add .
git commit -m "Añadido capítulo 2."
git diff HEAD~2..HEAD
```

</details>

<details> <summary>Pulse para ver los pasos</summary>

- __cat > capitulos/capitulo2.txt__
- Escribir: 
```code
"El flujo de trabajo básico con Git consiste en:
 1- Hacer cambios en el repositorio.
 2- Añadir los cambios a la zona de intercambio temporal.
 3- Hacer un commit de los cambios.
```


- __Ctrl + D__
- __git add .__
- __git commit -m "Añadido capitulo 2."__

<details> <summary>Salida:</summary>

```code
  [main f49d7ff] Añadido capítulo 2.
   1 file changed, 4 insertions(+)
   create mode 100644 capitulos/capitulo2.txt
```

</details>

- __git diff HEAD~2..HEAD__

<details> <summary>Salida:</summary>

```code
  diff --git a/capitulos/capitulo1.txt b/capitulos/capitulo1.txt
  new file mode 100644
  index 0000000..f4068a7
  --- /dev/null
  +++ b/capitulos/capitulo1.txt
  @@ -0,0 +1 @@
  +Git es un sistema de control de versiones ideado por Linus Torvalds.
  \ No newline at end of file
  diff --git a/capitulos/capitulo2.txt b/capitulos/capitulo2.txt
  new file mode 100644
  index 0000000..91b649b
  --- /dev/null
  +++ b/capitulos/capitulo2.txt
  @@ -0,0 +1,4 @@
  + El flujo de trabajo básico con Git consiste en:
  + 1- Hacer cambios en el repositorio.
  + 2- Añadir los cambios a la zona de intercambio temporal.
  + 3- Hacer un commit de los cambios.
  \ No newline at end of file
```

</details>

</details>

## Ejercicio 3 <a name="ejercicio3"></a>


- Crear el fichero capitulo3.txt en la carpeta capítulos con el siguiente texto.
```code
Git permite la creación de ramas lo que permite tener distintas versiones del mismo proyecto y trabajar de manera simultanea en ellas.
```
- Añadir los cambios a la zona de intercambio temporal.
- Hacer un commit de los cambios con el mensaje Añadido capítulo 3.
- Mostrar las diferencias entre la primera y la última versión del repositorio.

<details> <summary>Pulse para ver la solución</summary>

```code
  cat > capitulos/capitulo3.txt
  Git permite la creación de ramas lo que permite tener distintas versiones del mismo proyecto y trabajar de manera simultanea en ellas.
```

__Ctrl+D__

```code
  git add .
  git commit -m "Añadido capítulo 3."
  git log
  git diff <codigo hash de la primera version>..HEAD
```
</details>

<details> <summary>Pulse para ver los pasos</summary>

- __cat > capitulos/capitulo3.txt__
- Escribir:

```code

Git permite la creación de ramas lo que permite tener distintas versiones del mismo proyecto y trabajar de manera simultanea en ellas.

```

- __Ctrl + D__

- __git add .__

</details>

</div>