package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ci1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f19511a = Log.isLoggable("Volley", 2);

    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final boolean f19512c = ci1.f19511a;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayList f19513a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f19514b = false;

        /* JADX INFO: renamed from: com.yandex.mobile.ads.impl.ci1$a$a, reason: collision with other inner class name */
        public static class C0202a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f19515a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f19516b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f19517c;

            public C0202a(String str, long j10, long j11) {
                this.f19515a = str;
                this.f19516b = j10;
                this.f19517c = j11;
            }
        }

        public final synchronized void a(String str) {
            long j10;
            this.f19514b = true;
            if (this.f19513a.size() == 0) {
                j10 = 0;
            } else {
                long j11 = ((C0202a) this.f19513a.get(0)).f19517c;
                ArrayList arrayList = this.f19513a;
                j10 = ((C0202a) arrayList.get(arrayList.size() - 1)).f19517c - j11;
            }
            if (j10 <= 0) {
                return;
            }
            long j12 = ((C0202a) this.f19513a.get(0)).f19517c;
            x60.b("(%-4d ms) %s", Long.valueOf(j10), str);
            for (C0202a c0202a : this.f19513a) {
                long j13 = c0202a.f19517c;
                x60.b("(+%-4d) [%2d] %s", Long.valueOf(j13 - j12), Long.valueOf(c0202a.f19516b), c0202a.f19515a);
                j12 = j13;
            }
        }

        public final synchronized void a(String str, long j10) {
            if (this.f19514b) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f19513a.add(new C0202a(str, j10, SystemClock.elapsedRealtime()));
        }

        public final void finalize() throws Throwable {
            if (this.f19514b) {
                return;
            }
            a("Request on the loose");
            x60.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }
}
