/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

	ArrayList<String> words = new ArrayList<>();
	words.add("One");
	words.add("Two");
	words.add("Three");
	words.add("Four");
	words.add("Five");
	words.add("Six");
	words.add("Seven");
	words.add("Eight");
	words.add("Nine");
	words.add("Ten");

	LinearLayout rootView = (LinearLayout)findViewById(R.id.rootview);
	TextView wordView = new TextView(this);
	wordView.setText(words.get(0));
	rootView.addView(wordView);

	TextView wordView2 = new TextView(this);
	wordView.setText(words.get(1));
	rootView.addView(wordView);

	TextView wordView3 = new TextView(this);
	wordView.setText(words.get(2));
	rootView.addView(wordView);

	TextView wordView4 = new TextView(this);
	wordView.setText(words.get(3));
	rootView.addView(wordView);

	TextView wordView5 = new TextView(this);
	wordView.setText(words.get(4));
	rootView.addView(wordView);

	TextView wordView6 = new TextView(this);
	wordView.setText(words.get(5));
	rootView.addView(wordView);
	
	TextView wordView7 = new TextView(this);
	wordView.setText(words.get(6));
	rootView.addView(wordView);


	}
}
