package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z0 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Toolbar f1418d;

    public /* synthetic */ z0(Toolbar toolbar, int i10) {
        this.f1417c = i10;
        this.f1418d = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1417c) {
            case 0:
                this.f1418d.invalidateMenu();
                break;
            default:
                this.f1418d.collapseActionView();
                break;
        }
    }
}
