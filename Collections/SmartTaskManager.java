package com.nit.collection;

import java.util.*;

public class SmartTaskManager {

    public static void addTaskAtBeginning(LinkedList<String> tasks, String task) {
        tasks.addFirst(task);
        System.out.println("Added at beginning: " + task);
    }

    public static void addTaskAtEnd(LinkedList<String> tasks, String task) {
        tasks.addLast(task);
        System.out.println("Added at end: " + task);
    }

    public static String viewNextTask(LinkedList<String> tasks) {
        if (tasks.isEmpty()) {
            return "No tasks available!";
        }
        return tasks.getFirst();
    }

    public static String viewLastTask(LinkedList<String> tasks) {
        if (tasks.isEmpty()) {
            return "No tasks available!";
        }
        return tasks.getLast();
    }

    public static void processNextTask(LinkedList<String> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to process!");
        } else {
            String task = tasks.pollFirst();
            System.out.println("Processed task: " + task);
        }
    }

    public static void processLastTask(LinkedList<String> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to process!");
        } else {
            String task = tasks.pollLast();
            System.out.println("Processed last task: " + task);
        }
    }

    public static void removeDuplicateTask(LinkedList<String> tasks, String task, boolean removeFirst) {
        boolean removed;
        if (removeFirst) {
            removed = tasks.removeFirstOccurrence(task);
        } else {
            removed = tasks.removeLastOccurrence(task);
        }

        if (removed) {
            System.out.println(task + " removed");
        } else {
            System.out.println(task + " not found!");
        }
    }

    public static void undoFirstAction(LinkedList<String> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("Nothing to undo!");
        } else {
            String task = tasks.pollFirst();
            System.out.println("Undone first action: " + task);
        }
    }

    public static void undoLastAction(LinkedList<String> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("Nothing to undo!");
        } else {
            String task = tasks.pollLast();
            System.out.println("Undone last action: " + task);
        }
    }

    public static void addPriorityTask(LinkedList<String> tasks, String task, boolean atFront) {
        if (atFront) {
            tasks.offerFirst(task);
        } else {
            tasks.offerLast(task);
        }
        System.out.println("Priority task added: " + task);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> tasks = new LinkedList<>();

        System.out.print("Enter number of initial tasks: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter task " + i + ": ");
            String task = sc.nextLine();
            tasks.add(task);
        }

        int choice;

        do {
            System.out.println("\nCurrent tasks: " + tasks);
            System.out.println("Choose operation:");
            System.out.println("1- Add at beginning");
            System.out.println("2- Add at end");
            System.out.println("3- View next");
            System.out.println("4- View last");
            System.out.println("5- Process next");
            System.out.println("6- Process last");
            System.out.println("7- Remove first duplicate");
            System.out.println("8- Remove last duplicate");
            System.out.println("9- Undo first");
            System.out.println("10- Undo last");
            System.out.println("11- Add priority task");
            System.out.println("12- Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task to add at beginning: ");
                    addTaskAtBeginning(tasks, sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter task to add at end: ");
                    addTaskAtEnd(tasks, sc.nextLine());
                    break;

                case 3:
                    System.out.println("Next task: " + viewNextTask(tasks));
                    break;

                case 4:
                    System.out.println("Last task: " + viewLastTask(tasks));
                    break;

                case 5:
                    processNextTask(tasks);
                    break;

                case 6:
                    processLastTask(tasks);
                    break;

                case 7:
                    System.out.print("Enter task to remove first occurrence: ");
                    removeDuplicateTask(tasks, sc.nextLine(), true);
                    break;

                case 8:
                    System.out.print("Enter task to remove last occurrence: ");
                    removeDuplicateTask(tasks, sc.nextLine(), false);
                    break;

                case 9:
                    undoFirstAction(tasks);
                    break;

                case 10:
                    undoLastAction(tasks);
                    break;

                case 11:
                    System.out.print("Enter priority task: ");
                    String task = sc.nextLine();
                    System.out.print("Add at front? (true/false): ");
                    boolean atFront = sc.nextBoolean();
                    sc.nextLine();
                    addPriorityTask(tasks, task, atFront);
                    break;

                case 12:
                    System.out.println("Final tasks list: " + tasks);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 12);

        sc.close();
    }
}

