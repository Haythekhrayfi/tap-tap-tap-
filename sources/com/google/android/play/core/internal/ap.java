package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ap<T extends IInterface> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Handler> f12252a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f12253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final af f12254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f12255d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f12257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Intent f12258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final al<T> f12259h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ServiceConnection f12262k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private T f12263l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<ag> f12256e = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final IBinder.DeathRecipient f12261j = new IBinder.DeathRecipient(this) { // from class: com.google.android.play.core.internal.ah

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ap f12244a;

        {
            this.f12244a = this;
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            this.f12244a.c();
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final WeakReference<ak> f12260i = new WeakReference<>(null);

    public ap(Context context, af afVar, String str, Intent intent, al<T> alVar) {
        this.f12253b = context;
        this.f12254c = afVar;
        this.f12255d = str;
        this.f12258g = intent;
        this.f12259h = alVar;
    }

    public static /* synthetic */ void a(ap apVar, ag agVar) {
        if (apVar.f12263l != null || apVar.f12257f) {
            if (!apVar.f12257f) {
                agVar.run();
                return;
            } else {
                apVar.f12254c.c("Waiting to bind to the service.", new Object[0]);
                apVar.f12256e.add(agVar);
                return;
            }
        }
        apVar.f12254c.c("Initiate binding to the service.", new Object[0]);
        apVar.f12256e.add(agVar);
        ao aoVar = new ao(apVar);
        apVar.f12262k = aoVar;
        apVar.f12257f = true;
        if (apVar.f12253b.bindService(apVar.f12258g, aoVar, 1)) {
            return;
        }
        apVar.f12254c.c("Failed to bind to the service.", new Object[0]);
        apVar.f12257f = false;
        List<ag> list = apVar.f12256e;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            com.google.android.play.core.tasks.i<?> iVarB = list.get(i10).b();
            if (iVarB != null) {
                iVarB.b((Exception) new aq());
            }
        }
        apVar.f12256e.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(ag agVar) {
        Handler handler;
        Map<String, Handler> map = f12252a;
        synchronized (map) {
            if (!map.containsKey(this.f12255d)) {
                HandlerThread handlerThread = new HandlerThread(this.f12255d, 10);
                handlerThread.start();
                map.put(this.f12255d, new Handler(handlerThread.getLooper()));
            }
            handler = map.get(this.f12255d);
        }
        handler.post(agVar);
    }

    public static /* synthetic */ void f(ap apVar) {
        apVar.f12254c.c("linkToDeath", new Object[0]);
        try {
            apVar.f12263l.asBinder().linkToDeath(apVar.f12261j, 0);
        } catch (RemoteException e10) {
            apVar.f12254c.a(e10, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* synthetic */ void h(ap apVar) {
        apVar.f12254c.c("unlinkToDeath", new Object[0]);
        apVar.f12263l.asBinder().unlinkToDeath(apVar.f12261j, 0);
    }

    public final void a() {
        b(new aj(this));
    }

    public final void a(ag agVar) {
        b(new ai(this, agVar.b(), agVar));
    }

    public final T b() {
        return this.f12263l;
    }

    public final /* bridge */ /* synthetic */ void c() {
        this.f12254c.c("reportBinderDeath", new Object[0]);
        ak akVar = this.f12260i.get();
        if (akVar != null) {
            this.f12254c.c("calling onBinderDied", new Object[0]);
            akVar.a();
            return;
        }
        this.f12254c.c("%s : Binder has died.", this.f12255d);
        List<ag> list = this.f12256e;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            com.google.android.play.core.tasks.i<?> iVarB = list.get(i10).b();
            if (iVarB != null) {
                iVarB.b((Exception) new RemoteException(String.valueOf(this.f12255d).concat(" : Binder has died.")));
            }
        }
        this.f12256e.clear();
    }
}
