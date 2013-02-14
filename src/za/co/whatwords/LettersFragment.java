package za.co.whatwords;

import android.app.Fragment;
import android.os.Bundle;
import android.view.*;

public class LettersFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){
		return inflater.inflate(R.layout.fragment_letters, container, false);
	}

}
