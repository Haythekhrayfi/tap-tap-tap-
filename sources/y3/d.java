package y3;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public abstract class d<Z> extends i<ImageView, Z> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Animatable f38052d;

    public d(ImageView imageView) {
        super(imageView);
    }

    @Deprecated
    public d(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }

    @Override // y3.h
    public void b(Z z10, z3.b<? super Z> bVar) {
        j(z10);
    }

    @Override // y3.a, y3.h
    public void c(Drawable drawable) {
        j(null);
        ((ImageView) this.f38055b).setImageDrawable(drawable);
    }

    @Override // y3.i, y3.a, y3.h
    public void f(Drawable drawable) {
        j(null);
        ((ImageView) this.f38055b).setImageDrawable(drawable);
    }

    @Override // y3.i, y3.a, y3.h
    public void h(Drawable drawable) {
        this.f38056c.a();
        Animatable animatable = this.f38052d;
        if (animatable != null) {
            animatable.stop();
        }
        j(null);
        ((ImageView) this.f38055b).setImageDrawable(drawable);
    }

    public abstract void i(Z z10);

    public final void j(Z z10) {
        i(z10);
        if (!(z10 instanceof Animatable)) {
            this.f38052d = null;
            return;
        }
        Animatable animatable = (Animatable) z10;
        this.f38052d = animatable;
        animatable.start();
    }

    @Override // y3.a, u3.g
    public void onStart() {
        Animatable animatable = this.f38052d;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // y3.a, u3.g
    public void onStop() {
        Animatable animatable = this.f38052d;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
