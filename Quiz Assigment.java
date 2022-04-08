

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;


public class Quiz {
    public static JFrame MainFrame;
    public static JPanel MainPanel;
  
    //Pictures
    public static JLabel Picture_Slide2;
    public static JLabel Picture_Slide3;
    public static JLabel Picture_Slide4;
    public static JLabel Picture_Slide5;
    public static JLabel Picture_Slide6;
    public static JLabel Picture_Slide7;

    //Answer Tab
    public static JLabel Answer1;
    public static JLabel Answer2;
    public static JLabel Answer3;
    public static JLabel Answer4;
    public static JLabel Answer5;

    //Labels
    public static JLabel Title_Slide1;
    public static JLabel Title2_Slide1;
    public static JLabel Title3_Slide1;
    public static JLabel Question_Slide2;
    public static JLabel Question_Slide3;
    public static JLabel Question_Slide4;
    public static JLabel Question_Slide5;
    public static JLabel Question_Slide6;
    public static JLabel Question_Slide7;
    public static JLabel Question_Slide8;
    public static JLabel Question_Slide9;
    public static JLabel Question_Slide10;
    public static JLabel Score_label;
    public static JLabel Score_label2;


    //Buttons
    public static JButton Start_Button;
    public static JButton Red_Button;
    public static JButton Green_Button;
    public static JButton End_Button;


    //submit buttons
    public static JButton Submit_Button1;
    public static JButton Submit_Button2;
    public static JButton Submit_Button3;
    public static JButton Submit_Button4;
    public static JButton Submit_Button5;
    public static JButton Submit_Button6;
    public static JButton Submit_Button7;
    public static JButton Submit_Button8;


    //Separator
    public static JSeparator Sep_Slide2;

    //TextField
    public static JTextField Answer_Slide3;

    //ComboBox
    public static JComboBox Answer_Slide4;

    //RadioButton
    public static JRadioButton Answer_Slide5;
    public static JRadioButton Answer2_Slide5;
    //CheckBox
    public static JCheckBox Answer_Slide6;
    public static JCheckBox Answer2_Slide6;
    public static JCheckBox Answer3_Slide6;
    public static JCheckBox Answer4_Slide6;

    //Arrays
    public static String[] Slide4_Options = {"Pizza", "Noodle", "Calzone", "Sushi"};
    public static String[] Slide3_Options = {"Lucas", "lucas"};

    //misc
    public static boolean a;
    public static boolean b;
    public static boolean cc;
    public static boolean dd;
    public static String NAME;
    public static Object POGG;
    public static Integer winlose;
    private static double Score = 0;
    
   
    
    

    public static void main(String[] args) {
        GUI();
    }

