/**
 * Created by TZ6YSQ on 10/30/2015.
 */
class DuplicateTest extends GroovyTestCase {
    private Duplicate testDuplicate;


    /**
     * Tests to see if the expected strings are created.
     * */
    void testTrimDuplicate() {
        testDuplicate = new Duplicate();

        testDuplicate.trimDuplicate("balloons");

        assertEquals("balons", testDuplicate.wordTrimmed.toString());
        assertEquals("lo", testDuplicate.wordLeftovers.toString());


        testDuplicate = new Duplicate();

        testDuplicate.trimDuplicate("ddaaiillyypprrooggrraammeerr");

        assertEquals("dailyprogramer", testDuplicate.wordTrimmed.toString());
        assertEquals("dailyprogramer", testDuplicate.wordLeftovers.toString());


        testDuplicate = new Duplicate();

        testDuplicate.trimDuplicate("aabbccddeded");

        assertEquals("abcdeded", testDuplicate.wordTrimmed.toString());
        assertEquals("abcd", testDuplicate.wordLeftovers.toString());


        testDuplicate = new Duplicate();

        testDuplicate.trimDuplicate("flabby aapples");

        assertEquals("flaby aples", testDuplicate.wordTrimmed.toString());
        assertEquals("bap", testDuplicate.wordLeftovers.toString());

    }
}
