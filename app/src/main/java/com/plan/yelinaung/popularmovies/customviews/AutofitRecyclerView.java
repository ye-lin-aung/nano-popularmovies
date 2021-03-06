package com.plan.yelinaung.popularmovies.customviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by user on 2/14/16.
 */

// From http://blog.sqisland.com/2014/12/recyclerview-autofit-grid.html
public class AutofitRecyclerView extends RecyclerView {
  private GridLayoutManager manager;
  private int columnWidth = -1;

  public AutofitRecyclerView(Context context) {
    super(context);
    init(context, null);
  }

  public AutofitRecyclerView(Context context, AttributeSet attrs) {
    super(context, attrs);
    init(context, attrs);
  }

  public AutofitRecyclerView(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
    init(context, attrs);
  }

  private void init(Context context, AttributeSet attrs) {
    if (attrs != null) {
      int[] attrsArray = {
          android.R.attr.columnWidth
      };
      TypedArray array = context.obtainStyledAttributes(attrs, attrsArray);
      columnWidth = array.getDimensionPixelSize(0, -1);
      array.recycle();
    }

    manager = new GridLayoutManager(getContext(), 1);
    setLayoutManager(manager);
  }

  @Override public boolean canScrollVertically(int direction) {
    // check if scrolling up
    if (direction < 1) {
      boolean original = super.canScrollVertically(direction);
      return !original && getChildAt(0) != null && getChildAt(0).getTop() < 0 || original;
    }
    return super.canScrollVertically(direction);
  }

  @Override protected void onMeasure(int widthSpec, int heightSpec) {
    super.onMeasure(widthSpec, heightSpec);
    if (columnWidth > 0) {
      int spanCount = Math.max(1, getMeasuredWidth() / columnWidth);
      manager.setSpanCount(spanCount);
    }
  }
}

