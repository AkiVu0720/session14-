package ra.entity;

import java.util.List;
import java.util.Scanner;

public interface IEntity <T>{
    void inputData(Scanner scanner, List<T>arrayList);
    void displayData();
    void calAge();
    void calAvgMark_Rank();
}
