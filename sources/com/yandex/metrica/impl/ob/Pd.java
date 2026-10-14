package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Pd extends C1587dh {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Uc f14715m;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Qi f14716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uc f14717b;

        public b(Qi qi, Uc uc2) {
            this.f14716a = qi;
            this.f14717b = uc2;
        }
    }

    public static class c implements C1587dh.d<Pd, b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f14718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C1537bh f14719b;

        public c(Context context, C1537bh c1537bh) {
            this.f14718a = context;
            this.f14719b = c1537bh;
        }

        @Override // com.yandex.metrica.impl.ob.C1587dh.d
        public Pd a(b bVar) {
            Pd pd2 = new Pd(bVar.f14717b);
            C1537bh c1537bh = this.f14719b;
            Context context = this.f14718a;
            Objects.requireNonNull(c1537bh);
            pd2.b(U2.a(context, context.getPackageName()));
            C1537bh c1537bh2 = this.f14719b;
            Context context2 = this.f14718a;
            Objects.requireNonNull(c1537bh2);
            pd2.a(String.valueOf(U2.b(context2, context2.getPackageName())));
            pd2.a(bVar.f14716a);
            pd2.a(C1545c0.a());
            pd2.a(P0.i().p().a());
            pd2.e(this.f14718a.getPackageName());
            pd2.a(P0.i().t().a(this.f14718a));
            pd2.a(P0.i().b().a());
            return pd2;
        }
    }

    private Pd(Uc uc2) {
        this.f14715m = uc2;
    }

    public Uc A() {
        return this.f14715m;
    }

    public List<String> B() {
        return w().y();
    }
}
