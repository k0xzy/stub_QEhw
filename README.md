# Инструкция по запуску

Следуйте этим шагам, чтобы успешно запустить приложение.
url: localhost:8080/process
## Предварительные требования

Убедитесь, что у вас установлены следующие компоненты:

- Java Development Kit (JDK) 11+
- Apache Maven

## Шаги по запуску

1. **Склонируйте репозиторий**

   ```bash
   git clone https://github.com/k0xzy/stub_QEhw
   cd stub_QEhw

2. **Сборка проекта**
    ```bash
      mvn package

3. **Запустите приложение (port->:8080)**
    ```bash
    java -jar target/demo-0.0.1-SNAPSHOT.jar
