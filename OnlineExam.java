import java.util.Scanner;


public class OnlineExam
{
  public static void main(String...args)
  {
    int ch=4;
    int choice;
    String name;
    int id=0;
    Scanner sc=new Scanner(System.in);

      System.out.println("Enter your name :");
      name=sc.next();
      System.out.println("Enter your Roll no :");
      id=sc.nextInt();
      int count=0;
      System.out.println("\t\t Welcome "+name+" To OASIS ONLINE EXAMINATION");

    do
    {

      System.out.println("1. Take Exam");
      System.out.println("2. View Marks");
      System.out.println("3. Exit");
      System.out.println("Enter your choice");
      ch=sc.nextInt();
      if(ch==3)
      {
        System.out.println("You have finished your exam :) ");
        break;
      }

      switch(ch)
      {
        case 1:
        {
            System.out.println("Select Programming Language :");
            System.out.println("1.C \n2.Java \n3.C++");
            System.out.println("Enter your choice :");
            int sub=sc.nextInt();
            System.out.println("There are 5 Questions in the Examination");
            System.out.println("Each Questions are MCQs containing 4 options");

            if(sub==2)
            {
              count=0;
              System.out.println("Q1) Which of the following option leads to the portability and security of Java?");
              System.out.println("1)Bytecode is executed by JVM\n 2)The applet makes the Java code secure and portable\n 3)Use of exception handling\n 4)Dynamic binding between objects");
              System.out.println("Enter your choice :");
              choice=sc.nextInt();
              if(choice==1)
              {
                ++count;
              }

              System.out.println("Q2) Which of the following is not a Java features?");
              System.out.println("1)Dynamic\n 2)Architecture Neutral\n 3)Use of pointers\n 4)Object-oriented");
              System.out.println("Enter your choice :");
              choice=sc.nextInt();
              if(choice==3)
              {
                ++count;
              }

              System.out.println("Q3)The \u0021 article referred to as a");
              System.out.println("1)Unicode escape sequence\n 2)Octal escape\n 3)Hexadecimal\n 4)Line feed");
              System.out.println("Enter your choice :");
              choice=sc.nextInt();
              if(choice==1)
              {
                ++count;
              }

              System.out.println("Q4)Which of the following is a valid syntax to synchronize the HashMap?");
              System.out.println("1)Map m = hashMap.synchronizeMap();\n 2)HashMap map =hashMap.synchronizeMap();\n 3)Map m1 = Collections.synchronizedMap(hashMap);\n 4)Map m2 = Collection.synchronizeMap(hashMap);");
              System.out.println("Enter your choice :");
              choice=sc.nextInt();
              if(choice==3)
              {
                ++count;
              }

              System.out.println("Q5)What is the return type of the hashCode() method in the Object class?");
              System.out.println("1)Object\n 2)int\n 3)long\n 4)void");
              System.out.println("Enter your choice :");
              choice=sc.nextInt();
              if(choice==2)
              {
                ++count;
              }
            }

              else if(sub==1)
              {
                count=0;
              System.out.println("Q1)In C, parameters are always ?");
              System.out.println("1)Passed by value\n 2)Passed by reference\n 3)Non-pointer variables are passed by value and pointers are passed by reference\n 4)Passed by value result");
              System.out.println("Enter your choice :");
              choice=sc.nextInt();
              if(choice==1)
              {
                ++count;
              }

              System.out.println("Q2)Which of the following is true about return type of functions in C?");
              System.out.println("1)Functions can return any type\n 2)Functions can return any type except array and functions\n 3)Functions can return any type except array, functions and union\n 4)Functions can return any type except array, functions, function pointer and union");
              System.out.println("Enter your choice :");
              choice=sc.nextInt();
              if(choice==2)
              {
                ++count;
              }

              System.out.println("Q3)Which of the following is not a storage class specifier in C?");
              System.out.println("1)auto\n 2)register\n 3)static\n 4)volatile");
              System.out.println("Enter your choice :");
              choice=sc.nextInt();
              if(choice==4)
              {
                ++count;
              }

              System.out.println("Q4)Which of the following is not a logical operator?");
              System.out.println("1)&&\n 2)||\n 3)|\n 4)!");
              System.out.println("Enter your choice :");
              choice=sc.nextInt();
              if(choice==3)
              {
                ++count;
              }

              System.out.println("Q5)Which file is generated after pre-processing of a C program?");
              System.out.println("1).p\n 2).i\n 3).o\n 4).m");
              System.out.println("Enter your choice :");
              choice=sc.nextInt();
              if(choice==2)
              {
                ++count;
              }
            }

            else
            {
              count=0;

              System.out.println("Q1)What is C++?");
              System.out.println("1)C++ is an object oriented programming language\n 2) C++ is a procedural programming language\n 3)C++ supports both procedural and object oriented programming language\n 4)C++ is a functional programming language");
              System.out.println("Enter your choice :");
              choice=sc.nextInt();
              if(choice==3)
              {
                ++count;
              }

              System.out.println("Q2)Which of the following is the correct syntax of including a user defined header files in C++?");
              System.out.println("1)#include [userdefined]\n 2)#include 'userdefined'\n 3)#include <userdefined.h>\n 4) #include <userdefined>");
              System.out.println("Enter your choice :");
              choice=sc.nextInt();
              if(choice==2)
              {
                ++count;
              }

              System.out.println("Q3)Which of the following is a correct identifier in C++?");
              System.out.println("1)VAR_1234\n 2)$var_name\n 3)7VARNAME\n 4)7var_name");
              System.out.println("Enter your choice :");
              choice=sc.nextInt();
              if(choice==1)
              {
                ++count;
              }

              System.out.println("Q4)Which of the following user-defined header file extension used in c++?");
              System.out.println("1)hg\n 2)cpp\n 3)h\n 4)hf");
              System.out.println("Enter your choice :");
              choice=sc.nextInt();
              if(choice==3)
              {
                ++count;
              }

              System.out.println("Q5) Which of the following is used for comments in C++?");
              System.out.println("1) /* comment */\n 2) // comment */'\n 3) // comment\n 4)both // comment or /* comment */");
              System.out.println("Enter your choice :");
              choice=sc.nextInt();
              if(choice==4)
              {
                ++count;
              }
            }

               break;
             }
             case 2:
             {
               System.out.println("Congrats "+name+" Your Score is "+count+"Marks "+"Out Of 5");
             }
        }
      }
      while(true);
    }
  }
