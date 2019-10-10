package com.example.market;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.market.classes.connectionDB;

public class signup extends AppCompatActivity {

    EditText EMAIL;
    EditText PASSWORD;
    EditText FIRSTNAME;
    EditText LASTNAME;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        //CALL ID´S
        EMAIL = findViewById(R.id.idEmail);
        // FIRSTNAME = findViewById(R.id.idFname);
        //LASTNAME = findViewById(R.id.idLname);
        //PASSWORD = findViewById(R.id.idPasswd);
    }
        public void Register(View view){
            //1.create Database manager
            connectionDB manager= new connectionDB(this,"data",null,1);
            //2. let datavase read/write
            SQLiteDatabase market = manager.getWritableDatabase();
            //Get values
            String  Email = EMAIL.getText().toString();
            String  Passwd = "1234";
            String  Lname  ="McDonald";
            String  Fname  = "Peter";
            //validate:Email:
            //4. create content values
            if(!Email.isEmpty() && !Lname.isEmpty() && !Passwd.isEmpty() && !Fname.isEmpty()){
                Cursor row = market.rawQuery("SELECT email" + "FROM user WHERE email = " +Email,null);
                if(!row.moveToFirst()) {
                    ContentValues DATA = new ContentValues();
                    //5. Create data packDO not repeat email
                    //Call validateEmail function//method
                    // boolean status = validateEmail();
                    DATA.put("email", Email);
                    DATA.put("password", Passwd);
                    DATA.put("firstname", Fname);
                    DATA.put("lastname", Lname);
                    //Save DATA into market database
                    market.insert("user", null, DATA);
                    Toast.makeText(this, "The user has been created!!!", Toast.LENGTH_SHORT).show();
                    // close connection
                    market.close();
                }else{
                    Toast.makeText(this,"user already exists",Toast.LENGTH_LONG).show();
                }
            }else {
                Toast.makeText(this,"You must complete all fields.",Toast.LENGTH_LONG).show();
            }
        }

    /* public void  validateEmail(View view){
            connectionDB manager = new connectionDB( this,"data",null,1);
            SQLiteDatabase market = manager.getWritableDatabase();
        String Email = EMAIL.getText().toString();

        Cursor row = market.rawQuery("SELECT email"
                + "FROM users WHERE email= "+Email, null);
        if(row.moveToFirst()){
            return true;

        }else {
            return false;

        }*/


}
