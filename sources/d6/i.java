package d6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.developer.filepicker.model.DialogConfigs;
import fd.j0;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import z6.i1;
import z6.n0;
import z6.x0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Callable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28712c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f28714e;

    public /* synthetic */ i(Context context, Intent intent) {
        this.f28713d = context;
        this.f28714e = intent;
    }

    public /* synthetic */ i(com.google.firebase.remoteconfig.a aVar, h6.f fVar) {
        this.f28713d = aVar;
        this.f28714e = fVar;
    }

    public /* synthetic */ i(com.google.firebase.remoteconfig.internal.a aVar, com.google.firebase.remoteconfig.internal.b bVar) {
        this.f28713d = aVar;
        this.f28714e = bVar;
    }

    public /* synthetic */ i(v6.a aVar, d7.p pVar) {
        this.f28713d = aVar;
        this.f28714e = pVar;
    }

    public /* synthetic */ i(vc.y yVar, t6.a aVar) {
        this.f28713d = yVar;
        this.f28714e = aVar;
    }

    public /* synthetic */ i(i1 i1Var, v6.a aVar) {
        this.f28713d = i1Var;
        this.f28714e = aVar;
    }

    public /* synthetic */ i(x0 x0Var, v6.a aVar) {
        this.f28713d = x0Var;
        this.f28714e = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ServiceInfo serviceInfo;
        String str;
        int i10;
        ComponentName componentNameStartService;
        String str2 = null;
        switch (this.f28712c) {
            case 0:
                Context context = (Context) this.f28713d;
                Intent intent = (Intent) this.f28714e;
                y yVarA = y.a();
                Objects.requireNonNull(yVarA);
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                yVarA.f28747d.offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (yVarA) {
                    String str3 = yVarA.f28744a;
                    if (str3 != null) {
                        str2 = str3;
                    } else {
                        ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                        if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                        } else if (!context.getPackageName().equals(serviceInfo.packageName) || (str = serviceInfo.name) == null) {
                            Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + DialogConfigs.DIRECTORY_SEPERATOR + serviceInfo.name);
                        } else {
                            str2 = str.startsWith(".") ? context.getPackageName() + serviceInfo.name : serviceInfo.name;
                            yVarA.f28744a = str2;
                        }
                    }
                }
                if (str2 != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + str2);
                    }
                    intent2.setClassName(context.getPackageName(), str2);
                }
                try {
                    if (yVarA.c(context)) {
                        componentNameStartService = f0.b(context, intent2);
                    } else {
                        componentNameStartService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i10 = 404;
                    } else {
                        i10 = -1;
                    }
                } catch (IllegalStateException e10) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e10);
                    i10 = 402;
                } catch (SecurityException e11) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
                    i10 = 401;
                }
                return Integer.valueOf(i10);
            case 1:
                com.google.firebase.remoteconfig.a aVar = (com.google.firebase.remoteconfig.a) this.f28713d;
                h6.f fVar = (h6.f) this.f28714e;
                com.google.firebase.remoteconfig.internal.d dVar = aVar.f12670h;
                synchronized (dVar.f12709b) {
                    dVar.f12708a.edit().putLong("fetch_timeout_in_seconds", fVar.f30930a).putLong("minimum_fetch_interval_in_seconds", fVar.f30931b).commit();
                    break;
                }
                return null;
            case 2:
                com.google.firebase.remoteconfig.internal.a aVar2 = (com.google.firebase.remoteconfig.internal.a) this.f28713d;
                com.google.firebase.remoteconfig.internal.b bVar = (com.google.firebase.remoteconfig.internal.b) this.f28714e;
                i6.e eVar = aVar2.f12683b;
                synchronized (eVar) {
                    FileOutputStream fileOutputStreamOpenFileOutput = eVar.f31289a.openFileOutput(eVar.f31290b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(bVar.toString().getBytes("UTF-8"));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Throwable th) {
                        fileOutputStreamOpenFileOutput.close();
                        throw th;
                    }
                }
                return null;
            case 3:
                x0 x0Var = (x0) this.f28713d;
                v6.a aVar3 = (v6.a) this.f28714e;
                j0.i(x0Var, "this$0");
                j0.i(aVar3, "$recordSettings");
                x0Var.f45144c.d(new n0(aVar3.getName()));
                List<r6.d> listB = aVar3.b();
                long jE = 0;
                for (r6.d dVar2 : listB) {
                    if (jE != 0) {
                        dVar2.g(dVar2.e() - jE);
                    }
                    jE = dVar2.e();
                }
                return listB;
            case 4:
                vc.y yVar = (vc.y) this.f28713d;
                t6.a aVar4 = (t6.a) this.f28714e;
                j0.i(yVar, "$combinationIteration");
                j0.i(aVar4, "$combineSettings");
                yVar.f37006c++;
                return lb.i.l(aVar4.d());
            case 5:
                i1 i1Var = (i1) this.f28713d;
                v6.a aVar5 = (v6.a) this.f28714e;
                j0.i(i1Var, "this$0");
                j0.i(aVar5, "$recordSettings");
                i1Var.f45063d.d(new n0(aVar5.getName()));
                Iterator<T> it = aVar5.b().iterator();
                if (it.hasNext()) {
                    ArrayList arrayList = new ArrayList();
                    Object next = it.next();
                    while (it.hasNext()) {
                        Object next2 = it.next();
                        r6.d dVar3 = (r6.d) next;
                        dVar3.g(((r6.d) next2).e() - (dVar3.c() + dVar3.e()));
                        arrayList.add(jc.w.f31842a);
                        next = next2;
                    }
                }
                Iterator<T> it2 = aVar5.b().iterator();
                while (it2.hasNext()) {
                    ((r6.d) it2.next()).i(aVar5.e());
                }
                return aVar5.b();
            default:
                v6.a aVar6 = (v6.a) this.f28713d;
                d7.p pVar = (d7.p) this.f28714e;
                j0.i(aVar6, "$settings");
                j0.i(pVar, "this$0");
                List<r6.d> listB2 = aVar6.b();
                Objects.requireNonNull((r6.c) kc.t.x(((r6.d) kc.t.x(listB2)).a()));
                Objects.requireNonNull((r6.c) kc.t.r(((r6.d) kc.t.r(listB2)).a()));
                Objects.requireNonNull(pVar.f28817b.f28802c);
                long jE2 = 0;
                for (r6.d dVar4 : listB2) {
                    if (jE2 != 0) {
                        dVar4.g(dVar4.e() - jE2);
                    }
                    jE2 = dVar4.e();
                }
                return listB2;
        }
    }
}
