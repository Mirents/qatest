/*
 * Класс окна программы с графическим интерфейсом
 */
package qcbv;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        
        ActionListener actionListener = new ActionHandler();
        cbNumber.addActionListener(actionListener);
        rdbnSymbolsEN.addActionListener(actionListener);
        rdbnSymbolsRU.addActionListener(actionListener);
        rdbnSpecSymbols.addActionListener(actionListener);

        grid.add(cbNumber);
        grid.add(rdbnSymbolsEN);
        grid.add(rdbnSymbolsRU);
        grid.add(rdbnSpecSymbols);
        grid.add(taResult);
        
        // Показ элементов в окне и компоновка
        this.getContentPane().add(grid);
        this.pack();
    }
    
    class ActionHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            JCheckBox checkbox = (JCheckBox) event.getSource();
            if (checkbox == cbNumber) {
                if(checkbox.isSelected())
                    System.out.println("cbNumber On");
                else
                    System.out.println("cbNumber Off");
            } else if(checkbox == rdbnSymbolsEN) {
                if(checkbox.isSelected())
                    System.out.println("rdbnSymbolsEN On");
                else
                    System.out.println("rdbnSymbolsEN Off");
            } else if(checkbox == rdbnSymbolsRU) {
                if(checkbox.isSelected())
                    System.out.println("rdbnSymbolsRU On");
                else
                    System.out.println("rdbnSymbolsRU Off");
            } else if(checkbox == rdbnSpecSymbols) {
                if(checkbox.isSelected())
                    System.out.println("rdbnSpecSymbols On");
                else
                    System.out.println("rdbnSpecSymbols Off");
            }
        }
    }
}