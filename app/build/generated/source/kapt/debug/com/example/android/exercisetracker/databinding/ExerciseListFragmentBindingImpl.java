package com.example.android.exercisetracker.databinding;
import com.example.android.exercisetracker.R;
import com.example.android.exercisetracker.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ExerciseListFragmentBindingImpl extends ExerciseListFragmentBinding implements com.example.android.exercisetracker.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.recyclerview, 2);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.google.android.material.floatingactionbutton.FloatingActionButton mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ExerciseListFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ExerciseListFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        mCallback9 = new com.example.android.exercisetracker.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.exerciseListViewModel == variableId) {
            setExerciseListViewModel((com.example.android.exercisetracker.screens.exerciseList.ExerciseListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setExerciseListViewModel(@Nullable com.example.android.exercisetracker.screens.exerciseList.ExerciseListViewModel ExerciseListViewModel) {
        this.mExerciseListViewModel = ExerciseListViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.exerciseListViewModel);
        super.requestRebind();
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
        com.example.android.exercisetracker.screens.exerciseList.ExerciseListViewModel exerciseListViewModel = mExerciseListViewModel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback9);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // exerciseListViewModel
        com.example.android.exercisetracker.screens.exerciseList.ExerciseListViewModel exerciseListViewModel = mExerciseListViewModel;
        // exerciseListViewModel != null
        boolean exerciseListViewModelJavaLangObjectNull = false;



        exerciseListViewModelJavaLangObjectNull = (exerciseListViewModel) != (null);
        if (exerciseListViewModelJavaLangObjectNull) {


            exerciseListViewModel.navigateToAddExercise();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): exerciseListViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}