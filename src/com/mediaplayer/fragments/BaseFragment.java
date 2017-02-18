package com.mediaplayer.fragments;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



/**
 * Created by shrikanth on 10/4/15.
 */
public abstract class BaseFragment extends Fragment {
    AlertDialog.Builder alertDialogBuilder;
    AlertDialog alertDialog;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        setTitle();
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public abstract void setTitle();

    public AppCompatActivity getAppCompactActivity(){
        return (AppCompatActivity)getActivity();
    }

    public float getDp(int px){
        DisplayMetrics metrics = getContext().getResources().getDisplayMetrics();
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, px, metrics);
    }

    public void showAlertDialog(String title, String message, String positive, String negative, DialogInterface.OnClickListener listener){
        alertDialogBuilder = new AlertDialog.Builder(
                getContext());
        alertDialogBuilder.setTitle(title);
        alertDialogBuilder.setMessage(message);
        alertDialogBuilder.setPositiveButton(positive, listener);
        alertDialogBuilder.setNegativeButton(negative, listener);
        alertDialog = alertDialogBuilder.show();
    }

    public void dismissAlertDialog(){
        if(alertDialog != null){
            alertDialog.dismiss();
        }
    }
}
