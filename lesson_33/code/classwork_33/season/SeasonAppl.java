package classwork_33.season;
//.values() - извлекает данны в массив
//.toString
//.ordinal()
//.valueOf()
public class SeasonAppl {
    public static void main(String[] args) {


        Season[] seasons = Season.values();
        System.out.println("----------------values of Enum---------------------");

        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
            System.out.println(seasons[i].getNumber() + " : " + seasons[i].getName());
        }

        for (Season s : seasons) {
            System.out.println(s.getName());
            System.out.println(s.getDuration());
        }
            System.out.println("----------------toString-----------------");
            String str = Season.AUTUMN.toString();
            System.out.println(str);

            System.out.println("--------------------ordinal()--------------------");

            int num = Season.AUTUMN.ordinal();
            System.out.println(num); //3 or 4 ?
            num = Season.WINTER.ordinal();
            System.out.println(num); // 0 or 1 ?

            System.out.println("----------------------valueOf()---------------------");

            Season s = Season.valueOf("SPRING");
            System.out.println(s);


        }


    }


