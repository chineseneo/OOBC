import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 11/21/12
 * Time: 1:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldTest {
    @Test
    public void shouldShowHelloWorldToSomeOne()
    {
        String name = "longkai";
        HelloWorld helloWorld = new HelloWorld();
        String helloString = helloWorld.sayHelloTo(name);

        String expectedString = "hello world longkai!";

        assertThat(helloString, is(expectedString));
    }
}
