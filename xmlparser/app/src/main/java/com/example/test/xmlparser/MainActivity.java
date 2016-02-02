package com.example.test.xmlparser;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.test.utils.AsyncTaskRunner;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

//import com.example.test.utils.xml;

public class MainActivity extends AppCompatActivity {



    // All static variables
    static final String URL = "http://api.androidhive.info/pizza/?format=xml";
    // XML node keys
    static final String KEY_ITEM = "item"; // parent node
    static final String KEY_NAME = "name";
    static final String KEY_COST = "cost";
    static final String KEY_DESC = "description";

    private String xml=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new AsyncTaskRunner().execute(URL);
       // AsyncTaskRunner runner = new AsyncTaskRunner();
       // runner.execute(URL);

       // new getXmlTask().execute(URL,"","");
      //  xml  xml_parser = new  xml();
      //  String xml = new getXmlTask()  (URL); // getting XML
      //  Document doc = xml_parser.getDomElement(xml); // getting DOM element

      //  NodeList nl = doc.getElementsByTagName(KEY_ITEM);

// looping through all item nodes <item>
      //  for (int i = 0; i < nl.getLength(); i++) {
       //     String name = xml_parser.getValue((Element) nl.item(i), KEY_NAME); // name child value
       //     String cost = xml_parser.getValue((Element) nl.item(i), KEY_COST); // cost child value
       //     String description = xml_parser.getValue((Element) nl.item(i), KEY_DESC); // description child value
       // }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
