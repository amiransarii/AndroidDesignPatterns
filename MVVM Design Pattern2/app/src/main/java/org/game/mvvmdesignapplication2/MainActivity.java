package org.game.mvvmdesignapplication2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import org.game.mvvmdesignapplication2.databinding.ActivityMainBinding;
import org.game.mvvmdesignapplication2.viewmodels.LoginViewModel;

public class MainActivity extends AppCompatActivity {

    /**
     * ActivityMainBinding class is auto-generated from the layout.
     * The @BindingAdapter method gets triggered whenever toastMessage attribute defined on the Button is changed.
     * It must use the same attribute as defined in the XML and in the ViewModel.
     *
     * So in the above application, the ViewModel updates the Model by listening to the changes in the View.
     * Also, the Model can update the view via the ViewModel using the notifyPropertyChanged
     * @param savedInstanceState
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel(new LoginViewModel());
        activityMainBinding.executePendingBindings();
    }

    @BindingAdapter({"toastMessage"})
    public static void runMe(View view,String message){
        if(message != null){
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
        }
    }
}
