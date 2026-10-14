package com.zipoapps.premiumhelper;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.e;
import androidx.work.f;
import ch.qos.logback.core.CoreConstants;
import fd.j0;
import kotlin.reflect.KProperty;
import ma.h;
import mc.d;
import oc.c;
import vc.g;
import x1.n;
import y1.k;

/* JADX INFO: loaded from: classes3.dex */
public final class AcknowledgePurchaseWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f28240a = new a(null);

    public static final class a {
        public a() {
        }

        public a(g gVar) {
        }

        public final void a(Context context) {
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            x1.b.a aVar = new x1.b.a();
            aVar.f37390c = f.CONNECTED;
            x1.b bVar = new x1.b(aVar);
            n.a aVar2 = new n.a(AcknowledgePurchaseWorker.class);
            aVar2.f37419c.f29749j = bVar;
            k.c(context).b("AcknowledgePurchaseWorker", e.KEEP, aVar2.a());
        }
    }

    @oc.e(c = "com.zipoapps.premiumhelper.AcknowledgePurchaseWorker", f = "AcknowledgePurchaseWorker.kt", l = {29}, m = "doWork")
    public static final class b extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f28241c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f28243e;

        public b(d<? super b> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f28241c = obj;
            this.f28243e |= Integer.MIN_VALUE;
            return AcknowledgePurchaseWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcknowledgePurchaseWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j0.i(workerParameters, "params");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public Object doWork(d<? super ListenableWorker.a> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f28243e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f28243e = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f28241c;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i11 = bVar.f28243e;
        if (i11 == 0) {
            h9.d.t(obj);
            gb.g gVar = h.f33410y.a().f33427p;
            bVar.f28243e = 1;
            KProperty<Object>[] kPropertyArr = gb.g.f30206l;
            if (gVar.g(null, bVar) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h9.d.t(obj);
        }
        return new ListenableWorker.a.c();
    }
}
