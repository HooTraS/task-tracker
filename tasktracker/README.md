# Task Tracker

Проект — трекер задач на Java. Поддерживаются три типа задач: обычные задачи, эпики и подзадачи.

## Возможности
- Создание, обновление, удаление задач
- Поддержка эпиков и подзадач
- Автоматический пересчёт статуса эпика
- Консольный запуск с примерами

## Типы задач
- `Task` — обычная задача
- `Epic` — задача, содержащая подзадачи
- `Subtask` — подзадача, входящая в эпик

## Структура проекта

```
src/
├── manager/
│   └── TaskManager.java
├── model/
│   ├── Task.java
│   ├── Epic.java
│   ├── Subtask.java
│   └── Status.java
└── Main.java
```

## Запуск
```bash
javac -d out src/**/*.java
java -cp out Main
```

## Команды Git
```bash
git clone https://github.com/your-username/task-tracker.git
cd task-tracker
```
