package HW1;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Task1Test {
@Test
    public void sumListsTest(){
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> result = new ArrayList<>(Arrays.asList(2,4,6));
        List<Integer> resultTest = Task1.sumLists(list1,list2);
        assertEquals(result, resultTest, "Lists sum is incorrect");
    }
@Test
    public void findMaxTest(){
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
        int result = 3;
        int resultTest = Task1.findMax(list1);
        assertEquals(result, resultTest, "This is not a max value");
}

@Test
    public void filterStrings(){
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("11");
        int minLength = 2;
        List<String> result = new ArrayList<>();
        result.add("1");
        List<String> resultTest = Task1.filterStrings(list1, minLength);
        assertEquals(result, resultTest, "This list contains a string which doesn't pass minLength criteria");
}
}
