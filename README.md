# Sistema de Gestión Documental - Backend (TGM)

Backend robusto para el Sistema de Gestión Documental de Talleres Gráficos de México, desarrollado en Java 17 con Spring Boot. Bajo una arquitectura REST, automatiza el ciclo de vida de los oficios mediante Spring Data JPA conectado a Clever Cloud, garantizando la persistencia segura de datos y la trazabilidad operativa institucional.

## 🚀 Características Principales

* **Arquitectura RESTful:** Endpoints estructurados para operaciones CRUD completas de usuarios y oficios.
* **Persistencia Escalable:** Mapeo de entidades relacionales mediante Hibernate/JPA.
* **Seguridad de Credenciales:** Implementación de variables de entorno para proteger accesos críticos.
* **Código Limpio:** Integración con Proyecto Lombok para optimizar la legibilidad del modelo.

## 🛠️ Tecnologías Utilizadas

* **Lenguaje:** Java 17
* **Framework:** Spring Boot 3.x (Spring Web, Spring Data JPA)
* **Base de Datos:** MySQL (Alojada en Clever Cloud)
* **Gestor de Dependencias:** Maven

## 📋 Variables de Entorno Requeridas

Para ejecutar este proyecto de forma local, es necesario configurar las siguientes variables de entorno en tu IDE o sistema operativo:

| Variable | Descripción |
| :--- | :--- |
| `DB_HOST` | Dirección del servidor de Clever Cloud |
| `DB_NAME` | Nombre de la base de datos MySQL |
| `DB_USER` | Usuario de acceso a la base de datos |
| `DB_PASSWORD` | Contraseña de acceso |

## 🔧 Instalación y Ejecución Local

1. **Clonar el repositorio:**
   ```bash
   git clone [https://github.com/tu-usuario/gestion-documental-backend.git](https://github.com/tu-usuario/gestion-documental-backend.git)

2. **Configurar las variables de entorno explicadas en la sección anterior.**

3. **Compilar y ejecutar la aplicación**
Puedes arrancar el proyecto desde tu IDE ejecutando la clase GestionDocumentalApplication.java.

