package com.yandex.mobile.ads.nativeads;

import android.annotation.SuppressLint;
import com.yandex.mobile.ads.impl.la1;
import com.yandex.mobile.ads.impl.oj0;
import com.yandex.mobile.ads.impl.qa;
import com.yandex.mobile.ads.impl.ra;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class g implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<qa<?>> f27744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oj0 f27745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f27746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private w f27747d;

    public class a implements h0.b {
        public a() {
        }

        @Override // com.yandex.mobile.ads.nativeads.h0.b
        public final boolean isValid(List<qa<?>> list) {
            ra raVarA;
            for (qa<?> qaVar : list) {
                if (qaVar.f() && (raVarA = g.this.f27747d.a(qaVar)) != null && raVarA.d()) {
                    return true;
                }
            }
            return false;
        }
    }

    public class b implements h0.b {
        public b() {
        }

        @Override // com.yandex.mobile.ads.nativeads.h0.b
        public final boolean isValid(List<qa<?>> list) {
            ra raVarA;
            for (qa<?> qaVar : list) {
                if (qaVar.f() && ((raVarA = g.this.f27747d.a(qaVar)) == null || !raVarA.e())) {
                    g.this.f27746c = qaVar.b();
                    return false;
                }
            }
            return true;
        }
    }

    public class c implements h0.b {
        public c() {
        }

        @Override // com.yandex.mobile.ads.nativeads.h0.b
        public final boolean isValid(List<qa<?>> list) {
            for (qa<?> qaVar : list) {
                if (qaVar.f()) {
                    ra raVarA = g.this.f27747d.a(qaVar);
                    Object objD = qaVar.d();
                    if (raVarA == null || !raVarA.a(objD)) {
                        g.this.f27746c = qaVar.b();
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public class d implements h0.b {
        public d() {
        }

        @Override // com.yandex.mobile.ads.nativeads.h0.b
        public final boolean isValid(List<qa<?>> list) {
            ra raVarA;
            for (qa<?> qaVar : list) {
                if (qaVar.f() && ((raVarA = g.this.f27747d.a(qaVar)) == null || !raVarA.b())) {
                    g.this.f27746c = qaVar.b();
                    return false;
                }
            }
            return true;
        }
    }

    public g(List<qa<?>> list, oj0 oj0Var) {
        this.f27744a = list;
        this.f27745b = oj0Var;
    }

    @Override // com.yandex.mobile.ads.nativeads.h0
    public h0.a a(boolean z10) {
        int i10;
        la1.a aVar;
        List<qa<?>> list = this.f27744a;
        boolean z11 = false;
        if (list != null) {
            Iterator<qa<?>> it = list.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (it.next().f()) {
                    i10++;
                }
            }
        } else {
            i10 = 0;
        }
        if ((i10 >= 2) && b()) {
            z11 = true;
        }
        if (z11 && !z10) {
            aVar = la1.a.f22661g;
        } else if (d()) {
            aVar = la1.a.f22664j;
        } else {
            aVar = c() ? la1.a.f22658d : la1.a.f22656b;
        }
        return new g0(aVar, this.f27746c);
    }

    @Override // com.yandex.mobile.ads.nativeads.h0
    public m0 a() {
        return new m0(this.f27746c, this.f27747d != null && a(new d(), this.f27744a));
    }

    @Override // com.yandex.mobile.ads.nativeads.h0
    public void a(w wVar) {
        this.f27747d = wVar;
    }

    @SuppressLint({"VisibleForTests"})
    public boolean a(h0.b bVar, List<qa<?>> list) {
        Objects.requireNonNull(this.f27745b);
        return list != null && bVar.isValid(list);
    }

    public boolean b() {
        return !(this.f27747d != null && a(new a(), this.f27744a));
    }

    public boolean c() {
        return !(this.f27747d != null && a(new c(), this.f27744a));
    }

    public boolean d() {
        return !(this.f27747d != null && a(new b(), this.f27744a));
    }
}
