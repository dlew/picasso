package com.squareup.picasso;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/**
 * Allows one Drawable to be wrapped.
 *
 * This makes it easy to extend/modify a Drawable.
 */
class DrawableWrapper extends Drawable implements Drawable.Callback {

  final Drawable drawable;

  public DrawableWrapper(Drawable drawable) {
    this.drawable = drawable;
  }

  @Override
  public void setBounds(int left, int top, int right, int bottom) {
    drawable.setBounds(left, top, right, bottom);
  }

  @Override
  public void setBounds(Rect bounds) {
    drawable.setBounds(bounds);
  }

  @Override
  public void setChangingConfigurations(int configs) {
    drawable.setChangingConfigurations(configs);
  }

  @Override
  public int getChangingConfigurations() {
    return drawable.getChangingConfigurations();
  }

  @Override
  public void setDither(boolean dither) {
    drawable.setDither(dither);
  }

  @Override
  public void setFilterBitmap(boolean filter) {
    drawable.setFilterBitmap(filter);
  }

  @Override
  public Callback getCallback() {
    return drawable.getCallback();
  }

  @Override
  public void invalidateSelf() {
    drawable.invalidateSelf();
  }

  @Override
  public void scheduleSelf(Runnable what, long when) {
    drawable.scheduleSelf(what, when);
  }

  @Override
  public void unscheduleSelf(Runnable what) {
    drawable.unscheduleSelf(what);
  }

  @Override
  public void setColorFilter(int color, PorterDuff.Mode mode) {
    drawable.setColorFilter(color, mode);
  }

  @Override
  public void clearColorFilter() {
    drawable.clearColorFilter();
  }

  @Override
  public boolean isStateful() {
    return drawable.isStateful();
  }

  @Override
  public boolean setState(int[] stateSet) {
    return drawable.setState(stateSet);
  }

  @Override
  public int[] getState() {
    return drawable.getState();
  }

  @Override
  public void jumpToCurrentState() {
    drawable.jumpToCurrentState();
  }

  @Override
  public Drawable getCurrent() {
    return drawable.getCurrent();
  }

  @Override
  public boolean setVisible(boolean visible, boolean restart) {
    return drawable.setVisible(visible, restart);
  }

  @Override
  public Region getTransparentRegion() {
    return drawable.getTransparentRegion();
  }

  @Override
  public int getIntrinsicWidth() {
    return drawable.getIntrinsicWidth();
  }

  @Override
  public int getIntrinsicHeight() {
    return drawable.getIntrinsicHeight();
  }

  @Override
  public int getMinimumWidth() {
    return drawable.getMinimumWidth();
  }

  @Override
  public int getMinimumHeight() {
    return drawable.getMinimumHeight();
  }

  @Override
  public boolean getPadding(Rect padding) {
    return drawable.getPadding(padding);
  }

  @Override
  public Drawable mutate() {
    return drawable.mutate();
  }

  @Override
  public ConstantState getConstantState() {
    return drawable.getConstantState();
  }

  @Override
  public void draw(Canvas canvas) {
    drawable.draw(canvas);
  }

  @Override
  public void setAlpha(int i) {
    drawable.setAlpha(i);
  }

  @Override
  public void setColorFilter(ColorFilter colorFilter) {
    drawable.setColorFilter(colorFilter);
  }

  @Override
  public int getOpacity() {
    return drawable.getOpacity();
  }

  @Override
  public void invalidateDrawable(Drawable drawable) {
    invalidateSelf();
  }

  @Override
  public void scheduleDrawable(Drawable drawable, Runnable what, long when) {
    scheduleSelf(what, when);
  }

  @Override
  public void unscheduleDrawable(Drawable drawable, Runnable what) {
    unscheduleSelf(what);
  }
}
