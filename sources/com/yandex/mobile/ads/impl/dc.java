package com.yandex.mobile.ads.impl;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import ch.qos.logback.core.spi.AbstractComponentTracker;

/* JADX INFO: loaded from: classes3.dex */
final class dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f19819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f19821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f19822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f19823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f19824f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioTrack f19825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f19826b = new AudioTimestamp();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f19827c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f19828d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f19829e;

        public a(AudioTrack audioTrack) {
            this.f19825a = audioTrack;
        }

        public final long a() {
            return this.f19829e;
        }

        public final long b() {
            return this.f19826b.nanoTime / 1000;
        }

        public final boolean c() {
            boolean timestamp = this.f19825a.getTimestamp(this.f19826b);
            if (timestamp) {
                long j10 = this.f19826b.framePosition;
                if (this.f19828d > j10) {
                    this.f19827c++;
                }
                this.f19828d = j10;
                this.f19829e = j10 + (this.f19827c << 32);
            }
            return timestamp;
        }
    }

    public dc(AudioTrack audioTrack) {
        if (da1.f19803a >= 19) {
            this.f19819a = new a(audioTrack);
            f();
        } else {
            this.f19819a = null;
            a(3);
        }
    }

    private void a(int i10) {
        this.f19820b = i10;
        long j10 = AbstractComponentTracker.LINGERING_TIMEOUT;
        if (i10 == 0) {
            this.f19823e = 0L;
            this.f19824f = -1L;
            this.f19821c = System.nanoTime() / 1000;
        } else if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                j10 = 10000000;
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException();
                }
                j10 = 500000;
            }
        }
        this.f19822d = j10;
    }

    public final void a() {
        if (this.f19820b == 4) {
            f();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    @TargetApi(19)
    public final boolean a(long j10) {
        a aVar = this.f19819a;
        if (aVar == null || j10 - this.f19823e < this.f19822d) {
            return false;
        }
        this.f19823e = j10;
        boolean zC = aVar.c();
        int i10 = this.f19820b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zC) {
                        f();
                    }
                } else if (!zC) {
                    f();
                }
            } else if (!zC) {
                f();
            } else if (this.f19819a.a() > this.f19824f) {
                a(2);
            }
        } else if (zC) {
            if (this.f19819a.b() < this.f19821c) {
                return false;
            }
            this.f19824f = this.f19819a.a();
            a(1);
        } else if (j10 - this.f19821c > 500000) {
            a(3);
        }
        return zC;
    }

    @TargetApi(19)
    public final long b() {
        a aVar = this.f19819a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    @TargetApi(19)
    public final long c() {
        a aVar = this.f19819a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public final boolean d() {
        return this.f19820b == 2;
    }

    public final void e() {
        a(4);
    }

    public final void f() {
        if (this.f19819a != null) {
            a(0);
        }
    }
}
