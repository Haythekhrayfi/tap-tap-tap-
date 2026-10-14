package z6;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q6.b f45128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t6.b f45129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t6.a f45130c;

    public static final class a extends vc.l implements uc.l<t6.a, jc.w> {
        public a() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(t6.a aVar) {
            r.this.c(aVar);
            return jc.w.f31842a;
        }
    }

    public r(q6.b bVar, t6.b bVar2) {
        fd.j0.i(bVar, "rxEvents");
        fd.j0.i(bVar2, "settingsDao");
        this.f45128a = bVar;
        this.f45129b = bVar2;
    }

    public final lb.m<List<t6.a>> a() {
        return this.f45129b.b();
    }

    public final lb.m<t6.a> b(String str) {
        fd.j0.i(str, FacebookMediationAdapter.KEY_ID);
        return this.f45129b.a(str).e(new x6.b(new a(), 13));
    }

    public final void c(t6.a aVar) {
        this.f45130c = aVar;
        xe.a.f37601c.a("Sending information about loaded settings.", new Object[0]);
        if (aVar != null) {
            q6.b bVar = this.f45128a;
            Objects.requireNonNull(bVar);
            fd.j0.i(aVar, "settings");
            bVar.f34785e.d(aVar);
        }
    }
}
