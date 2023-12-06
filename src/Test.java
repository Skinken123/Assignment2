public class Test 
{
    public static void main(String[] args) 
    {
        String[] testA = {"merciful | gracious, kindly, compassionate, forgiving, charitable",
                          "powerful | mighty, vigorous, forceful, energetic",
                          "beautiful | lovely, pretty, pleasing, graceful, appealing, charming",
                          "clever | wise, knowing, capable, smart, sharp, intelligent"};
        String test = testA[0];
        System.out.println(test);

        String testArray[] = getSynonyms(test);
        for (String element : testArray) 
        {
            System.out.print(element + " ");
        }

        // Print the modified array
        //for (String element : testA) 
        //{
       //     System.out.println(element);
       // }
    }

    private static String[] getSynonyms (String synonymLine)
    {
        int index = synonymLine.indexOf('|');
        String s2 = synonymLine.substring(index + 2);
        String[] str3 = s2.split(", ");

        return str3;
    }
    
}



