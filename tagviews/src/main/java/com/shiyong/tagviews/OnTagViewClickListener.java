package com.shiyong.tagviews;

public abstract class OnTagViewClickListener implements TagView.OnTagClickListener{
    @Override
    public void onTagLongClick(int position, String text) {
    }

    @Override
    public void onSelectedTagDrag(int position, String text) {
    }

    @Override
    public void onTagCrossClick(int position) {
    }
}