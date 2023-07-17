package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
//        System.out.println(Divide(5, 0));

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (Map.Entry<String, String> student : studentFiles.entrySet()) {
            System.out.println(student.getKey() + ": " + CheckFileExtension(student.getValue()));
        }
    }

    public static int Divide(int x, int y)
    {
        // Write code here!
        if (y == 0) {
            try {
                throw new ArithmeticException("Cannot divide by 0");
            } catch(ArithmeticException error) {
                error.printStackTrace();
            }
        }

        return x/y;
    }

    public static int CheckFileExtension(String fileName)
    {
        if (fileName == null || fileName.equals("")) {
            try {
                throw new FileNameException("Illegal file name!");
            } catch(FileNameException e) {
                e.printStackTrace();
                return -1;
            }
        }

        if (fileName.endsWith(".java")) {
            return 1;
        } else {
            return 0;
        }
    }

}
