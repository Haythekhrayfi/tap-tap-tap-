package androidx.appcompat.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class o0 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p0 f1314d;

    public o0(p0 p0Var, View view) {
        this.f1314d = p0Var;
        this.f1313c = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1314d.smoothScrollTo(this.f1313c.getLeft() - ((this.f1314d.getWidth() - this.f1313c.getWidth()) / 2), 0);
        this.f1314d.f1319c = null;
    }
}
