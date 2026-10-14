package com.yandex.mobile.ads.nativeads.template;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f27941b = Color.parseColor("#eaeaea");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageView[] f27942a;

    public b(ImageView... imageViewArr) {
        this.f27942a = imageViewArr;
        b();
    }

    public final void a() {
        for (ImageView imageView : this.f27942a) {
            ColorDrawable colorDrawable = (ColorDrawable) imageView.getBackground();
            Drawable drawable = imageView.getDrawable();
            if (drawable != null && colorDrawable.getAlpha() == 255) {
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(colorDrawable, PropertyValuesHolder.ofInt("alpha", 255, 0));
                objectAnimatorOfPropertyValuesHolder.setTarget(colorDrawable);
                objectAnimatorOfPropertyValuesHolder.setDuration(500L);
                objectAnimatorOfPropertyValuesHolder.start();
                ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(drawable, PropertyValuesHolder.ofInt("alpha", 0, 255));
                objectAnimatorOfPropertyValuesHolder2.setTarget(drawable);
                objectAnimatorOfPropertyValuesHolder2.setDuration(500L);
                objectAnimatorOfPropertyValuesHolder2.start();
            }
        }
    }

    public final void b() {
        for (ImageView imageView : this.f27942a) {
            if (imageView != null) {
                if (imageView.getDrawable() != null) {
                    imageView.setBackgroundColor(0);
                } else {
                    imageView.setBackgroundColor(f27941b);
                }
            }
        }
    }
}
