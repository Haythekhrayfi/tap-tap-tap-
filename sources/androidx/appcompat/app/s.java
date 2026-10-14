package androidx.appcompat.app;

import android.app.job.JobParameters;
import android.content.Intent;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.ForcedSender;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.service.ClickService;
import com.inscode.autoclicker.service.ManualSettingsLoadActivity;
import com.inscode.autoclicker.service.RecordSettingsLoadActivity;
import com.inscode.autoclicker.service.combine.CombinedRecordingsActivity;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.impl.t2;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.nativeads.SliderAd;
import fd.j0;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import y6.b3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f692c = 13;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f694e;

    public /* synthetic */ s(a5.r rVar, x5.b bVar) {
        this.f693d = rVar;
        this.f694e = bVar;
    }

    public /* synthetic */ s(a5.t tVar, x5.b bVar) {
        this.f693d = tVar;
        this.f694e = bVar;
    }

    public /* synthetic */ s(t.a aVar, Runnable runnable) {
        this.f693d = aVar;
        this.f694e = runnable;
    }

    public /* synthetic */ s(androidx.lifecycle.d dVar, Runnable runnable) {
        this.f693d = dVar;
        this.f694e = runnable;
    }

    public /* synthetic */ s(b1.b.c cVar, b1.l lVar) {
        this.f693d = cVar;
        this.f694e = lVar;
    }

    public /* synthetic */ s(com.applovin.exoplayer2.b.g.a aVar, String str) {
        this.f693d = aVar;
        this.f694e = str;
    }

    public /* synthetic */ s(com.applovin.exoplayer2.l.w wVar, com.applovin.exoplayer2.l.w.b bVar) {
        this.f693d = wVar;
        this.f694e = bVar;
    }

    public /* synthetic */ s(com.applovin.exoplayer2.m.n.a aVar, com.applovin.exoplayer2.m.o oVar) {
        this.f693d = aVar;
        this.f694e = oVar;
    }

    public /* synthetic */ s(com.applovin.exoplayer2.m.n.a aVar, Exception exc) {
        this.f693d = aVar;
        this.f694e = exc;
    }

    public /* synthetic */ s(com.applovin.exoplayer2.m.n.a aVar, String str) {
        this.f693d = aVar;
        this.f694e = str;
    }

    public /* synthetic */ s(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f693d = jobInfoSchedulerService;
        this.f694e = jobParameters;
    }

    public /* synthetic */ s(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        this.f693d = firebaseMessaging;
        this.f694e = taskCompletionSource;
    }

    public /* synthetic */ s(com.google.firebase.messaging.f fVar, TaskCompletionSource taskCompletionSource) {
        this.f693d = fVar;
        this.f694e = taskCompletionSource;
    }

    public /* synthetic */ s(ClickService clickService, ClickService.b bVar) {
        this.f693d = clickService;
        this.f694e = bVar;
    }

    public /* synthetic */ s(com.yandex.mobile.ads.banner.d dVar, AdRequestError adRequestError) {
        this.f693d = dVar;
        this.f694e = adRequestError;
    }

    public /* synthetic */ s(com.yandex.mobile.ads.banner.d dVar, ImpressionData impressionData) {
        this.f693d = dVar;
        this.f694e = impressionData;
    }

    public /* synthetic */ s(com.yandex.mobile.ads.banner.g gVar, AdRequest adRequest) {
        this.f693d = gVar;
        this.f694e = adRequest;
    }

    public /* synthetic */ s(t2 t2Var, com.yandex.mobile.ads.nativeads.t tVar) {
        this.f693d = t2Var;
        this.f694e = tVar;
    }

    public /* synthetic */ s(InterstitialAd interstitialAd, AdRequest adRequest) {
        this.f693d = interstitialAd;
        this.f694e = adRequest;
    }

    public /* synthetic */ s(com.yandex.mobile.ads.nativeads.t tVar, SliderAd sliderAd) {
        this.f693d = tVar;
        this.f694e = sliderAd;
    }

    public /* synthetic */ s(com.yandex.mobile.ads.nativeads.t tVar, List list) {
        this.f693d = tVar;
        this.f694e = list;
    }

    public /* synthetic */ s(d6.l lVar, Intent intent) {
        this.f693d = lVar;
        this.f694e = intent;
    }

    public /* synthetic */ s(g0.f.e eVar, Typeface typeface) {
        this.f693d = eVar;
        this.f694e = typeface;
    }

    public /* synthetic */ s(String str, b1.l lVar) {
        this.f693d = str;
        this.f694e = lVar;
    }

    public /* synthetic */ s(Throwable th, ManualSettingsLoadActivity manualSettingsLoadActivity) {
        this.f693d = th;
        this.f694e = manualSettingsLoadActivity;
    }

    public /* synthetic */ s(Throwable th, RecordSettingsLoadActivity recordSettingsLoadActivity) {
        this.f693d = th;
        this.f694e = recordSettingsLoadActivity;
    }

    public /* synthetic */ s(Throwable th, CombinedRecordingsActivity combinedRecordingsActivity) {
        this.f693d = th;
        this.f694e = combinedRecordingsActivity;
    }

    public /* synthetic */ s(Map.Entry entry, u5.a aVar) {
        this.f693d = entry;
        this.f694e = aVar;
    }

    public /* synthetic */ s(l5.b bVar, CountDownLatch countDownLatch) {
        this.f693d = bVar;
        this.f694e = countDownLatch;
    }

    public /* synthetic */ s(y.z zVar, View[] viewArr) {
        this.f693d = zVar;
        this.f694e = viewArr;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        x5.a.InterfaceC0461a<T> interfaceC0461a;
        Set set;
        Object obj;
        String string;
        String str;
        String string2;
        String str2;
        String string3;
        String str3;
        switch (this.f692c) {
            case 0:
                t.a aVar = (t.a) this.f693d;
                Runnable runnable = (Runnable) this.f694e;
                Objects.requireNonNull(aVar);
                try {
                    runnable.run();
                    return;
                } finally {
                    aVar.a();
                }
            case 1:
                y.z zVar = (y.z) this.f693d;
                View[] viewArr = (View[]) this.f694e;
                if (zVar.f37949p != -1) {
                    for (View view : viewArr) {
                        view.setTag(zVar.f37949p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (zVar.f37950q != -1) {
                    for (View view2 : viewArr) {
                        view2.setTag(zVar.f37950q, null);
                    }
                    return;
                }
                return;
            case 2:
                ((g0.f.e) this.f693d).lambda$callbackSuccessAsync$0((Typeface) this.f694e);
                return;
            case 3:
                b1.b.c cVar = (b1.b.c) this.f693d;
                b1.l lVar = (b1.l) this.f694e;
                b1.b bVar = b1.b.f3231a;
                j0.i(cVar, "$policy");
                j0.i(lVar, "$violation");
                cVar.f3235b.a(lVar);
                return;
            case 4:
                String str4 = (String) this.f693d;
                b1.l lVar2 = (b1.l) this.f694e;
                b1.b bVar2 = b1.b.f3231a;
                j0.i(lVar2, "$violation");
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str4, lVar2);
                throw lVar2;
            case 5:
                androidx.lifecycle.d dVar = (androidx.lifecycle.d) this.f693d;
                Runnable runnable2 = (Runnable) this.f694e;
                j0.i(dVar, "this$0");
                j0.i(runnable2, "$runnable");
                dVar.c(runnable2);
                return;
            case 6:
                ((com.applovin.exoplayer2.b.g.a) this.f693d).b((String) this.f694e);
                return;
            case 7:
                ((com.applovin.exoplayer2.l.w) this.f693d).b((com.applovin.exoplayer2.l.w.b) this.f694e);
                return;
            case 8:
                ((com.applovin.exoplayer2.m.n.a) this.f693d).b((String) this.f694e);
                return;
            case 9:
                ((com.applovin.exoplayer2.m.n.a) this.f693d).b((Exception) this.f694e);
                return;
            case 10:
                ((com.applovin.exoplayer2.m.n.a) this.f693d).b((com.applovin.exoplayer2.m.o) this.f694e);
                return;
            case 11:
                ((JobInfoSchedulerService) this.f693d).lambda$onStartJob$0((JobParameters) this.f694e);
                return;
            case 12:
                a5.t tVar = (a5.t) this.f693d;
                x5.b<T> bVar3 = (x5.b) this.f694e;
                int i10 = a5.j.f102h;
                if (tVar.f130b != a5.t.f128d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (tVar) {
                    interfaceC0461a = tVar.f129a;
                    tVar.f129a = null;
                    tVar.f130b = bVar3;
                    break;
                }
                interfaceC0461a.b(bVar3);
                return;
            case 13:
                a5.r rVar = (a5.r) this.f693d;
                x5.b bVar4 = (x5.b) this.f694e;
                int i11 = a5.j.f102h;
                synchronized (rVar) {
                    if (rVar.f126b == null) {
                        set = rVar.f125a;
                        obj = bVar4;
                    } else {
                        set = rVar.f126b;
                        obj = bVar4.get();
                    }
                    set.add(obj);
                }
                return;
            case 14:
                ((u5.b) ((Map.Entry) this.f693d).getKey()).a((u5.a) this.f694e);
                return;
            case 15:
                l5.b bVar5 = (l5.b) this.f693d;
                CountDownLatch countDownLatch = (CountDownLatch) this.f694e;
                ForcedSender.sendBlocking(bVar5.f32221g, Priority.HIGHEST);
                countDownLatch.countDown();
                return;
            case 16:
                ((d6.l) this.f693d).a((Intent) this.f694e);
                return;
            case 17:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f693d;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f694e;
                com.google.firebase.messaging.g gVar = FirebaseMessaging.f12588o;
                Objects.requireNonNull(firebaseMessaging);
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            case 18:
                com.google.firebase.messaging.f fVar = (com.google.firebase.messaging.f) this.f693d;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f694e;
                Objects.requireNonNull(fVar);
                try {
                    taskCompletionSource2.setResult(fVar.a());
                    return;
                } catch (Exception e11) {
                    taskCompletionSource2.setException(e11);
                    return;
                }
            case 19:
                ClickService clickService = (ClickService) this.f693d;
                ClickService.b bVar6 = (ClickService.b) this.f694e;
                j0.i(clickService, "this$0");
                ClickService.a(clickService, bVar6);
                return;
            case 20:
                Throwable th = (Throwable) this.f693d;
                ManualSettingsLoadActivity manualSettingsLoadActivity = (ManualSettingsLoadActivity) this.f694e;
                j0.i(manualSettingsLoadActivity, "this$0");
                if (th instanceof b3) {
                    string = manualSettingsLoadActivity.getString(R.string.import_error_invalid_file);
                    str = "getString(R.string.import_error_invalid_file)";
                } else if (th instanceof com.google.gson.q) {
                    string = manualSettingsLoadActivity.getString(R.string.import_error_unsupported_file);
                    str = "getString(R.string.import_error_unsupported_file)";
                } else if (th instanceof y6.q) {
                    string = manualSettingsLoadActivity.getString(R.string.error_import_new_file);
                    str = "getString(R.string.error_import_new_file)";
                } else {
                    string = manualSettingsLoadActivity.getString(R.string.import_settings_error);
                    str = "getString(R.string.import_settings_error)";
                }
                j0.h(string, str);
                Toast.makeText(manualSettingsLoadActivity, string, 1).show();
                return;
            case 21:
                Throwable th2 = (Throwable) this.f693d;
                RecordSettingsLoadActivity recordSettingsLoadActivity = (RecordSettingsLoadActivity) this.f694e;
                j0.i(recordSettingsLoadActivity, "this$0");
                if (th2 instanceof b3) {
                    string2 = recordSettingsLoadActivity.getString(R.string.error_import_mode);
                    str2 = "getString(R.string.error_import_mode)";
                } else if (th2 instanceof com.google.gson.q) {
                    string2 = recordSettingsLoadActivity.getString(R.string.error_import_file);
                    str2 = "getString(R.string.error_import_file)";
                } else if (th2 instanceof y6.q) {
                    string2 = recordSettingsLoadActivity.getString(R.string.error_import_new_file);
                    str2 = "getString(R.string.error_import_new_file)";
                } else {
                    string2 = recordSettingsLoadActivity.getString(R.string.import_settings_error);
                    str2 = "getString(R.string.import_settings_error)";
                }
                j0.h(string2, str2);
                Toast.makeText(recordSettingsLoadActivity, string2, 1).show();
                return;
            case 22:
                Throwable th3 = (Throwable) this.f693d;
                CombinedRecordingsActivity combinedRecordingsActivity = (CombinedRecordingsActivity) this.f694e;
                j0.i(combinedRecordingsActivity, "this$0");
                if (th3 instanceof b3) {
                    string3 = combinedRecordingsActivity.getString(R.string.error_import_mode);
                    str3 = "getString(R.string.error_import_mode)";
                } else if (th3 instanceof com.google.gson.q) {
                    string3 = combinedRecordingsActivity.getString(R.string.error_import_file);
                    str3 = "getString(R.string.error_import_file)";
                } else if (th3 instanceof y6.q) {
                    string3 = combinedRecordingsActivity.getString(R.string.error_import_new_file);
                    str3 = "getString(R.string.error_import_new_file)";
                } else {
                    string3 = combinedRecordingsActivity.getString(R.string.import_settings_error);
                    str3 = "getString(R.string.import_settings_error)";
                }
                j0.h(string3, str3);
                Toast.makeText(combinedRecordingsActivity, string3, 1).show();
                return;
            case 23:
                ((com.yandex.mobile.ads.banner.d) this.f693d).a((ImpressionData) this.f694e);
                return;
            case 24:
                ((com.yandex.mobile.ads.banner.d) this.f693d).a((AdRequestError) this.f694e);
                return;
            case 25:
                ((com.yandex.mobile.ads.banner.g) this.f693d).a((AdRequest) this.f694e);
                return;
            case 26:
                ((InterstitialAd) this.f693d).a((AdRequest) this.f694e);
                return;
            case 27:
                com.yandex.mobile.ads.nativeads.t.a((t2) this.f693d, (com.yandex.mobile.ads.nativeads.t) this.f694e);
                return;
            case 28:
                com.yandex.mobile.ads.nativeads.t.a((com.yandex.mobile.ads.nativeads.t) this.f693d, (List) this.f694e);
                return;
            default:
                com.yandex.mobile.ads.nativeads.t.a((com.yandex.mobile.ads.nativeads.t) this.f693d, (SliderAd) this.f694e);
                return;
        }
    }
}
