import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
@Named
@ViewScoped
public class JavaBean  implements Serializable {
  private String content = ìWelcome to JSF!î
  // getters/setters
}
