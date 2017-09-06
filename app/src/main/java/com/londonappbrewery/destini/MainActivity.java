package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here
    private TextView mHistoria;
    private Button  mRespuestaA, mRespuestaB;
    private int mStoryIndex = 2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mHistoria = (TextView) findViewById(R.id.storyTextView);
        mRespuestaA = (Button) findViewById(R.id.buttonTop);
        mRespuestaB = (Button) findViewById(R.id.buttonBottom);

        mRespuestaA.setText(R.string.T1_Ans1);
        mRespuestaB.setText(R.string.T1_Ans2);




        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mRespuestaA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: funcionalidad:
                Log.d("Etiqueta", "IF" + mStoryIndex);
                if (mStoryIndex < 10) {
                    mStoryIndex = mStoryIndex +10;
                }
                actualizarVistasIzq();

            }
        });







        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mRespuestaB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Etiqueta", "IF" + mStoryIndex);
                if (mStoryIndex < 10) {
                    mStoryIndex = mStoryIndex +20;
                }

                actualizarVistasDer();
            }
        });


    }

    public void actualizarVistasDer() {
        if (mStoryIndex == 22) {
            mHistoria.setText(R.string.T2_Story);
            mRespuestaA.setText(R.string.T2_Ans1);
            mRespuestaB.setText(R.string.T2_Ans2);
            mStoryIndex = mStoryIndex +1;
        }

        else if (mStoryIndex == 23) {
            mHistoria.setText(R.string.T4_End);
            mRespuestaA.setVisibility(View.GONE);
            mRespuestaB.setVisibility(View.GONE);
            mStoryIndex = mStoryIndex +1;

        }

        else if (mStoryIndex == 13) {
            mHistoria.setText(R.string.T5_End);
            mRespuestaA.setVisibility(View.GONE);
            mRespuestaB.setVisibility(View.GONE);
            mStoryIndex = mStoryIndex +1;
        }



        else if (mStoryIndex== 24) {
            mHistoria.setText(R.string.T5_End);
            mRespuestaA.setVisibility(View.GONE);
            mRespuestaB.setVisibility(View.GONE);
            mStoryIndex = mStoryIndex +1;
        }
    }

    public void actualizarVistasIzq() {
        if (mStoryIndex == 12) {
            mHistoria.setText(R.string.T3_Story);
            mRespuestaA.setText(R.string.T3_Ans1);
            mRespuestaB.setText(R.string.T3_Ans2);
            mStoryIndex = mStoryIndex +1;
        }

        else if (mStoryIndex == 13) {
            mHistoria.setText(R.string.T6_End);
            mRespuestaA.setVisibility(View.GONE);
            mRespuestaB.setVisibility(View.GONE);
            mStoryIndex = mStoryIndex +1;
        }


        else if (mStoryIndex == 23) {
            mHistoria.setText(R.string.T3_Story);
            mRespuestaA.setText(R.string.T3_Ans1);
            mRespuestaB.setText(R.string.T3_Ans2);
            mStoryIndex = mStoryIndex +1;

        }

        else if (mStoryIndex == 24) {
            mHistoria.setText(R.string.T6_End);
            mRespuestaA.setVisibility(View.GONE);
            mRespuestaB.setVisibility(View.GONE);
            mStoryIndex = mStoryIndex +1;
        }

    }

}
