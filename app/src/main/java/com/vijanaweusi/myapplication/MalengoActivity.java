package com.vijanaweusi.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MalengoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malengo);

        RecyclerView list = findViewById(R.id.recycler_view_malengo);

        Malengo[] goals = {

                new Malengo("Get my 1st Jr. Developer job!", "After months of hard work and dedication my goal is to get my 1st Jr. Developer Job by December 2021!", R.drawable.goals1),
                new Malengo("Master Kotlin!", "Day by day I have learned a tremendous amount of Kotlin and XML concepts. Though I am proud of myself I can't be complacent...KEEP LEARNING! ", R.drawable.goals2),
                new Malengo("Keep learning Java", "Although as a new Dev I love Kotlin, which is my 1st programming language, one of the best things I did was take a bootcamp Udemy course on Java. Java has made Kotlin make more sense! This, my 1st portfolio project, I decided to write in Java to show my foundation in Android development!", R.drawable.goals3),
                new Malengo("Continue to perfect my Swahili (Kiswahili Kituzuwe!)", "My goal of becoming 'fluent' was reached in 2020. Now my goal is to speak on the level of a native speaker with a masters degree! ", R.drawable.kiswahili__),
                new Malengo("Learn new languages", "My goal is to learn Lingala, French, and Twi...maybe Arabic or Hindi", R.drawable.goals5),
                new Malengo("Become a better tumbler", "This is a very short term goal as I recently starting tumbling (August 2021). I really love the challenge and I am already improving greatly!", R.drawable.goals6),
                new Malengo("Lose weight!", "This goes without saying but with my new found hobby in Tumbling I feel much more inspired to do so (yes I can backflip even though I am pretty heavy :))", R.drawable.goals7),
                new Malengo("Compete in a Tumbling competition", "I will always be a competitor so if I am going to do tumbling I should compete", R.drawable.goals8)
        };

        MalengoAdapter adapter = new MalengoAdapter(goals);
        list.setAdapter(adapter);

    }

}