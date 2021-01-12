package com.example.android.exercisetracker.databinding;
import com.example.android.exercisetracker.R;
import com.example.android.exercisetracker.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSessionListBindingImpl extends FragmentSessionListBinding implements com.example.android.exercisetracker.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.recyclerview, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSessionListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentSessionListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            );
        this.clearButton.setTag(null);
        this.exerciseButton.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.example.android.exercisetracker.generated.callback.OnClickListener(this, 1);
        mCallback4 = new com.example.android.exercisetracker.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.sessionListViewModel == variableId) {
            setSessionListViewModel((com.example.android.exercisetracker.screens.sessionList.SessionListViewModel) variable);
        }
        else if (BR.listViewModel == variableId) {
            setListViewModel((com.example.android.exercisetracker.screens.sessionList.SessionListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSessionListViewModel(@Nullable com.example.android.exercisetracker.screens.sessionList.SessionListViewModel SessionListViewModel) {
        this.mSessionListViewModel = SessionListViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.sessionListViewModel);
        super.requestRebind();
    }
    public void setListViewModel(@Nullable com.example.android.exercisetracker.screens.sessionList.SessionListViewModel ListViewModel) {
        this.mListViewModel = ListViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.example.android.exercisetracker.screens.sessionList.SessionListViewModel sessionListViewModel = mSessionListViewModel;
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.clearButton.setOnClickListener(mCallback4);
            this.exerciseButton.setOnClickListener(mCallback3);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // sessionListViewModel
                com.example.android.exercisetracker.screens.sessionList.SessionListViewModel sessionListViewModel = mSessionListViewModel;
                // sessionListViewModel != null
                boolean sessionListViewModelJavaLangObjectNull = false;



                sessionListViewModelJavaLangObjectNull = (sessionListViewModel) != (null);
                if (sessionListViewModelJavaLangObjectNull) {


                    sessionListViewModel.navigateToAdd();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // sessionListViewModel
                com.example.android.exercisetracker.screens.sessionList.SessionListViewModel sessionListViewModel = mSessionListViewModel;
                // sessionListViewModel != null
                boolean sessionListViewModelJavaLangObjectNull = false;



                sessionListViewModelJavaLangObjectNull = (sessionListViewModel) != (null);
                if (sessionListViewModelJavaLangObjectNull) {


                    sessionListViewModel.clearAllSessions();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): sessionListViewModel
        flag 1 (0x2L): listViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}