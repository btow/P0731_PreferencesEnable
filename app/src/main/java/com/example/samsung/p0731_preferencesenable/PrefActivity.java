package com.example.samsung.p0731_preferencesenable;

import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.os.Bundle;
import android.preference.PreferenceCategory;

public class PrefActivity extends PreferenceActivity {

    CheckBoxPreference check_box_preference_3_screen_preference_1;
    PreferenceCategory category_preference_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.pref);

        check_box_preference_3_screen_preference_1 =
                (CheckBoxPreference) findPreference(getString(R.string.check_box_preference_3_screen_preference_1));
        category_preference_2 = (PreferenceCategory) findPreference(getString(R.string.category_preference_2));
        category_preference_2.setEnabled(check_box_preference_3_screen_preference_1.isChecked());

        check_box_preference_3_screen_preference_1.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                category_preference_2.setEnabled(check_box_preference_3_screen_preference_1.isChecked());
                return false;
            }
        });
    }
}
