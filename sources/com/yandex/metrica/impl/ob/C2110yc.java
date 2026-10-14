package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C2110yc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uc f17903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B8 f17904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final A8 f17905c;

    public C2110yc(Uc uc2, B8 b10, A8 a10) {
        this.f17903a = uc2;
        this.f17904b = b10;
        this.f17905c = a10;
    }

    public void a() {
        Uc uc2 = this.f17903a;
        if (uc2 != null) {
            long jC = this.f17904b.c();
            int i10 = uc2.f15142f;
            if (jC > ((long) i10)) {
                this.f17904b.b((int) (i10 * 0.1f));
            }
            Uc uc3 = this.f17903a;
            long jC2 = this.f17905c.c();
            int i11 = uc3.f15142f;
            if (jC2 > ((long) i11)) {
                this.f17905c.b((int) (i11 * 0.1f));
            }
        }
    }

    public void a(Uc uc2) {
        this.f17903a = uc2;
    }
}
