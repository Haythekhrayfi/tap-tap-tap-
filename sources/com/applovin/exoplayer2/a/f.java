package com.applovin.exoplayer2.a;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import com.applovin.exoplayer2.h.ad;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.tasks.OnCompleteListener;
import com.google.android.play.core.tasks.Task;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;
import f5.b0;
import f5.q0;
import fd.j0;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements com.applovin.exoplayer2.l.p.a, com.applovin.impl.mediation.debugger.ui.d.d.a, SynchronizationGuard.CriticalSection, TransportScheduleCallback, ConsentInformation.OnConsentInfoUpdateFailureListener, OnCompleteListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3949c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3952f;

    public /* synthetic */ f(b.a aVar, ad adVar, com.applovin.exoplayer2.j.h hVar) {
        this.f3950d = aVar;
        this.f3951e = adVar;
        this.f3952f = hVar;
    }

    public /* synthetic */ f(com.applovin.impl.mediation.debugger.ui.a.c cVar, com.applovin.impl.sdk.o oVar, com.applovin.impl.mediation.debugger.b.a.a aVar) {
        this.f3950d = cVar;
        this.f3951e = oVar;
        this.f3952f = aVar;
    }

    public /* synthetic */ f(com.applovin.impl.mediation.debugger.ui.a.d dVar, List list, com.applovin.impl.sdk.o oVar) {
        this.f3950d = dVar;
        this.f3951e = list;
        this.f3952f = oVar;
    }

    public /* synthetic */ f(DefaultScheduler defaultScheduler, TransportContext transportContext, EventInternal eventInternal) {
        this.f3950d = defaultScheduler;
        this.f3951e = transportContext;
        this.f3952f = eventInternal;
    }

    public /* synthetic */ f(ReviewManager reviewManager, Activity activity, com.zipoapps.premiumhelper.ui.rate.c.a aVar) {
        this.f3950d = reviewManager;
        this.f3951e = activity;
        this.f3952f = aVar;
    }

    public /* synthetic */ f(com.zipoapps.ads.c.e eVar, com.zipoapps.ads.c cVar, uc.a aVar) {
        this.f3950d = eVar;
        this.f3951e = cVar;
        this.f3952f = aVar;
    }

    public /* synthetic */ f(l5.b bVar, TaskCompletionSource taskCompletionSource, b0 b0Var) {
        this.f3950d = bVar;
        this.f3951e = taskCompletionSource;
        this.f3952f = b0Var;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        return ((DefaultScheduler) this.f3950d).lambda$schedule$0((TransportContext) this.f3951e, (EventInternal) this.f3952f);
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public void invoke(Object obj) {
        ((b) obj).a((b.a) this.f3950d, (ad) this.f3951e, (com.applovin.exoplayer2.j.h) this.f3952f);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
    public void onClick(com.applovin.impl.mediation.debugger.ui.d.a aVar, com.applovin.impl.mediation.debugger.ui.d.c cVar) {
        switch (this.f3949c) {
            case 1:
                ((com.applovin.impl.mediation.debugger.ui.a.c) this.f3950d).a((com.applovin.impl.sdk.o) this.f3951e, (com.applovin.impl.mediation.debugger.b.a.a) this.f3952f, aVar, cVar);
                break;
            default:
                ((com.applovin.impl.mediation.debugger.ui.a.d) this.f3950d).a((List) this.f3951e, (com.applovin.impl.sdk.o) this.f3952f, aVar, cVar);
                break;
        }
    }

    @Override // com.google.android.play.core.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ReviewManager reviewManager = (ReviewManager) this.f3950d;
        Activity activity = (Activity) this.f3951e;
        com.zipoapps.premiumhelper.ui.rate.c.a aVar = (com.zipoapps.premiumhelper.ui.rate.c.a) this.f3952f;
        KProperty<Object>[] kPropertyArr = com.zipoapps.premiumhelper.ui.rate.c.f28360d;
        j0.i(reviewManager, "$manager");
        j0.i(activity, "$activity");
        j0.i(task, "response");
        if (task.isSuccessful()) {
            ma.h.f33410y.a().f33419h.r(com.zipoapps.premiumhelper.a.b.IN_APP_REVIEW);
            Object result = task.getResult();
            j0.h(result, "response.result");
            ReviewInfo reviewInfo = (ReviewInfo) result;
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                Task<Void> taskLaunchReviewFlow = reviewManager.launchReviewFlow(activity, reviewInfo);
                j0.h(taskLaunchReviewFlow, "manager.launchReviewFlow(activity, reviewInfo)");
                taskLaunchReviewFlow.addOnCompleteListener(new m(jCurrentTimeMillis, aVar));
                return;
            } catch (ActivityNotFoundException e10) {
                xe.a.f37601c.c(e10);
                if (aVar == null) {
                    return;
                }
            }
        } else if (aVar == null) {
            return;
        }
        aVar.a(com.zipoapps.premiumhelper.ui.rate.c.EnumC0239c.NONE, false);
    }

    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
    public void onConsentInfoUpdateFailure(FormError formError) {
        com.zipoapps.ads.c.e eVar = (com.zipoapps.ads.c.e) this.f3950d;
        com.zipoapps.ads.c cVar = (com.zipoapps.ads.c) this.f3951e;
        uc.a aVar = (uc.a) this.f3952f;
        xe.a.c cVarB = xe.a.b(com.zipoapps.ads.c.f28151h);
        StringBuilder sbA = defpackage.a.a("Consent info request error: ");
        sbA.append(formError.getErrorCode());
        sbA.append(" -  ");
        sbA.append(formError.getMessage());
        cVarB.b(sbA.toString(), new Object[0]);
        eVar.f28163a = new com.zipoapps.ads.c.b(formError.getMessage(), formError);
        cVar.f(eVar);
        cVar.f28157f = false;
        cVar.d();
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.google.android.datatransport.TransportScheduleCallback
    public void onSchedule(Exception exc) throws Throwable {
        l5.b bVar = (l5.b) this.f3950d;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f3951e;
        b0 b0Var = (b0) this.f3952f;
        Objects.requireNonNull(bVar);
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        boolean z10 = true;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new androidx.appcompat.app.s(bVar, countDownLatch)).start();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ExecutorService executorService = q0.f29336a;
        boolean z11 = false;
        try {
            long nanos = timeUnit.toNanos(2L);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    try {
                        countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                        break;
                    } catch (Throwable th) {
                        th = th;
                        if (z10) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    nanos = jNanoTime - System.nanoTime();
                    z11 = true;
                }
            }
            if (z11) {
                Thread.currentThread().interrupt();
            }
            taskCompletionSource.trySetResult(b0Var);
        } catch (Throwable th2) {
            th = th2;
            z10 = z11;
        }
    }
}
