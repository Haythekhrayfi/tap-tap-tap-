package z6;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Callable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f45032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r6.d f45033d;

    public /* synthetic */ a1(r6.d dVar, int i10) {
        this.f45032c = i10;
        if (i10 != 1) {
        }
        this.f45033d = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f45032c) {
            case 0:
                r6.d dVar = this.f45033d;
                fd.j0.i(dVar, "$actionSet");
                return dVar;
            case 1:
                r6.d dVar2 = this.f45033d;
                fd.j0.i(dVar2, "$actionSet");
                return dVar2;
            case 2:
                r6.d dVar3 = this.f45033d;
                fd.j0.i(dVar3, "$actionSet");
                return dVar3;
            default:
                r6.d dVar4 = this.f45033d;
                fd.j0.i(dVar4, "$actionSet");
                return dVar4;
        }
    }
}
