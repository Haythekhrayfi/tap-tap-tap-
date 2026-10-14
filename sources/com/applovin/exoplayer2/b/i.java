package com.applovin.exoplayer2.b;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f4459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f4460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f4461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f4462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f4463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f4464f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioTrack f4465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f4466b = new AudioTimestamp();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f4467c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f4468d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f4469e;

        public a(AudioTrack audioTrack) {
            this.f4465a = audioTrack;
        }

        public boolean a() {
            boolean timestamp = this.f4465a.getTimestamp(this.f4466b);
            if (timestamp) {
                long j10 = this.f4466b.framePosition;
                if (this.f4468d > j10) {
                    this.f4467c++;
                }
                this.f4468d = j10;
                this.f4469e = j10 + (this.f4467c << 32);
            }
            return timestamp;
        }

        public long b() {
            return this.f4466b.nanoTime / 1000;
        }

        public long c() {
            return this.f4469e;
        }
    }

    public i(AudioTrack audioTrack) {
        if (ai.f7595a >= 19) {
            this.f4459a = new a(audioTrack);
            d();
        } else {
            this.f4459a = null;
            a(3);
        }
    }

    private void a(int i10) {
        this.f4460b = i10;
        long j10 = AbstractComponentTracker.LINGERING_TIMEOUT;
        if (i10 == 0) {
            this.f4463e = 0L;
            this.f4464f = -1L;
            this.f4461c = System.nanoTime() / 1000;
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
        this.f4462d = j10;
    }

    public void a() {
        a(4);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    @TargetApi(19)
    public boolean a(long j10) {
        a aVar = this.f4459a;
        if (aVar == null || j10 - this.f4463e < this.f4462d) {
            return false;
        }
        this.f4463e = j10;
        boolean zA = aVar.a();
        int i10 = this.f4460b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zA) {
                        d();
                    }
                } else if (!zA) {
                    d();
                }
            } else if (!zA) {
                d();
            } else if (this.f4459a.c() > this.f4464f) {
                a(2);
            }
        } else if (zA) {
            if (this.f4459a.b() < this.f4461c) {
                return false;
            }
            this.f4464f = this.f4459a.c();
            a(1);
        } else if (j10 - this.f4461c > 500000) {
            a(3);
        }
        return zA;
    }

    public void b() {
        if (this.f4460b == 4) {
            d();
        }
    }

    public boolean c() {
        return this.f4460b == 2;
    }

    public void d() {
        if (this.f4459a != null) {
            a(0);
        }
    }

    @TargetApi(19)
    public long e() {
        a aVar = this.f4459a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    @TargetApi(19)
    public long f() {
        a aVar = this.f4459a;
        if (aVar != null) {
            return aVar.c();
        }
        return -1L;
    }
}
