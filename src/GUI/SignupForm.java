package GUI;

import CommonActionListeners.BackButtonListener;
import Database.DatabaseClass;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

//@SuppressWarnings({ "unused", "serial" })
public class SignupForm extends BaseFrame
{

  
	private static final long serialVersionUID = 1L;
	JLabel username,password,name,email,Age,Address,Gender,mobile_no,signName;
    JTextField enterUsername,enterName,enterEmail,enterAddress,enterGender,entermobile_no,enterAge;

    JPasswordField enterPassword;

    JButton back, submit;

    List<JLabel> visibleLabels;
    List<JLabel> visibleLabels1;
    List<JTextField> textFields;
    List<JTextField> textFields1;

    //List<JButton> buttons;

    JFrame lastPage;

    JCheckBox showPassword;


    
    private void initSignName()
    {
        signName=new JLabel("Sign Up");
        signName.setBounds(100, 100,200, 40);
        signName.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 30));
        signName.setForeground (new Color(255,255,255));
        super.basePanel.add(signName);
    }

    private void initUsername()
    {
        username=new JLabel("Username :");
        username.setForeground (new Color(255,255,255));
        username.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 20));
        this.visibleLabels.add(username);
    }

    private void initPassword() {
        password=new JLabel("Password :");
        password.setForeground (new Color(255,255,255));
        password.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 20));
        this.visibleLabels.add(password);
    }

    private void initName() {
        name=new JLabel("Full Name :");
        name.setForeground (new Color(255,255,255));
        name.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 20));
        this.visibleLabels.add(name);
    }

    private void initEmail() {
        email=new JLabel("Email Address :");
        email.setForeground (new Color(255,255,255));
        email.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 20));
        this.visibleLabels.add(email);

    }
  private void initAge()
  {
       Age=new JLabel("Age :");
       Age.setForeground (new Color(255,255,255));
       Age.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 20));
       this.visibleLabels1.add(Age);

    }
    private void initAddress() {
        Address=new JLabel("Address :");
        Address.setForeground (new Color(255,255,255));
        Address.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 20));
        this.visibleLabels1.add(Address);

    }
    private void initGender() {
        Gender=new JLabel("Gender :");
        Gender.setForeground (new Color(255,255,255));
        Gender.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 20));
        this.visibleLabels1.add(Gender);

    }
    private void initmobile_no() {
        mobile_no=new JLabel("Mobile No :");
        mobile_no.setForeground (new Color(255,255,255));
        mobile_no.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 20));
        this.visibleLabels1.add(mobile_no);

    }
    
    
    


    protected void initEnterUsername() {

        this.enterUsername=new JTextField();
        this.textFields.add(enterUsername);
    }

    protected void initEnterPassword() {
        this.enterPassword=new JPasswordField();
        this.textFields.add(enterPassword);
    }

    protected void initEnterName() {
        this.enterName=new JTextField();
        this.textFields.add(enterName);
    }

    protected void initEnterEmail() {
        this.enterEmail=new JTextField(15);
        this.textFields.add(enterEmail);

    }
    protected void initEnterAge() {
        this.enterAge=new JTextField(16);
        this.textFields1.add(enterAge);

    }
    protected void initEnterAddress() 
    {
        this.enterAddress=new JTextField(17);
        this.textFields1.add(enterAddress);

    }
    protected void initEnterGender() 
    {
        this.enterGender=new JTextField(18);
        this.textFields1.add(enterGender);

    }
    protected void initEntermobile_no() 
    {
        this.entermobile_no=new JTextField(19);
        this.textFields1.add(entermobile_no);
        

    }
 
    protected void initback() {
        back=new JButton("Back");
        back.setBounds(600,500,200,40);
        back.setBackground(new java.awt.Color(255, 153, 0));
        back.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 16));
        back.addActionListener(new BackButtonListener(this,lastPage));
        super.basePanel.add(back);
    }

    protected void initSubmit() {
        submit =new JButton("Submit");
        submit.addActionListener(this);
        submit.setBounds(300,500,200,40);
        submit.setBackground(Color.green);
        submit.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 16));
        
        super.basePanel.add(submit);
    }

    protected void initTitle()
    {
        this.setTitle("Sign Up");
    }


    SignupForm(JFrame lastPage)
    {

        this.lastPage=lastPage;


        visibleLabels=new ArrayList<>();
        textFields=new ArrayList<>();
        visibleLabels1=new ArrayList<>();
        textFields1=new ArrayList<>();

        initComponents();
        positionComponents();





    }

    void positionComponents()
    {
    	position(this.visibleLabels,100,200,180,40,70);
           position(this.textFields,300,200,200,30,70);
        
        position(this.visibleLabels1,600,200,150,40,70);
           position(this.textFields1,760,200,200,30,70);
        
    }
    void initComponents()
    {
        //order of JTextFields
        initEnterUsername();
        initEnterPassword();
        initEnterName();
        initEnterEmail();
        initEnterAge();
        initEnterAddress();
        initEnterGender();
        initEntermobile_no();
        initSignName();
        //order of JLabels
        initUsername();
        initPassword();
        initName();
        initEmail();
        initAge();
        initAddress();
        initGender();
        initmobile_no();

        //order of JButtons
        initSubmit();
        initback();

        //init page Title
        initTitle();

        showPassword =new JCheckBox("Show Password");
        showPassword.setBounds(300,290,200,40);
        showPassword.setForeground(new Color(0,0,153));
        showPassword.addActionListener(this);
        showPassword.setForeground(new Color(255,255,255));
        basePanel.add(showPassword);


    }
    void position(List<? extends JComponent> list , int startingX, int startingY, int height, int width, int yIincrement)
    {
        for(int i=0;i<list.size();i++)
        {
            list.get(i).setBounds(startingX,startingY,height,width);
            super.basePanel.add(list.get(i));
            startingY=startingY+yIincrement;
        }
    }




    @Override
    public void actionPerformed(ActionEvent e)
    {

        if(e.getSource().equals(back))
        {
            this.dispose();

                new UserLogin();

        }
        else if (e.getSource().equals(submit))
        {
            String userName= enterUsername.getText();
            @SuppressWarnings("deprecation")
			String password= enterPassword.getText();
            String fullName= enterName.getText();
            
            String email=enterEmail.getText();
            String age=enterAge.getText();
            
           // Integer age=Integer.parseInt(p);
            String address=enterAddress.getText();
            String gender=enterGender.getText();
            String mob_no=entermobile_no.getText();

            if(userName.equals("") || password.equals("") || fullName.equals("") || email.equals("")||address.equals("")||gender.equals("")||mob_no.equals(""))
            {
                JOptionPane.showMessageDialog(basePanel,"Error! Some fields are empty");
                return;
            }
            if(userName.trim().length()!=9)
            {
            	JOptionPane.showMessageDialog(basePanel,"UserName is Invalid");
                return;
            	
            }
            int size = email.length();
            String s="";
            for(int i=size-11;i<size;i++)
            {
            	s=s + Character.toString(email.charAt(i));
            }
            if(!s.equals("@nitc.ac.in"))
            {
            	JOptionPane.showMessageDialog(basePanel,"Invalid email address");
                return;
            }
            if(password.length()<8){
            	
            	JOptionPane.showMessageDialog(basePanel,"Password should be atleat 8 characters");
                return;
            }
            if(mob_no.length()!=10){
            	
            	JOptionPane.showMessageDialog(basePanel,"Mobile Number should be 10 digits");
                return;
            }
            if(DatabaseClass.getDataAccessObject().addUser(userName,password,fullName,email,age,address,gender,mob_no))
            {
                this.setVisible(false);

                    new UserLogin();

            }
            else
                JOptionPane.showMessageDialog(basePanel,"This Username or Email Id already exists");
        }

        if(e.getSource().equals(showPassword))
        {
            if (showPassword.isSelected()) {
                enterPassword.setEchoChar((char)0); //password = JPasswordField
            } else {
                enterPassword.setEchoChar('*');
            }
        }

    }
   
}
