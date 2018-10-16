package playground.georg.steinbacher.newprojecttemplate;

import javax.inject.Singleton;

import dagger.Component;
import playground.georg.steinbacher.newprojecttemplate.core.User;
import playground.georg.steinbacher.newprojecttemplate.dep.UserComponent;
import playground.georg.steinbacher.newprojecttemplate.dep.UserModule;
import playground.georg.steinbacher.newprojecttemplate.home.HomeActivity;

/**
 * Created by stge on 16.10.18.
 */
@Singleton
@Component(modules = UserModuleMock.class)
public interface UserComponentMock extends UserComponent{
}
