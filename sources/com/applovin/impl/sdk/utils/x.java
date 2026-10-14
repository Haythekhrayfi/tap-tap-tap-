package com.applovin.impl.sdk.utils;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public class x {
    public static void a(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static void a(View view, long j10) {
        a(view, j10, (Runnable) null);
    }

    public static void a(final View view, long j10, final Runnable runnable) {
        view.setVisibility(4);
        view.bringToFront();
        AlphaAnimation alphaAnimation = new AlphaAnimation(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 1.0f);
        alphaAnimation.setDuration(j10);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.applovin.impl.sdk.utils.x.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                view.setVisibility(0);
            }
        });
        view.startAnimation(alphaAnimation);
    }

    public static boolean a(int i10) {
        return i10 == 0;
    }

    public static boolean a(int i10, int i11) {
        return a(i10) != a(i11);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0021  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    public static int[] a(int i10, int i11, int i12) {
        if (i10 == 0) {
            return new int[]{i11, i12};
        }
        if ((i10 & 119) == 119) {
            return new int[]{13};
        }
        if ((i10 & 112) == 112) {
            i11 = 15;
        } else if ((i10 & 48) == 48) {
            i11 = 10;
        } else if ((i10 & 80) == 80) {
            i11 = 12;
        } else if ((i10 & 16) == 16) {
            i11 = 15;
        }
        if ((i10 & 7) == 7) {
            i12 = 14;
        } else if (h.b() && (i10 & 8388611) == 8388611) {
            i12 = 20;
        } else if ((i10 & 3) == 3) {
            i12 = 9;
        } else if (h.b() && (i10 & 8388613) == 8388613) {
            i12 = 21;
        } else if ((i10 & 5) == 5) {
            i12 = 11;
        } else if ((i10 & 1) == 1) {
            i12 = 14;
        }
        return new int[]{i12, i11};
    }

    public static String b(int i10) {
        if (i10 == 0) {
            return "VISIBLE";
        }
        if (i10 == 4) {
            return "INVISIBLE";
        }
        return i10 == 8 ? "GONE" : String.valueOf(i10);
    }

    public static void b(final View view, long j10, final Runnable runnable) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        alphaAnimation.setDuration(j10);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.applovin.impl.sdk.utils.x.2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.setVisibility(4);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                view.setVisibility(0);
            }
        });
        view.startAnimation(alphaAnimation);
    }
}
