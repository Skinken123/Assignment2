// SynonymUser.java
/****************************************************************
SynonymUser reads the synonym data from a given file. This data
is used and modified in various ways. Finally, the modified data
is written to a new file.
See:
thesaurus.com
Author: Fadil Galjic
****************************************************************/
import java.io.*; // IOException
import static java.lang.System.out;

public class SynonymUser {
    public static void main (String[] args) throws IOException
    {
        String[] synonymData = SynonymHandler.readSynonymData("SynonymData1.txt");
        println(synonymData);
        out.println("");

        String synonymLine = SynonymHandler.getSynonymLine(synonymData, "beautiful");
        out.println(synonymLine + "\n");
        synonymLine = "glowing | luminous, vibrant, flaming, gleaming";

        synonymData = SynonymHandler.addSynonymLine(synonymData, synonymLine);
        println(synonymData);
        out.println("");

        synonymData = SynonymHandler.removeSynonymLine(synonymData, "clever");
        println(synonymData);
        out.println("");

        SynonymHandler.addSynonym(synonymData, "powerful","briliant");
        println(synonymData);
        out.println("");

        SynonymHandler.removeSynonym(synonymData, "merciful","gracious");
        SynonymHandler.removeSynonym(synonymData, "powerful","briliant");
        SynonymHandler.removeSynonym(synonymData, "beautiful","pleasing");
        println(synonymData);
        out.println("");

        SynonymHandler.sortSynonymData(synonymData);
        println(synonymData);
        out.println("");

        SynonymHandler.writeSynonymData(synonymData,"SynonymData2.txt");
    }

    public static void println (String[] synonymData)
    {
        for (String synonymLine : synonymData)
        {
            out.println(synonymLine);
        }  
    }
}
