package d6;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e f28679d = new e(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e f28680e = new e(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ e f28681f = new e(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ e f28682g = new e(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ e f28683h = new e(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ e f28684i = new e(5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28685c;

    public /* synthetic */ e(int i10) {
        this.f28685c = i10;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f28685c) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                runnable.run();
                break;
            case 4:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
