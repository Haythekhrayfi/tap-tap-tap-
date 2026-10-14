package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Long f15627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f15628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Om f15629c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f15630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f15631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f15632c;

        public a(long j10, long j11, int i10) {
            this.f15630a = j10;
            this.f15632c = i10;
            this.f15631b = j11;
        }
    }

    public Z4() {
        this(new Nm());
    }

    public Z4(Om om) {
        this.f15629c = om;
    }

    public a a() {
        if (this.f15627a == null) {
            this.f15627a = Long.valueOf(this.f15629c.b());
        }
        long jLongValue = this.f15627a.longValue();
        long jLongValue2 = this.f15627a.longValue();
        int i10 = this.f15628b;
        a aVar = new a(jLongValue, jLongValue2, i10);
        this.f15628b = i10 + 1;
        return aVar;
    }
}
