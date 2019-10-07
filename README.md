## О приложении 
Информация о страховых организациях

Функции:
- Заполнение справочника по полям ИНН, ОГРН, Полное наименование, адрес;
![1_input_form](https://user-images.githubusercontent.com/33284245/66296969-6163b000-e8f7-11e9-92a5-6aacd69fb971.jpg)
![2_add_organization](https://user-images.githubusercontent.com/33284245/66296978-688abe00-e8f7-11e9-8368-32e47c02305f.jpg)
- Параметризованный поиск информации.
![3_multiple_search](https://user-images.githubusercontent.com/33284245/66296989-6c1e4500-e8f7-11e9-82c5-3bd15d74a0cf.jpg)
![4_multiple_search_results](https://user-images.githubusercontent.com/33284245/66296997-6e809f00-e8f7-11e9-8575-08e52d719c36.jpg)

Технологии:
- Spring Boot (MVC, Security, Data JPA); 
- Maven;
- Flyway;
- PosrgreSQL;
- Thymeleaf.

## Запуск приложения локально
- Установить и запустить PostgreSQL; 
- Создать БД organizations;
- Проверить/заменить данные для доступа к БД в application.properties; 
- При запуске приложения Flyway создаст таблицу в БД organizations и мигрирует данные;
- Запустить приложение и обратиться в браузере по http://localhost:8080/
- При перезапуске приложения желательно удалять БД organizations. 

## TODO
- Накрутить валидацию ввода данных с отображением подсказок на странице ввода;
- Подключить Lombok для сокращения шаблонного кода и переписать сущности;
- Дополнить контроллер и добавить вьюшки для ошибок; 
- Больше использовать шаблонизатор Thymeleaf;
- Переписать код контроллера и класса OrganizationSpecs, чтобы избавиться от бойлерплейта;
- Понизить связность где возможно;
- Накрутить Spring Security; 
- Отформатировать код, чтобы повысить читаемость.  
