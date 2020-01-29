package developer.ishank.forlalit.sir.autoresizableedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.autofit.et.lib.AutoFitEditText;
import com.autofit.et.lib.AutoFitEditTextUtil;

public class MainActivity extends AppCompatActivity {
    AutoFitEditText mAutoFitEditText;
    FrameLayout mRootView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAutoFitEditText = findViewById(R.id.rET);
        mRootView = findViewById(R.id.container);
    }

    public void initAutoFitEditText() {

        mAutoFitEditText.setEnabled(true);
        mAutoFitEditText.setFocusableInTouchMode(true);
        mAutoFitEditText.setFocusable(true);
        mAutoFitEditText.setEnableSizeCache(false);
        //might cause crash on some devices
        mAutoFitEditText.setMovementMethod(null);
        // can be added after layout inflation;
        mAutoFitEditText.setMaxHeight(330);
        //don't forget to add min text size programmatically
        mAutoFitEditText.setMinTextSize(60f);

        AutoFitEditTextUtil.setNormalization(this, mRootView, mAutoFitEditText);
    }
}
