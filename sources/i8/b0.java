package i8;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<p7.g> f31310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<ExecutorService> f31311b;

    public b0(ic.a<p7.g> aVar, ic.a<ExecutorService> aVar2) {
        this.f31310a = aVar;
        this.f31311b = aVar2;
    }

    @Override // ic.a
    public Object get() {
        return new z(this.f31310a.get(), this.f31311b.get());
    }
}
