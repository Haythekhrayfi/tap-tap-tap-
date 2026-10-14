package com.applovin.exoplayer2.k;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class j extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7385a;

    public j(int i10) {
        this.f7385a = i10;
    }

    public j(String str, int i10) {
        super(str);
        this.f7385a = i10;
    }

    public j(String str, Throwable th, int i10) {
        super(str, th);
        this.f7385a = i10;
    }

    public j(Throwable th, int i10) {
        super(th);
        this.f7385a = i10;
    }

    public static boolean a(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof j) && ((j) cause).f7385a == 2008) {
                return true;
            }
        }
        return false;
    }
}
