package androidx.appcompat.app;

import android.view.View;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;
import p0.o0;

/* JADX INFO: loaded from: classes.dex */
public class m extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppCompatDelegateImpl f684a;

    public m(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f684a = appCompatDelegateImpl;
    }

    @Override // p0.o0, p0.n0
    public void b(View view) {
        this.f684a.f616x.setAlpha(1.0f);
        this.f684a.A.d(null);
        this.f684a.A = null;
    }

    @Override // p0.o0, p0.n0
    public void c(View view) {
        this.f684a.f616x.setVisibility(0);
        if (this.f684a.f616x.getParent() instanceof View) {
            View view2 = (View) this.f684a.f616x.getParent();
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.h.c(view2);
        }
    }
}
