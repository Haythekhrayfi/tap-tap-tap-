package com.zipoapps.premiumhelper.toto;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.appcompat.app.s;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import cd.i;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import fd.j0;
import g2.p;
import java.util.Objects;
import jc.h;
import kotlin.reflect.KProperty;
import ma.f;
import mc.d;
import ta.e;
import vc.b0;
import vc.g;
import vc.t;
import w5.a;
import x1.b;
import x1.n;
import y1.k;

/* JADX INFO: loaded from: classes3.dex */
public final class TotoRegisterWorker extends CoroutineWorker {
    public static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    public static final Companion Companion;
    private static final String TAG = "RegisterWorker";
    private final e log$delegate;
    private final f preferences;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static /* synthetic */ void schedule$default(Companion companion, Context context, String str, int i10, Object obj) throws Throwable {
            if ((i10 & 2) != 0) {
                str = "";
            }
            companion.schedule(context, str);
        }

        public final void schedule(Context context) throws Throwable {
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            schedule$default(this, context, null, 2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void schedule(Context context, String str) throws Throwable {
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            j0.i(str, "fcmToken");
            h hVar = new h("fcm_token", str);
            int i10 = 0;
            h[] hVarArr = {hVar};
            c.a aVar = new c.a();
            while (i10 < 1) {
                h hVar2 = hVarArr[i10];
                i10++;
                aVar.b((String) hVar2.f31811c, hVar2.f31812d);
            }
            c cVarA = aVar.a();
            b.a aVar2 = new b.a();
            aVar2.f37390c = androidx.work.f.CONNECTED;
            b bVar = new b(aVar2);
            n.a aVar3 = new n.a(TotoRegisterWorker.class);
            p pVar = aVar3.f37419c;
            pVar.f29749j = bVar;
            pVar.f29744e = cVarA;
            k.c(context).b(TotoRegisterWorker.TAG, androidx.work.e.KEEP, aVar3.a());
        }
    }

    /* JADX INFO: renamed from: com.zipoapps.premiumhelper.toto.TotoRegisterWorker$doWork$1, reason: invalid class name */
    @oc.e(c = "com.zipoapps.premiumhelper.toto.TotoRegisterWorker", f = "TotoRegisterWorker.kt", l = {46, 53}, m = "doWork")
    public static final class AnonymousClass1 extends oc.c {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TotoRegisterWorker.this.doWork(this);
        }
    }

