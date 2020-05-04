package org.game.mvvmdesignapplication2.viewmodels;

import android.text.TextUtils;
import android.util.Patterns;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import org.game.mvvmdesignapplication2.BR;
import org.game.mvvmdesignapplication2.model.User;

/**
 * The methods were called in the layout are implemented in the above code with the same signature.
 * If the XML counterpart of the method doesn’t exist, we need to change the attribute to app:.
 *
 * The above class can also extend ViewModel. But we need BaseObservable since it converts the data into streams
 * and notifies when the toastMessage property is changed.
 *
 * We need to define the getter and setter for the toastMessage custom attribute defined in the XML.
 * Inside the setter, we notify the observer (which will be the View in our application) that the data has changed.
 * The View(Our activity) can define the appropriate actio
 */


public class LoginViewModel extends BaseObservable {
    private User user;

    private String successMessage = "Login was successful";
    private String errorMessage = "Email or Password not valid";

    @Bindable
    private String toastMessage = null;

    public String getToastMessage(){
        return toastMessage;
    }

    private void setToastMessage(String toastMessage){
        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }

    public void setUserEmail(String email){
        user.setEmail(email);
        notifyPropertyChanged(BR.userEmail);
    }

    @Bindable
    public String getUserEmail() {
        return user.getEmail();
    }

    @Bindable
    public String getUserPassword() {
        return user.getPassword();
    }
    public void setUserPassword(String password) {
        user.setPassword(password);
        notifyPropertyChanged(BR.userPassword);
    }
    public LoginViewModel() {
        user = new User("","");
    }

    public void onLoginClicked() {
        if (isInputDataValid())
            setToastMessage(successMessage);
        else
            setToastMessage(errorMessage);
    }

    public boolean isInputDataValid() {
        return !TextUtils.isEmpty(getUserEmail()) && Patterns.EMAIL_ADDRESS.matcher(getUserEmail()).matches() && getUserPassword().length() > 5;
    }
}
