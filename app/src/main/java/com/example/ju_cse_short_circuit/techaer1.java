package com.example.ju_cse_short_circuit;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.Manifest;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class techaer1 extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private int mParam2;

    // Change the constructor signature as suggested by Android Studio
    public techaer1(String param1, int param2) {
        mParam1 = param1;
        mParam2 = param2;
    }

    public static techaer1 newInstance(String param1, int param2) {
        techaer1 fragment = new techaer1(param1, param2); // Use the constructor with parameters
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putInt(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    Button btn1,btn2;
    private static final int PERMISSION_CODE = 100;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Remove the parameter retrieval from the getArguments() method
        // as we are now using the constructor with parameters
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_techaer1, container, false);
        // You can access the parameters directly using mParam1 and mParam2
        // For example, set the text of a TextView in the layout to display the values:

        btn1 = rootView.findViewById(R.id.callbtn);
        btn2 = rootView.findViewById(R.id.emailbtn);

       btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if the CALL_PHONE permission is granted
                if (ContextCompat.checkSelfPermission(requireContext(), Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    // If permission is granted, make the phone call
                    String phone;
                    if(mParam2==0)
                        phone = getString(R.string.phone0);
                    else if(mParam2==1)
                        phone = getString(R.string.phone1);
                    else if(mParam2==2)
                        phone = getString(R.string.phone2);
                    else if(mParam2==3)
                        phone = getString(R.string.phone3);
                    else if(mParam2==4)
                        phone = getString(R.string.phone4);
                    else if(mParam2==5)
                        phone = getString(R.string.phone5);
                    else if(mParam2==6)
                        phone = getString(R.string.phone6);
                    else if(mParam2==7)
                        phone = getString(R.string.phone7);
                    else if(mParam2==8)
                        phone = getString(R.string.phone8);
                    else if(mParam2==9)
                        phone = getString(R.string.phone9);
                    else if(mParam2==10)
                        phone = getString(R.string.phone10);
                    else if(mParam2==11)
                        phone = getString(R.string.phone11);

                    else phone = getString(R.string.phone12);

                    makePhoneCall(String.valueOf(phone));

                } else {
                    // If permission is not granted, request the permission
                    requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, PERMISSION_CODE);
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email;
                if(mParam2==0)
                    email = getString(R.string.email0);
                else if(mParam2==1)
                    email = getString(R.string.email1);
                else if(mParam2==2)
                    email = getString(R.string.email2);
                else if(mParam2==3)
                    email = getString(R.string.email3);
                else if(mParam2==4)
                    email = getString(R.string.email4);
                else if(mParam2==5)
                    email = getString(R.string.email5);
                else if(mParam2==6)
                    email = getString(R.string.email6);
                else if(mParam2==7)
                    email = getString(R.string.email7);
                else if(mParam2==8)
                    email = getString(R.string.email8);
                else if(mParam2==9)
                    email = getString(R.string.email9);
                else if(mParam2==10)
                    email = getString(R.string.email10);
                else if(mParam2==11)
                    email = getString(R.string.email11);
                else if(mParam2==12)
                    email = getString(R.string.email12);
                else email = getString(R.string.email13);
                String[] str = {email};
                sendEmail(str);
            }
        });




        TextView textview = rootView.findViewById(R.id.fid1_tv1);
        ImageView imageview = rootView.findViewById(R.id.fid1_iv1);

        if(mParam2 == 0)
        {

            imageview.setImageResource(R.drawable.teacher_0);
            textview.setText(R.string.teacher0);

            btn1.setText(R.string.phone0);
            btn2.setText(R.string.email0);



        }
        else if(mParam2 == 1)
        {

            imageview.setImageResource(R.drawable.teacher_1);
            textview.setText(R.string.teacher1);

            btn1.setText(R.string.phone1);
            btn2.setText(R.string.email1);



        }
       else if(mParam2 == 2)
        {

           imageview.setImageResource(R.drawable.teacher_2);
            textview.setText(R.string.teacher2);
            btn1.setText(R.string.phone2);
            btn2.setText(R.string.email2);



        }
        else if(mParam2 ==3)
        {

           imageview.setImageResource(R.drawable.teacher_3);
            textview.setText(R.string.teacher3);

            btn1.setText(R.string.phone3);
            btn2.setText(R.string.email3);



        }
        else if(mParam2 ==4)
        {

            imageview.setImageResource(R.drawable.teacher_4);
            textview.setText(R.string.teacher4);
            btn1.setText(R.string.phone4);
            btn2.setText(R.string.email4);


        }

       else if(mParam2 == 5)
        {

            imageview.setImageResource(R.drawable.teacher_5);
            textview.setText(R.string.teacher5);

            btn1.setText(R.string.phone5);
            btn2.setText(R.string.email5);



        }
        else if(mParam2 == 6)
        {

            imageview.setImageResource(R.drawable.teacher_6);
            textview.setText(R.string.teacher6);

            btn1.setText(R.string.phone6);
            btn2.setText(R.string.email6);



        }
        else if(mParam2 == 7)
        {

            imageview.setImageResource(R.drawable.teacher_7);
            textview.setText(R.string.teacher7);

            btn1.setText(R.string.phone7);
            btn2.setText(R.string.email7);



        }
        else if(mParam2 == 8)
        {

            imageview.setImageResource(R.drawable.teacher_8);
            textview.setText(R.string.teacher8);

            btn1.setText(R.string.phone8);
            btn2.setText(R.string.email8);



        }
        else if(mParam2 == 9)
        {

            imageview.setImageResource(R.drawable.teacher_9);
            textview.setText(R.string.teacher9);

            btn1.setText(R.string.phone9);
            btn2.setText(R.string.email9);



        }
        else if(mParam2 == 10)
        {

            imageview.setImageResource(R.drawable.teacher_10);
            textview.setText(R.string.teacher10);

            btn1.setText(R.string.phone10);
            btn2.setText(R.string.email10);

        }
        else if(mParam2 == 11)
        {

            imageview.setImageResource(R.drawable.teacher_11);
            textview.setText(R.string.teacher11);

            btn1.setText(R.string.phone11);
            btn2.setText(R.string.email11);



        }
        else if(mParam2 == 12)
        {

            imageview.setImageResource(R.drawable.teacher_12);
            textview.setText(R.string.teacher12);

            btn1.setText(R.string.phone12);
            btn2.setText(R.string.email12);



        }
        else {

            imageview.setImageResource(R.drawable.teacher_13);
            textview.setText(R.string.teacher13);

            btn1.setText(R.string.phone13);
            btn2.setText(R.string.email13);
        }


        return rootView;
    }


    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == PERMISSION_CODE) {
            // If the permission is granted, make the phone call
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {


                String phone;
                if(mParam2==0)
                    phone = getString(R.string.phone0);
                else if(mParam2==1)
                    phone = getString(R.string.phone1);
                else if(mParam2==2)
                    phone = getString(R.string.phone2);
                else if(mParam2==3)
                    phone = getString(R.string.phone3);
                else if(mParam2==4)
                    phone = getString(R.string.phone4);
                else if(mParam2==5)
                    phone = getString(R.string.phone5);
                else if(mParam2==6)
                    phone = getString(R.string.phone6);
                else if(mParam2==7)
                    phone = getString(R.string.phone7);
                else if(mParam2==8)
                    phone = getString(R.string.phone8);
                else if(mParam2==9)
                    phone = getString(R.string.phone9);
                else if(mParam2==10)
                    phone = getString(R.string.phone10);
                else if(mParam2==11)
                    phone = getString(R.string.phone11);
                else if(mParam2==12)
                    phone = getString(R.string.phone12);

                else phone = getString(R.string.phone13);

                makePhoneCall(String.valueOf(phone));

            } else {
                // If the permission is denied, you may show a message or handle it accordingly
            }
        }
    }

    private void makePhoneCall(String phoneNumber){

           // String phoneNumber = "1234567890"; // Replace this with the actual phone number you want to call
            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:" + phoneNumber));
            startActivity(intent);
        }

        private void sendEmail( String[] recipientEmail) {
        String subject = "Subject";
        String body = "Body";



            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("message/rfc822");
            intent.putExtra(Intent.EXTRA_EMAIL, recipientEmail);
            intent.putExtra(Intent.EXTRA_SUBJECT, subject);
            intent.putExtra(Intent.EXTRA_TEXT, body);

            if (intent.resolveActivity(requireContext().getPackageManager()) != null) {
                startActivity(Intent.createChooser(intent, "Choose an Email client:"));
            } else {
                Toast.makeText(requireContext(), "No app found to handle the email.", Toast.LENGTH_SHORT).show();
            }

            startActivity(Intent.createChooser(intent, "Choose an Email client:"));
    }



}
