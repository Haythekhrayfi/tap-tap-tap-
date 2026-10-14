package d7;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q6.b f28800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v6.b f28801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v6.a f28802c;

    public static final class a extends vc.l implements uc.l<v6.a, jc.w> {
        public a() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(v6.a aVar) {
            v6.a aVar2 = aVar;
            g gVar = g.this;
            fd.j0.h(aVar2, "it");
            gVar.c(aVar2);
            return jc.w.f31842a;
        }
    }

    public g(q6.b bVar, v6.b bVar2) {
        fd.j0.i(bVar, "rxEvents");
        fd.j0.i(bVar2, "settingsDao");
        this.f28800a = bVar;
        this.f28801b = bVar2;
        this.f28802c = new v6.a(null, null, 0L, 0L, 0, 0L, 0.0d, 127, null);
    }

    public final lb.m<List<v6.a>> a() {
        return this.f28801b.b();
    }

    public final lb.m<v6.a> b(String str) {
        fd.j0.i(str, FacebookMediationAdapter.KEY_ID);
        return this.f28801b.a(str).e(new x6.b(new a(), 24));
    }

    public final void c(v6.a aVar) {
        this.f28802c = aVar;
        xe.a.f37601c.a("Sending information about loaded settings.", new Object[0]);
        q6.b bVar = this.f28800a;
        Objects.requireNonNull(bVar);
        bVar.f34784d.d(aVar);
    }
}
