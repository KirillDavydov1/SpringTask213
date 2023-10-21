import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean1 = applicationContext.getBean(HelloWorld.class);
        Cat cat = applicationContext.getBean(Cat.class);
        Cat cat1 = (Cat) applicationContext.getBean("cat");

        System.out.println("Сравнение по ссылке бинов HelloWorld:" + (bean == bean1));
        System.out.println("Сравнение по ссылке бинов Cat:" + (cat == cat1));

    }
}