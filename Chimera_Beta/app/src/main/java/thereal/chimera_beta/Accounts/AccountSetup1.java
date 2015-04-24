package thereal.chimera_beta.Accounts;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import thereal.chimera_beta.MainActivity;
import thereal.chimera_beta.R;

public class AccountSetup1 extends ActionBarActivity implements SeekBar.OnSeekBarChangeListener {

    int genreRating, bookRating, movieRating, tvRating, gameRating, creatorRating;
    int five = genreRating = bookRating = movieRating = tvRating = gameRating = creatorRating = 5;
    SeekBar genre1, book1, movie1, tv1, game1, creator1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_setup1);

        final TextView continueB = (TextView) findViewById(R.id.continueBttn);
        genre1 = (SeekBar) findViewById(R.id.genreSeekBar);
        genre1.setMax(10);
        book1 = (SeekBar) findViewById(R.id.bookSeekBar);
        book1.setMax(10);
        movie1 = (SeekBar) findViewById(R.id.movieSeekBar);
        movie1.setMax(10);
        tv1 = (SeekBar) findViewById(R.id.tvSeekBar);
        tv1.setMax(10);
        game1 = (SeekBar) findViewById(R.id.gameSeekBar);
        game1.setMax(10);
        creator1 = (SeekBar) findViewById(R.id.creatorSeekBar);
        creator1.setMax(10);
        this.initRatingsBars();

        genre1.setOnSeekBarChangeListener(this);
        book1.setOnSeekBarChangeListener(this);
        movie1.setOnSeekBarChangeListener(this);
        tv1.setOnSeekBarChangeListener(this);
        game1.setOnSeekBarChangeListener(this);
        creator1.setOnSeekBarChangeListener(this);
            continueB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MainActivity.user001.prefs.setBasicRatings(genreRating, bookRating,
                            movieRating, tvRating, gameRating, creatorRating);
                    startActivity(new Intent(getApplicationContext(), AccountSetup2.class));

                }
            });
    }

    public void onProgressChanged(SeekBar seekBar, int progress,
                                  boolean fromUser) {
        if(progress < 1)
            progress = 1;
        switch(seekBar.getContentDescription().toString()){
            case "genre":
                genreRating = progress;
                break;
            case "book":
                bookRating = progress;
                break;
            case "movie":
                movieRating = progress;
                break;
            case "tv":
                tvRating = progress;
                break;
            case "game":
                gameRating = progress;
                break;
            case "creator":
                creatorRating = progress;
                break;
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        if(seekBar.getProgress() == 0)
            seekBar.setProgress(1);
        /*switch(seekBar.getContentDescription().toString()){
            case "genre":
                break;
            case "book":
                break;
            case "movie":
                break;
            case "tv":
                break;
            case "game":
                break;
            case "creator":
                break;
        }*/
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        if(seekBar.getProgress() == 0)
            seekBar.setProgress(1);
        switch(seekBar.getContentDescription().toString()){
            case "genre":
                genreRating = seekBar.getProgress();
                break;
            case "book":
                bookRating = seekBar.getProgress();
                break;
            case "movie":
                movieRating = seekBar.getProgress();
                break;
            case "tv":
                tvRating = seekBar.getProgress();
                break;
            case "game":
                gameRating = seekBar.getProgress();
                break;
            case "creator":
                creatorRating = seekBar.getProgress();
                break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_account_setup1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void initRatingsBars(){
        if(MainActivity.user001.prefs.genre != 0)
            genreRating = MainActivity.user001.prefs.genre;
        if(MainActivity.user001.prefs.book != 0)
            bookRating = MainActivity.user001.prefs.book;
        if(MainActivity.user001.prefs.tv != 0)
            tvRating = MainActivity.user001.prefs.tv;
        if(MainActivity.user001.prefs.movie != 0)
            movieRating = MainActivity.user001.prefs.movie;
        if(MainActivity.user001.prefs.game != 0)
            gameRating = MainActivity.user001.prefs.game;
        if(MainActivity.user001.prefs.creator != 0)
            creatorRating = MainActivity.user001.prefs.creator;

        genre1.setProgress(genreRating);
        book1.setProgress(bookRating);
        tv1.setProgress(tvRating);
        movie1.setProgress(movieRating);
        game1.setProgress(gameRating);
        creator1.setProgress(creatorRating);
    }
}