    public static void GUI() {//this is where i make all of my swing stuff and just set them to visible false
 
        // makes Frame thats used throughout
        MainFrame = new JFrame("Quiz");
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainFrame.setSize(800, 500);

        // makes panel used throughout
        MainPanel = new JPanel();
        MainPanel.setBackground(Color.LIGHT_GRAY);
        MainFrame.add(MainPanel);
        MainPanel.setLayout(null);

        //These items stay until score tab
        End_Button = new JButton("END");
        End_Button.setBounds(25, 425, 75, 20);
        End_Button.setVisible(false);
        End_Button.addActionListener((ActionEvent a) -> MainFrame.dispose());
        MainPanel.add(End_Button);
        //Title Slide

        //Labels
        Title_Slide1 = new JLabel("QUIZ");
        Title_Slide1.setFont(new Font("Serif", Font.BOLD, 150));
        Title_Slide1.setBounds(25, 100, 400, 200);
        Title_Slide1.setVisible(false);
        MainPanel.add(Title_Slide1);

        Title2_Slide1 = new JLabel("Connor's");
        Title2_Slide1.setFont(new Font("Comic Sans", Font.BOLD, 70));
        Title2_Slide1.setBounds(10, 10, 400, 200);
        Title2_Slide1.setVisible(false);
        MainPanel.add(Title2_Slide1);

        //adds button to title page
        Start_Button = new JButton("Start");
        Start_Button.setBounds(150, 350, 500, 30);
        Start_Button.setVisible(false);
        MainPanel.add(Start_Button);

        //all of this adds picture
        BufferedImage img1 = null;
        try {
            img1 = ImageIO.read(new File("src/Connor1.jpeg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image dimg = img1.getScaledInstance(250, 200, 100);

        //Creating image icons
        ImageIcon image1 = new ImageIcon(dimg);

        //Adds picture as a label
        Title3_Slide1 = new JLabel(image1);
        Title3_Slide1.setBounds(450, 100, 250, 200);
        Title3_Slide1.setVisible(false);
        MainPanel.add(Title3_Slide1);
        
        //pic2 
        BufferedImage img2 = null;
        try {
            img2 = ImageIO.read(new File("src/ConnorThink.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image dimg2 = img2.getScaledInstance(150, 150, 100);

        //Creating image icons
        ImageIcon image2 = new ImageIcon(dimg2);
        
        //Adds picture as a label
        Picture_Slide2 = new JLabel(image2);
        Picture_Slide2.setBounds(330, 200, 150, 150);
        Picture_Slide2.setVisible(false);
        MainPanel.add(Picture_Slide2);

        //Pic3
        BufferedImage img3 = null;
        try {
        	img3 = ImageIO.read(new File("src/ConnorThinksleft.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image dimg3 = img3.getScaledInstance(200, 200, 200);

        //Creating image icons
        ImageIcon image3 = new ImageIcon(dimg3);

        //Adds picture as a label
        Picture_Slide3 = new JLabel(image3);
        Picture_Slide3.setBounds(570, 150, 200, 200);
        Picture_Slide3.setVisible(false);
        MainPanel.add(Picture_Slide3);
        
        //Pic4
        BufferedImage img4 = null;
        try {
            img4 = ImageIO.read(new File("src/ConnorHappy.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image dimg4 = img4.getScaledInstance(250, 200, 100);

        //Creating image icons
        ImageIcon image4 = new ImageIcon(dimg4);

        //Adds picture as a label
        Picture_Slide4 = new JLabel(image4);
        Picture_Slide4.setBounds(550, 150, 200, 200);
        Picture_Slide4.setVisible(false);
        MainPanel.add(Picture_Slide4);
        
        //Pic5
        BufferedImage img5 = null;
        try {
            img5 = ImageIO.read(new File("src/ConnorThink.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image dimg5 = img5.getScaledInstance(150, 150, 100);

        //Creating image icons
        ImageIcon image5 = new ImageIcon(dimg5);

        //Adds picture as a label
        Picture_Slide5 = new JLabel(image5);
        Picture_Slide5.setBounds(330, 200, 150, 150);
        Picture_Slide5.setVisible(false);
        MainPanel.add(Picture_Slide5);
        
        //Pic6
        BufferedImage img6 = null;
        try {
            img6 = ImageIO.read(new File("src/ConnorPoses.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image dimg6 = img6.getScaledInstance(150, 150, 100);

        //Creating image icons
        ImageIcon image6 = new ImageIcon(dimg6);

        //Adds picture as a label
        Picture_Slide6 = new JLabel(image6);
        Picture_Slide6.setBounds(330, 150, 150, 150);
        Picture_Slide6.setVisible(false);
        MainPanel.add(Picture_Slide6);
        
        //Pic6
        BufferedImage img7 = null;
        try {
            img7 = ImageIO.read(new File("src/Connor1.jpeg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image dimg7 = img7.getScaledInstance(250, 200, 100);

        //Creating image icons
        ImageIcon image7 = new ImageIcon(dimg7);

        //Adds picture as a label
        Picture_Slide7 = new JLabel(image7);
        Picture_Slide7.setBounds(450, 100, 250, 200);
        Picture_Slide7.setVisible(false);
        MainPanel.add(Picture_Slide7);
        


        //Slide 2

        Question_Slide2 = new JLabel("What is Connors Favorite Color?");
        Question_Slide2.setFont(new Font("Serif", Font.BOLD, 45));
        Question_Slide2.setBounds(25, 10, 700, 100);
        Question_Slide2.setVisible(false);
        MainPanel.add(Question_Slide2);
        
        Sep_Slide2 = new JSeparator();
        Sep_Slide2.setBounds(10, 100, 700, 10);
        Sep_Slide2.setForeground(Color.black);
        MainPanel.add(Sep_Slide2);
        Sep_Slide2.setVisible(false);

        Red_Button = new JButton("Red");
        Red_Button.setBounds(100, 150, 200, 200);
        Red_Button.setVisible(false);
        Red_Button.setFont(new Font("Serif", Font.PLAIN, 50));
        Red_Button.setBackground(Color.RED);
        MainPanel.add(Red_Button);

        Green_Button = new JButton("Green");
        Green_Button.setBounds(500, 150, 200, 200);
        Green_Button.setVisible(false);
        Green_Button.setFont(new Font("Serif", Font.PLAIN, 50));
        Green_Button.setBackground(Color.GREEN);
        MainPanel.add(Green_Button);

        //Slide 3
        Question_Slide3 = new JLabel("What Is Connors Last Name?");
        Question_Slide3.setFont(new Font("Serif", Font.BOLD, 45));
        Question_Slide3.setBounds(25, 10, 700, 100);
        Question_Slide3.setVisible(false);
        MainPanel.add(Question_Slide3);

        Answer_Slide3 = new JTextField();
        Answer_Slide3.setBounds(50, 150, 500, 200);
        Answer_Slide3.setFont(new Font("Serif", Font.BOLD, 100));
        Answer_Slide3.setVisible(false);
        MainPanel.add(Answer_Slide3);

        Submit_Button1 = new JButton("Sumbit");
        Submit_Button1.setBounds(125, 425, 75, 20);
        Submit_Button1.setVisible(false);
        MainPanel.add(Submit_Button1);

        //Slide 4
        Answer_Slide4 = new JComboBox<Object>(Slide4_Options);
        Answer_Slide4.setBounds(25, 150, 500, 200);
        Answer_Slide4.setFont(new Font("Serif", Font.BOLD, 100));
        Answer_Slide4.setVisible(false);
        MainPanel.add(Answer_Slide4);

        Question_Slide4 = new JLabel("What is Connors Favourite Food?");
        Question_Slide4.setFont(new Font("Serif", Font.BOLD, 45));
        Question_Slide4.setBounds(25, 10, 700, 100);
        Question_Slide4.setVisible(false);
        MainPanel.add(Question_Slide4);

        Submit_Button2 = new JButton("Sumbit");
        Submit_Button2.setBounds(125, 425, 75, 20);
        Submit_Button2.setVisible(false);
        MainPanel.add(Submit_Button2);

        //Slide 5
        Question_Slide5 = new JLabel("How many dogs does Connor Own?");
        Question_Slide5.setFont(new Font("Serif", Font.BOLD, 45));
        Question_Slide5.setBounds(25, 10, 700, 100);
        Question_Slide5.setVisible(false);
        MainPanel.add(Question_Slide5);

        Submit_Button3 = new JButton("Sumbit");
        Submit_Button3.setBounds(125, 425, 75, 20);
        Submit_Button3.setVisible(false);
        MainPanel.add(Submit_Button3);

        ButtonGroup btn_grp = new ButtonGroup();

        Answer_Slide5 = new JRadioButton("6");
        Answer_Slide5.setBounds(500, 150, 200, 200);
        MainPanel.add(Answer_Slide5);
        btn_grp.add(Answer_Slide5);
        Answer_Slide5.setVisible(false);

        Answer2_Slide5 = new JRadioButton("2");
        Answer2_Slide5.setBounds(100, 150, 200, 200);
        MainPanel.add(Answer2_Slide5);
        btn_grp.add(Answer2_Slide5);
        Answer2_Slide5.setVisible(false);
        Answer2_Slide5.addActionListener((ActionEvent t) -> dd = true); // Jer note: I simplified several of these action events, this just uses fewer lines to do the same thing and can always be used for single-operation if statements


        //Slide 6
        Question_Slide6 = new JLabel("What are Connors 2 Favourite Games?");
        Question_Slide6.setFont(new Font("Serif", Font.BOLD, 35));
        Question_Slide6.setBounds(25, 10, 700, 100);
        Question_Slide6.setVisible(false);
        MainPanel.add(Question_Slide6);

        Answer_Slide6 = new JCheckBox("Genshin Impact");
        Answer_Slide6.setBounds(100, 150, 200, 50);
        Answer_Slide6.setVisible(false);
        MainPanel.add(Answer_Slide6);

        Answer2_Slide6 = new JCheckBox("GeoGuesser");
        Answer2_Slide6.setBounds(500, 150, 200, 50);
        Answer2_Slide6.setVisible(false);
        MainPanel.add(Answer2_Slide6);
        Answer2_Slide6.addActionListener((ActionEvent z) -> b = true);
        Answer3_Slide6 = new JCheckBox("City Skylines");
        Answer3_Slide6.setBounds(500, 250, 200, 50);
        Answer3_Slide6.setVisible(false);
        MainPanel.add(Answer3_Slide6);
        Answer3_Slide6.addActionListener((ActionEvent x) -> a = true);

        Answer4_Slide6 = new JCheckBox("Fortnite");
        Answer4_Slide6.setBounds(100, 250, 200, 50);
        Answer4_Slide6.setVisible(false);
        MainPanel.add(Answer4_Slide6);


        Submit_Button4 = new JButton("Sumbit");
        Submit_Button4.setBounds(125, 425, 75, 20);
        Submit_Button4.setVisible(false);
        MainPanel.add(Submit_Button4);
      
        //Slide 7
         
        
   

        SLIDE_ONE();
    }

    public static void SLIDE_ONE() {

        MainFrame.setVisible(true);
        MainPanel.setVisible(true);
        Title_Slide1.setVisible(true);
        Title2_Slide1.setVisible(true);
        Title3_Slide1.setVisible(true);
        Start_Button.setVisible(true);

        Start_Button.addActionListener((ActionEvent a) -> {
            SLIDE_TWO();
            //disable last slide
            Title_Slide1.setVisible(false);
            Title2_Slide1.setVisible(false);
            Start_Button.setVisible(false);
            Title3_Slide1.setVisible(false);
        });
    }

    public static void SLIDE_TWO() { //Buttons


        //enable this slide
        End_Button.setVisible(true);
        Question_Slide2.setVisible(true);
        Sep_Slide2.setVisible(true);
        Picture_Slide2.setVisible(true);
        
        Red_Button.setVisible(true);
        Red_Button.addActionListener((ActionEvent b) -> {
            Question_Slide2.setVisible(false);
            Sep_Slide2.setVisible(false);
            Red_Button.setVisible(false);
            Green_Button.setVisible(false);
            Picture_Slide2.setVisible(false);

            SLIDE_THREE();

        });

        Green_Button.setVisible(true);
        Green_Button.addActionListener((ActionEvent c) -> {
            Question_Slide2.setVisible(false);
            Sep_Slide2.setVisible(false);
            Picture_Slide2.setVisible(false);
            Red_Button.setVisible(false);
            Green_Button.setVisible(false);
            SLIDE_THREE();
            cc = true;
        });

    }

    public static void SLIDE_THREE() { //Text

        //enable this slide
        Question_Slide3.setVisible(true);
        Answer_Slide3.setVisible(true);
        Submit_Button1.setVisible(true);
        Picture_Slide3.setVisible(true);
        
        Submit_Button1.addActionListener((ActionEvent d) -> {
            Question_Slide3.setVisible(false);
            Answer_Slide3.setVisible(false);
            Submit_Button1.setVisible(false);
            End_Button.setVisible(false);
            Picture_Slide3.setVisible(false);

            NAME = Answer_Slide3.getText();
            SLIDE_FOUR();
        });
    }

    public static void SLIDE_FOUR() {//ComboBox
        //Enable this slide
        Question_Slide4.setVisible(true);
        Answer_Slide4.setVisible(true);
        Submit_Button2.setVisible(true);
        End_Button.setVisible(true);
        Picture_Slide4.setVisible(true);

        Submit_Button2.addActionListener((ActionEvent e) -> {
            Question_Slide4.setVisible(false);
            Submit_Button2.setVisible(false);
            POGG = Answer_Slide4.getSelectedItem();
            Answer_Slide4.setVisible(false);
            Picture_Slide4.setVisible(false);

            SLIDE_FIVE();
        });
    }

    public static void SLIDE_FIVE() {//Check


        Submit_Button3.setVisible(true);
        Question_Slide5.setVisible(true);
        Answer_Slide5.setVisible(true);
        Answer2_Slide5.setVisible(true);
        Picture_Slide5.setVisible(true);



        Submit_Button3.addActionListener((ActionEvent f) -> {
            Question_Slide5.setVisible(false);
            Submit_Button3.setVisible(false);
            Answer_Slide5.setVisible(false);
            Answer2_Slide5.setVisible(false);
            Picture_Slide5.setVisible(false);



            SLIDE_SIX();
        });
    }

    public static void SLIDE_SIX() { //Radio
        Question_Slide6.setVisible(true);
        Answer_Slide6.setVisible(true);
        Answer2_Slide6.setVisible(true);
        Answer3_Slide6.setVisible(true);
        Answer4_Slide6.setVisible(true);
        Picture_Slide6.setVisible(true);



        Submit_Button4.setVisible(true);

        Submit_Button4.addActionListener((ActionEvent g) -> {
            Question_Slide6.setVisible(false);
            Answer_Slide6.setVisible(false);
            Answer2_Slide6.setVisible(false);
            Picture_Slide6.setVisible(false);

            Submit_Button4.setVisible(false);
            Answer3_Slide6.setVisible(false);
            Answer4_Slide6.setVisible(false);

            SLIDE_SEVEN();
        });


    }

    public static void SLIDE_SEVEN() {
    	
    	//i did this at like 2:00 am have mercy
    	winlose = 0;
    	
        Picture_Slide7.setVisible(true);

        if (cc) { // Jer note: You don't need to compare booleans, just putting the name of the var is essentially saying if [VAR] is true
           
        Answer1 = new JLabel("Question 1 Was Correct");
        Answer1.setVisible(true);
        Answer1.setBounds(50, 50, 500, 25);
        MainPanel.add(Answer1);
        Score += 1;      
        } else {
        	 Answer1 = new JLabel("Question 1 Was Wrong");
             Answer1.setVisible(true);
             Answer1.setBounds(50, 25, 500, 25);   
             MainPanel.add(Answer1);
        }
        //Q2
        if (Objects.equals(NAME, "Lucas")) {
            Answer2 = new JLabel("Question 2 Was Correct");
            Answer2.setVisible(true);
            Answer2.setBounds(50, 100, 500, 25);
            Score += 1;   
            MainPanel.add(Answer2);
        }//Not Working
        else {
            Answer2 = new JLabel("Question 2 Was Wrong");
            Answer2.setVisible(true);
            Answer2.setBounds(50, 100, 500, 25);   
            MainPanel.add(Answer2);
          
        }
        //Q3
        if (POGG == "Pizza") {
        	 Answer3 = new JLabel("Question 3 Was Correct");
             Answer3.setVisible(true);
             Answer3.setBounds(50, 150, 500, 25);
                 MainPanel.add(Answer3);
                 Score += 1;        
                 } else {
        	 Answer3 = new JLabel("Question 3 Was Wrong");
             Answer3.setVisible(true);
             Answer3.setBounds(50, 150, 500, 25);
                 MainPanel.add(Answer3);
        }

        //Q4
        if (dd) { // Jer note: see above
        	Answer4 = new JLabel("Question 4 Was Correct");
            Answer4.setVisible(true);
            Answer4.setBounds(50, 200, 500, 25);
             MainPanel.add(Answer4);
             Score += 1;
             } else {
        	Answer4 = new JLabel("Question 4 Was Wrong");
            Answer4.setVisible(true);
            Answer4.setBounds(50, 200, 500, 25);
             MainPanel.add(Answer4);        }

        //Q5
        if (b && a) { // Jer note: see above
        	  Answer5 = new JLabel("Question 5 Was Correct");
              Answer5.setVisible(true);
              Answer5.setBounds(50, 250, 500, 25);
               MainPanel.add(Answer5);    
               Score += 1;        
               } else {
            Answer5 = new JLabel("Question 5 Was Wrong");
            Answer5.setVisible(true);
            Answer5.setBounds(50, 250, 500, 25);
            MainPanel.add(Answer5);         
             }
        if (Score >= 4) {
        	Score_label = new JLabel("You Win!");
        	Score_label.setVisible(true);
        	Score_label.setBounds(50, 300, 500, 25);
             MainPanel.add(Score_label);
        } else {
        	Score_label = new JLabel("You Loose!");
        	Score_label.setVisible(true);
        	Score_label.setBounds(50, 300, 500, 25);
             MainPanel.add(Score_label);
        }
        
        Score_label = new JLabel("Your score was " + Score + "/5");
    	Score_label.setVisible(true);
    	Score_label.setBounds(50, 350, 500, 25);
         MainPanel.add(Score_label);
  
    }
}
