import org.junit.Test;

import static org.junit.Assert.assertEquals;
//in this class we are using the junit testing
public class VotingSystemTest {

    votingSystem vot = new votingSystem();

    @Test
    public void testvote(){
        vot.vote("contestant one");
        vot.vote("contestant one");
        vot.vote("contestant two");
        vot.vote("contestant one");
        vot.vote("contestant three");
        vot.vote("contestant three");
        assertEquals(3,vot.getVotes().get("contestant one"));
        assertEquals(1,vot.getVotes().get("contestant two"));
        assertEquals(2,vot.getVotes().get("contestant three"));
        //double confirmation
       // assertEquals(5,vot.getVotes().get("contestant four"));
    }

    @Test
    public void testVoteOrder() {
        vot.vote("contestant one");
        vot.vote("contestant one");
        vot.vote("contestant two");
        vot.vote("contestant one");
        vot.vote("contestant three");
        vot.vote("contestant three");


        assertEquals("contestant one",vot.getVotes().keySet().iterator().next());
    }

}
