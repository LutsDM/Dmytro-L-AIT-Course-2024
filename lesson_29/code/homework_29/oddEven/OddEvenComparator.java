package homework_29.oddEven;

public class OddEvenComparator implements Comparable<OddEvenComparator> {

    private int numbers;

    public OddEvenComparator(int numbers) {
        this.numbers = numbers;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    @Override
    public int compareTo(OddEvenComparator other) {
        if ((this.numbers % 2 == 0) && (other.getNumbers() % 2 != 0)) {
            return -1;

        } else if ((this.numbers % 2 != 0) && (other.getNumbers() % 2 == 0)) {
            return 1;
        }

        return 0;
    }

}//end of class
