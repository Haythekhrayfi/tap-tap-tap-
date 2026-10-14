package ba;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import fd.j0;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<Object> f3448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.android.billingclient.api.e f3449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f3450c;

    public j(com.android.billingclient.api.e eVar, Handler handler) {
        j0.i(eVar, "billingClient");
        j0.i(handler, "mainHandler");
        this.f3449b = eVar;
        this.f3450c = handler;
        this.f3448a = new LinkedHashSet();
    }

    public /* synthetic */ j(com.android.billingclient.api.e eVar, Handler handler, int i10) {
        this(eVar, (i10 & 2) != 0 ? new Handler(Looper.getMainLooper()) : null);
    }

    public final void a(Object obj) {
        this.f3448a.add(obj);
    }

    public final void b(Object obj) {
        j0.i(obj, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f3448a.remove(obj);
        if (this.f3448a.size() == 0) {
            this.f3450c.post(new aa.h(this));
        }
    }
}
