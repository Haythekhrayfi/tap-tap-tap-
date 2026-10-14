package com.applovin.exoplayer2.b;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Handler f4449d;

    public /* synthetic */ g0(Handler handler, int i10) {
        this.f4448c = i10;
        if (i10 != 1) {
        }
        this.f4449d = handler;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f4448c) {
        }
        this.f4449d.post(runnable);
    }
}
