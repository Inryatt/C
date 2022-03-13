import java.util.Scanner;
import java.util.HashMap;

public class old_Ex2 {

    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        HashMap<String, Double> var = new HashMap<String, Double>();
        System.out.print("Type the operation below(number operation number): ");

        Double res = 0.0;
        Double arg1, arg2;
        String op, toSave, tmpVar1, line, tmpVar2;
        String[] arg;

        Boolean hasAssignment;

        do {
            toSave = "";
            tmpVar1 = "";
            tmpVar2 = "";
            arg1 = -1.0;
            arg2 = -1.0;
            op = "";
            hasAssignment = false;

            line = sc.nextLine();
            arg = line.split("[ ]");
            for (int i = 0; i < arg.length; i++) {
                try {
                    if (arg1 == -1.0)
                        arg1 = Double.parseDouble(arg[i]);
                    else if (arg2 == -1.0)
                        arg2 = Double.parseDouble(arg[i]);
                    else {
                        System.err.println("ERROR: Too many arguments!");
                        break;
                    }
                } catch (NumberFormatException e) {
                    if (arg[i].matches("[+-/*]")) {
                        op = arg[i];
                    } else if (arg[i].equals("=")) {
                        if (hasAssignment) {
                            System.err.println("ERROR: Too many '='! There can be only one.");
                            break;
                        } else {
                            hasAssignment = true;
                            op = "=";
                            try {
                                try {
                                    var.put(arg[i - 1], Double.parseDouble(arg[i + 1]));
                                    break;
                                } catch (NumberFormatException ex) { // if assigning a var to other var like n = m
                                    var.put(arg[i - 1], var.get(arg[i + 1]));
                                    break;
                                }
                            } catch (IndexOutOfBoundsException exc) {
                                System.err.println("ERROR:Missing an argument!");
                                break;
                            }
                        }
                    } else {
                        if (arg1 == -1.0 && arg2 == -1.0) {
                            toSave = arg[i];
                        }
                        if (arg1 == -1.0) {
                            var.put(arg[i], 0.0); // should be replaced later!
                            tmpVar1 = arg[i];
                            arg1 = -2.0;// should be replaced with the value on arg2
                        } else if (arg2 == -1.0) {
                            var.put(arg[i], 0.0); // should be replaced later!
                            tmpVar2 = arg[i];
                            arg2 = -2.0;// should be replaced with the value on arg1
                        }
                    }
                }
            }

            if (arg1 == -1 || arg2 == -1) {
                System.err.println("ERROR: Missing argument D:");
                break;
            }
            if (arg1 == -2.0) {
                arg1 = var.get(tmpVar1);
            }
            if (arg2 == -2.0) {
                arg2 = var.get(tmpVar2);
            }
            System.out.println("Operator: " + op);
            switch (op) {
            case ("+"): {
                res = arg1 + arg2;
                break;
            }
            case ("-"): {
                res = arg1 - arg2;
                break;
            }
            case ("*"): {
                res = arg1 * arg2;
                break;
            }
            case ("/"): {
                res = arg1 / arg2;
                break;
            }
            case ("="): {
                var.put(tmpVar1, res);
                break;
            }
            default: {
                System.err.println("ERROR: Invalid Operator " + op);
                return;
            }
            }
            if (hasAssignment)
                var.put(toSave, res);
            else
                System.out.println(res);

        } while (sc.hasNextLine());

    }
}
