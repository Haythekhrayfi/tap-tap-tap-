package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
public class o {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f2099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Animator f2100b;

        public a(Animator animator) {
            this.f2099a = null;
            this.f2100b = animator;
        }

        public a(Animation animation) {
            this.f2099a = animation;
            this.f2100b = null;
        }
    }

    public static class b extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ViewGroup f2101c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final View f2102d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f2103e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f2104f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f2105g;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f2105g = true;
            this.f2101c = viewGroup;
            this.f2102d = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation) {
            this.f2105g = true;
            if (this.f2103e) {
                return !this.f2104f;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f2103e = true;
                p0.x.a(this.f2101c, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f2105g = true;
            if (this.f2103e) {
                return !this.f2104f;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f2103e = true;
                p0.x.a(this.f2101c, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2103e || !this.f2105g) {
                this.f2101c.endViewTransition(this.f2102d);
                this.f2104f = true;
            } else {
                this.f2105g = false;
                this.f2101c.post(this);
            }
        }
    }

    public static int a(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }
}
