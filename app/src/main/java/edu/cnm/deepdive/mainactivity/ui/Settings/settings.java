package edu.cnm.deepdive.mainactivity.ui.Settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import edu.cnm.deepdive.mainactivity.databinding.FragmentNotificationsBinding;
import edu.cnm.deepdive.mainactivity.ui.MainViewModel;
import org.jetbrains.annotations.NotNull;

public class settings extends Fragment {

private FragmentNotificationsBinding binding;
  private MainViewModel viewModel;

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    binding = edu.cnm.deepdive.mainactivity.databinding.FragmentNotificationsBinding.inflate(inflater);

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