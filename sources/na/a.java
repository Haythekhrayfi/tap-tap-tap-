package na;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.android.billingclient.api.e;
import com.android.billingclient.api.f;
import fd.j0;
import fd.k;
import gb.x;
import java.util.Objects;
import jc.w;
import mc.d;
import oc.c;
import oc.h;
import uc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f33751a;

    /* JADX INFO: renamed from: na.a$a, reason: collision with other inner class name */
    @oc.e(c = "com.zipoapps.premiumhelper.billing.BillingConnection", f = "BillingConnection.kt", l = {28}, m = "connect$premium_helper_4_4_2_alpha5_regularRelease")
    public static final class C0369a extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f33752c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f33753d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f33755f;

        public C0369a(d<? super C0369a> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f33753d = obj;
            this.f33755f |= Integer.MIN_VALUE;
            return a.this.a(this);
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.billing.BillingConnection$connect$result$1", f = "BillingConnection.kt", l = {28}, m = "invokeSuspend")
    public static final class b extends h implements l<d<? super x<? extends Integer>>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f33756c;

        public b(d<? super b> dVar) {
            super(1, dVar);
        }

        @Override // oc.a
        public final d<w> create(d<?> dVar) {
            return a.this.new b(dVar);
        }

        @Override // uc.l
        public Object invoke(d<? super x<? extends Integer>> dVar) {
            return a.this.new b(dVar).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f33756c;
            if (i10 == 0) {
                h9.d.t(obj);
                a aVar2 = a.this;
                this.f33756c = 1;
                Objects.requireNonNull(aVar2);
                k kVar = new k(nc.b.c(this), 1);
                kVar.u();
                aVar2.f33751a.i(new na.b(kVar));
                obj = kVar.r();
                if (obj == aVar) {
                    j0.i(this, "frame");
                }
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            return obj;
        }
    }

    public a(Context context, com.android.billingclient.api.w wVar) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j0.i(wVar, "purchaseUpdateListener");
        this.f33751a = new f(new j0(1), context, wVar, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(d<? super e> dVar) {
        C0369a c0369a;
        a aVar;
        if (dVar instanceof C0369a) {
            c0369a = (C0369a) dVar;
            int i10 = c0369a.f33755f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0369a.f33755f = i10 - Integer.MIN_VALUE;
            } else {
                c0369a = new C0369a(dVar);
            }
        } else {
            c0369a = new C0369a(dVar);
        }
        C0369a c0369a2 = c0369a;
        Object objR = c0369a2.f33753d;
        nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
        int i11 = c0369a2.f33755f;
        if (i11 == 0) {
            h9.d.t(objR);
            if (this.f33751a.d()) {
                return this.f33751a;
            }
            com.zipoapps.premiumhelper.util.c cVar = com.zipoapps.premiumhelper.util.c.f28448a;
            b bVar = new b(null);
            c0369a2.f33752c = this;
            c0369a2.f33755f = 1;
            objR = cVar.r(10, 100L, 500L, 2.0d, bVar, c0369a2);
            if (objR == aVar2) {
                return aVar2;
            }
            aVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) c0369a2.f33752c;
            h9.d.t(objR);
        }
        x xVar = (x) objR;
        if (!(xVar instanceof x.b)) {
            return aVar.f33751a;
        }
        StringBuilder sbA = defpackage.a.a("Connect failure: ");
        Exception exc = ((x.b) xVar).f30416b;
        sbA.append(exc != null ? exc.getMessage() : null);
        throw new IllegalStateException(sbA.toString().toString());
    }
}
