package day3;
import java.util.Scanner;
public class T9 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 读取年份
            System.out.print("请输入年份: ");
            int year = scanner.nextInt();

            // 读取月份
            System.out.print("请输入月份: ");
            int month = scanner.nextInt();

            // 读取日期
            System.out.print("请输入日期: ");
            int day = scanner.nextInt();

            // 计算并输出结果
            System.out.println("这一天是该年的第 " + dayOfYear(year, month, day) + " 天。");

            scanner.close();
        }

        // 计算给定日期是该年的第几天
        public static int dayOfYear(int year, int month, int day) {
            // 每个月的天数，注意2月份需要根据是否闰年进行调整
            int[] daysOfMonth = {
                    31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
            };

            // 计算之前月份的总天数
            int dayOfYear = 0;
            for (int i = 0; i < month - 1; i++) {
                dayOfYear += daysOfMonth[i];
            }

            // 加上当前月的天数
            dayOfYear += day;

            return dayOfYear;
        }

        // 判断是否为闰年
        public static boolean isLeapYear(int year) {
            // 如果年份能被4整除且不能被100整除，或者能被400整除，则是闰年
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
    }


