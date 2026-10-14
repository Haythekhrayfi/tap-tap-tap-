package d0;

import android.accessibilityservice.GestureDescription;
import android.view.Display;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.inscode.autoclicker.service.ClickService;
import com.yandex.mobile.ads.impl.bx0;
import com.yandex.mobile.ads.impl.sg;
import com.zipoapps.permissions.MultiplePermissionsRequester;
import com.zipoapps.permissions.PermissionRequester;
import fd.j0;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements com.applovin.exoplayer2.e.a.d, com.applovin.exoplayer2.h.s.a, com.applovin.exoplayer2.c.i.a, com.applovin.exoplayer2.m.m.b.a, SynchronizationGuard.CriticalSection, x5.a.InterfaceC0461a, SuccessContinuation, pb.c, x8.n, bx0.b, sg.a, androidx.activity.result.a, EventListener.Factory {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28485c = 10;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28486d;

    public /* synthetic */ a(com.applovin.exoplayer2.e.l lVar) {
        this.f28486d = lVar;
    }

    public /* synthetic */ a(com.applovin.exoplayer2.e.p pVar) {
        this.f28486d = pVar;
    }

    public /* synthetic */ a(com.applovin.exoplayer2.i.c cVar) {
        this.f28486d = cVar;
    }

    public /* synthetic */ a(com.applovin.exoplayer2.i.d dVar) {
        this.f28486d = dVar;
    }

    public /* synthetic */ a(com.applovin.exoplayer2.m.m mVar) {
        this.f28486d = mVar;
    }

    public /* synthetic */ a(Uploader uploader) {
        this.f28486d = uploader;
    }

    public /* synthetic */ a(WorkInitializer workInitializer) {
        this.f28486d = workInitializer;
    }

    public /* synthetic */ a(ClientHealthMetricsStore clientHealthMetricsStore) {
        this.f28486d = clientHealthMetricsStore;
    }

    public /* synthetic */ a(EventStore eventStore) {
        this.f28486d = eventStore;
    }

    public /* synthetic */ a(ClickService clickService) {
        this.f28486d = clickService;
    }

    public /* synthetic */ a(com.yandex.mobile.ads.exo.offline.c cVar) {
        this.f28486d = cVar;
    }

    public /* synthetic */ a(com.yandex.mobile.ads.exo.offline.e eVar) {
        this.f28486d = eVar;
    }

    public /* synthetic */ a(String str) {
        this.f28486d = str;
    }

    public /* synthetic */ a(EventListener eventListener) {
        this.f28486d = eventListener;
    }

    public /* synthetic */ a(u7.c cVar) {
        this.f28486d = cVar;
    }

    @Override // com.yandex.mobile.ads.impl.sg.a
    public void a(long j10, long j11, long j12) {
        ((com.yandex.mobile.ads.exo.offline.e) this.f28486d).a(j10, j11, j12);
    }

    @Override // com.yandex.mobile.ads.impl.bx0.b
    public void a(bx0 bx0Var, int i10) {
        ((com.yandex.mobile.ads.exo.offline.c) this.f28486d).a(bx0Var, i10);
    }

    @Override // androidx.activity.result.a
    public void a(Object obj) {
        boolean z10;
        switch (this.f28485c) {
            case 18:
                MultiplePermissionsRequester multiplePermissionsRequester = (MultiplePermissionsRequester) this.f28486d;
                Map map = (Map) obj;
                j0.i(multiplePermissionsRequester, "this$0");
                j0.h(map, "result");
                Collection collectionValues = map.values();
                if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                    z10 = true;
                } else {
                    Iterator it = collectionValues.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z10 = true;
                        } else if (!((Boolean) it.next()).booleanValue()) {
                            z10 = false;
                        }
                    }
                }
                if (!z10) {
                    AppCompatActivity appCompatActivity = multiplePermissionsRequester.f28233c;
                    String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                    j0.i(appCompatActivity, "activity");
                    j0.i(strArr, "permissions");
                    int length = strArr.length;
                    for (int i10 = 0; i10 < length && !androidx.core.app.a.c(appCompatActivity, strArr[i10]); i10++) {
                    }
                }
                multiplePermissionsRequester.f28234d = false;
                break;
            default:
                PermissionRequester permissionRequester = (PermissionRequester) this.f28486d;
                Boolean bool = (Boolean) obj;
                j0.i(permissionRequester, "this$0");
                j0.h(bool, "isGranted");
                if (!bool.booleanValue()) {
                    androidx.core.app.a.c(permissionRequester.f28233c, permissionRequester.f28238e);
                }
                permissionRequester.f28234d = false;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pb.c
    public Object apply(Object obj) {
        List<r6.d> listA;
        boolean zD;
        ClickService clickService = (ClickService) this.f28486d;
        ClickService.a aVar = ClickService.f13099n;
        j0.i(clickService, "this$0");
        j0.i(obj, "it");
        int i10 = 3;
        GestureDescription gestureDescription = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        try {
            if (obj instanceof r6.d) {
                return clickService.b(kc.k.a(obj), false);
            }
            if (obj instanceof u6.a) {
                listA = ((u6.a) obj).a();
                zD = ((u6.a) obj).d();
            } else {
                if (!(obj instanceof r6.j)) {
                    return new ClickService.b(gestureDescription, objArr5 == true ? 1 : 0, i10, objArr4 == true ? 1 : 0);
                }
                listA = kc.k.a(((r6.j) obj).f35182a);
                zD = ((r6.j) obj).f35183b;
            }
            return clickService.b(listA, zD);
        } catch (Exception e10) {
            xe.a.f37601c.b(b.a(e10, c.a("[ClickService] handleEvent exception: ", e10, ' ')), new Object[0]);
            return new ClickService.b(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0);
        }
    }

    @Override // x5.a.InterfaceC0461a
    public void b(x5.b bVar) {
        c5.b bVar2 = (c5.b) this.f28486d;
        Objects.requireNonNull(bVar2);
        c5.d.f3604c.b("Crashlytics native component now available.");
        bVar2.f3599b.set((c5.a) bVar.get());
    }

    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        return Util.m138asFactory$lambda8((EventListener) this.f28486d, call);
    }

    @Override // com.applovin.exoplayer2.h.s.a
    public com.applovin.exoplayer2.h.s createProgressiveMediaExtractor() {
        return com.applovin.exoplayer2.h.u.a.a((com.applovin.exoplayer2.e.l) this.f28486d);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        switch (this.f28485c) {
            case 6:
                return ((Uploader) this.f28486d).lambda$logAndUpdateState$6();
            case 7:
                return ((ClientHealthMetricsStore) this.f28486d).loadClientMetrics();
            case 8:
                return Integer.valueOf(((EventStore) this.f28486d).cleanUp());
            default:
                return ((WorkInitializer) this.f28486d).lambda$ensureContextsScheduled$0();
        }
    }

    @Override // x8.n
    public Object get(String str) {
        u7.c cVar = (u7.c) this.f28486d;
        j0.i(cVar, "this$0");
        j0.i(str, "variableName");
        w8.d dVarB = cVar.f36038b.b(str);
        if (dVarB == null) {
            return null;
        }
        return dVarB.b();
    }

    @Override // com.applovin.exoplayer2.m.m.b.a
    public void onDefaultDisplayChanged(Display display) {
        ((com.applovin.exoplayer2.m.m) this.f28486d).a(display);
    }

    @Override // com.applovin.exoplayer2.c.i.a
    public void releaseOutputBuffer(com.applovin.exoplayer2.c.i iVar) {
        switch (this.f28485c) {
            case 3:
                ((com.applovin.exoplayer2.i.c) this.f28486d).a((com.applovin.exoplayer2.i.k) iVar);
                break;
            default:
                ((com.applovin.exoplayer2.i.d) this.f28486d).a((com.applovin.exoplayer2.i.k) iVar);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        ArrayDeque<TaskCompletionSource<Void>> arrayDeque;
        switch (this.f28485c) {
            case 11:
                String str = (String) this.f28486d;
                com.google.firebase.messaging.i iVar = (com.google.firebase.messaging.i) obj;
                com.google.firebase.messaging.g gVar = FirebaseMessaging.f12588o;
                Objects.requireNonNull(iVar);
                d6.a0 a0Var = new d6.a0("S", str);
                d6.b0 b0Var = iVar.f12662h;
                synchronized (b0Var) {
                    b0Var.f28656b.a(a0Var.f28652c);
                }
                TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();
                synchronized (iVar.f12659e) {
                    String str2 = a0Var.f28652c;
                    if (iVar.f12659e.containsKey(str2)) {
                        arrayDeque = iVar.f12659e.get(str2);
                    } else {
                        ArrayDeque<TaskCompletionSource<Void>> arrayDeque2 = new ArrayDeque<>();
                        iVar.f12659e.put(str2, arrayDeque2);
                        arrayDeque = arrayDeque2;
                    }
                    arrayDeque.add(taskCompletionSource);
                    break;
                }
                Task<Void> task = taskCompletionSource.getTask();
                iVar.f();
                return task;
            case 12:
                final com.google.firebase.remoteconfig.a aVar = (com.google.firebase.remoteconfig.a) this.f28486d;
                final Task<com.google.firebase.remoteconfig.internal.b> taskB = aVar.f12665c.b();
                final Task<com.google.firebase.remoteconfig.internal.b> taskB2 = aVar.f12666d.b();
                return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskB, taskB2}).continueWithTask(aVar.f12664b, new Continuation() { // from class: h6.a
                    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
                    
                        if ((r1 == null || !r0.f12689c.equals(r1.f12689c)) == false) goto L19;
                     */
                    @Override // com.google.android.gms.tasks.Continuation
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object then(com.google.android.gms.tasks.Task r4) {
                        /*
                            r3 = this;
                            com.google.firebase.remoteconfig.a r4 = r1
                            com.google.android.gms.tasks.Task r0 = r2
                            com.google.android.gms.tasks.Task r1 = r3
                            java.util.Objects.requireNonNull(r4)
                            boolean r2 = r0.isSuccessful()
                            if (r2 == 0) goto L4d
                            java.lang.Object r2 = r0.getResult()
                            if (r2 != 0) goto L16
                            goto L4d
                        L16:
                            java.lang.Object r0 = r0.getResult()
                            com.google.firebase.remoteconfig.internal.b r0 = (com.google.firebase.remoteconfig.internal.b) r0
                            boolean r2 = r1.isSuccessful()
                            if (r2 == 0) goto L3b
                            java.lang.Object r1 = r1.getResult()
                            com.google.firebase.remoteconfig.internal.b r1 = (com.google.firebase.remoteconfig.internal.b) r1
                            if (r1 == 0) goto L37
                            java.util.Date r2 = r0.f12689c
                            java.util.Date r1 = r1.f12689c
                            boolean r1 = r2.equals(r1)
                            if (r1 != 0) goto L35
                            goto L37
                        L35:
                            r1 = 0
                            goto L38
                        L37:
                            r1 = 1
                        L38:
                            if (r1 != 0) goto L3b
                            goto L4d
                        L3b:
                            com.google.firebase.remoteconfig.internal.a r1 = r4.f12666d
                            com.google.android.gms.tasks.Task r0 = r1.c(r0)
                            java.util.concurrent.Executor r1 = r4.f12664b
                            f5.l0 r2 = new f5.l0
                            r2.<init>(r4)
                            com.google.android.gms.tasks.Task r4 = r0.continueWith(r1, r2)
                            goto L53
                        L4d:
                            java.lang.Boolean r4 = java.lang.Boolean.FALSE
                            com.google.android.gms.tasks.Task r4 = com.google.android.gms.tasks.Tasks.forResult(r4)
                        L53:
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: h6.a.then(com.google.android.gms.tasks.Task):java.lang.Object");
                    }
                });
            default:
                com.google.firebase.remoteconfig.internal.c.a aVar2 = (com.google.firebase.remoteconfig.internal.c.a) this.f28486d;
                int[] iArr = com.google.firebase.remoteconfig.internal.c.f12693k;
                return Tasks.forResult(aVar2);
        }
    }

    @Override // com.applovin.exoplayer2.e.a.d
    public long timeUsToTargetTime(long j10) {
        return ((com.applovin.exoplayer2.e.p) this.f28486d).a(j10);
    }
}
