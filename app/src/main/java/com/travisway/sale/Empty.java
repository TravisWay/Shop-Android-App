package com.travisway.sale;

import android.widget.Button;
import android.widget.EditText;

/**
 * Created by travisway on 10/7/17.
 */

public class Empty {

    public boolean Emp(EditText text){
        EditText myEditText = text;
        String texty = myEditText.getText().toString();
        if (texty.matches("")|| texty.matches("Required")) {
            return true;
        }
        else{
            return false;
        }
    }
}
