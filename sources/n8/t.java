package n8;

import android.util.DisplayMetrics;
import android.view.View;
import fd.j0;
import java.util.Objects;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;
import y9.x1;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t9.s f33689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x1 f33690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f33691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DisplayMetrics f33692f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(t9.s sVar, x1 x1Var, v9.d dVar, DisplayMetrics displayMetrics) {
        super(1);
        this.f33689c = sVar;
        this.f33690d = x1Var;
        this.f33691e = dVar;
        this.f33692f = displayMetrics;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        t9.s sVar = this.f33689c;
        Long lB = this.f33690d.f44033b.b(this.f33691e);
        DisplayMetrics displayMetrics = this.f33692f;
        j0.h(displayMetrics, "metrics");
        int iU = l8.b.u(lB, displayMetrics);
        Long lB2 = this.f33690d.f44035d.b(this.f33691e);
        DisplayMetrics displayMetrics2 = this.f33692f;
        j0.h(displayMetrics2, "metrics");
        int iU2 = l8.b.u(lB2, displayMetrics2);
        Long lB3 = this.f33690d.f44034c.b(this.f33691e);
        DisplayMetrics displayMetrics3 = this.f33692f;
        j0.h(displayMetrics3, "metrics");
        int iU3 = l8.b.u(lB3, displayMetrics3);
        Long lB4 = this.f33690d.f44032a.b(this.f33691e);
        DisplayMetrics displayMetrics4 = this.f33692f;
        j0.h(displayMetrics4, "metrics");
        int iU4 = l8.b.u(lB4, displayMetrics4);
        Objects.requireNonNull(sVar);
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        e0.e.k(sVar, iU, iU2, iU3, iU4);
        return jc.w.f31842a;
    }
}
