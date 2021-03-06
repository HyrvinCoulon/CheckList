package com.example.todo;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Separator extends RecyclerView.ItemDecoration {

    private final int vertical;

    public Separator(int vertical) {
        this.vertical = vertical;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        outRect.bottom = vertical;
    }
}
