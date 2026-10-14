package d6;

import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e0 implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28686a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28687b;

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f28686a) {
            case 0:
                f0.a((Intent) this.f28687b);
                break;
            case 1:
                h0.a aVar = (h0.a) this.f28687b;
                int i10 = g0.f28701d;
                aVar.a();
                break;
            default:
                ((ScheduledFuture) this.f28687b).cancel(false);
                break;
        }
    }
}
