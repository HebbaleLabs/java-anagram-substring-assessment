package com.talfinder.assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Created by shashidhara on 2/23/19.
 */
@RunWith(Parameterized.class)
public class AnagramTest {

  @Parameters
  public static Collection<Object[]> parameters() {
    return Arrays.asList(new Object[][] {
        {"ab", 1},
        {"abcb", 1},
        {"abcdea", 2},
        {"dnqaurlplofnrtmh", 5},
        {"hhpddlnnsjfoyxpciioigvjqzfbpllssuj", 10},
        {"xulkowreuowzxgnhmiqekxhzistdocbnyozmnqthhpievvlj", 13},
        {"aujteqimwfkjoqodgqaxbrkrwykpmuimqtgulojjwtukjiqrasqejbvfbixnchzsahpnyayutsgecwvcqngzoehrmeeqlgknnb", 26},
        {"drngbjuuhmwqwxrinxccsqxkpwygwcdbtriwaesjsobrntzaqbe", -1},
        {"gqdvlchavotcykafyjzbbgmnlajiqlnwctrnvznspiwquxxsiwuldizqkkaawpyyisnftdzklwagv", -1}
    });
  }

  String input;
  int expectedValue;

  public AnagramTest(String input, int expectedValue) {
    this.input = input;
    this.expectedValue = expectedValue;
  }

  @Test
  public void countChanges() {
    Assert.assertEquals("input:" + input, expectedValue, Anagram.countChanges(input));
  }
}
