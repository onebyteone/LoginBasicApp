# 🔑 LoginBasicApp

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Platform](https://img.shields.io/badge/Platform-Android-green.svg)](https://www.android.com/)
[![Language](https://img.shields.io/badge/Language-Kotlin-blue.svg)](https://kotlinlang.org/)

Una aplicación Android sencilla que implementa un sistema de autenticación básico con usuario y contraseña.

## 📋 Descripción

LoginBasicApp es una aplicación Android desarrollada en Kotlin que demuestra la implementación de un sistema de login simple. La aplicación verifica las credenciales del usuario contra valores predefinidos y muestra mensajes de respuesta apropiados.

Este proyecto sirve como punto de partida ideal para desarrolladores que desean implementar funcionalidades de autenticación en sus aplicaciones Android.

## ✨ Características

- **Interfaz minimalista**: Diseño limpio centrado en la experiencia de inicio de sesión
- **Validación de campos**: Comprobación de campos vacíos
- **Autenticación básica**: Verificación de credenciales contra valores predefinidos
- **Feedback visual**: Notificaciones mediante Toast para informar al usuario sobre el resultado del login

## 🚀 Instalación

1. Clona este repositorio:
   ```
   git clone https://github.com/yourusername/LoginBasicApp.git
   ```

2. Abre el proyecto en Android Studio

3. Sincroniza Gradle y ejecuta la aplicación en un emulador o dispositivo físico

## 💻 Requisitos

- Android Studio 4.0 o superior
- SDK mínimo: API 21 (Android 5.0 Lollipop)
- Dispositivo Android o emulador con API 21 o superior

## 🛠️ Tecnologías utilizadas

- **Kotlin**: Lenguaje de programación principal
- **XML**: Diseño de interfaces de usuario
- **AndroidX**: Bibliotecas de soporte para componentes de la interfaz

## 📝 Uso

1. Inicia la aplicación
2. En la pantalla de login:
   - Ingresa el nombre de usuario
   - Ingresa la contraseña
3. Presiona el botón "INGRESAR"
4. Observa el mensaje que confirma el éxito del login o muestra un error

### Credenciales de prueba
- **Usuario**: admin
- **Contraseña**: 1234

## 🔜 Próximas mejoras

- Implementación de Firebase Authentication
- Opción para recordar credenciales
- Pantalla de registro de nuevos usuarios
- Recuperación de contraseña
- Integración con redes sociales
- Almacenamiento seguro de credenciales usando Room o SQLite

## 🔒 Seguridad

**Nota**: Esta es una implementación básica con fines educativos. En un entorno de producción:
- No almacenes contraseñas en texto plano en el código
- Utiliza soluciones de autenticación seguras como Firebase Auth o implementa hash + salt
- Considera utilizar tokens JWT para la autenticación
- Implementa HTTPS para la comunicación con servidores

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Para contribuir:

1. Haz un Fork del proyecto
2. Crea una rama para tu función (`git checkout -b feature/amazing-feature`)
3. Haz commit a tus cambios (`git commit -m 'Add some amazing feature'`)
4. Haz Push a la rama (`git push origin feature/amazing-feature`)
5. Abre un Pull Request

## 📄 Licencia

Este proyecto está bajo la Licencia MIT - consulta el archivo [LICENSE](LICENSE) para más detalles.

## 📞 Contacto

Si tienes preguntas o sugerencias, no dudes en abrir un issue en el repositorio.
