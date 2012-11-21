import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

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
