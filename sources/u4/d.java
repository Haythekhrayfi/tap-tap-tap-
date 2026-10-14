package u4;

import a5.g;
import a5.h;
import a5.j;
import a5.q;
import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l0.k;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f36008j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Executor f36009k = new ExecutorC0424d(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Map<String, d> f36010l = new q.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f36011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f36013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f36014d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q<c6.a> f36017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x5.b<v5.d> f36018h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f36015e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f36016f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<b> f36019i = new CopyOnWriteArrayList();

    @KeepForSdk
    public interface b {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z10);
    }

    @TargetApi(14)
    public static class c implements BackgroundDetector.BackgroundStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static AtomicReference<c> f36020a = new AtomicReference<>();

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z10) {
            Object obj = d.f36008j;
            synchronized (d.f36008j) {
                for (d dVar : new ArrayList(((q.a) d.f36010l).values())) {
                    if (dVar.f36015e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator<b> it = dVar.f36019i.iterator();
                        while (it.hasNext()) {
                            it.next().onBackgroundStateChanged(z10);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: u4.d$d, reason: collision with other inner class name */
    public static class ExecutorC0424d implements Executor {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Handler f36021c = new Handler(Looper.getMainLooper());

        public ExecutorC0424d(a aVar) {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f36021c.post(runnable);
        }
    }

    @TargetApi(24)
    public static class e extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static AtomicReference<e> f36022b = new AtomicReference<>();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f36023a;

        public e(Context context) {
            this.f36023a = context;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object obj = d.f36008j;
            synchronized (d.f36008j) {
                Iterator it = ((q.a) d.f36010l).values().iterator();
                while (it.hasNext()) {
                    ((d) it.next()).d();
                }
            }
            this.f36023a.unregisterReceiver(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007b  */
    /* JADX WARN: Code duplicated, block: B:16:0x0085  */
    /* JADX WARN: Code duplicated, block: B:19:0x0098  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c6 A[LOOP:0: B:25:0x00c0->B:27:0x00c6, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    public d(Context context, String str, f fVar) {
        Bundle bundle;
        ?? arrayList;
        Iterator it;
        b bVar;
        String str2;
        new CopyOnWriteArrayList();
        this.f36011a = (Context) Preconditions.checkNotNull(context);
        this.f36012b = Preconditions.checkNotEmpty(str);
        this.f36013c = (f) Preconditions.checkNotNull(fVar);
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    str2 = ComponentDiscoveryService.class + " has no service info.";
                } else {
                    bundle = serviceInfo.metaData;
                }
                if (bundle == null) {
                    Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                    arrayList = Collections.emptyList();
                } else {
                    arrayList = new ArrayList();
                    for (String str3 : bundle.keySet()) {
                        if (!"com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str3)) && str3.startsWith("com.google.firebase.components:")) {
                            arrayList.add(str3.substring(31));
                        }
                    }
                }
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new a5.e((String) it.next()));
                }
                Trace.endSection();
                Trace.beginSection("Runtime");
                Executor executor = f36009k;
                int i10 = j.f102h;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                g gVar = g.f95u1;
                arrayList3.addAll(arrayList2);
                arrayList3.add(new h(new FirebaseCommonRegistrar(), 1));
                arrayList4.add(a5.c.d(context, Context.class, new Class[0]));
                arrayList4.add(a5.c.d(this, d.class, new Class[0]));
                arrayList4.add(a5.c.d(fVar, f.class, new Class[0]));
                j jVar = new j(executor, arrayList3, arrayList4, new j6.a());
                this.f36014d = jVar;
                Trace.endSection();
                this.f36017g = new q<>(new u4.c(this, context));
                this.f36018h = jVar.b(v5.d.class);
                bVar = new b() { // from class: u4.b
                    @Override // u4.d.b
                    public final void onBackgroundStateChanged(boolean z10) {
                        d dVar = this.f36004a;
                        Objects.requireNonNull(dVar);
                        if (z10) {
                            return;
                        }
                        dVar.f36018h.get().c();
                    }
                };
                a();
                if (this.f36015e.get() && BackgroundDetector.getInstance().isInBackground()) {
                    bVar.onBackgroundStateChanged(true);
                }
                this.f36019i.add(bVar);
                Trace.endSection();
            }
            str2 = "Context has no PackageManager.";
            Log.w("ComponentDiscovery", str2);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        bundle = null;
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            while (r3.hasNext()) {
                if (!"com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str3))) {
                }
            }
        }
        it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new a5.e((String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        Executor executor2 = f36009k;
        int i11 = j.f102h;
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        g gVar2 = g.f95u1;
        arrayList5.addAll(arrayList2);
        arrayList5.add(new h(new FirebaseCommonRegistrar(), 1));
        arrayList6.add(a5.c.d(context, Context.class, new Class[0]));
        arrayList6.add(a5.c.d(this, d.class, new Class[0]));
        arrayList6.add(a5.c.d(fVar, f.class, new Class[0]));
        j jVar2 = new j(executor2, arrayList5, arrayList6, new j6.a());
        this.f36014d = jVar2;
        Trace.endSection();
        this.f36017g = new q<>(new u4.c(this, context));
        this.f36018h = jVar2.b(v5.d.class);
        bVar = new b() { // from class: u4.b
            @Override // u4.d.b
            public final void onBackgroundStateChanged(boolean z10) {
                d dVar = this.f36004a;
                Objects.requireNonNull(dVar);
                if (z10) {
                    return;
                }
                dVar.f36018h.get().c();
            }
        };
        a();
        if (this.f36015e.get()) {
            bVar.onBackgroundStateChanged(true);
        }
        this.f36019i.add(bVar);
        Trace.endSection();
    }

    public static d b() {
        d dVar;
        synchronized (f36008j) {
            dVar = (d) ((q.h) f36010l).get("[DEFAULT]");
            if (dVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return dVar;
    }

    public static d e(Context context) {
        synchronized (f36008j) {
            if (((q.h) f36010l).e("[DEFAULT]") >= 0) {
                return b();
            }
            f fVarA = f.a(context);
            if (fVarA != null) {
                return f(context, fVarA);
            }
            Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
            return null;
        }
    }

    public static d f(Context context, f fVar) {
        d dVar;
        AtomicReference<c> atomicReference = c.f36020a;
        if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
            Application application = (Application) context.getApplicationContext();
            if (c.f36020a.get() == null) {
                c cVar = new c();
                if (c.f36020a.compareAndSet(null, cVar)) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(cVar);
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f36008j) {
            Object obj = f36010l;
            boolean z10 = true;
            if (((q.h) obj).e("[DEFAULT]") >= 0) {
                z10 = false;
            }
            Preconditions.checkState(z10, "FirebaseApp name [DEFAULT] already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            dVar = new d(context, "[DEFAULT]", fVar);
            ((q.h) obj).put("[DEFAULT]", dVar);
        }
        dVar.d();
        return dVar;
    }

    public final void a() {
        Preconditions.checkState(!this.f36016f.get(), "FirebaseApp was deleted");
    }

    @KeepForSdk
    public String c() {
        StringBuilder sb2 = new StringBuilder();
        a();
        sb2.append(Base64Utils.encodeUrlSafeNoPadding(this.f36012b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        a();
        sb2.append(Base64Utils.encodeUrlSafeNoPadding(this.f36013c.f36025b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void d() {
        HashMap map;
        if (!k.a(this.f36011a)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(this.f36012b);
            Log.i("FirebaseApp", sb2.toString());
            Context context = this.f36011a;
            if (e.f36022b.get() == null) {
                e eVar = new e(context);
                if (e.f36022b.compareAndSet(null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb3.append(this.f36012b);
        Log.i("FirebaseApp", sb3.toString());
        j jVar = this.f36014d;
        boolean zH = h();
        if (jVar.f108f.compareAndSet(null, Boolean.valueOf(zH))) {
            synchronized (jVar) {
                map = new HashMap(jVar.f103a);
            }
            jVar.f(map, zH);
        }
        this.f36018h.get().c();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        String str = this.f36012b;
        d dVar = (d) obj;
        dVar.a();
        return str.equals(dVar.f36012b);
    }

    @KeepForSdk
    public boolean g() {
        boolean z10;
        a();
        c6.a aVar = this.f36017g.get();
        synchronized (aVar) {
            z10 = aVar.f3610d;
        }
        return z10;
    }

    @KeepForSdk
    public boolean h() {
        a();
        return "[DEFAULT]".equals(this.f36012b);
    }

    public int hashCode() {
        return this.f36012b.hashCode();
    }

    public String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("name", this.f36012b).add("options", this.f36013c).toString();
    }
}
