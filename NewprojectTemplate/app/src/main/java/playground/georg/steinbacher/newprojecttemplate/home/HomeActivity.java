package playground.georg.steinbacher.newprojecttemplate.home;

import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import playground.georg.steinbacher.newprojecttemplate.BaseApp;
import playground.georg.steinbacher.newprojecttemplate.MyApplication;
import playground.georg.steinbacher.newprojecttemplate.R;
import playground.georg.steinbacher.newprojecttemplate.core.User;

/**
 * Created by stge on 16.10.18.
 */

public class HomeActivity extends BaseApp {

    @Inject
    User mUser;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ((MyApplication)getApplication())
                .getUserComponent()
                .inject(this);

        TextView textView = findViewById(R.id.text);
        textView.setText(mUser.getName());
    }
}
