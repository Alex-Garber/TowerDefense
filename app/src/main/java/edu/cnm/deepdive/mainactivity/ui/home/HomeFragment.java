package edu.cnm.deepdive.mainactivity.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;
import edu.cnm.deepdive.mainactivity.R;
import edu.cnm.deepdive.mainactivity.databinding.FragmentHomeBinding;
import edu.cnm.deepdive.mainactivity.ui.MainViewModel;
import org.jetbrains.annotations.NotNull;

public class HomeFragment extends Fragment {

  private FragmentHomeBinding binding;

  private MainViewModel viewModel;


  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    binding = edu.cnm.deepdive.mainactivity.databinding.FragmentHomeBinding.inflate(inflater);
    //noinspection ConstantConditions

    // THe stuff down bellow allows us to display multiple variations of a fragment.
//    Variation variation = MatchFragmentArgs.fromBundle(getArguments()).getVariation();
//    binding.placeholder.setText(variation.toString());
    // Access references in binding to set contents of view objects, as appropriate.

    return binding.getRoot();
  }

  @Override
  public void onViewCreated(@NonNull @NotNull View view,
      @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    // Get reference to view model and set observers on live data.
//    viewModel = new ViewModelProvider(this).get(MainViewModel.class);
    // TODO obserive live data as nedded
  }
}


