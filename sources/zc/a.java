package zc;

import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends c {
    @Override // zc.c
    public int a(int i10) {
        return ((-i10) >> 31) & (e().nextInt() >>> (32 - i10));
    }

    @Override // zc.c
    public int b() {
        return e().nextInt();
    }

    @Override // zc.c
    public int c(int i10) {
        return e().nextInt(i10);
    }

    public abstract Random e();
}
