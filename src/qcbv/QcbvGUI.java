/*
 * Класс окна программы с графическим интерфейсом
 */
package qcbv;
import javax.swing.JFrame;

public class QcbvGUI extends JFrame {
    // Конструктор класса главного окна приложения
    public QcbvGUI() {
        // Вызов конструктора суперкласса с названием окна
        super("Qcbv Generator");
        // Задание границ окна
	this.setBounds(300, 200, 400, 200);
        // Установка операции закрытия по умолчанию
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
