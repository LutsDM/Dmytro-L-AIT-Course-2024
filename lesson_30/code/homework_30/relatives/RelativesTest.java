package homework_30.relatives;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RelativesTest {

    Relatives[] relatives;

    @BeforeEach
    void setUp() {

        relatives = new Relatives[]{
         new Relatives("Marta", false, 50,100000 ),
         new Relatives("Bob", true, 46,11700 ),
         new Relatives("Anna", false, 57,14000 ),
         new Relatives("Julia", false, 44,14000),
         new Relatives("Jack", true, 17,36700 ),
         new Relatives("Nina", false, 72,14000 ),
         new Relatives("Ivan", true, 82,36700 ),
         new Relatives("Barbara", false, 49,36700)
        };
    }


    public void printArray(Relatives[] relatives){
        for (Relatives relative : relatives) {
            System.out.println(relative);
        }
    }

    @Test
    void testNativeSorting(){
        System.out.println("--------------Print as is--------------");
        printArray(relatives);
        Arrays.sort(relatives); //native, by default
        System.out.println("--------------Print after native sorting (name)--------------");
        printArray(relatives);

    }

    @Test
    void testSortingByIncomGenderAge(){
        System.out.println("--------------Print as is--------------");
        printArray(relatives);

        Arrays.sort(relatives, (o1, o2) -> {

            int incomeComparison = Double.compare(o1.getAnnualIncome(), o2.getAnnualIncome());
            if (incomeComparison != 0) {
                return incomeComparison;
            }

            int genderComparison = Boolean.compare(o1.isGender(), o2.isGender());
            if (genderComparison != 0) {
                return genderComparison;
            }

            return - Integer.compare (o1.getAge(), o2.getAge());

        });//end of sort
        System.out.println("--------------Print Incom/Gender/Age sorting--------------");
        printArray(relatives);



    }

}