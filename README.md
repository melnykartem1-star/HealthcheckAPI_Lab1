## Інструкція з локального запуску

Для запуску проєкту на вашому комп'ютері має бути встановлений та запущений **Docker Desktop**.

---

**1. Клонуйте цей репозиторій**

```
git clone https://github.com/melnykartem1-star/HealthcheckAPI_Lab1.git
cd HealthcheckAPI_Lab1
```

---

**2. Запустіть проєкт**

Виконайте наступну команду в кореневій папці проєкту, щоб зібрати образ та підняти сервіс із прокиданням портів.

```
docker compose up --build -d
```

---

**3. Перевірте роботу застосунку**

Після успішного запуску контейнера застосунок буде доступний на порту 8080. Перевірити його роботу можна через браузер, curl або інструменти на кшталт Postman.

- Liveness Probe:
```
curl -X GET http://localhost:8080/healthz/live
```

- Readiness Probe:
```
curl -X GET http://localhost:8080/healthz/ready
```

> Примітка для Windows PowerShell: Якщо команда curl не розпізнається або видає помилку, використовуйте curl.exe.

---

**4. Зупинка контейнера**

```
docker compose down
```