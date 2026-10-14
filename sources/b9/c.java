package b9;

import fd.j0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc.a f3359d;

    public /* synthetic */ c(uc.a aVar, int i10) {
        this.f3358c = i10;
        this.f3359d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3358c) {
            case 0:
                uc.a aVar = this.f3359d;
                j0.i(aVar, "$tmp0");
                aVar.invoke();
                break;
            default:
                uc.a aVar2 = this.f3359d;
                k9.k kVar = k9.k.f31954a;
                j0.i(aVar2, "$tmp0");
                aVar2.invoke();
                break;
        }
    }
}
