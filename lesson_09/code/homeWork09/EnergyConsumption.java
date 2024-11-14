package homeWork09;
// Анна использует различные электроприборы в своем доме.
// У неё есть холодильник, который потребляет 150 Вт, и кондиционер с потреблением 2000 Вт.
// Анна хочет узнать, сколько она тратит на электроэнергию в месяц, если стоимость 1 кВт·ч составляет 0.15 евро.
// Вопросы: Сколько электроэнергии тратят холодильник и кондиционер вместе в час? (calculateHourlyConsumption)
// Сколько Анна тратит на электроэнергию в месяц? (calculateMonthlyCost)
public class EnergyConsumption {
    public static void main(String[] args) {

        double conditionerConsumption = 2000;
        double fridgeConsumption = 150;
        double electricityCost = 0.15;

        double calculateHourlyConsumption = (conditionerConsumption + fridgeConsumption)/1000;
        double calculateMonthlyCost = (calculateHourlyConsumption * 30 * 24) * electricityCost;

        System.out.println("Hourly Consumption (kW): " + calculateHourlyConsumption);
        System.out.println("Monthly Cost (Euro): " +calculateMonthlyCost);

    }


}

