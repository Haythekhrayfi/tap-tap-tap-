package com.zipoapps.premiumhelper.toto;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.e;
import androidx.work.f;
import ch.qos.logback.core.CoreConstants;
import fd.j0;
import gb.x;
import ma.h;
import mc.d;
import nc.a;
import oc.c;
import vc.g;
import x1.b;
import x1.n;
import y1.k;

/* JADX INFO: loaded from: classes3.dex */
public final class PostConfigWorker extends CoroutineWorker {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "PostConfigWorker";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final void scheduleNow(Context context) {
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            b.a aVar = new b.a();
            aVar.f37390c = f.CONNECTED;
            b bVar = new b(aVar);
            n.a aVar2 = new n.a(PostConfigWorker.class);
            aVar2.f37419c.f29749j = bVar;
            k.c(context).b(PostConfigWorker.TAG, e.REPLACE, aVar2.a());
        }
    }

    /* JADX INFO: renamed from: com.zipoapps.premiumhelper.toto.PostConfigWorker$doWork$1, reason: invalid class name */
    @oc.e(c = "com.zipoapps.premiumhelper.toto.PostConfigWorker", f = "PostConfigWorker.kt", l = {42, 44}, m = "doWork")
    public static final class AnonymousClass1 extends c {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PostConfigWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostConfigWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j0.i(workerParameters, "params");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public Object doWork(d<? super ListenableWorker.a> dVar) {
        AnonymousClass1 anonymousClass1;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object objPostConfig = anonymousClass1.result;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = anonymousClass1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                h9.d.t(objPostConfig);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h9.d.t(objPostConfig);
            }
            return ((x) objPostConfig) instanceof x.b ? new ListenableWorker.a.b() : new ListenableWorker.a.c();
        }
        h9.d.t(objPostConfig);
        h hVarA = h.f33410y.a();
        anonymousClass1.label = 1;
        if (hVarA.r(anonymousClass1) == aVar) {
            return aVar;
        }
        TotoFeature totoFeature = h.f33410y.a().f33426o;
        anonymousClass1.label = 2;
        objPostConfig = totoFeature.postConfig(anonymousClass1);
        if (objPostConfig == aVar) {
            return aVar;
        }
        if (((x) objPostConfig) instanceof x.b) {
        }
    }
}
