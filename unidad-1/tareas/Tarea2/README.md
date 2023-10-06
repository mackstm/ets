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
- Escribir: __"Git es un sistema de control de versiones ideado por Linus Torvalds."__
- __git add .__
- __git commit -m "Añadido capítulo 1."__
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

</div>