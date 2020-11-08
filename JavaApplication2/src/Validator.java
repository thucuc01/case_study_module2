
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAM
 */
public class Validator {
    public static boolean isEmpty(JTextField txtField,StringBuilder str,String msg){
       String strField=txtField.getText().trim();
       if(strField.equals("")){
           str.append(msg).append("\n");          
           txtField.setBackground(Color.red);
           return false;
       }
       txtField.setBackground(Color.white);
       return true;
    }
    public static boolean isNumber(JTextField txtField,StringBuilder str,String msg){
        if(!isEmpty(txtField,str,msg)){
            return false;
        } else {
            try{
                Integer.parseInt(txtField.getText());
                txtField.setBackground(Color.white);                 
            }catch(Exception e){
                System.out.println("ERROR Validator isNumber: "+ e.toString());
                str.append(msg).append("\n");
                txtField.setBackground(Color.red);
                return false;          
            }
        }
        return true;
    }
    public static boolean isNumber(JTextField txtField,StringBuilder str,
            String msg, int type){
        if(!isEmpty(txtField,str,msg)){
            return false;
        } else {
            try{
                switch(type){
                    case 0:
                        Integer.parseInt(txtField.getText());
                        txtField.setBackground(Color.white);
                        break;
                    case 1:
                      Double.parseDouble(txtField.getText());
                        txtField.setBackground(Color.white); 
                        break;
                }                 
            }catch(Exception e){
                System.out.println("ERROR Validator isNumber: "+ e.toString());
                 str.append(msg).append("\n");
                 txtField.setBackground(Color.red);
                 return false;          
            }
        }
        return true;
    }
    public static boolean isNumberMinMax(JTextField txtField,StringBuilder str,
            String msg,double min, double max, int type){
        if(!isNumber(txtField,str,msg,type)){
            return false;
        }else{
            switch(type){
                case 0:
                    int numberInt=Integer.parseInt(txtField.getText());
                    if(numberInt<min||numberInt>max){
                        str.append(msg).append("\n");
                        txtField.setBackground(Color.red);
                        return false;   
                    }
                    break;
            
                case 1:
                    double number=Double.parseDouble(txtField.getText());
                    if(number<min||number>max){
                        str.append(msg).append("\n");
                        txtField.setBackground(Color.red);
                        return false;   
                    }
                    break;
            }  
        }
        txtField.setBackground(Color.white); 
        return true;
    }
    private static final String STUDENT_FILE_NAME = "student.txt";


    public static void write(List<Student> studentList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File(STUDENT_FILE_NAME));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(studentList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }


    public static List<Student> read() {

        FileInputStream fis;
        try {
            fis = new FileInputStream(STUDENT_FILE_NAME);
            ObjectInputStream ois=new ObjectInputStream(fis);
            List<Student>list=(List<Student>) ois.readObject();
            if(list==null){
                list=new ArrayList<Student>();
            }
            return list;
        } catch (ClassNotFoundException | IOException e) {
            return null;
        }
    }


    private static void closeStream(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private static void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
