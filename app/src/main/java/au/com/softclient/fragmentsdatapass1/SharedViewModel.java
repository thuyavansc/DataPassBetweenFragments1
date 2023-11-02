package au.com.softclient.fragmentsdatapass1;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
    private final MutableLiveData<String> text = new MutableLiveData<>();

    public void setMyText(String input) {
        text.setValue(input);
    }

    public LiveData<String> getMyText() {
        return text;
    }
}

