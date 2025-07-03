# 🧪 Segundo Parcial Grupal - Metodología de Sistemas II

**Materia:** Metodología de Sistemas II  
**Carrera:** Tecnicatura Universitaria en Programación  
**Docente:** Castillo, Rocío  
**Institución:** UTN (Universidad Tecnológica Nacional)  
**Fecha de entrega:** 03/07/2025  

## 👥 Integrantes

- Martinez Balian, Francisco  
- Landeira, Agustín  
- Gimenez, Magali Andrea  

---

## 📚 Índice

1. [Patrones de diseño](#patrones_de_diseño)
2. [Refactoring](#refactoring)
3. [Domain Driven Design (DDD)](#domain_driven_design)

---

## 🧩 Patrones de diseño

Se analizaron distintos ejercicios aplicando los siguientes patrones:

### 1. Template Method
Usado en el ejemplo de lavado de ropa y de bebidas calientes. Define una estructura general del algoritmo en una clase abstracta y permite que las subclases implementen los detalles específicos.

### 2. Adapter
Aplicado en la integración de clases de medios de pago con una clase `Pedido`. Se usa para adaptar clases existentes a una nueva interfaz sin modificar su implementación original.

### 3. Singleton
Utilizado para asegurar que haya una única instancia del carrito de compras durante toda la sesión.

> 🔗 El código y los diagramas UML de estos ejercicios están incluidos en este repositorio.

---

## 🛠️ Refactoring

Se identificaron los siguientes **bad smells** en el código original:

- Código duplicado en la impresión de información.
- Mezcla de responsabilidades (mostrar datos, calcular daño, identificar tipo).
- Llamadas encadenadas difíciles de leer.
- Errores de tipado que generan errores.

### 🧠 Problemas para la mantenibilidad:

- Dificultad para extender el sistema (cada nuevo tipo requiere modificar el código existente).
- Mayor riesgo de errores.
- Poco legible para nuevos desarrolladores.

### 🔧 Refactoring aplicado:

- **Extract Method**: se extrajeron métodos pequeños para separar responsabilidades.
- **Polimorfismo**: se reemplazaron condicionales por métodos abstractos en la jerarquía de habilidades.
- **Encapsulamiento**: se centralizó el cálculo de daño en la clase `Personaje`.

> 📁 El código refactorizado se encuentra en la carpeta `/refactoring` y acompañado de su diagrama UML.

---

## 🌍 Domain Driven Design

### 1. Lenguaje ubicuo

Es un vocabulario compartido entre desarrolladores y expertos del dominio, usado en código, documentación y conversaciones. Mejora la comunicación y evita ambigüedades.

### 2. Entidad vs Value Object

- **Entidad**: Tiene identidad propia (por ejemplo, una persona con DNI).
- **Value Object**: Su identidad está en sus valores (por ejemplo, una dirección).

### 3. Bounded Context

Es una zona del sistema donde un concepto tiene un único significado. Permite modularizar y manejar la complejidad de grandes sistemas.

### 4. UML y modelo del dominio

Los diagramas UML ayudan a visualizar entidades, relaciones y procesos. Favorecen el uso del lenguaje común y previenen errores desde las primeras etapas del diseño.

---

## 📌 Notas técnicas del trabajo

- Proyecto realizado en **Java** con orientación a objetos.
- Se utilizó el patrón **Template Method** y refactoring basado en el libro de Martin Fowler.
- El proyecto está estructurado para ser **mantenible y escalable**, priorizando buenas prácticas de diseño.

---

## 📎 Repositorio

Este repositorio contiene:

- ✅ Código fuente original y refactorizado.
- ✅ Diagramas UML.
- ✅ Resumen teórico de patrones, DDD y refactoring.
- ✅ Este archivo `README.md` como guía del trabajo.

---

**Gracias por leer 🙌**
