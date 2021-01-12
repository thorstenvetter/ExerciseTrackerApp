package com.example.android.exercisetracker.databinding;
import com.example.android.exercisetracker.R;
import com.example.android.exercisetracker.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSessionAddBindingImpl extends FragmentSessionAddBinding implements com.example.android.exercisetracker.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSessionAddBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentSessionAddBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[4]
            , (android.widget.Button) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.widget.EditText) bindings[6]
            );
        this.failButton.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.resultButton.setTag(null);
        this.startButton.setTag(null);
        this.successButton.setTag(null);
        this.timeTextView.setTag(null);
        this.timerEditText.setTag(null);
        setRootTag(root);
        // listeners
        mCallback12 = new com.example.android.exercisetracker.generated.callback.OnClickListener(this, 3);
        mCallback13 = new com.example.android.exercisetracker.generated.callback.OnClickListener(this, 4);
        mCallback10 = new com.example.android.exercisetracker.generated.callback.OnClickListener(this, 1);
        mCallback11 = new com.example.android.exercisetracker.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.sessionAddViewModel == variableId) {
            setSessionAddViewModel((com.example.android.exercisetracker.screens.sessionAdd.SessionAddViewModel) variable);
        }
        else if (BR.addViewModel == variableId) {
            setAddViewModel((com.example.android.exercisetracker.screens.sessionAdd.SessionAddViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSessionAddViewModel(@Nullable com.example.android.exercisetracker.screens.sessionAdd.SessionAddViewModel SessionAddViewModel) {
        this.mSessionAddViewModel = SessionAddViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.sessionAddViewModel);
        super.requestRebind();
    }
    public void setAddViewModel(@Nullable com.example.android.exercisetracker.screens.sessionAdd.SessionAddViewModel AddViewModel) {
        this.mAddViewModel = AddViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSessionAddViewModelFailScore((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeSessionAddViewModelSuccessScore((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
            case 2 :
                return onChangeSessionAddViewModelCurrentTimeString((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSessionAddViewModelFailScore(androidx.lifecycle.LiveData<java.lang.Integer> SessionAddViewModelFailScore, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSessionAddViewModelSuccessScore(androidx.lifecycle.LiveData<java.lang.Integer> SessionAddViewModelSuccessScore, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSessionAddViewModelCurrentTimeString(androidx.lifecycle.LiveData<java.lang.String> SessionAddViewModelCurrentTimeString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.LiveData<java.lang.Integer> sessionAddViewModelFailScore = null;
        java.lang.String sessionAddViewModelCurrentTimeStringGetValue = null;
        com.example.android.exercisetracker.screens.sessionAdd.SessionAddViewModel sessionAddViewModel = mSessionAddViewModel;
        androidx.lifecycle.LiveData<java.lang.Integer> sessionAddViewModelSuccessScore = null;
        android.text.TextWatcher sessionAddViewModelTimerTextWatcher = null;
        java.lang.String sessionAddViewModelSuccessScoreToString = null;
        java.lang.String sessionAddViewModelFailScoreToString = null;
        java.lang.Integer sessionAddViewModelSuccessScoreGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> sessionAddViewModelCurrentTimeString = null;
        java.lang.Integer sessionAddViewModelFailScoreGetValue = null;

        if ((dirtyFlags & 0x2fL) != 0) {


            if ((dirtyFlags & 0x29L) != 0) {

                    if (sessionAddViewModel != null) {
                        // read sessionAddViewModel.failScore
                        sessionAddViewModelFailScore = sessionAddViewModel.getFailScore();
                    }
                    updateLiveDataRegistration(0, sessionAddViewModelFailScore);


                    if (sessionAddViewModelFailScore != null) {
                        // read sessionAddViewModel.failScore.getValue()
                        sessionAddViewModelFailScoreGetValue = sessionAddViewModelFailScore.getValue();
                    }


                    if (sessionAddViewModelFailScoreGetValue != null) {
                        // read sessionAddViewModel.failScore.getValue().toString()
                        sessionAddViewModelFailScoreToString = sessionAddViewModelFailScoreGetValue.toString();
                    }
            }
            if ((dirtyFlags & 0x2aL) != 0) {

                    if (sessionAddViewModel != null) {
                        // read sessionAddViewModel.successScore
                        sessionAddViewModelSuccessScore = sessionAddViewModel.getSuccessScore();
                    }
                    updateLiveDataRegistration(1, sessionAddViewModelSuccessScore);


                    if (sessionAddViewModelSuccessScore != null) {
                        // read sessionAddViewModel.successScore.getValue()
                        sessionAddViewModelSuccessScoreGetValue = sessionAddViewModelSuccessScore.getValue();
                    }


                    if (sessionAddViewModelSuccessScoreGetValue != null) {
                        // read sessionAddViewModel.successScore.getValue().toString()
                        sessionAddViewModelSuccessScoreToString = sessionAddViewModelSuccessScoreGetValue.toString();
                    }
            }
            if ((dirtyFlags & 0x28L) != 0) {

                    if (sessionAddViewModel != null) {
                        // read sessionAddViewModel.timerTextWatcher
                        sessionAddViewModelTimerTextWatcher = sessionAddViewModel.getTimerTextWatcher();
                    }
            }
            if ((dirtyFlags & 0x2cL) != 0) {

                    if (sessionAddViewModel != null) {
                        // read sessionAddViewModel.currentTimeString
                        sessionAddViewModelCurrentTimeString = sessionAddViewModel.getCurrentTimeString();
                    }
                    updateLiveDataRegistration(2, sessionAddViewModelCurrentTimeString);


                    if (sessionAddViewModelCurrentTimeString != null) {
                        // read sessionAddViewModel.currentTimeString.getValue()
                        sessionAddViewModelCurrentTimeStringGetValue = sessionAddViewModelCurrentTimeString.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.failButton, sessionAddViewModelFailScoreToString);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.failButton.setOnClickListener(mCallback11);
            this.resultButton.setOnClickListener(mCallback12);
            this.startButton.setOnClickListener(mCallback13);
            this.successButton.setOnClickListener(mCallback10);
        }
        if ((dirtyFlags & 0x2aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.successButton, sessionAddViewModelSuccessScoreToString);
        }
        if ((dirtyFlags & 0x2cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.timeTextView, sessionAddViewModelCurrentTimeStringGetValue);
        }
        if ((dirtyFlags & 0x28L) != 0) {
            // api target 1

            this.timerEditText.addTextChangedListener(sessionAddViewModelTimerTextWatcher);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // sessionAddViewModel != null
                boolean sessionAddViewModelJavaLangObjectNull = false;
                // sessionAddViewModel
                com.example.android.exercisetracker.screens.sessionAdd.SessionAddViewModel sessionAddViewModel = mSessionAddViewModel;



                sessionAddViewModelJavaLangObjectNull = (sessionAddViewModel) != (null);
                if (sessionAddViewModelJavaLangObjectNull) {


                    sessionAddViewModel.insertDataToDatabase();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // sessionAddViewModel != null
                boolean sessionAddViewModelJavaLangObjectNull = false;
                // sessionAddViewModel
                com.example.android.exercisetracker.screens.sessionAdd.SessionAddViewModel sessionAddViewModel = mSessionAddViewModel;



                sessionAddViewModelJavaLangObjectNull = (sessionAddViewModel) != (null);
                if (sessionAddViewModelJavaLangObjectNull) {


                    sessionAddViewModel.onStart();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // sessionAddViewModel != null
                boolean sessionAddViewModelJavaLangObjectNull = false;
                // sessionAddViewModel
                com.example.android.exercisetracker.screens.sessionAdd.SessionAddViewModel sessionAddViewModel = mSessionAddViewModel;



                sessionAddViewModelJavaLangObjectNull = (sessionAddViewModel) != (null);
                if (sessionAddViewModelJavaLangObjectNull) {


                    sessionAddViewModel.addSuccessScore();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // sessionAddViewModel != null
                boolean sessionAddViewModelJavaLangObjectNull = false;
                // sessionAddViewModel
                com.example.android.exercisetracker.screens.sessionAdd.SessionAddViewModel sessionAddViewModel = mSessionAddViewModel;



                sessionAddViewModelJavaLangObjectNull = (sessionAddViewModel) != (null);
                if (sessionAddViewModelJavaLangObjectNull) {


                    sessionAddViewModel.addFailScore();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): sessionAddViewModel.failScore
        flag 1 (0x2L): sessionAddViewModel.successScore
        flag 2 (0x3L): sessionAddViewModel.currentTimeString
        flag 3 (0x4L): sessionAddViewModel
        flag 4 (0x5L): addViewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}