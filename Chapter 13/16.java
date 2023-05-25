package company.mypackage;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
public class CommandManager implements BeanFactoryAware {
   private BeanFactory beanFactory;
   public Object process(Map commandState) {
           Command command = createCommand();
           command.setState(commandState);
           return command.execute();
   }

   protected Command createCommand() {
      return (Command) this.beanFactory.getBean("command"); // notice the Spring API dependency
   }

   public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
      this.beanFactory = beanFactory;
   }
}
