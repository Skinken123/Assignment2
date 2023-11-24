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


    

    private static String sortSynonymLinee (String synonymLine)
    {
        int index = synonymLine.indexOf('|');
        String s1 = synonymLine.substring(0, index);
        String str3[] = getSynonyms(synonymLine);
        sortIgnoreCase(str3);

       // String finals2 = String.join(", ",str3);
        String finalLine = s1 + " | " + String.join(", ",str3);
        return finalLine;
    }
    private static String[] getSynonyms (String synonymLine)
    {
        int index = synonymLine.indexOf('|');
        String s2 = synonymLine.substring(index + 2);
        String[] str3 = s2.split(", ");

        return str3;
    }
    private static void sortIgnoreCase (String[] strings)
    {
        int n = strings.length;
        for (int i = 0; i < n - 1; i++) 
        {
            int minIndex = i;

            // Find the index of the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) 
            {
                if (strings[j].compareTo(strings[minIndex]) < 0) 
                {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element in the unsorted part
            if (minIndex != i)
            {
                String temp = strings[i];
                strings[i] = strings[minIndex];
                strings[minIndex] = temp;
            }
        }
    }
    
}



