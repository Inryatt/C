import java.util.Scanner;
import java.util.HashMap;

public class Ex3 {

    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        HashMap<String, Double> var = new HashMap<String, Double>();
        System.out.println("Type the operation below(number operation number): ");

        Double arg1, arg2;
        String op, toSave,  line;
        String[] arg;

        boolean hasAssignment;

        do {
            toSave = "";
            hasAssignment = false;
            Double res = 0.0;
            line = sc.nextLine();
            arg = line.split("[ ]");
            for (int i = 0; i < arg.length; i++) {
                if (arg[i].matches("[=]")) {
                    hasAssignment = true; //save variable in the end
                    try {
                        toSave = arg[i-1];//name of var to save
                        
                    }catch(NumberFormatException e){
                        toSave = Double.toString(var.get(arg[i - 1])); 
                        break;
                    }
                    if(arg.length==3) //simple assignment like n = 1
                        try {
                            res=Double.parseDouble(arg[i+1]); //direct number
                            break;
                        
                        }catch(NumberFormatException e){
                            res=var.get(arg[i+1]); //assigning the value of another variable
                            break;
                        }
                }
                if (arg[i].matches("[+-/*]")) {
                    op = arg[i];
                    // System.out.println("Operator: " + op);
                    try {
                        arg1 = Double.parseDouble(arg[i - 1]);
                    } catch (NumberFormatException ex1) {
                        arg1 = var.get(arg[i - 1]);
                    }
                    try {
                        arg2 = Double.parseDouble(arg[i + 1]);
                    } catch (NumberFormatException ex1) {
                        arg2 = var.get(arg[i + 1]);
                    }
                    switch (op) {
                        case ("+"): {
                            if(res==0)
                                res = arg1 + arg2;
                            else
                                res = res + arg2;
                            break;
                        }
                        case ("-"): {
                            if(res==0)
                                res = arg1 - arg2;
                            else
                                res = res - arg2;
                            break;
                        }
                        case ("*"): {
                            if(res==0)
                                res = arg1 * arg2;
                            else
                                res = res * arg2;
                            break;
                        }
                        case ("/"): {
                            if(res==0)
                                res = arg1 / arg2;
                            else
                                res = res / arg2;
                            break;
                        }
                        default: {
                            System.err.println("ERROR: Invalid Operator " + op);
                            return;
                        }
                    }
                }

            }
            if (hasAssignment)
                var.put(toSave, Double.valueOf(res));
            else
                System.out.println(res);
        } while (sc.hasNextLine());

    }
}
