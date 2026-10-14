package ad;

import fd.j0;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends zc.a {
    @Override // zc.c
    public int d(int i10, int i11) {
        return ThreadLocalRandom.current().nextInt(i10, i11);
    }

    @Override // zc.a
    public Random e() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        j0.h(threadLocalRandomCurrent, "current()");
        return threadLocalRandomCurrent;
    }
}
