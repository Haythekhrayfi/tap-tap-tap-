package com.zipoapps.premiumhelper.ui.preferences;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import androidx.preference.m;
import ch.qos.logback.core.CoreConstants;
import fd.a2;
import fd.c0;
import fd.g0;
import fd.j0;
import fd.s0;
import fd.z;
import jc.w;
import kd.q;
import mc.d;
import mc.f;
import oc.e;
import oc.h;
import uc.p;
import vc.g;
import xa.b;

/* JADX INFO: loaded from: classes3.dex */
public class PremiumPreference extends Preference {
    public g0 O;
    public final PreferenceHelper P;
    public Preference.c Q;

    @e(c = "com.zipoapps.premiumhelper.ui.preferences.PremiumPreference$onAttached$1", f = "PremiumPreference.kt", l = {45}, m = "invokeSuspend")
    public static final class a extends h implements p<g0, d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28325c;

        /* JADX INFO: renamed from: com.zipoapps.premiumhelper.ui.preferences.PremiumPreference$a$a, reason: collision with other inner class name */
        public static final class C0237a<T> implements id.e {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PremiumPreference f28327c;

            public C0237a(PremiumPreference premiumPreference) {
                this.f28327c = premiumPreference;
            }

            @Override // id.e
            public Object emit(Object obj, d dVar) {
                this.f28327c.J(((Boolean) obj).booleanValue());
                return w.f31842a;
            }
        }

        public a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // oc.a
        public final d<w> create(Object obj, d<?> dVar) {
            return PremiumPreference.this.new a(dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, d<? super w> dVar) {
            return PremiumPreference.this.new a(dVar).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f28325c;
            if (i10 == 0) {
                h9.d.t(obj);
                id.d dVarO = z.o(ma.h.f33410y.a().f33427p.f30214h);
                C0237a c0237a = new C0237a(PremiumPreference.this);
                this.f28325c = 1;
                if (dVarO.a(c0237a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            return w.f31842a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PremiumPreference(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.P = new PreferenceHelper(context, attributeSet);
        this.f2289g = new b(this, context);
    }

    public /* synthetic */ PremiumPreference(Context context, AttributeSet attributeSet, int i10, g gVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    @Override // androidx.preference.Preference
    public void A(int i10) {
        super.A(i10);
    }

    @Override // androidx.preference.Preference
    public void B(Preference.c cVar) {
        this.Q = cVar;
    }

    public boolean I() {
        return !this.P.b();
    }

    public void J(boolean z10) {
    }

    @Override // androidx.preference.Preference
    public void o() {
        super.o();
        a2 a2Var = new a2(null);
        c0 c0Var = s0.f29619a;
        g0 g0VarA = z.a(f.a.C0363a.d(a2Var, q.f32064a.e0()));
        this.O = g0VarA;
        y8.c0.z(g0VarA, null, null, new a(null), 3, null);
    }

    @Override // androidx.preference.Preference
    public void q(m mVar) {
        j0.i(mVar, "holder");
        super.q(mVar);
        this.P.a(mVar);
    }

    @Override // androidx.preference.Preference
    public void s() {
        super.s();
        g0 g0Var = this.O;
        if (g0Var != null) {
            z.g(g0Var, null, 1);
        }
    }
}
