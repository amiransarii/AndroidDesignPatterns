package org.game.mvpdesignapplictaion2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.game.mvpdesignapplictaion2.model.GetQuoteInteractorImpl;
import org.game.mvpdesignapplictaion2.presenter.MainPresenter;
import org.game.mvpdesignapplictaion2.presenter.MainPresenterImpl;
import org.game.mvpdesignapplictaion2.view.MainView;

import static android.view.View.GONE;

//code for the MainActivity.java which implements MainView interface is given below
public class MainActivity extends AppCompatActivity  implements MainView {

    private TextView textView;
    private Button button;
    private ProgressBar progressBar;
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        presenter = new MainPresenterImpl(this, new GetQuoteInteractorImpl());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onButtonClick();
            }
        });
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
        textView.setVisibility(View.INVISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(GONE);
        textView.setVisibility(View.VISIBLE);
    }

    @Override
    public void setQuote(String string) {
        textView.setText(string);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
