package com.yandex.metrica.impl.ob;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Nm f15603a;

    public Z() {
        this(new Nm());
    }

    public Z(Nm nm) {
        this.f15603a = nm;
    }

    public void a() {
        Objects.requireNonNull(this.f15603a);
        SystemClock.elapsedRealtime();
    }
}
