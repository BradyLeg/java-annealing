import java.util.Set;

public class ProblemSolving {

  /**
   * Returns whether every word in the set starts with the letter A (either
   * upper or lower case).
   * 
   * Edge case: If set is empty, return true.
   * 
   * @param words a set of words
   * @return true if every word starts with A (case-insensitive), false otherwise.
   */
  public static boolean allStartWithA(Set<String> words) {

    if (words.size() == 0) {
      return true;
    }

    for (String word : words) {
      if (word.toLowerCase().charAt(0) != 'a') {
        return false;
      }
    }

    return true;
  }

  /**
   * Returns whether there exists at least one empty string in the set of words.
   * 
   * Edge case: If set is empty, return false.
   * 
   * @param words a set of words
   * @return true if there is at least one empty string, false otherwise
   */
  public static boolean hasEmptyString(Set<String> words) {

    if (words.size() == 0) {
      return false;
    }

    for (String word : words) {
      if (word.isEmpty()) {
        return true;
      }
    }

    return false;
  }

  /**
   * Returns the length of the longest word in the set.
   * 
   * Edge case: If the set is empty, return 0
   * 
   * @param words a set of words
   * @return the maximum length of a word in the set
   */
  public static int maxLength(Set<String> words) {

    if (words.size() == 0) {
      return 0;
    }

    int max = 0;

    for (String word : words) {
      if (word.length() > max) {
        max = word.length();
      }
    }

    return max;
  }

  /**
   * Returns the length of the shortest word in the set.
   * 
   * Edge case: if set is empty, return Integer.MAX_VALUE
   * 
   * @param words a set of words
   * @return the minimum length of a word in the set
   */
  public static int minLength(Set<String> words) {

    if (words.size() == 0) {
      return Integer.MAX_VALUE;
    }

    boolean first = true;
    int min = 0;

    for (String word : words) {
      if (first) {
        min = word.length();
        first = false;
      } else {
        if (word.length() < min) {
          min = word.length();
        }
      }
    }

    return min;
  }
}