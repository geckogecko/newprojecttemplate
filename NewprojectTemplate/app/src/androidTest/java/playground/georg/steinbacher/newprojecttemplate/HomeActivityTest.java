package playground.georg.steinbacher.newprojecttemplate;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import playground.georg.steinbacher.newprojecttemplate.dep.DaggerUserComponent;
import playground.georg.steinbacher.newprojecttemplate.dep.UserComponent;
import playground.georg.steinbacher.newprojecttemplate.home.HomeActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class HomeActivityTest {
   @Rule
   public ActivityTestRule<HomeActivity> mActivityTestRule = new ActivityTestRule<HomeActivity>(HomeActivity.class) {

       @Override
       protected void beforeActivityLaunched() {
           MyApplication application = (MyApplication) InstrumentationRegistry
                   .getInstrumentation()
                   .getTargetContext()
                   .getApplicationContext();
           UserComponent userComponent = DaggerUserComponentMock
                   .builder()
                   .build();
           application.setUserComponent(userComponent);

       }
   };

   @Test
    public void userNameTest() {
       onView(withId(R.id.text)).check(matches(withText("Georg")));
   }

}
