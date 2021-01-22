/*
 * Класс окна программы с графическим интерфейсом
 */
package qcbv;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class QcbvGUI extends JFrame {
    JCheckBox cbNumber;
    JCheckBox rdbnSymbolsEN;
    JCheckBox rdbnSymbolsRU;
    JCheckBox rdbnSpecSymbols;
    JTextArea taResult;
    
    // Конструктор класса главного окна приложения
    public QcbvGUI() {
        // Вызов конструктора суперкласса с названием окна
        super("Test Data Generator");
        // Задание границ окна
	this.setBounds(300, 200, 400, 200);
        // Установка операции закрытия по умолчанию
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Создание панели для компонентов
        JPanel grid = new JPanel();
        GridLayout layout = new GridLayout(3, 0, 5, 12);
        grid.setLayout(layout);
    
        cbNumber = new JCheckBox("Цифры");
        rdbnSymbolsEN = new JCheckBox("Буквы EN");
        rdbnSymbolsRU = new JCheckBox("Буквы RU");
        rdbnSpecSymbols = new JCheckBox("Спецсимволы");
        taResult = new JTextArea();

        grid.add(cbNumber);
        grid.add(rdbnSymbolsEN);
        grid.add(rdbnSymbolsRU);
        grid.add(rdbnSpecSymbols);
        grid.add(taResult);
        
        // Показ элементов в окне и компоновка
        this.getContentPane().add(grid);
        this.pack();
    }
}