package qa;

import android.text.format.DateUtils;
import com.applovin.exoplayer2.b.z;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import fd.i;
import fd.j0;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class c<TResult, TContinuationResult> implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f34867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f34868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f34869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i<Boolean> f34870d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(a aVar, long j10, boolean z10, i<? super Boolean> iVar) {
        this.f34867a = aVar;
        this.f34868b = j10;
        this.f34869c = z10;
        this.f34870d = iVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        j0.i(task, "it");
        com.google.firebase.remoteconfig.a aVar = this.f34867a.f34852a;
        if (aVar == null) {
            j0.r("firebaseRemoteConfig");
            throw null;
        }
        final com.google.firebase.remoteconfig.internal.c cVar = aVar.f12668f;
        final long j10 = cVar.f12701h.f12708a.getLong("minimum_fetch_interval_in_seconds", com.google.firebase.remoteconfig.internal.c.f12692j);
        return cVar.f12699f.b().continueWithTask(cVar.f12696c, new Continuation() { // from class: i6.b
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Task taskContinueWithTask;
                final com.google.firebase.remoteconfig.internal.c cVar2 = cVar;
                long j11 = j10;
                Objects.requireNonNull(cVar2);
                final Date date = new Date(cVar2.f12697d.currentTimeMillis());
                if (task2.isSuccessful()) {
                    com.google.firebase.remoteconfig.internal.d dVar = cVar2.f12701h;
                    Objects.requireNonNull(dVar);
                    Date date2 = new Date(dVar.f12708a.getLong("last_fetch_time_in_millis", -1L));
                    if (date2.equals(com.google.firebase.remoteconfig.internal.d.f12706d) ? false : date.before(new Date(TimeUnit.SECONDS.toMillis(j11) + date2.getTime()))) {
                        return Tasks.forResult(new com.google.firebase.remoteconfig.internal.c.a(date, 2, null, null));
                    }
                }
                Date date3 = cVar2.f12701h.a().f12712b;
                Date date4 = date.before(date3) ? date3 : null;
                if (date4 != null) {
                    taskContinueWithTask = Tasks.forException(new h6.d(String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date4.getTime() - date.getTime()))), date4.getTime()));
                } else {
                    final Task<String> id2 = cVar2.f12694a.getId();
                    final Task<com.google.firebase.installations.e> taskA = cVar2.f12694a.a(false);
                    taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{id2, taskA}).continueWithTask(cVar2.f12696c, new Continuation() { // from class: i6.c
                        @Override // com.google.android.gms.tasks.Continuation
                        public final Object then(Task task3) {
                            h6.b bVar;
                            com.google.firebase.remoteconfig.internal.c cVar3 = cVar2;
                            Task task4 = id2;
                            Task task5 = taskA;
                            Date date5 = date;
                            Objects.requireNonNull(cVar3);
                            if (!task4.isSuccessful()) {
                                bVar = new h6.b("Firebase Installations failed to get installation ID for fetch.", task4.getException());
                            } else {
                                if (task5.isSuccessful()) {
                                    try {
                                        com.google.firebase.remoteconfig.internal.c.a aVarA = cVar3.a((String) task4.getResult(), ((com.google.firebase.installations.e) task5.getResult()).a(), date5);
                                        return aVarA.f12703a != 0 ? Tasks.forResult(aVarA) : cVar3.f12699f.c(aVarA.f12704b).onSuccessTask(cVar3.f12696c, new d0.a(aVarA));
                                    } catch (h6.c e10) {
                                        return Tasks.forException(e10);
                                    }
                                }
                                bVar = new h6.b("Firebase Installations failed to get installation auth token for fetch.", task5.getException());
                            }
                            return Tasks.forException(bVar);
                        }
                    });
                }
                return taskContinueWithTask.continueWithTask(cVar2.f12696c, new d6.g(cVar2, date));
            }
        }).onSuccessTask(z.B).onSuccessTask(aVar.f12664b, new d0.a(aVar)).addOnCompleteListener(new b(this.f34867a, this.f34868b, this.f34869c, this.f34870d));
    }
}
