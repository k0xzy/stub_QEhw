# Инструкция по запуску

Следуйте этим шагам, чтобы успешно запустить приложение.

## Предварительные требования

Убедитесь, что у вас установлены следующие компоненты:

- Java Development Kit (JDK) 11+
- Apache Maven

## Шаги по запуску

1. **Склонируйте репозиторий**

   ```bash
   git clone https://github.com/your-username/your-repo.git
   cd your-repo

2. **Сборка проекта**
    ```bash
      mvn clean package

3. **Запустите приложение**
    ```bash
    java -jar target/demo-0.0.1-SNAPSHOT.jar

4. **Тест заглушки**
   ```bash
   mvn test