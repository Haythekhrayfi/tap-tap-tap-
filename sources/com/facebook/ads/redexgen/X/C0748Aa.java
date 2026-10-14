package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Aa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0748Aa {
    public static byte[] A0P;
    public static String[] A0Q = {"G0ejmsNLWo5N4HwPMLJOyhcWTLvm5k", "AaVAi8kEbPSTq7WMPq", "3SFwMFVKqfYZc9yidXjkKt9eYi", "MpavoNzourXMB6MEjk2fzdRtD4ZxlK4T", "tgtkP63ogxvavW2iBkIKDzfLLaZpZCzK", "ybOdqEkHneyM4wZj2LwFYBNLYP9L294", "eNRXQ28nuUhO04KATDB8SwCNKP", "apyaz1fP5pXVrlGks8RRBsGavNttMFUQ"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public AudioTrack A0H;
    public AX A0I;
    public Method A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final AY A0N;
    public final long[] A0O;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0P, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0P = new byte[]{48, 46, 61, 21, 42, 61, 46, 55, 44, 66};
    }

    static {
        A06();
    }

    public C0748Aa(AY ay) {
        this.A0N = (AY) HG.A01(ay);
        if (C0930Hv.A02 >= 18) {
            try {
                this.A0J = AudioTrack.class.getMethod(A03(0, 10, 75), null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.A0O = new long[10];
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0091  */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    private long A00() {
        if (this.A0G != -9223372036854775807L) {
            long jElapsedRealtime = (((long) this.A03) * ((SystemClock.elapsedRealtime() * 1000) - this.A0G)) / 1000000;
            long framesSinceStop = this.A06;
            long elapsedTimeSinceStopUs = this.A0F;
            return Math.min(framesSinceStop, elapsedTimeSinceStopUs + jElapsedRealtime);
        }
        int playState = this.A0H.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        int state = this.A0H.getPlaybackHeadPosition();
        long j10 = 4294967295L & ((long) state);
        if (this.A0M) {
            if (playState == 2) {
                String[] strArr = A0Q;
                String str = strArr[7];
                String str2 = strArr[3];
                int iCharAt = str.charAt(23);
                int state2 = str2.charAt(23);
                if (iCharAt == state2) {
                    throw new RuntimeException();
                }
                A0Q[1] = "2Rrhrvg7XFDDHkaxdizPj4VES";
                if (j10 == 0) {
                    this.A0C = this.A0A;
                }
            }
            j10 += this.A0C;
        }
        if (C0930Hv.A02 <= 28) {
            if (j10 == 0) {
                long j11 = this.A0A;
                if (A0Q[1].length() != 9) {
                    A0Q[5] = "5rZ1QvooVelNPm3umI";
                    if (j11 > 0) {
                        if (playState == 3) {
                            if (this.A07 == -9223372036854775807L) {
                                this.A07 = SystemClock.elapsedRealtime();
                            }
                            return this.A0A;
                        }
                    }
                } else if (j11 > 0) {
                    if (playState == 3) {
                        if (this.A07 == -9223372036854775807L) {
                            this.A07 = SystemClock.elapsedRealtime();
                        }
                        return this.A0A;
                    }
                }
            }
            this.A07 = -9223372036854775807L;
        }
        if (this.A0A > j10) {
            this.A0D++;
        }
        this.A0A = j10;
        return (this.A0D << 32) + j10;
    }

    private long A01() {
        return A02(A00());
    }

    private long A02(long j10) {
        return (1000000 * j10) / ((long) this.A03);
    }

    private void A04() {
        long systemTimeUs = A01();
        if (systemTimeUs == 0) {
            return;
        }
        long jNanoTime = System.nanoTime() / 1000;
        long playbackPositionUs = this.A09;
        if (jNanoTime - playbackPositionUs >= 30000) {
            long[] jArr = this.A0O;
            int i10 = this.A01;
            long playbackPositionUs2 = systemTimeUs - jNanoTime;
            jArr[i10] = playbackPositionUs2;
            this.A01 = (i10 + 1) % 10;
            int i11 = this.A04;
            if (i11 < 10) {
                this.A04 = i11 + 1;
            }
            this.A09 = jNanoTime;
            this.A0E = 0L;
            int i12 = 0;
            while (true) {
                int i13 = this.A04;
                if (i12 >= i13) {
                    break;
                }
                long playbackPositionUs3 = i13;
                this.A0E += this.A0O[i12] / playbackPositionUs3;
                i12++;
            }
        }
        if (this.A0M) {
            return;
        }
        A08(jNanoTime, systemTimeUs);
        A07(jNanoTime);
    }

    private void A05() {
        this.A0E = 0L;
        this.A04 = 0;
        this.A01 = 0;
        this.A09 = 0L;
    }

    private void A07(long j10) {
        if (this.A0L) {
            Method method = this.A0J;
            if (A0Q[1].length() == 9) {
                throw new RuntimeException();
            }
            A0Q[5] = "5gTCJ";
            if (method != null && j10 - this.A08 >= 500000) {
                try {
                    long jIntValue = (((long) ((Integer) method.invoke(this.A0H, null)).intValue()) * 1000) - this.A05;
                    this.A0B = jIntValue;
                    long jMax = Math.max(jIntValue, 0L);
                    this.A0B = jMax;
                    if (jMax > 5000000) {
                        this.A0N.ABa(jMax);
                        this.A0B = 0L;
                    }
                } catch (Exception unused) {
                    this.A0J = null;
                }
                this.A08 = j10;
            }
        }
    }

    private void A08(long j10, long audioTimestampSystemTimeUs) {
        if (!this.A0I.A08(j10)) {
            return;
        }
        long jA02 = this.A0I.A02();
        long jA01 = this.A0I.A01();
        if (Math.abs(jA02 - j10) > 5000000) {
            this.A0N.ACw(jA01, jA02, j10, audioTimestampSystemTimeUs);
            this.A0I.A04();
        } else if (Math.abs(A02(jA01) - audioTimestampSystemTimeUs) > 5000000) {
            this.A0N.ACK(jA01, jA02, j10, audioTimestampSystemTimeUs);
            this.A0I.A04();
        } else {
            this.A0I.A03();
        }
    }

    private boolean A09() {
        return this.A0M && this.A0H.getPlayState() == 2 && A00() == 0;
    }

    public static boolean A0A(int i10) {
        if (C0930Hv.A02 < 23) {
            if (i10 != 5) {
                String[] strArr = A0Q;
                if (strArr[6].length() != strArr[2].length()) {
                    throw new RuntimeException();
                }
                A0Q[0] = "NO";
                if (i10 == 6) {
                }
            }
            return true;
        }
        return false;
    }

    public final int A0B(long j10) {
        int bytesPending = (int) (j10 - (A00() * ((long) this.A02)));
        return this.A00 - bytesPending;
    }

    public final long A0C(boolean z10) {
        long systemTimeUs;
        if (this.A0H.getPlayState() == 3) {
            A04();
        }
        long elapsedSinceTimestampUs = System.nanoTime() / 1000;
        if (this.A0I.A06()) {
            long systemTimeUs2 = this.A0I.A01();
            long timestampPositionUs = A02(systemTimeUs2);
            boolean zA07 = this.A0I.A07();
            if (A0Q[1].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A0Q;
            strArr[7] = "B2EPmPjaxRfTTctNgZbFUDggQYGnhm7g";
            strArr[3] = "gdL6KIe4ggUqKImq5hrR6J8T2bfxhE0p";
            if (!zA07) {
                return timestampPositionUs;
            }
            AX ax = this.A0I;
            String[] strArr2 = A0Q;
            if (strArr2[6].length() != strArr2[2].length()) {
                long systemTimeUs3 = ax.A02();
                return timestampPositionUs + (elapsedSinceTimestampUs - systemTimeUs3);
            }
            A0Q[5] = "zkTTFu0HqLBb6JIYxZc4CSGv3";
            long systemTimeUs4 = ax.A02();
            return timestampPositionUs + (elapsedSinceTimestampUs - systemTimeUs4);
        }
        if (this.A04 == 0) {
            systemTimeUs = A01();
        } else {
            long systemTimeUs5 = this.A0E;
            systemTimeUs = systemTimeUs5 + elapsedSinceTimestampUs;
        }
        if (!z10) {
            long positionUs = this.A0B;
            return systemTimeUs - positionUs;
        }
        return systemTimeUs;
    }

    public final void A0D() {
        A05();
        this.A0H = null;
        this.A0I = null;
    }

    public final void A0E() {
        this.A0I.A05();
    }

    public final void A0F(long j10) {
        this.A0F = A00();
        this.A0G = SystemClock.elapsedRealtime() * 1000;
        this.A06 = j10;
    }

    public final void A0G(AudioTrack audioTrack, int i10, int i11, int i12) {
        this.A0H = audioTrack;
        this.A02 = i11;
        this.A00 = i12;
        this.A0I = new AX(audioTrack);
        this.A03 = audioTrack.getSampleRate();
        this.A0M = A0A(i10);
        boolean zA0c = C0930Hv.A0c(i10);
        this.A0L = zA0c;
        this.A05 = zA0c ? A02(i12 / i11) : -9223372036854775807L;
        this.A0A = 0L;
        this.A0D = 0L;
        this.A0C = 0L;
        this.A0K = false;
        this.A0G = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
        this.A0B = 0L;
    }

    public final boolean A0H() {
        return this.A0H.getPlayState() == 3;
    }

    public final boolean A0I() {
        A05();
        if (this.A0G == -9223372036854775807L) {
            this.A0I.A05();
            return true;
        }
        return false;
    }

    public final boolean A0J(long j10) {
        return j10 > A00() || A09();
    }

    public final boolean A0K(long j10) {
        return this.A07 != -9223372036854775807L && j10 > 0 && SystemClock.elapsedRealtime() - this.A07 >= 200;
    }

    public final boolean A0L(long j10) {
        AY ay;
        int playState = this.A0H.getPlayState();
        if (this.A0M) {
            if (playState == 2) {
                this.A0K = false;
                return false;
            }
            if (playState == 1 && A00() == 0) {
                return false;
            }
        }
        boolean hadData = this.A0K;
        boolean zA0J = A0J(j10);
        this.A0K = zA0J;
        if (hadData && !zA0J && playState != 1 && (ay = this.A0N) != null) {
            ay.AD5(this.A00, C9C.A01(this.A05));
        }
        return true;
    }
}
