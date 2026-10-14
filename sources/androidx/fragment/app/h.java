package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class h implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f2052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f2053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Rect f2054e;

    public h(b bVar, i0 i0Var, View view, Rect rect) {
        this.f2052c = i0Var;
        this.f2053d = view;
        this.f2054e = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2052c.h(this.f2053d, this.f2054e);
    }
}
