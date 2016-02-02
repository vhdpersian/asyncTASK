package com.example.test.utils;

import android.os.AsyncTask;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by V_Karimi on 2/2/2016.
 */
public class AsyncTaskRunner extends AsyncTask<String, String, String> {


    private String resp;

    @Override
    protected String doInBackground(String... params) {

        try {
            // defaultHttpClient
            HttpClient httpClient = new DefaultHttpClient();
            HttpPost httpPost = new HttpPost("http://api.androidhive.info/pizza/?format=xml");

            org.apache.http.HttpResponse httpResponse = httpClient.execute(httpPost);
            HttpEntity httpEntity = httpResponse.getEntity();
            resp = EntityUtils.toString(httpEntity);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return resp;
    }

    @Override
    protected void onPostExecute(String result)
    {
        // execution of result of Long time consuming operation
        //finalResult.setText(result);

    }

    @Override
    protected void onPreExecute()
    {
        // Things to be done before execution of long running operation. For
        // example showing ProgessDialog
    }

}
