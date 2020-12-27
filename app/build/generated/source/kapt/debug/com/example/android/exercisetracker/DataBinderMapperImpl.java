package com.example.android.exercisetracker;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.android.exercisetracker.databinding.FragmentSessionAddBindingImpl;
import com.example.android.exercisetracker.databinding.FragmentSessionAddBindingLandImpl;
import com.example.android.exercisetracker.databinding.FragmentSessionListBindingImpl;
import com.example.android.exercisetracker.databinding.FragmentSessionListBindingLandImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTSESSIONADD = 1;

  private static final int LAYOUT_FRAGMENTSESSIONLIST = 2;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(2);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.android.exercisetracker.R.layout.fragment_session_add, LAYOUT_FRAGMENTSESSIONADD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.android.exercisetracker.R.layout.fragment_session_list, LAYOUT_FRAGMENTSESSIONLIST);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTSESSIONADD: {
          if ("layout-land/fragment_session_add_0".equals(tag)) {
            return new FragmentSessionAddBindingLandImpl(component, view);
          }
          if ("layout/fragment_session_add_0".equals(tag)) {
            return new FragmentSessionAddBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_session_add is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSESSIONLIST: {
          if ("layout-land/fragment_session_list_0".equals(tag)) {
            return new FragmentSessionListBindingLandImpl(component, view);
          }
          if ("layout/fragment_session_list_0".equals(tag)) {
            return new FragmentSessionListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_session_list is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "addViewModel");
      sKeys.put(2, "listViewModel");
      sKeys.put(3, "sessionAddViewModel");
      sKeys.put(4, "sessionListViewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout-land/fragment_session_add_0", com.example.android.exercisetracker.R.layout.fragment_session_add);
      sKeys.put("layout/fragment_session_add_0", com.example.android.exercisetracker.R.layout.fragment_session_add);
      sKeys.put("layout-land/fragment_session_list_0", com.example.android.exercisetracker.R.layout.fragment_session_list);
      sKeys.put("layout/fragment_session_list_0", com.example.android.exercisetracker.R.layout.fragment_session_list);
    }
  }
}
