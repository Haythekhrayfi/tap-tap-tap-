package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class g extends e.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e.h f1799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f1800b;

    public g(EmojiCompatInitializer.b bVar, e.h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1799a = hVar;
        this.f1800b = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.e.h
    public void a(Throwable th) {
        try {
            this.f1799a.a(th);
        } finally {
            this.f1800b.shutdown();
        }
    }

    @Override // androidx.emoji2.text.e.h
    public void b(n nVar) {
        try {
            this.f1799a.b(nVar);
        } finally {
            this.f1800b.shutdown();
        }
    }
}
