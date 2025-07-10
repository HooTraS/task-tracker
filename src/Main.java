package tasktracker;

import tasktracker.model.*;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        Task t1 = new Task("Купить хлеб", "Сходить в магазин");
        Task t2 = new Task("Помыть посуду", "После ужина");
        manager.createTask(t1);
        manager.createTask(t2);

        Epic epic1 = new Epic("Сделать проект", "Учебный проект по Java");
        manager.createEpic(epic1);
        Subtask st1 = new Subtask("Сделать бэкенд", "Spring Boot", epic1.getId());
        Subtask st2 = new Subtask("Сделать фронт", "Angular", epic1.getId());
        manager.createSubtask(st1);
        manager.createSubtask(st2);

        Epic epic2 = new Epic("Отпуск", "Поездка в горы");
        manager.createEpic(epic2);
        Subtask st3 = new Subtask("Забронировать отель", "Booking", epic2.getId());
        manager.createSubtask(st3);

        System.out.println("Все задачи:");
        manager.getAllTasks().forEach(System.out::println);
        System.out.println("\nВсе эпики:");
        manager.getAllEpics().forEach(System.out::println);
        System.out.println("\nВсе подзадачи:");
        manager.getAllSubtasks().forEach(System.out::println);

        st1.setStatus(TaskStatus.DONE);
        st2.setStatus(TaskStatus.IN_PROGRESS);
        manager.updateSubtask(st1);
        manager.updateSubtask(st2);

        System.out.println("\nОбновлённые эпики:");
        manager.getAllEpics().forEach(System.out::println);

        manager.deleteTask(t1.getId());
        manager.deleteEpic(epic2.getId());

        System.out.println("\nПосле удаления:");
        manager.getAllTasks().forEach(System.out::println);
        manager.getAllEpics().forEach(System.out::println);
        manager.getAllSubtasks().forEach(System.out::println);
    }
}