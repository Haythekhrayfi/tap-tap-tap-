package androidx.appcompat.app;

import android.view.View;
import p0.e0;
import p0.s0;

/* JADX INFO: loaded from: classes.dex */
public class j implements p0.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppCompatDelegateImpl f680a;

    public j(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f680a = appCompatDelegateImpl;
    }

    @Override // p0.u
    public s0 onApplyWindowInsets(View view, s0 s0Var) {
        int iF = s0Var.f();
        int iC0 = this.f680a.c0(s0Var, null);
        if (iF != iC0) {
            int iD = s0Var.d();
            int iE = s0Var.e();
            int iC = s0Var.c();
            s0.b bVar = new s0.b(s0Var);
            bVar.f34409a.d(h0.g.b(iD, iC0, iE, iC));
            s0Var = bVar.a();
        }
        return e0.k(view, s0Var);
    }
}
