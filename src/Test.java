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

        test = sortSynonymLinee(test);   
        System.out.println(test);   
        System.out.println("");            
        
        for (int i = 0; i < testA.length; i++) 
        {
            String line = testA[i];
            line = line.replaceAll(",", "");
            testA[i] = line;
            int index = line.indexOf('|');
            //String s1 = line.substring(0, index);
            String s2 = line.substring(index + 1);
            String[] str3 = s2.split(", ");
            for(String element :str3)
            {
                System.out.println(element);
            }
        }

        bubbleSort(testA);

        // Print the modified array
        for (String element : testA) 
        {
            System.out.println(element);
        }
    }


    public static void bubbleSort(String[] arr) 
    {
        int n = arr.length;
        boolean swapped;

        do 
        {
            swapped = false;
            for (int i = 1; i < n; i++) 
            {
                if (arr[i - 1].compareTo(arr[i]) > 0) 
                {
                    // Swap arr[i-1] and arr[i]
                    String temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    private static String sortSynonymLinee (String synonymLine)
    {
        int index = synonymLine.indexOf('|');
        String s1 = synonymLine.substring(0, index);
        String s2 = synonymLine.substring(index + 1);
        String[] str3 = s2.split(", ");
        boolean s;
        int n = str3.length;

        System.out.println(s1);
        System.out.println(s2);

        do 
        {
            s = false;
            for (int i = 0; i < n-1; i++) 
            {
                if (str3[i].compareTo(str3[i+1]) > 0) 
                {
                    String temp = str3[i];
                    str3[i] = str3[i+1];
                    str3[i+1] = temp;
                    s = true;
                }
            }
        } while (s);

        String finals2 = String.join(", ",str3);
        String finalLine = s1 + " | " + finals2;
        return finalLine;
    }
}



