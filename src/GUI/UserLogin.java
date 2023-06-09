package GUI;//import required classes and packages



import Database.DatabaseClass;

import javax.swing.*;

import CommonActionListeners.BackButtonListener;

//import javax.swing.border.Border;
//import javax.swing.border.CompoundBorder;
//import javax.swing.border.EmptyBorder;
//import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
//create GUI.LoginForm class to create login form
//class extends JFrame to create a window where our component add  
//class implements ActionListener to perform an action on button click  
public class UserLogin extends BaseFrame1
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//initialize button, panel, label, and text field  
    JButton submit,signup, adminLogin, back;
    JLabel loginLabel, passLabel,userLabel,newLabel,homeLabel;
    JTextField loginIdTextBox;

    JPasswordField passwordTextBox;



    JCheckBox showPassword;
    
    
    

    protected void initHomeLabel()
    {
    	homeLabel = new JLabel("Welcome to NITC_Travel_Together");
    	homeLabel.setBounds(90,60,800,45);
    	homeLabel.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 40));
    	homeLabel.setForeground (new Color(231,184,141));
        super.basePanel.add(homeLabel);
    }
    
    
    protected void initUserLabel()
    {
    	userLabel = new JLabel("Student Login");
    	userLabel.setBounds(350,170,200,40);
    	userLabel.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 25));
    	userLabel.setForeground (new Color(0,0,0));
        super.basePanel.add(userLabel);
    }
    
    protected void initNewLabel()
    {
    	newLabel = new JLabel("Not a member?");
    	newLabel.setBounds(470,415,200,40);
    	newLabel.setFont(new Font(Font.SANS_SERIF,  Font.ITALIC, 15));
    	newLabel.setForeground (new Color(0,0,0));
        super.basePanel.add(newLabel);
    }
    




  protected void initLoginLabel()
   {
       loginLabel = new JLabel("Username :");
       loginLabel.setBounds(350,220,150,40);
       loginLabel.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 20));
       loginLabel.setForeground (new Color(0,0,0));
       super.basePanel.add(loginLabel);
   }

  private void initPasswordLabel()
   {
       passLabel = new JLabel("Password :");
       passLabel.setBounds(350,270,150,40);
       passLabel.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 20));
       passLabel.setForeground (new Color(0,0,0));
       super.basePanel.add(passLabel);
   }

  private void initSubmitButton()
   {
       submit = new JButton("Login");
       
       //submit.setForeground(Color.yellow);
   
       
       submit.setBounds(480,350,200,40);
       submit.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 18));
       submit.setBackground(new Color(173,134,106));
       super.basePanel.add(submit);
       submit.addActionListener(this);
       
       submit.addMouseListener(new MouseAdapter() {
           Color color = submit.getForeground();
           public void mouseEntered(MouseEvent me) {
              color = submit.getForeground();
              submit.setBackground(new Color(143,104,86)); // change the color to green when mouse over a button
           }
           public void mouseExited(MouseEvent me) {
        	   submit.setBackground(new Color(173,134,106));
           }
        });
   }

  private void initSignupButton()
   {
       signup=new JButton("Sign Up");
       signup.setBounds(580,420,100,30);
       signup.setBackground(new Color(255, 255, 153));
       signup.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 12));
       //signup.setForeground(Color.yellow);
       super.basePanel.add(signup);
       signup.addActionListener(this);
       signup.addMouseListener(new MouseAdapter() {
           Color color = signup.getForeground();
           public void mouseEntered(MouseEvent me) {
              color = signup.getForeground();
              signup.setBackground(new Color(225, 225, 123)); // change the color to green when mouse over a button
           }
           public void mouseExited(MouseEvent me) {
        	   signup.setBackground(new Color(255, 255, 153));
           }
        });
   }

  private void initadminLoginButton()
   {
       adminLogin=new JButton("Admin Login");
       adminLogin.setBounds(700,500,150,35);
       adminLogin.setBackground(new Color(255, 255, 153));
       adminLogin.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 12));
       super.basePanel.add(adminLogin);
       adminLogin.addActionListener(this);
      
   }

  private void initLoginTextBox()
   {
       loginIdTextBox = new JTextField(15);    //set length of the text
       loginIdTextBox.setBounds(480,230,200,30);
       super.basePanel.add(loginIdTextBox);
   }

  private void initPasswordTextBox()
   {
       passwordTextBox = new JPasswordField(15);    //set length for the password
       passwordTextBox.setBounds(480,280,200,30);
       super.basePanel.add(passwordTextBox);
   }

  private void initBackButton() {
  back = new JButton();
  back.setBackground(new java.awt.Color(255, 153, 0));
  back.setFont(new Font(Font.SANS_SERIF,  Font.BOLD, 12));
  back.setBounds(350,600,70,35);
  back.setText("<");
  //super.basePanel.add(back);
  back.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
          backActionPerformed(evt);
      }
  });
  }
  /*
  backButton =new JButton("Back");
  backButton.setBounds(250,470,80,40);
  backButton.addActionListener(new BackButtonListener(this,lastPage));
  super.basePanel.add(backButton);*/
  
  private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
      // TODO add your handling code here:
      new Homepage().setVisible(true);
      this.dispose();
  }
  
  
  protected void setTitle()
   {
       setTitle("Home Page");
   }

  public UserLogin()
    {



        this.setBackground(new Color(1,1,1));
        initHomeLabel();
        initLoginLabel();
        initPasswordLabel();
        initUserLabel();
        initNewLabel();
        initLoginTextBox();
        initPasswordTextBox();
        initBackButton();
        initSubmitButton();
        initSignupButton();
        initadminLoginButton();
        setTitle();
   
        showPassword =new JCheckBox("Show Password");
        showPassword.setBounds(480,295,200,50);
        showPassword.addActionListener(this);
        showPassword.setForeground(new Color(0,0,0));
        basePanel.add(showPassword);


    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource().equals(submit))
        {
            String userName = loginIdTextBox.getText();        //get user entered username from the textField1
            @SuppressWarnings("deprecation")
			String passValue = passwordTextBox.getText();        //get user entered pasword from the textField2

            //check whether the credentials are authentic or not
            try {
                if (  !userName.equals("") && DatabaseClass.getDataAccessObject().userLoginValidate(userName,passValue))
                {
                    //if authenticated successfully, navigate user to a new page
                    //create instance of the GUI.NewPage

                    this.dispose();
                    new UserLandingPage(DatabaseClass.getDataAccessObject().getUser(userName));

                } else
                    JOptionPane.showMessageDialog(basePanel,"Error! Username or Password in Invalid");
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
        }

        if(e.getSource().equals(signup))
        {
            this.dispose();
            new SignupForm(this);

        } 
        if (e.getSource().equals(adminLogin))
        {
        	
        	this.dispose();
            new AdminLogin();
            
        }

        if(e.getSource().equals(showPassword))
        {
            if (showPassword.isSelected()) {
                //setting 0 means view text as it is
                passwordTextBox.setEchoChar((char)0); //password = JPasswordField
            } else {
                passwordTextBox.setEchoChar('*');
            }
        }
       
        
    }
    
    

}



