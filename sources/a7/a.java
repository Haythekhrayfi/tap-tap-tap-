package a7;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import fd.j0;
import java.util.List;
import java.util.Objects;
import jc.w;
import lb.m;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q6.b f159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u6.b f160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u6.a f161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u6.a f162d;

    /* JADX INFO: renamed from: a7.a$a, reason: collision with other inner class name */
    public static final class C0004a extends l implements uc.l<u6.a, w> {
        public C0004a() {
            super(1);
        }

        @Override // uc.l
        public w invoke(u6.a aVar) {
            u6.a aVar2 = aVar;
            a aVar3 = a.this;
            j0.h(aVar2, "it");
            aVar3.c(aVar2);
            return w.f31842a;
        }
    }

    public a(q6.b bVar, u6.b bVar2) {
        j0.i(bVar, "rxEvents");
        j0.i(bVar2, "settingsDao");
        this.f159a = bVar;
        this.f160b = bVar2;
        this.f161c = new u6.a(null, 0L, 0L, 0L, false, 0L, null, 0L, false, 0, 1023, null);
        this.f162d = new u6.a(null, 0L, 0L, 0L, false, 0L, null, 0L, false, 0, 1023, null);
    }

    public final m<List<u6.a>> a() {
        return this.f160b.b();
    }

    public final m<u6.a> b(String str) {
        j0.i(str, FacebookMediationAdapter.KEY_ID);
        return this.f160b.a(str).e(new x6.b(new C0004a(), 20));
    }

    public final void c(u6.a aVar) {
        this.f161c = aVar;
        xe.a.f37601c.a("Sending information about loaded settings.", new Object[0]);
        q6.b bVar = this.f159a;
        Objects.requireNonNull(bVar);
        bVar.f34783c.d(aVar);
    }
}
