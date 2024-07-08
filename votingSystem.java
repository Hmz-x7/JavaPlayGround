import java.util.LinkedHashMap;
import java.util.List;

public class votingSystem {

    LinkedHashMap<String , Integer> list = new LinkedHashMap<>() ;


    void vote(String contestant  ) {
        list.merge(contestant, 1,Integer::sum);


    }

    LinkedHashMap getVotes(){ return list;     }
}
