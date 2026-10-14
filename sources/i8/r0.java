package i8;

import android.view.View;
import ch.qos.logback.core.joran.action.Action;
import java.util.Map;
import java.util.Objects;
import y9.o8;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0 f31429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f31430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f31431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Map f31432f;

    public r0(q0 q0Var, k kVar, View view, Map map) {
        this.f31429c = q0Var;
        this.f31430d = kVar;
        this.f31431e = view;
        this.f31432f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e9.c cVar = e9.c.f29122a;
        n0 n0Var = this.f31429c.f31411b;
        k kVar = this.f31430d;
        View view = this.f31431e;
        Object[] array = this.f31432f.values().toArray(new o8[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        o8[] o8VarArr = (o8[]) array;
        Objects.requireNonNull(n0Var);
        fd.j0.i(kVar, Action.SCOPE_ATTRIBUTE);
        fd.j0.i(view, "view");
        fd.j0.i(o8VarArr, "actions");
        kVar.r(new o0(o8VarArr, n0Var, kVar, view));
    }
}
