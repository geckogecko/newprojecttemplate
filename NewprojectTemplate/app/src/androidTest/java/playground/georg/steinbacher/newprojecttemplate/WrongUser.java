package playground.georg.steinbacher.newprojecttemplate;

import playground.georg.steinbacher.newprojecttemplate.core.User;

/**
 * Created by stge on 16.10.18.
 */

public class WrongUser implements User{
    @Override
    public String getName() {
        return "Not Georg";
    }
}
