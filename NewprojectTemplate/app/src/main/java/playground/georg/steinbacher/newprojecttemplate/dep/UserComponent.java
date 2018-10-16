package playground.georg.steinbacher.newprojecttemplate.dep;

import javax.inject.Singleton;

import dagger.Component;
import playground.georg.steinbacher.newprojecttemplate.home.HomeActivity;

/**
 * Created by stge on 16.10.18.
 */
@Singleton
@Component(modules = UserModule.class)
public interface UserComponent {
    void inject(HomeActivity homeActivity);
}
