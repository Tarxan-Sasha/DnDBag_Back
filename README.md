Часть одного большого проекта: DnD_Bag.
DnD_Bag - это сайт помошник для игр в днд.

Здесь реализован Back сторона.
Базовые CRUD запросы.
Использованные технологии:
1) Java
2) Spring Core
3) Spring Web
4) Spring Data JPA + Hibernate
5) PostgreSql
6) Maven
7) Rest API.

Реализованный функционал:
1) API для работы с заклинаниями
2) Подключение к БД PostgreSQL
3) Реализован пока что лишь READ из CRUD операций

Запуск проекта:
1) Скачать PostgreSQL
2) Создать БД DnD_Bag_Database

Эндпоинты
Получить все заклинанния - GET /spells/allSpells
Получить одно заклинание по Id - Get /spells/{id}