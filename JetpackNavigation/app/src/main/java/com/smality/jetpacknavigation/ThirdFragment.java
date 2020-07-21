package com.smality.jetpacknavigation;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.*;
import android.view.*;
import android.widget.Button;
public class ThirdFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view =inflater.inflate(R.layout.fragment_third,container,false);
        Button button=(Button)view.findViewById(R.id.button3);
        final NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
         //navigate metodu ile nav_graph.xml dosyasındaki hangi action kullanacağını belirterek, geçiş yapacağı fragment bilgisini veriyoruz
            navController.navigate(R.id.action_thirdFragment_to_homeFragment);
            }
        });
        return view;
    }
}