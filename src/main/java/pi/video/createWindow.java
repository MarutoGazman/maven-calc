package pi.video;
/*
 * Swing - Библиотека графического интерфейса (конкретный пакет), В отличие от java.awt, javax.swing имеет более гибкую
 * систему управления и более широкий набор функций
 */
 
/*Подключение необходимых библиотек
 * javax.swing.JFrame            - JFrame, представляющий собой окно с рамкой и строкой заголовка (с кнопками «Свернуть», «Во весь экран» и «Закрыть»).
 *                                 Оно может изменять размеры и перемещаться по экрану.
 * javax.swing.JTextField        - JTextField, представляющий собой однострочное поле для ввода текста.
 * javax.swing.JLabel            - JLabel, представляющий собой поле для отображения текста или иконки.
 * javax.swing.JOptionPane       - JOptionPane позволяющий вызывать однин из многочисленных статических методов, создающих и выводящих на экран модальное диалоговое окно стандартного вида.
 * javax.swing.JButton           - JButton Кнопка
 * java.awt.event.ActionEvent;
 * java.awt.event.ActionListener - Событие Event - это объект, описывающий изменение состояния источника, с которым оно связано.
 *                                 Примером события, в котором участвует пользователь, являются нажатие кнопки, выбор элемента из списка, ввод символа с клавиатуры и т.д.
 *                                 Слушатель Listener - это уведомляемый о некотором событии объект.
 * java.io.FileWriter            - используется для записи потоков символов.
 * java.awt.Color                - классе Color определяется несколько констант (вроде Color.black) для описания наиболее употребительных используемых цветов.
 * javax.swing.JPanel            - панель контейнер, которая может содержать другие элементы (кнопки, текстовые поля и т.д.)
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
 
//Объявление класса createWindow
public class createWindow {
 
    //Объявление переменных типа JFrame и JTextField
    private JFrame frame;
    private JTextField widthText;
    private JTextField heightText;
    private JTextField colorText;
    private JTextField fpsText;
    private JTextField timeText;
    private JTextField soundText;
    private JTextField gzText;
    private JTextField resultText;
    private JTextField passwordText;
    /* Объявление глобальных переменных класса
     * calcValues     - переменная содержащая валидные значения из всех текстовых полей окна калькулятора
     * error          - логическая переменная содержащая результат проверки введенных значений на валидность
     * ADMIN_PASSWORD - константа содержащая пароль администратора
     */
    public static double[] calcValues = new double[7];
    public static boolean error;
    public static final String ADMIN_PASSWORD = "admin";
 
    //Метод main который запускает работу программы
    public static void main(String[] args) throws Exception {
        EventQueue.invokeLater(new Runnable() {
            //Метод run включающий отображение главного фрейма
            public void run() {
                //Создание экземпляра класса createWindow
                createWindow window = new createWindow();
                //Отключение невидимости фрейма
                window.frame.setVisible(true);
            }
        });
    }
   
 
    //Паблик метод createWindow запускающий метод initialize
    public createWindow() {
        initialize();
    }
   
    //Приватный метод initialize реализующий создание главного окна программы
    public void initialize() {
       
        /*
         * Создаем фрейм и устанавливаем значение заголовка
         * setTitle()                   - устанавливает текстовое значение заголовка окна
         * setBounds()                  - устанавливает положение окна и его размеры
         * setDefaultCloseOperation()   - позволяет указать действие, которое необходимо выполнить, когда пользователь закрывает окно нажатием на крестик.
         * getContentPane()             - обращение к области контента. setLayout() - установка лейаута
         */
        frame = new JFrame();
        frame.setTitle("ПИ 217");
        frame.setBounds(100, 100, 462, 541);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
       
       
        /*
         * Создаем textField-ы и устанавливаем значения по умолчанию
         * setText()                - запись значения в элемент
         * setBounds()              - устанавливает положение элемента и его размеры
         * getContentPane().add()   - добавление элемента в окно программы
         * setColumns()             - изменение длинны строки
         */
        widthText = new JTextField();
        widthText.setText("1280");
        widthText.setBounds(269, 123, 131, 20);
        frame.getContentPane().add(widthText);
        widthText.setColumns(10);
       
        heightText = new JTextField();
        heightText.setColumns(10);
        heightText.setText("1024");
        heightText.setBounds(269, 154, 131, 20);
        frame.getContentPane().add(heightText);
       
        colorText = new JTextField();
        colorText.setText("24");
        colorText.setColumns(10);
        colorText.setBounds(269, 185, 131, 20);
        frame.getContentPane().add(colorText);
       
        fpsText = new JTextField();
        fpsText.setColumns(10);
        fpsText.setText("25");
        fpsText.setBounds(269, 216, 131, 20);
        frame.getContentPane().add(fpsText);
       
        timeText = new JTextField();
        timeText.setColumns(10);
        timeText.setText("52");
        timeText.setBounds(269, 247, 131, 20);
        frame.getContentPane().add(timeText);
       
        soundText = new JTextField();
        soundText.setColumns(10);
        soundText.setText("16");
        soundText.setBounds(269, 278, 131, 20);
        frame.getContentPane().add(soundText);
       
        gzText = new JTextField();
        gzText.setColumns(10);
        gzText.setText("44100");
        gzText.setBounds(269, 309, 131, 20);
        frame.getContentPane().add(gzText);
 
       
       
        /*
         * Создаем надписи (лейблы)
         * setBounds()              - устанавливает положение элемента и его размеры
         * getContentPane().add()   - добавление элемента в окно программы
         */
        JLabel widthLabel = new JLabel("Ширина изображения (px)");
        widthLabel.setBounds(55, 126, 204, 14);
        frame.getContentPane().add(widthLabel);
       
        JLabel heightLabel = new JLabel("Высота изображения (px)");
        heightLabel.setBounds(55, 157, 204, 14);
        frame.getContentPane().add(heightLabel);
       
        JLabel colorLabel = new JLabel("Глубина цвета (бит)");
        colorLabel.setBounds(55, 188, 204, 14);
        frame.getContentPane().add(colorLabel);
       
        JLabel fpsLabel = new JLabel("Количество кадров (шт)");
        fpsLabel.setBounds(55, 219, 204, 14);
        frame.getContentPane().add(fpsLabel);
       
        JLabel timeLabel = new JLabel("Длительность видео (сек)");
        timeLabel.setBounds(55, 250, 204, 14);
        frame.getContentPane().add(timeLabel);
       
        JLabel soundLabel = new JLabel("Разрядность звука (бит)");
        soundLabel.setBounds(55, 281, 204, 14);
        frame.getContentPane().add(soundLabel);
       
        JLabel gzLabel = new JLabel("Частота дискретизации (Гц)");
        gzLabel.setBounds(55, 312, 204, 14);
        frame.getContentPane().add(gzLabel);
        //*********************************************************\\
       
        //Создаем кнопку
        JButton resultButton = new JButton("Рассчитать");
        //Создаем слушатель для кнопки
        resultButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                //Проверка textField-ов на пустоту
                if(isTextFieldEmpty())
                    //Если хотябы одно из полей пустое - выводим окно JOptionPane.showMessageDialog с сообщением об ошибке
                    JOptionPane.showMessageDialog(null, "Все поля обязательны для заполнения!", "Ошибка", JOptionPane.WARNING_MESSAGE);
               
                //Проверка введены ли числовые значения
                if(isNumericValues() == true)
                    //Заполняем массив значениями из textField-ов 
                    setArrayValues();
                else
                    //Если введены не числовые значения, выводим окно с сообщением об ошибке
                    JOptionPane.showMessageDialog(null, "Введите числовые значения!", "Ошибка", JOptionPane.WARNING_MESSAGE);
               
                //Устанавливаем значение по умолчанию для переменной error информирующей об ошибке в заполнении полей
                error = false;
                //Проходим циклом по всем значениям массива calcValues
                for(int i = 0; i < 7; i++) {
                    //Проверяем значения массива методом toValidate
                    if(toValidate(calcValues[i]) == true) {
                        error = true;
                        break;
                    }
                       
                }
                //Если значение переменной error - истина, выводим окно с сообщением об ошибке
                if (error == true) {
                    JOptionPane.showMessageDialog(null, "Введите положительные значения\nКалькулятор не поддерживает значения больше 1000000", "Ошибка", JOptionPane.WARNING_MESSAGE);
                } else {
                //Иначе выполняем вычисления в классе Calculate
                    //Создаем экземпляр класса calculate
                    Calculate calculate = new Calculate();
                    //Выводим значение полученное в классе Calculate в текстовое поле
                    resultText.setText((calculate.toFormateResult())); 
                }
            }
        });
        resultButton.setBounds(269, 356, 131, 23);
        frame.getContentPane().add(resultButton);
       
        /* Создание текстового поля
         * setBounds()              - устанавливает положение элемента и его размеры
         * getContentPane().add()   - добавление элемента в окно программы
         * setColumns()             - изменение длинны строки
         */
        resultText = new JTextField();
        resultText.setBounds(269, 406, 131, 20);
        frame.getContentPane().add(resultText);
        resultText.setColumns(10);
       
        //Создание лейбла
        JLabel resultLabel = new JLabel("Результат:");
        resultLabel.setBounds(142, 409, 117, 14);
        frame.getContentPane().add(resultLabel);
       
        final JPanel passwordPanel = new JPanel();
        passwordPanel.setBounds(21, 11, 398, 88);
        frame.getContentPane().add(passwordPanel);
        passwordPanel.setLayout(null);
       
        JLabel passwordLabel = new JLabel("Пароль администратора:");
        passwordLabel.setBounds(34, 28, 203, 14);
        passwordPanel.add(passwordLabel);
       
        /* Создание текстового поля для ввода паролей */
        passwordText = new JPasswordField();
        passwordText.setText("admin");
        passwordText.setBounds(247, 25, 128, 20);
        passwordPanel.add(passwordText);
        passwordText.setColumns(10);
       
