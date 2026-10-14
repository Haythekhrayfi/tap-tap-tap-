package i6;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.yandex.mobile.ads.impl.h71;
import com.yandex.mobile.ads.impl.po;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements SuccessContinuation, po.g.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f31274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f31275e;

    public /* synthetic */ a(com.google.firebase.remoteconfig.internal.a aVar, boolean z10, com.google.firebase.remoteconfig.internal.b bVar) {
        this.f31273c = aVar;
        this.f31274d = z10;
        this.f31275e = bVar;
    }

    public /* synthetic */ a(po poVar, po.c cVar, boolean z10) {
        this.f31273c = poVar;
        this.f31275e = cVar;
        this.f31274d = z10;
    }

    @Override // com.yandex.mobile.ads.impl.po.g.a
    public List a(int i10, h71 h71Var, int[] iArr) {
        return ((po) this.f31273c).a((po.c) this.f31275e, this.f31274d, i10, h71Var, iArr);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        com.google.firebase.remoteconfig.internal.a aVar = (com.google.firebase.remoteconfig.internal.a) this.f31273c;
        boolean z10 = this.f31274d;
        com.google.firebase.remoteconfig.internal.b bVar = (com.google.firebase.remoteconfig.internal.b) this.f31275e;
        Objects.requireNonNull(aVar);
        if (z10) {
            synchronized (aVar) {
                aVar.f12684c = Tasks.forResult(bVar);
            }
        }
        return Tasks.forResult(bVar);
    }
}
