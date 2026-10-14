package d6;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28698a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28700c;

    public /* synthetic */ g(Context context, Intent intent) {
        this.f28699b = context;
        this.f28700c = intent;
    }

    public /* synthetic */ g(com.google.firebase.remoteconfig.internal.c cVar, Date date) {
        this.f28699b = cVar;
        this.f28700c = date;
    }

    public /* synthetic */ g(w wVar, String str) {
        this.f28699b = wVar;
        this.f28700c = str;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        switch (this.f28698a) {
            case 0:
                return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? k.a((Context) this.f28699b, (Intent) this.f28700c).continueWith(e.f28680e, new Continuation() { // from class: d6.h
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task2) {
                        Object obj = k.f28719c;
                        return 403;
                    }
                }) : task;
            case 1:
                w wVar = (w) this.f28699b;
                String str = (String) this.f28700c;
                synchronized (wVar) {
                    wVar.f28742b.remove(str);
                    break;
                }
                return task;
            default:
                com.google.firebase.remoteconfig.internal.c cVar = (com.google.firebase.remoteconfig.internal.c) this.f28699b;
                Date date = (Date) this.f28700c;
                int[] iArr = com.google.firebase.remoteconfig.internal.c.f12693k;
                Objects.requireNonNull(cVar);
                if (task.isSuccessful()) {
                    com.google.firebase.remoteconfig.internal.d dVar = cVar.f12701h;
                    synchronized (dVar.f12709b) {
                        dVar.f12708a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
                        break;
                    }
                } else {
                    Exception exception = task.getException();
                    if (exception != null) {
                        boolean z10 = exception instanceof h6.d;
                        com.google.firebase.remoteconfig.internal.d dVar2 = cVar.f12701h;
                        if (!z10) {
                            synchronized (dVar2.f12709b) {
                                dVar2.f12708a.edit().putInt("last_fetch_status", 1).apply();
                            }
                        } else {
                            synchronized (dVar2.f12709b) {
                                dVar2.f12708a.edit().putInt("last_fetch_status", 2).apply();
                            }
                        }
                    }
                    break;
                }
                return task;
        }
    }
}
