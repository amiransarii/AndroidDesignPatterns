package org.game.mvvmandoidapplication.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import android.os.*;
import org.game.mvvmandoidapplication.model.UserModel;


public class LoginViewModel  extends ViewModel {
    public MutableLiveData<String> loginStatus = new MutableLiveData<>();
   private Handler handler = new Handler();

    public void doLogin(String userName, String password){
        UserModel userModel = new UserModel(userName,password);
        final int code = userModel.checkUserValidity(userName,password);
        System.out.println("@Code "+code);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                String msg;

                if(code == 0){
                    msg="Login Successful";
                }
                else{
                    msg="Login Fail";
                }
                System.out.println("@LOGIN: "+msg);
                loginStatus.postValue(msg);
            }
        },2000);

    }
}
