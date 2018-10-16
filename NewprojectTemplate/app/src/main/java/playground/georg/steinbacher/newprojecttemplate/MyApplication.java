package playground.georg.steinbacher.newprojecttemplate;

import android.app.Application;

import playground.georg.steinbacher.newprojecttemplate.dep.DaggerUserComponent;
import playground.georg.steinbacher.newprojecttemplate.dep.UserComponent;

/**
 * Created by stge on 16.10.18.
 */

public class MyApplication extends Application {
    private UserComponent mUserComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mUserComponent = createUserComponent();
    }

    public UserComponent getUserComponent() {
        return mUserComponent;
    }

    public void setUserComponent(UserComponent userComponent) {
        mUserComponent = userComponent;
    }

    private UserComponent createUserComponent() {
        return DaggerUserComponent
                .builder()
                .build();
    }
}
