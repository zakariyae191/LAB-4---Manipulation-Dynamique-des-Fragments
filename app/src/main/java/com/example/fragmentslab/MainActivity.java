package com.example.fragmentslab;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Recuperation des boutons depuis le layout.
        btn1 = findViewById(R.id.btnFragment1);
        btn2 = findViewById(R.id.btnFragment2);

        // Au premier lancement, on affiche FragmentOne par defaut.
        if (savedInstanceState == null) {
            replaceFragment(new FragmentOne(), false);
        }

        btn1.setOnClickListener(v -> replaceFragment(new FragmentOne(), true));
        btn2.setOnClickListener(v -> replaceFragment(new FragmentTwo(), true));
    }

    private void replaceFragment(Fragment fragment, boolean addToBackStack) {
        // FragmentManager permet de gerer les fragments dans l'Activity.
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.setReorderingAllowed(true);
        ft.replace(R.id.fragment_container, fragment);

        // Ajout optionnel a la pile de retour.
        if (addToBackStack) {
            ft.addToBackStack(null);
        }

        ft.commit();
    }
}
