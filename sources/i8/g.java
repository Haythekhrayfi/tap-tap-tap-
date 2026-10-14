package i8;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f31338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jc.e f31339d;

    public static final class a extends vc.l implements uc.a<String> {
        public a() {
            super(0);
        }

        @Override // uc.a
        public String invoke() {
            return g.this.f31336a + '#' + g.this.f31337b + '#' + g.this.f31338c;
        }
    }

    public g(String str, String str2, String str3) {
        fd.j0.i(str, "scopeLogId");
        fd.j0.i(str2, "dataTag");
        fd.j0.i(str3, "actionLogId");
        this.f31336a = str;
        this.f31337b = str2;
        this.f31338c = str3;
        this.f31339d = jc.f.b(new a());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!fd.j0.d(g.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yandex.div.core.view2.CompositeLogId");
        g gVar = (g) obj;
        return fd.j0.d(this.f31336a, gVar.f31336a) && fd.j0.d(this.f31338c, gVar.f31338c) && fd.j0.d(this.f31337b, gVar.f31337b);
    }

    public int hashCode() {
        return this.f31337b.hashCode() + l1.e.a(this.f31338c, this.f31336a.hashCode() * 31, 31);
    }

    public String toString() {
        return (String) this.f31339d.getValue();
    }
}
