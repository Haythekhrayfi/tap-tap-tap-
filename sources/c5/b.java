package c5;

import a5.t;
import h5.c0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements c5.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f3597c = new C0067b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x5.a<c5.a> f3598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<c5.a> f3599b = new AtomicReference<>(null);

    /* JADX INFO: renamed from: c5.b$b, reason: collision with other inner class name */
    public static final class C0067b implements e {
        public C0067b(a aVar) {
        }
    }

    public b(x5.a<c5.a> aVar) {
        this.f3598a = aVar;
        ((t) aVar).a(new d0.a(this));
    }

    @Override // c5.a
    public e a(String str) {
        c5.a aVar = this.f3599b.get();
        return aVar == null ? f3597c : aVar.a(str);
    }

    @Override // c5.a
    public boolean b() {
        c5.a aVar = this.f3599b.get();
        return aVar != null && aVar.b();
    }

    @Override // c5.a
    public boolean c(String str) {
        c5.a aVar = this.f3599b.get();
        return aVar != null && aVar.c(str);
    }

    @Override // c5.a
    public void d(String str, String str2, long j10, c0 c0Var) {
        d.f3604c.e("Deferring native open session: " + str);
        ((t) this.f3598a).a(new com.google.android.datatransport.runtime.scheduling.jobscheduling.b(str, str2, j10, c0Var));
    }
}
