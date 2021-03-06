package playground.georg.steinbacher.newprojecttemplate;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import playground.georg.steinbacher.newprojecttemplate.core.DefaultUser;
import playground.georg.steinbacher.newprojecttemplate.core.User;

/**
 * Created by stge on 16.10.18.
 */

@Module
public class UserModuleMock {

    @Provides
    @Singleton
    public User provideUser() {
        return new WrongUser();
    }
}

