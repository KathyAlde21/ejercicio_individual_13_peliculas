package cl.bootcamp.ejercicioindividual13.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import cl.bootcamp.ejercicioindividual13.R;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.Navigation;
import cl.bootcamp.ejercicioindividual13.databinding.FragmentPersonajesBinding;


public class PersonajesFragment extends Fragment {

    private FragmentPersonajesBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentPersonajesBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Configurar clics para cada imagen
        binding.imageShingeki.setOnClickListener(v ->
                Navigation.findNavController(view).navigate(R.id.action_personajesFragment_to_shingekiFragment));

        binding.imageDbz.setOnClickListener(v ->
                Navigation.findNavController(view).navigate(R.id.action_personajesFragment_to_dbzFragment));

        binding.imageDigimon.setOnClickListener(v ->
                Navigation.findNavController(view).navigate(R.id.action_personajesFragment_to_digimonFragment));

        binding.imageSlamDunk.setOnClickListener(v ->
                Navigation.findNavController(view).navigate(R.id.action_personajesFragment_to_slamDunkFragment));

        binding.imageNaruto.setOnClickListener(v ->
                Navigation.findNavController(view).navigate(R.id.action_personajesFragment_to_narutoFragment));

        binding.imageVinland.setOnClickListener(v ->
                Navigation.findNavController(view).navigate(R.id.action_personajesFragment_to_vinlandFragment));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}