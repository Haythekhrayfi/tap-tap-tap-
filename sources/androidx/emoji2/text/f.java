package androidx.emoji2.text;

import android.content.Intent;
import com.applovin.exoplayer2.v;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.regex.Pattern;
import ue.z;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1795c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1798f;

    public /* synthetic */ f(EmojiCompatInitializer.b bVar, e.h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1796d = bVar;
        this.f1797e = hVar;
        this.f1798f = threadPoolExecutor;
    }

    public /* synthetic */ f(com.applovin.exoplayer2.b.g.a aVar, v vVar, com.applovin.exoplayer2.c.h hVar) {
        this.f1796d = aVar;
        this.f1797e = vVar;
        this.f1798f = hVar;
    }

    public /* synthetic */ f(com.applovin.exoplayer2.d.g.a aVar, com.applovin.exoplayer2.d.g gVar, Exception exc) {
        this.f1796d = aVar;
        this.f1797e = gVar;
        this.f1798f = exc;
    }

    public /* synthetic */ f(com.applovin.exoplayer2.h.q.a aVar, com.applovin.exoplayer2.h.q qVar, com.applovin.exoplayer2.h.m mVar) {
        this.f1796d = aVar;
        this.f1797e = qVar;
        this.f1798f = mVar;
    }

    public /* synthetic */ f(com.applovin.exoplayer2.m.n.a aVar, v vVar, com.applovin.exoplayer2.c.h hVar) {
        this.f1796d = aVar;
        this.f1797e = vVar;
        this.f1798f = hVar;
    }

    public /* synthetic */ f(BiConsumer biConsumer, String str, com.google.firebase.remoteconfig.internal.b bVar) {
        this.f1796d = biConsumer;
        this.f1797e = str;
        this.f1798f = bVar;
    }

    public /* synthetic */ f(com.yandex.mobile.ads.exo.drm.f.a aVar, com.yandex.mobile.ads.exo.drm.f fVar, Exception exc) {
        this.f1796d = aVar;
        this.f1797e = fVar;
        this.f1798f = exc;
    }

    public /* synthetic */ f(d6.f fVar, Intent intent, TaskCompletionSource taskCompletionSource) {
        this.f1796d = fVar;
        this.f1797e = intent;
        this.f1798f = taskCompletionSource;
    }

    public /* synthetic */ f(ue.g.b.a aVar, ue.d dVar, Throwable th) {
        this.f1796d = aVar;
        this.f1797e = dVar;
        this.f1798f = th;
    }

    public /* synthetic */ f(ue.g.b.a aVar, ue.d dVar, z zVar) {
        this.f1796d = aVar;
        this.f1797e = dVar;
        this.f1798f = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1795c) {
            case 0:
                EmojiCompatInitializer.b bVar = (EmojiCompatInitializer.b) this.f1796d;
                e.h hVar = (e.h) this.f1797e;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1798f;
                Objects.requireNonNull(bVar);
                try {
                    k kVarA = c.a(bVar.f1768a);
                    if (kVarA == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    k.b bVar2 = (k.b) kVarA.f1789a;
                    synchronized (bVar2.f1822d) {
                        bVar2.f1824f = threadPoolExecutor;
                        break;
                    }
                    kVarA.f1789a.a(new g(bVar, hVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    hVar.a(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                ((com.applovin.exoplayer2.b.g.a) this.f1796d).b((v) this.f1797e, (com.applovin.exoplayer2.c.h) this.f1798f);
                return;
            case 2:
                ((com.applovin.exoplayer2.d.g.a) this.f1796d).a((com.applovin.exoplayer2.d.g) this.f1797e, (Exception) this.f1798f);
                return;
            case 3:
                ((com.applovin.exoplayer2.h.q.a) this.f1796d).a((com.applovin.exoplayer2.h.q) this.f1797e, (com.applovin.exoplayer2.h.m) this.f1798f);
                return;
            case 4:
                ((com.applovin.exoplayer2.m.n.a) this.f1796d).b((v) this.f1797e, (com.applovin.exoplayer2.c.h) this.f1798f);
                return;
            case 5:
                d6.f fVar = (d6.f) this.f1796d;
                Intent intent = (Intent) this.f1797e;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f1798f;
                int i10 = d6.f.f28688h;
                Objects.requireNonNull(fVar);
                try {
                    fVar.c(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            case 6:
                BiConsumer biConsumer = (BiConsumer) this.f1796d;
                String str = (String) this.f1797e;
                com.google.firebase.remoteconfig.internal.b bVar3 = (com.google.firebase.remoteconfig.internal.b) this.f1798f;
                Pattern pattern = i6.d.f31282e;
                biConsumer.accept(str, bVar3);
                return;
            case 7:
                ((com.yandex.mobile.ads.exo.drm.f.a) this.f1796d).a((com.yandex.mobile.ads.exo.drm.f) this.f1797e, (Exception) this.f1798f);
                return;
            case 8:
                ue.g.b.a aVar = (ue.g.b.a) this.f1796d;
                ((ue.d) this.f1797e).b(aVar.f36410b, (Throwable) this.f1798f);
                return;
            default:
                ue.g.b.a aVar2 = (ue.g.b.a) this.f1796d;
                ue.d dVar = (ue.d) this.f1797e;
                z zVar = (z) this.f1798f;
                boolean zIsCanceled = aVar2.f36410b.f36408d.isCanceled();
                ue.g.b bVar4 = aVar2.f36410b;
                if (zIsCanceled) {
                    dVar.b(bVar4, new IOException("Canceled"));
                    return;
                } else {
                    dVar.a(bVar4, zVar);
                    return;
                }
        }
    }
}
