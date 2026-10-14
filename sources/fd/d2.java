package fd;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class d2 extends CancellationException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient j1 f29562c;

    public d2(String str) {
        this(str, null);
    }

    public d2(String str, j1 j1Var) {
        super(str);
        this.f29562c = j1Var;
    }
}
