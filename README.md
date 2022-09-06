# Автотесты для [sela.ru](https://www.sela.ru/)

___

## Стек используемых технологий:

| GitHub | IDEA | Java | Junit5 | Gradle | Selenide |
|:------:|:----:|:----:|:------:|:------:|:--------:|
| <img src="images/GitHub.svg" width="40" height="40"> | <img src="images/IDEA.svg" width="40" height="40"> | <img src="images/JAVA.svg" width="40" height="40"> | <img src="images/Junit5.svg" width="40" height="40"> | <img src="images/Gradle.svg" width="40" height="40"> | <img src="images/Selenide.svg" width="40" height="40"> |

| Selenoid | Allure Report | Allure TO | Jenkins | Telegram | Jira |
|:--------:|:-------------:|:---------:|:-------:|:----:|:----:|
| <img src="images/Selenoid.svg" width="40" height="40"> | <img src="images/Allure Report.svg" width="40" height="40"> | <img src="images/Allure TestOps.svg" width="40" height="40"> | <img src="images/Jenkins.svg" width="40" height="40"> | <img src="images/Telegram.svg" width="40" height="40"> |  <img src="images/Jira.svg" width="40" height="40"> |

___

## Команды запуска тестов из терминала:

- Запуск тестов на проверку авторизации: 
  clean task authorization_tests -Dbrowser=${BROWSER} -Dversion=${VERSION}
  -Dsize=${SIZE}
- Запуск тестов на проверку на добавление товара в корзину: 
  clean task add_product_tests -Dbrowser=${BROWSER}
  -Dversion=${VERSION} -Dsize=${SIZE}
- Запуск тестов на проверку заголовков: 
   clean task check_titles_tests -Dbrowser=${BROWSER} -Dversion=${VERSION}
  -Dsize=${SIZE}

## Примеры используемых технологий:

### :newspaper: В качестве CI системы использован Jenkins

![](images/mainJenkins.png)

### :newspaper: Построение отчета в Allure Reports по результатам прогона

![](images/mainAllure.png)

### :newspaper: Для удобства представлена вся информация о тесте, которая была указана в аннотациях

![](images/aboutTestAllure.png)

### :newspaper: В качестве дополнительного отчета использован Allure TestOps

![](images/testOps.png)

### :newspaper: История запусков тестов в Allure TestOps

![](images/launches.png)

### :newspaper: Настроена интеграция с Jira

![](images/jira.png)

### :newspaper: По результату выполнения тестов отправляется уведомление в телеграм

![](images/telegram.png)

### :newspaper: Видео прохождения теста - добавление товара в корзину

![](images/testExample.gif)