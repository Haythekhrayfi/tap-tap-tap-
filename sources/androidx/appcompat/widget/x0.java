package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class x0 extends m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<Context> f1396b;

    public x0(Context context, Resources resources) {
        super(resources);
        this.f1396b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.m0, android.content.res.Resources
    public Drawable getDrawable(int i10) throws Resources.NotFoundException {
        Drawable drawableA = a(i10);
        Context context = this.f1396b.get();
        if (drawableA != null && context != null) {
            l0.c().k(context, i10, drawableA);
        }
        return drawableA;
    }
}
