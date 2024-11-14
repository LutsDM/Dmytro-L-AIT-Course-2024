package classwork_36.ilist.model;

public class IListAppl {
    public static void main(String[] args) {

        //список с целыми числами

        IList<Integer> listOfAge = new IListImpl<>();

        listOfAge.add(61);
        listOfAge.add(38);
        listOfAge.add(37);
        listOfAge.add(35);
        listOfAge.add(44);
        listOfAge.add(27);
        listOfAge.add(37);
        listOfAge.add(37);
        listOfAge.add(37);
        listOfAge.add(46);
        listOfAge.add(23);
        listOfAge.add(45);
        listOfAge.add(18);
        listOfAge.add(63);


        System.out.println(listOfAge.size());
        System.out.println(listOfAge.indexOf(61));//0
        System.out.println(listOfAge.indexOf(63));//13
        System.out.println(listOfAge.indexOf(37));//2

        int index = 0;
        for (Integer i : listOfAge) {
            System.out.println(index++ + ":" +i);
        }

        System.out.println();
        System.out.println("------------------------------------------");


        for (int i = 0; i < listOfAge.size(); i++) {
            if (listOfAge.get(i) == 37) {
                System.out.println("index" + i);
            }
        }

        int sum = 0;
        for (Integer i : listOfAge) {
            sum += i;
        }
        System.out.println("---------------------------------------------");
        System.out.println(sum);
        double avgAge = (double)  sum / listOfAge.size();
        System.out.println(avgAge);

        System.out.println("---------------------------------------------");
        IList<String> listOfName = new IListImpl<>();
        listOfName.add("Leonid");
        System.out.println(listOfName.size());
        listOfName.add("Artem");
        listOfName.add("Diana");
        listOfName.add("Dmitry");
        listOfName.add("Juri");
        listOfName.add("Carina");
        listOfName.add("Dmitri");
        listOfName.add(null);
        listOfName.add("German");
        System.out.println(listOfName.size());

        index = 0;
        for (String str : listOfName) {
            System.out.println(index++ + ":" + str);
        }

        String strTotal = "";
        for (String str : listOfName) {
            strTotal += str;
        }
        System.out.println(strTotal);

        listOfName.remove(3);
        listOfName.remove("Leonid");

        index = 0;
        for (String str : listOfName) {
            System.out.println(index++ + ":" + str);
        }

    }


}
