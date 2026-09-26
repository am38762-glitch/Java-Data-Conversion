public class DataConversion {

    public static void main(String[] args){
                // 1. مدخلات الإيداع (عدد صحيح) ونسبة الفائدة (عدد عشري)
                int deposit = 1050;
                double interestRate = 1.11; // 5.5%

                // 2. التحويل الضمني (Implicit Conversion)
                // عند ضرب int في double تحول جافا الناتج تلقائياً إلى double
                double calculatedInterest = deposit * interestRate;
                double totalAmount = deposit + calculatedInterest;

                // 3. التحويل الصريح (Explicit Conversion)
                // تحويل القيمة العشرية إلى int بإضافة (int) للتقرير المحاسبي
                int roundedInterest = (int) calculatedInterest;
                int roundedTotalAmount = (int) totalAmount;

                // 4. عرض النتائج على الشاشة
                System.out.println("Deposit Amount:" + deposit+"ugx");
                System.out.println("Calculated Interest (Implicit): " + calculatedInterest+"ugx");
                System.out.println("Total Amount (Implicit):" + totalAmount+"ugx");

                System.out.println("-----------------------------------");
                System.out.println("Rounded Interest (Explicit):" + roundedInterest+"ugx");
                System.out.println("Rounded Total Amount (Explicit):" + roundedTotalAmount+"ugx");

                // توضيح تأثير التحويل على دقة البيانات
                double precisionLost = calculatedInterest - roundedInterest;
                System.out.println("Precision Lost: " + precisionLost+"ugx");
            }
        }




