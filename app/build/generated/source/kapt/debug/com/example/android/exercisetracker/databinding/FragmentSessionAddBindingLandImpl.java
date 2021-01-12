package com.example.android.exercisetracker.databinding;
import com.example.android.exercisetracker.R;
import com.example.android.exercisetracker.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSessionAddBindingLandImpl extends FragmentSessionAddBinding implements com.example.android.exercisetracker.generated.callback.OnClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSessionAddBindingLandImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentSessionAddBindingLandImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.Button) bindings[5]
            , (android.widget.Button) bindings[6]
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.EditText) bindings[2]
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
        mCallback7 = new com.example.android.exercisetracker.generated.callback.OnClickListener(this, 3);
        mCallback8 = new com.example.android.exercisetracker.generated.callback.OnClickListener(this, 4);
        mCallback5 = new com.example.android.exercisetracker.generated.callback.OnClickListener(this, 1);
        mCallback6 = new com.example.android.exercisetracker.generated.callback.OnClickListener(this, 2);
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
    }
    public void setAddViewModel(@Nullable com.example.android.exercisetracker.screens.sessionAdd.SessionAddViewModel AddViewModel) {
        this.mAddViewModel = AddViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.addViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeAddViewModelCurrentTimeString((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeAddViewModelSuccessScore((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
            case 2 :
                return onChangeAddViewModelFailScore((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeAddViewModelCurrentTimeString(androidx.lifecycle.LiveData<java.lang.String> AddViewModelCurrentTimeString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeAddViewModelSuccessScore(androidx.lifecycle.LiveData<java.lang.Integer> AddViewModelSuccessScore, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeAddViewModelFailScore(androidx.lifecycle.LiveData<java.lang.Integer> AddViewModelFailScore, int fieldId) {
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
        java.lang.String addViewModelCurrentTimeStringGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> addViewModelCurrentTimeString = null;
        android.text.TextWatcher addViewModelTimerTextWatcher = null;
        androidx.lifecycle.LiveData<java.lang.Integer> addViewModelSuccessScore = null;
        java.lang.String addViewModelFailScoreToString = null;
        androidx.lifecycle.LiveData<java.lang.Integer> addViewModelFailScore = null;
        java.lang.Integer addViewModelSuccessScoreGetValue = null;
        java.lang.Integer addViewModelFailScoreGetValue = null;
        java.lang.String addViewModelSuccessScoreToString = null;
        com.example.android.exercisetracker.screens.sessionAdd.SessionAddViewModel addViewModel = mAddViewModel;

        if ((dirtyFlags & 0x37L) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (addViewModel != null) {
                        // read addViewModel.currentTimeString
                        addViewModelCurrentTimeString = addViewModel.getCurrentTimeString();
                    }
                    updateLiveDataRegistration(0, addViewModelCurrentTimeString);


                    if (addViewModelCurrentTimeString != null) {
                        // read addViewModel.currentTimeString.getValue()
                        addViewModelCurrentTimeStringGetValue = addViewModelCurrentTimeString.getValue();
                    }
            }
            if ((dirtyFlags & 0x30L) != 0) {

                    if (addViewModel != null) {
                        // read addViewModel.timerTextWatcher
                        addViewModelTimerTextWatcher = addViewModel.getTimerTextWatcher();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (addViewModel != null) {
                        // read addViewModel.successScore
                        addViewModelSuccessScore = addViewModel.getSuccessScore();
                    }
                    updateLiveDataRegistration(1, addViewModelSuccessScore);


                    if (addViewModelSuccessScore != null) {
                        // read addViewModel.successScore.getValue()
                        addViewModelSuccessScoreGetValue = addViewModelSuccessScore.getValue();
                    }


                    if (addViewModelSuccessScoreGetValue != null) {
                        // read addViewModel.successScore.getValue().toString()
                        addViewModelSuccessScoreToString = addViewModelSuccessScoreGetValue.toString();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (addViewModel != null) {
                        // read addViewModel.failScore
                        addViewModelFailScore = addViewModel.getFailScore();
                    }
                    updateLiveDataRegistration(2, addViewModelFailScore);


                    if (addViewModelFailScore != null) {
                        // read addViewModel.failScore.getValue()
                        addViewModelFailScoreGetValue = addViewModelFailScore.getValue();
                    }


                    if (addViewModelFailScoreGetValue != null) {
                        // read addViewModel.failScore.getValue().toString()
                        addViewModelFailScoreToString = addViewModelFailScoreGetValue.toString();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.failButton, addViewModelFailScoreToString);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.failButton.setOnClickListener(mCallback7);
            this.resultButton.setOnClickListener(mCallback8);
            this.startButton.setOnClickListener(mCallback5);
            this.successButton.setOnClickListener(mCallback6);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.successButton, addViewModelSuccessScoreToString);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.timeTextView, addViewModelCurrentTimeStringGetValue);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.timerEditText.addTextChangedListener(addViewModelTimerTextWatcher);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // addViewModel != null
                boolean addViewModelJavaLangObjectNull = false;
                // addViewModel
                com.example.android.exercisetracker.screens.sessionAdd.SessionAddViewModel addViewModel = mAddViewModel;



                addViewModelJavaLangObjectNull = (addViewModel) != (null);
                if (addViewModelJavaLangObjectNull) {


                    addViewModel.addFailScore();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // addViewModel != null
                boolean addViewModelJavaLangObjectNull = false;
                // addViewModel
                com.example.android.exercisetracker.screens.sessionAdd.SessionAddViewModel addViewModel = mAddViewModel;



                addViewModelJavaLangObjectNull = (addViewModel) != (null);
                if (addViewModelJavaLangObjectNull) {


                    addViewModel.insertDataToDatabase();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // addViewModel != null
                boolean addViewModelJavaLangObjectNull = false;
                // addViewModel
                com.example.android.exercisetracker.screens.sessionAdd.SessionAddViewModel addViewModel = mAddViewModel;



                addViewModelJavaLangObjectNull = (addViewModel) != (null);
                if (addViewModelJavaLangObjectNull) {


                    addViewModel.onStart();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // addViewModel != null
                boolean addViewModelJavaLangObjectNull = false;
                // addViewModel
                com.example.android.exercisetracker.screens.sessionAdd.SessionAddViewModel addViewModel = mAddViewModel;



                addViewModelJavaLangObjectNull = (addViewModel) != (null);
                if (addViewModelJavaLangObjectNull) {


                    addViewModel.addSuccessScore();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): addViewModel.currentTimeString
        flag 1 (0x2L): addViewModel.successScore
        flag 2 (0x3L): addViewModel.failScore
        flag 3 (0x4L): sessionAddViewModel
        flag 4 (0x5L): addViewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}