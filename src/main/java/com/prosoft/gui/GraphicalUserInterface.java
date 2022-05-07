package com.prosoft.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Главный фрейм проекта
 */
public class GraphicalUserInterface extends JFrame  {

    private JFrame jFrame;
    private JPanel mainPanel;
    private JTextArea textArea1;

    /**
     * Конструктор класса
     */
    public GraphicalUserInterface() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Создание строки главного меню
        JMenuBar menuBar = new JMenuBar();
        // Добавление в главное меню выпадающих пунктов меню
        menuBar.add(new JMenu("Файл"));

        //jFrame.add(mainPanel);
        //mainPanel.add(textArea1);

        // Подключаем меню к интерфейсу приложения
        setJMenuBar(menuBar);
        // Открытие окна
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
