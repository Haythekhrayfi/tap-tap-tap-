package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class f1 extends m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1218c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<Context> f1219b;

    public f1(Context context, Resources resources) {
        super(resources);
        this.f1219b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.m0, android.content.res.Resources
    public Drawable getDrawable(int i10) throws Resources.NotFoundException {
        Drawable drawableJ;
        Context context = this.f1219b.get();
        if (context == null) {
            return a(i10);
        }
        l0 l0VarC = l0.c();
        synchronized (l0VarC) {
            Drawable drawableI = l0VarC.i(context, i10);
            if (drawableI == null) {
                drawableI = a(i10);
            }
            drawableJ = drawableI != null ? l0VarC.j(context, i10, false, drawableI) : null;
        }
        return drawableJ;
    }
}
