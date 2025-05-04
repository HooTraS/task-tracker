#!/bin/bash

# Создание основного репозитория
git init
git branch -M main
git remote add origin https://github.com/HooTraS/task-tracker.git
git add .
git commit -m "init: начальный коммит проекта"
git push -u origin main

# Ветка dev
git checkout -b dev
git push -u origin dev

# Ветка с задачами
git checkout -b feature/tasks
# предположим, Task и TaskManager уже написаны
git add .
git commit -m "feat: реализованы Task и TaskManager"
git push -u origin feature/tasks

# Ветка с эпиками и подзадачами
git checkout dev
git checkout -b feature/epics
# предположим, Epic и Subtask добавлены
git add .
git commit -m "feat: добавлены Epic и Subtask"
git push -u origin feature/epics

# Ветка с логикой статуса
git checkout dev
git checkout -b feature/status
# предположим, реализован пересчёт статуса эпика
git add .
git commit -m "feat: реализован пересчёт статуса эпика"
git push -u origin feature/status

# Ветка с демонстрацией Main
git checkout dev
git checkout -b test/main
# предположим, Main.java добавлен
git add .
git commit -m "test: добавлен Main с тестовыми задачами"
git push -u origin test/main

# Слияние всех веток в dev
git checkout dev
git merge feature/tasks
git merge feature/epics
git merge feature/status
git merge test/main
git push

# Слияние dev в main
git checkout main
git merge dev
git push
