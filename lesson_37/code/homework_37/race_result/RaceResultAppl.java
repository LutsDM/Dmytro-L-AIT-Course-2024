package homework_37.race_result;

import homework_27.marathon.ticket_agency.entity.Ticket;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RaceResultAppl {
    public static void main(String[] args) {

        List<RaceResult> resultsList = new ArrayList<>();


        resultsList.add(new RaceResult(101,"Bob","Smiht", true, LocalDate.parse("1998-12-02"), "Tigers", 12.23));
        resultsList.add(new RaceResult(102,"Jack","Doom", true, LocalDate.parse("1992-10-12"),"NFS", 11.15));
        resultsList.add(new RaceResult(103,"Nick","Tapper", true, LocalDate.parse("1990-07-15"),"Tigers", 13.11));
        resultsList.add(new RaceResult(104,"Ivan","Ivanov", true, LocalDate.parse("2086-01-02"),"N765", 12.59));
        resultsList.add(new RaceResult(105,"Mark","Zimmerman", true, LocalDate.parse("1995-10-10"),"NoTeam", 12.13));
        resultsList.add(new RaceResult(106,"Kai","Berg", true, LocalDate.parse("1975-11-02"),"NoTeam", 11.20));
        resultsList.add(new RaceResult(107,"Felics","Troop", true, LocalDate.parse("1972-01-12"),"NFS", 11.49));
        resultsList.add(new RaceResult(108,"Mick","Jager", true, LocalDate.parse("1979-08-02"),"N765", 13.10));
        resultsList.add(new RaceResult(109,"Leam","Graber", true, LocalDate.parse("2009-11-05"),"BerlanRun", 13.30));
        resultsList.add(new RaceResult(110,"Eliot","Cipchogy", true,LocalDate.parse("2010-10-12"),"BerlinRun", 11.11));
        resultsList.add(new RaceResult(111, "Anna", "Smith", false, LocalDate.parse("1999-03-15"), "Tigers", 13.58));
        resultsList.add(new RaceResult(112, "Jane", "Doe", false, LocalDate.parse("1991-12-11"), "NFS", 14.23));
        resultsList.add(new RaceResult(113, "Lily", "Brown", false, LocalDate.parse("1988-07-24"), "Tigers", 11.95));
        resultsList.add(new RaceResult(114, "Emma", "Johnson", false, LocalDate.parse("1995-04-09"), "N765", 14.12));
        resultsList.add(new RaceResult(115, "Olivia", "Taylor", false, LocalDate.parse("1997-02-20"), "NoTeam", 13.47));
        resultsList.add(new RaceResult(116, "Sophia", "Anderson", false, LocalDate.parse("1976-09-03"), "NoTeam",
                11.98));
        resultsList.add(new RaceResult(117, "Isabella", "Martinez", false, LocalDate.parse("1983-08-16"), "NFS", 13.72));
        resultsList.add(new RaceResult(118, "Mia", "Garcia", false, LocalDate.parse("1980-06-29"), "N765", 14.30));
        resultsList.add(new RaceResult(119, "Amelia", "Martinez", false, LocalDate.parse("2007-05-25"), "BerlinRun", 15.02));
        resultsList.add(new RaceResult(120, "Harper", "Clark", false, LocalDate.parse("2005-01-18"), "BerlinRun",
                11.85));


        System.out.println("--------------overall result---------------");
        resultsList.sort(RaceResult::compareTo);
        for (RaceResult raceResult : resultsList) {
            System.out.println(raceResult);
        }

        System.out.println("----------------women's overall result---------------");

        for (int i = 0; i < resultsList.size(); i++) {
            if(resultsList.get(i).isGender() == false) {
                System.out.println(resultsList.get(i));
            }
        }

        System.out.println("----------------men's overall result---------------");

        for (int i = 0; i < resultsList.size(); i++) {
            if(resultsList.get(i).isGender() == true) {
                System.out.println(resultsList.get(i));
            }
        }

        //TODO доделать тут когда-нибудь результаты по гендеру и возростным группам 20-30, 30-40, 40+



    }
}
