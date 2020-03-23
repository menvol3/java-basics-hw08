import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expressions.
 */
public class RegExp {

  /**
   * Get IP address from text.
   * @param text text to parse
   * @return String with IP address
   */
  public static String getIpAddress(String text) {
    Pattern ip = Pattern.compile("");
    Matcher matcher = ip.matcher(text);
    if(matcher.find()){
      return matcher.group();
    }else {
    return "";
    }
  }
}