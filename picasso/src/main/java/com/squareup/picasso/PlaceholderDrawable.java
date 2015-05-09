package com.squareup.picasso;

import android.graphics.drawable.Drawable;

/**
 * In order for a placeholder to be the correct size when crossfading
 * into the loaded image, it needs to have the same intrinsic width/height
 * as the image.
 *
 * This only works when we know the width/height before the image is loaded,
 * as is the case with fit() or resize(). Otherwise the crossfade is doomed
 * to fail and there's nothing we can do.
 */
class PlaceholderDrawable extends DrawableWrapper {

  private final int intrinsicWidth;
  private final int intrinsicHeight;

  public PlaceholderDrawable(Drawable drawable, int intrinsicWidth, int intrinsicHeight) {
    super(drawable);

    this.intrinsicWidth = intrinsicWidth;
    this.intrinsicHeight = intrinsicHeight;
  }

  @Override
  public int getIntrinsicWidth() {
    return intrinsicWidth;
  }

  @Override
  public int getIntrinsicHeight() {
    return intrinsicHeight;
  }
}
