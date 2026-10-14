package com.yandex.metrica.impl.ob;

import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public class Bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Random f13736a;

    public Bm() {
        this(new Random());
    }

    public Bm(Random random) {
        this.f13736a = random;
    }

    public long a(long j10, long j11) {
        if (j10 >= j11) {
            throw new IllegalArgumentException("min should be less than max");
        }
        long jNextLong = this.f13736a.nextLong();
        if (jNextLong == Long.MIN_VALUE) {
            jNextLong = 0;
        } else if (jNextLong < 0) {
            jNextLong = -jNextLong;
        }
        return (jNextLong % (j11 - j10)) + j10;
    }
}
