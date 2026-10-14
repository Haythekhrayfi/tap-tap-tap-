package qa;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.zipoapps.premiumhelper.performance.StartupPerformanceTracker;
import fd.i;
import fd.j0;
import h6.g;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.reflect.KProperty;
import ma.h;
import ta.d;

/* JADX INFO: loaded from: classes3.dex */
public final class b<TResult> implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f34863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f34864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f34865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i<Boolean> f34866d;

    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar, long j10, boolean z10, i<? super Boolean> iVar) {
        this.f34863a = aVar;
        this.f34864b = j10;
        this.f34865c = z10;
        this.f34866d = iVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<Boolean> task) {
        String message;
        j0.i(task, "fetch");
        a aVar = this.f34863a;
        KProperty<Object>[] kPropertyArr = a.f34851e;
        d dVarF = aVar.f();
        StringBuilder sbA = defpackage.a.a("RemoteConfig: Fetch success: ");
        sbA.append(task.isSuccessful());
        dVarF.g(sbA.toString(), new Object[0]);
        StartupPerformanceTracker startupPerformanceTrackerA = StartupPerformanceTracker.f28309b.a();
        if (task.isSuccessful()) {
            message = "success";
        } else {
            Exception exception = task.getException();
            if (exception == null || (message = exception.getMessage()) == null) {
                message = "Fail";
            }
        }
        StartupPerformanceTracker.StartupData startupData = startupPerformanceTrackerA.f28311a;
        if (startupData != null) {
            startupData.setRemoteConfigResult(message);
        }
        com.zipoapps.premiumhelper.a aVar2 = h.f33410y.a().f33419h;
        boolean zIsSuccessful = task.isSuccessful();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f34864b;
        Objects.requireNonNull(aVar2);
        Bundle[] bundleArr = new Bundle[1];
        jc.h[] hVarArr = new jc.h[3];
        hVarArr[0] = new jc.h("success", Boolean.valueOf(zIsSuccessful));
        hVarArr[1] = new jc.h("latency", Long.valueOf(jCurrentTimeMillis));
        Application application = aVar2.f28253a;
        j0.i(application, CoreConstants.CONTEXT_SCOPE_VALUE);
        Object systemService = application.getSystemService("connectivity");
        j0.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        hVarArr[2] = new jc.h("has_connection", Boolean.valueOf(activeNetworkInfo != null ? activeNetworkInfo.isConnected() : false));
        bundleArr[0] = androidx.activity.i.a(hVarArr);
        aVar2.t("RemoteGetConfig", bundleArr);
        if (this.f34865c && task.isSuccessful()) {
            com.google.firebase.remoteconfig.a aVar3 = this.f34863a.f34852a;
            if (aVar3 == null) {
                j0.r("firebaseRemoteConfig");
                throw null;
            }
            Set<Map.Entry> setEntrySet = ((HashMap) aVar3.a()).entrySet();
            a aVar4 = this.f34863a;
            for (Map.Entry entry : setEntrySet) {
                d dVarF2 = aVar4.f();
                StringBuilder sbA2 = defpackage.a.a("    RemoteConfig: ");
                sbA2.append((String) entry.getKey());
                sbA2.append(" = ");
                sbA2.append(((g) entry.getValue()).c());
                sbA2.append(" source: ");
                sbA2.append(((g) entry.getValue()).b());
                dVarF2.g(sbA2.toString(), new Object[0]);
            }
        }
        if (this.f34866d.a()) {
            i<Boolean> iVar = this.f34866d;
            jc.i.a aVar5 = jc.i.f31813c;
            iVar.resumeWith(Boolean.valueOf(task.isSuccessful()));
        }
        this.f34863a.f34855d = true;
        StartupPerformanceTracker.StartupData startupData2 = StartupPerformanceTracker.f28309b.a().f28311a;
        if (startupData2 == null) {
            return;
        }
        startupData2.setRemoteConfigEndTimestamp(System.currentTimeMillis());
    }
}
