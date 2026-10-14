package d6;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ j f28715d = new j(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ j f28716e = new j(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ j f28717f = new j(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28718c;

    public /* synthetic */ j(int i10) {
        this.f28718c = i10;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f28718c) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
        }
    }
}
