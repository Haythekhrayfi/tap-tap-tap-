package r7;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q extends vc.k implements uc.a<Executor> {
    public q(Object obj) {
        super(0, obj, ic.a.class, "get", "get()Ljava/lang/Object;", 0);
    }

    @Override // uc.a
    public Executor invoke() {
        return (Executor) ((ic.a) this.receiver).get();
    }
}
