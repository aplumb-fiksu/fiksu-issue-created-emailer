package ut.com.fiksu.jira.plugins;

import org.junit.Test;
import com.fiksu.jira.plugins.MyPluginComponent;
import com.fiksu.jira.plugins.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}