package edu.jsu.mcis.cs408.calculator;


import static androidx.constraintlayout.widget.ConstraintSet.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.Toast;


import edu.jsu.mcis.cs408.calculator.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        Model model = new Model();

        class CalculatorClickHandler implements View.OnClickListener {

            @Override
            public void onClick(View v) {
                String tag = v.getTag().toString();
                Toast toast = Toast.makeText(binding.getRoot().getContext(), tag, Toast.LENGTH_SHORT);
                toast.show();

                model.GetProblem(tag);
                binding.textView.setText(model.Return());




            }

        }

        CalculatorClickHandler click = new CalculatorClickHandler();
        ConstraintLayout layout = binding.getRoot();

        for (int i = 0; i < layout.getChildCount(); ++i) {
            View child = layout.getChildAt(i);
            if(child instanceof Button) {
                child.setOnClickListener(click);
            }
        }




    }
}