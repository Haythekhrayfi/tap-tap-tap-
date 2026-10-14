package androidx.activity;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CopyOnWriteArrayList<a> f497b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o0.a<Boolean> f498c;

    public f(boolean z10) {
        this.f496a = z10;
    }

    public abstract void a();

    public final void b(boolean z10) {
        this.f496a = z10;
        o0.a<Boolean> aVar = this.f498c;
        if (aVar != null) {
            aVar.accept(Boolean.valueOf(z10));
        }
    }
}
