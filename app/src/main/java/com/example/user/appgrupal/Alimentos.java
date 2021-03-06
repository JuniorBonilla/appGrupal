package com.example.user.appgrupal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Alimentos.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Alimentos#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Alimentos extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    View vista;
    private Button btnFrutas;
    private Button btnPostres;
    private Button btnRapidas;

    private OnFragmentInteractionListener mListener;

    public Alimentos() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Alimentos.
     */
    // TODO: Rename and change types and number of parameters
    public static Alimentos newInstance(String param1, String param2) {
        Alimentos fragment = new Alimentos();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        vista= inflater.inflate(R.layout.fragment_alimentos, container, false);

        btnFrutas =(Button) vista.findViewById(R.id.btnFrutas);
        btnFrutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //   Intent intent =  new Intent(Servicios.this, Main2Activity.class);
                // startActivity(intent);

                Intent frutas = new Intent( getActivity() , AlimentoF.class);
                startActivity(frutas);

            }
        });

        btnPostres =(Button) vista.findViewById(R.id.btnPostres);
        btnPostres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //   Intent intent =  new Intent(Servicios.this, Main2Activity.class);
                // startActivity(intent);

                Intent postres = new Intent( getActivity() , AlimentoP.class);
                startActivity(postres);

            }
        });

        btnRapidas =(Button) vista.findViewById(R.id.btnRapidas);
        btnRapidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //   Intent intent =  new Intent(Servicios.this, Main2Activity.class);
                // startActivity(intent);

                Intent rapida = new Intent( getActivity() , AlimentoR.class);
                startActivity(rapida);

            }
        });
        return vista;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
