package com.zipoapps.premiumhelper.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import ch.qos.logback.core.CoreConstants;
import fd.g0;
import fd.j0;
import fd.s0;
import fd.z;
import gb.x;
import jc.w;
import kd.q;
import oc.e;
import oc.h;
import uc.p;
import vc.g;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class ConsumeAllReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f28431a;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
        }
    }

    @e(c = "com.zipoapps.premiumhelper.util.ConsumeAllReceiver$onReceive$1", f = "ConsumeAllReceiver.kt", l = {21}, m = "invokeSuspend")
    public static final class b extends h implements p<g0, mc.d<? super w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28432c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f28433d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, mc.d<? super b> dVar) {
            super(2, dVar);
            this.f28433d = context;
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return new b(this.f28433d, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
            return new b(this.f28433d, dVar).invokeSuspend(w.f31842a);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f28432c;
            if (i10 == 0) {
                h9.d.t(obj);
                ma.h hVarA = ma.h.f33410y.a();
                this.f28432c = 1;
                obj = hVarA.f33427p.i(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(obj);
            }
            Context context = this.f28433d;
            x xVar = (x) obj;
            if (c0.x(xVar)) {
                StringBuilder sbA = defpackage.a.a("Successfully consumed: ");
                sbA.append(c0.m(xVar));
                sbA.append(" products");
                Toast.makeText(context, sbA.toString(), 0).show();
                xe.a.c cVarB = xe.a.b(ConsumeAllReceiver.f28431a);
                StringBuilder sbA2 = defpackage.a.a("onReceive()-> Successfully consumed: ");
                sbA2.append(c0.m(xVar));
                sbA2.append(" products");
                cVarB.a(sbA2.toString(), new Object[0]);
            } else {
                StringBuilder sbA3 = defpackage.a.a("Failed to consume: ");
                sbA3.append(c0.j(xVar));
                Toast.makeText(context, sbA3.toString(), 0).show();
                xe.a.c cVarB2 = xe.a.b(ConsumeAllReceiver.f28431a);
                StringBuilder sbA4 = defpackage.a.a("onReceive()-> Failed to consume: ");
                sbA4.append(c0.j(xVar));
                cVarB2.b(sbA4.toString(), new Object[0]);
            }
            return w.f31842a;
        }
    }

    static {
        new a(null);
        f28431a = "ConsumeAllReceiver";
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j0.i(intent, "intent");
        fd.c0 c0Var = s0.f29619a;
        c0.z(z.a(q.f32064a), null, null, new b(context, null), 3, null);
    }
}