    static {
        t tVar = new t(TotoRegisterWorker.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        Objects.requireNonNull(b0.f36991a);
        $$delegatedProperties = new i[]{tVar};
        Companion = new Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotoRegisterWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j0.i(workerParameters, "params");
        this.log$delegate = new e(TAG);
        this.preferences = new f(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFcmToken(d<? super String> dVar) {
        Task<String> task;
        String strB = getInputData().b("fcm_token");
        if (!(strB == null || strB.length() == 0)) {
            getLog().g(i.f.a("New FCM token: ", strB), new Object[0]);
            return strB;
        }
        final fd.k kVar = new fd.k(nc.b.c(dVar), 1);
        kVar.u();
        try {
            getLog().k(4, null, "Requesting FCM token", new Object[0]);
            FirebaseMessaging firebaseMessagingC = FirebaseMessaging.c();
            a aVar = firebaseMessagingC.f12592b;
            if (aVar != null) {
                task = aVar.a();
            } else {
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                firebaseMessagingC.f12598h.execute(new s(firebaseMessagingC, taskCompletionSource));
                task = taskCompletionSource.getTask();
            }
            task.addOnCompleteListener(new OnCompleteListener() { // from class: com.zipoapps.premiumhelper.toto.TotoRegisterWorker$getFcmToken$2$1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task<String> task2) {
                    j0.i(task2, "it");
                    if (task2.isSuccessful()) {
                        ta.d log = this.this$0.getLog();
                        StringBuilder sbA = defpackage.a.a("Got FCM token: ");
                        sbA.append(task2.getResult());
                        log.g(sbA.toString(), new Object[0]);
                        if (kVar.a()) {
                            fd.i<String> iVar = kVar;
                            jc.i.a aVar2 = jc.i.f31813c;
                            iVar.resumeWith(task2.getResult());
                            return;
                        }
                        return;
                    }
                    Exception exception = task2.getException();
                    if (exception != null) {
                        xe.a.b("PremiumHelper").c(exception);
                        b5.d.a().c(exception);
                    }
                    if (kVar.a()) {
                        fd.i<String> iVar2 = kVar;
                        jc.i.a aVar3 = jc.i.f31813c;
                        iVar2.resumeWith(null);
                    }
                }
            });
        } catch (Throwable th) {
            getLog().k(6, th, "Failed to retrieve FCM token", new Object[0]);
            if (kVar.a()) {
                jc.i.a aVar2 = jc.i.f31813c;
                kVar.resumeWith(null);
            }
        }
        Object objR = kVar.r();
        if (objR == nc.a.COROUTINE_SUSPENDED) {
            j0.i(dVar, "frame");
        }
        return objR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ta.d getLog() {
        return this.log$delegate.a(this, $$delegatedProperties[0]);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public Object doWork(d<? super ListenableWorker.a> dVar) {
        AnonymousClass1 anonymousClass1;
        TotoRegisterWorker totoRegisterWorker;
        TotoRegisterWorker totoRegisterWorker2;
        int i10;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i11 = anonymousClass1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i11 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object fcmToken = anonymousClass1.result;
        nc.a aVar = nc.a.COROUTINE_SUSPENDED;
        int i12 = anonymousClass1.label;
        boolean zBooleanValue = false;
        if (i12 == 0) {
            h9.d.t(fcmToken);
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            fcmToken = getFcmToken(anonymousClass1);
            if (fcmToken == aVar) {
                return aVar;
            }
            totoRegisterWorker = this;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                totoRegisterWorker2 = (TotoRegisterWorker) anonymousClass1.L$0;
                try {
                    h9.d.t(fcmToken);
                    zBooleanValue = ((Boolean) fcmToken).booleanValue();
                } catch (Exception e10) {
                    e = e10;
                    totoRegisterWorker = totoRegisterWorker2;
                    xe.a.b("PremiumHelper").c(e);
                    b5.d.a().c(e);
                    if (e instanceof ue.h) {
                        i10 = ((ue.h) e).f36411c;
                        if (i10 == 404 && i10 != 500 && i10 != 502) {
                            if (i10 == 504) {
                                return new ListenableWorker.a.b();
                            }
                        }
                        return new ListenableWorker.a.b();
                    }
                    totoRegisterWorker2 = totoRegisterWorker;
                }
                if (!zBooleanValue) {
                    return new ListenableWorker.a.C0046a();
                }
                SharedPreferences.Editor editorEdit = totoRegisterWorker2.preferences.f33405a.edit();
                editorEdit.putBoolean("is_fcm_registered", true);
                editorEdit.apply();
                return new ListenableWorker.a.c();
            }
            totoRegisterWorker = (TotoRegisterWorker) anonymousClass1.L$0;
            h9.d.t(fcmToken);
        }
        String str = (String) fcmToken;
        if (str == null || str.length() == 0) {
            return new ListenableWorker.a.b();
        }
        try {
            TotoFeature totoFeature = ma.h.f33410y.a().f33426o;
            anonymousClass1.L$0 = totoRegisterWorker;
            anonymousClass1.label = 2;
            fcmToken = totoFeature.registerFcmToken(str, anonymousClass1);
            if (fcmToken == aVar) {
                return aVar;
            }
            totoRegisterWorker2 = totoRegisterWorker;
            zBooleanValue = ((Boolean) fcmToken).booleanValue();
            if (!zBooleanValue) {
                return new ListenableWorker.a.C0046a();
            }
            SharedPreferences.Editor editorEdit2 = totoRegisterWorker2.preferences.f33405a.edit();
            editorEdit2.putBoolean("is_fcm_registered", true);
            editorEdit2.apply();
            return new ListenableWorker.a.c();
        } catch (Exception e11) {
            e = e11;
            xe.a.b("PremiumHelper").c(e);
            b5.d.a().c(e);
            if (e instanceof ue.h) {
                i10 = ((ue.h) e).f36411c;
                if (i10 == 404) {
                    return new ListenableWorker.a.b();
                }
                if (i10 == 504) {
                    return new ListenableWorker.a.b();
                }
            }
            totoRegisterWorker2 = totoRegisterWorker;
        }
    }
}
