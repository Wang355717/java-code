import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        // Ctrl + Alt + M：将选择的代码自动抽取方法
        /*机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
        按照如下规则计算机票价格:旺季(5-10月)头等舱9折，经济舱8.5折，淡季(11月到来年4月)头等舱7折，经济舱6.5折。*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入机票原价:");
        double ticket = scanner.nextDouble();
        System.out.print("请输入月份:");
        int month = scanner.nextInt();
        System.out.print("请输入仓位(0:头等舱，1:经济舱):");
        int seat = scanner.nextInt();
        // 判断淡季还是旺季
        if (month >= 5 && month <= 10) {
            // 旺季
            ticket = getPrice(ticket, seat, 0.9, 0.85);
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            // 淡季
            ticket = getPrice(ticket, seat, 0.7, 0.65);
        } else {
            System.out.println("输入的月份无效");
        }
        System.out.print("最后票价为:" + ticket);
    }
    
    public static double getPrice(double ticket, int seat, double v0, double v1) {
        if (seat == 0) {
            ticket = ticket * v0;
        } else if (seat == 1) {
            ticket = ticket * v1;
        } else {
            System.out.println("输入的仓位无效");
        }
        return ticket;
    }
}