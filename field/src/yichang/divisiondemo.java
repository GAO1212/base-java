package yichang;

public class divisiondemo {
    public static void main(String[] args) {
        try {
            int m=Integer.parseInt(args[0]);
            int n=Integer.parseInt(args[1]);
            System.out.println(division(m, n));
        } catch (belowzeroexception e) {
            System.out.println(e.getMessage()); }
//        }catch (NumberFormatException e){
//            System.out.println("数据类型不一致");
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("缺少命令行参数");
//        }catch (ArithmeticException e){
//            System.out.println("除0");
//        }

    }
    public static int division(int m,int n)throws belowzeroexception{
        if(m<0||n<0){
            throw new belowzeroexception("有负数了");
        }else return m/n;
    }

    }

