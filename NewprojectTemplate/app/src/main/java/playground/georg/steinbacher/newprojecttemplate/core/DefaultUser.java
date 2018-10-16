package playground.georg.steinbacher.newprojecttemplate.core;

/**
 * Created by stge on 16.10.18.
 */

public class DefaultUser implements User{
    private String mName = "Georg";

    public DefaultUser() {
    }

    @Override
    public String getName() {
        return mName;
    }
}
