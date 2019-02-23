import com.talfinder.assessment.Anagram;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by shashidhara on 2/23/19.
 */
public class AnagramTest {

  @Test
  public void countChangesSimpleStrings() {
    int countChanges = Anagram.countChanges("ab");
    Assert.assertEquals(1, countChanges);

    countChanges = Anagram.countChanges("abcb");
    Assert.assertEquals(1, countChanges);

    countChanges = Anagram.countChanges("abcdea");
    Assert.assertEquals(2, countChanges);

  }

  @Test
  public void countChangesComplexStrings() {
    int countChanges = Anagram.countChanges("dnqaurlplofnrtmh");
    Assert.assertEquals(5, countChanges);

    countChanges = Anagram.countChanges("hhpddlnnsjfoyxpciioigvjqzfbpllssuj");
    Assert.assertEquals(10, countChanges);

    countChanges = Anagram.countChanges("xulkowreuowzxgnhmiqekxhzistdocbnyozmnqthhpievvlj");
    Assert.assertEquals(13, countChanges);

    countChanges = Anagram.countChanges("aujteqimwfkjoqodgqaxbrkrwykpmuimqtgulojjwtukjiqrasqejbvfbixnchzsahpnyayutsgecwvcqngzoehrmeeqlgknnb");
    Assert.assertEquals(26, countChanges);
  }

  @Test
  public void countChangesInvalidStrings() {
    int countChanges = Anagram.countChanges("abc");
    Assert.assertEquals(-1, countChanges);

    countChanges = Anagram.countChanges("abcde");
    Assert.assertEquals(-1, countChanges);

    countChanges = Anagram.countChanges("drngbjuuhmwqwxrinxccsqxkpwygwcdbtriwaesjsobrntzaqbe");
    Assert.assertEquals(-1, countChanges);

    countChanges = Anagram.countChanges("gqdvlchavotcykafyjzbbgmnlajiqlnwctrnvznspiwquxxsiwuldizqkkaawpyyisnftdzklwagv");
    Assert.assertEquals(-1, countChanges);

  }
}
