package com.applovin.exoplayer2.e.j;

import android.util.Pair;
import androidx.appcompat.widget.r0;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.b.z;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.k.g;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.io.IOException;
import okhttp3.internal.http.StatusLine;

/* JADX INFO: loaded from: classes.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f6064a = z.f4658n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f6065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private x f6066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f6067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6068e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f6069f = -1;

    /* JADX INFO: renamed from: com.applovin.exoplayer2.e.j.a$a, reason: collision with other inner class name */
    public static final class C0090a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int[] f6070a = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int[] f6071b = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final j f6072c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final x f6073d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final com.applovin.exoplayer2.e.j.b f6074e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f6075f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f6076g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final y f6077h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f6078i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final v f6079j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f6080k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f6081l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f6082m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f6083n;

        public C0090a(j jVar, x xVar, com.applovin.exoplayer2.e.j.b bVar) throws ai {
            this.f6072c = jVar;
            this.f6073d = xVar;
            this.f6074e = bVar;
            int iMax = Math.max(1, bVar.f6094c / 10);
            this.f6078i = iMax;
            y yVar = new y(bVar.f6098g);
            yVar.j();
            int iJ = yVar.j();
            this.f6075f = iJ;
            int i10 = bVar.f6093b;
            int i11 = (((bVar.f6096e - (i10 * 4)) * 8) / (bVar.f6097f * i10)) + 1;
            if (iJ == i11) {
                int iA = com.applovin.exoplayer2.l.ai.a(iMax, iJ);
                this.f6076g = new byte[bVar.f6096e * iA];
                this.f6077h = new y(iA * a(iJ, i10));
                int i12 = ((bVar.f6094c * bVar.f6096e) * 8) / iJ;
                this.f6079j = new v.a().f("audio/raw").d(i12).e(i12).f(a(iMax, i10)).k(bVar.f6093b).l(bVar.f6094c).m(2).a();
                return;
            }
            throw ai.b("Expected frames per block: " + i11 + "; got: " + iJ, null);
        }

        private static int a(int i10, int i11) {
            return i10 * 2 * i11;
        }

        private void a(int i10) {
            long jD = this.f6081l + com.applovin.exoplayer2.l.ai.d(this.f6083n, 1000000L, this.f6074e.f6094c);
            int iC = c(i10);
            this.f6073d.a(jD, 1, iC, this.f6082m - iC, null);
            this.f6083n += (long) i10;
            this.f6082m -= iC;
        }

        private void a(byte[] bArr, int i10, int i11, byte[] bArr2) {
            com.applovin.exoplayer2.e.j.b bVar = this.f6074e;
            int i12 = bVar.f6096e;
            int i13 = bVar.f6093b;
            int i14 = (i11 * 4) + (i10 * i12);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int iA = (short) (((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255));
            int iMin = Math.min(bArr[i14 + 2] & 255, 88);
            int i17 = f6071b[iMin];
            int i18 = ((i10 * this.f6075f * i13) + i11) * 2;
            bArr2[i18] = (byte) (iA & 255);
            bArr2[i18 + 1] = (byte) (iA >> 8);
            for (int i19 = 0; i19 < i16 * 2; i19++) {
                int i20 = bArr[((i19 / 8) * i13 * 4) + i15 + ((i19 / 2) % 4)] & 255;
                int i21 = i19 % 2 == 0 ? i20 & 15 : i20 >> 4;
                int i22 = ((((i21 & 7) * 2) + 1) * i17) >> 3;
                if ((i21 & 8) != 0) {
                    i22 = -i22;
                }
                iA = com.applovin.exoplayer2.l.ai.a(iA + i22, -32768, 32767);
                i18 += i13 * 2;
                bArr2[i18] = (byte) (iA & 255);
                bArr2[i18 + 1] = (byte) (iA >> 8);
                int i23 = iMin + f6070a[i21];
                int[] iArr = f6071b;
                iMin = com.applovin.exoplayer2.l.ai.a(i23, 0, iArr.length - 1);
                i17 = iArr[iMin];
            }
        }

        private void a(byte[] bArr, int i10, y yVar) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f6074e.f6093b; i12++) {
                    a(bArr, i11, i12, yVar.d());
                }
            }
            int iC = c(this.f6075f * i10);
            yVar.d(0);
            yVar.c(iC);
        }

        private int b(int i10) {
            return i10 / (this.f6074e.f6093b * 2);
        }

        private int c(int i10) {
            return a(i10, this.f6074e.f6093b);
        }

        @Override // com.applovin.exoplayer2.e.j.a.b
        public void a(int i10, long j10) {
            this.f6072c.a(new d(this.f6074e, this.f6075f, i10, j10));
            this.f6073d.a(this.f6079j);
        }

        @Override // com.applovin.exoplayer2.e.j.a.b
        public void a(long j10) {
            this.f6080k = 0;
            this.f6081l = j10;
            this.f6082m = 0;
            this.f6083n = 0L;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0038 A[LOOP:0: B:6:0x001e->B:12:0x0038, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:23:0x003e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:25:0x001b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0020  */
        /* JADX WARN: Code duplicated, block: B:9:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // com.applovin.exoplayer2.e.j.a.b
        public boolean a(com.applovin.exoplayer2.e.i r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.f6078i
                int r1 = r6.f6082m
                int r1 = r6.b(r1)
                int r0 = r0 - r1
                int r1 = r6.f6075f
                int r0 = com.applovin.exoplayer2.l.ai.a(r0, r1)
                com.applovin.exoplayer2.e.j.b r1 = r6.f6074e
                int r1 = r1.f6096e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.f6080k
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f6076g
                int r5 = r6.f6080k
                int r3 = r7.a(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f6080k
                int r4 = r4 + r3
                r6.f6080k = r4
                goto L1e
            L3e:
                int r7 = r6.f6080k
                com.applovin.exoplayer2.e.j.b r8 = r6.f6074e
                int r8 = r8.f6096e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f6076g
                com.applovin.exoplayer2.l.y r9 = r6.f6077h
                r6.a(r8, r7, r9)
                int r8 = r6.f6080k
                com.applovin.exoplayer2.e.j.b r9 = r6.f6074e
                int r9 = r9.f6096e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f6080k = r8
                com.applovin.exoplayer2.l.y r7 = r6.f6077h
                int r7 = r7.b()
                com.applovin.exoplayer2.e.x r8 = r6.f6073d
                com.applovin.exoplayer2.l.y r9 = r6.f6077h
                r8.a(r9, r7)
                int r8 = r6.f6082m
                int r8 = r8 + r7
                r6.f6082m = r8
                int r7 = r6.b(r8)
                int r8 = r6.f6078i
                if (r7 < r8) goto L75
                r6.a(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f6082m
                int r7 = r6.b(r7)
                if (r7 <= 0) goto L82
                r6.a(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.j.a.C0090a.a(com.applovin.exoplayer2.e.i, long):boolean");
        }
    }

    public interface b {
        void a(int i10, long j10) throws ai;

        void a(long j10);

        boolean a(i iVar, long j10) throws IOException;
    }

    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j f6084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final x f6085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.applovin.exoplayer2.e.j.b f6086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final v f6087d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f6088e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f6089f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f6090g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f6091h;

        public c(j jVar, x xVar, com.applovin.exoplayer2.e.j.b bVar, String str, int i10) throws ai {
            this.f6084a = jVar;
            this.f6085b = xVar;
            this.f6086c = bVar;
            int i11 = (bVar.f6093b * bVar.f6097f) / 8;
            if (bVar.f6096e != i11) {
                StringBuilder sbA = r0.a("Expected block size: ", i11, "; got: ");
                sbA.append(bVar.f6096e);
                throw ai.b(sbA.toString(), null);
            }
            int i12 = bVar.f6094c;
            int i13 = i12 * i11 * 8;
            int iMax = Math.max(i11, (i12 * i11) / 10);
            this.f6088e = iMax;
            this.f6087d = new v.a().f(str).d(i13).e(i13).f(iMax).k(bVar.f6093b).l(bVar.f6094c).m(i10).a();
        }

        @Override // com.applovin.exoplayer2.e.j.a.b
        public void a(int i10, long j10) {
            this.f6084a.a(new d(this.f6086c, 1, i10, j10));
            this.f6085b.a(this.f6087d);
        }

        @Override // com.applovin.exoplayer2.e.j.a.b
        public void a(long j10) {
            this.f6089f = j10;
            this.f6090g = 0;
            this.f6091h = 0L;
        }

        @Override // com.applovin.exoplayer2.e.j.a.b
        public boolean a(i iVar, long j10) throws IOException {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f6090g) < (i11 = this.f6088e)) {
                int iA = this.f6085b.a((g) iVar, (int) Math.min(i11 - i10, j11), true);
                if (iA == -1) {
                    j11 = 0;
                } else {
                    this.f6090g += iA;
                    j11 -= (long) iA;
                }
            }
            com.applovin.exoplayer2.e.j.b bVar = this.f6086c;
            int i12 = bVar.f6096e;
            int i13 = this.f6090g / i12;
            if (i13 > 0) {
                long jD = this.f6089f + com.applovin.exoplayer2.l.ai.d(this.f6091h, 1000000L, bVar.f6094c);
                int i14 = i13 * i12;
                int i15 = this.f6090g - i14;
                this.f6085b.a(jD, 1, i14, i15, null);
                this.f6091h += (long) i13;
                this.f6090g = i15;
            }
            return j11 <= 0;
        }
    }

    private void a() {
        com.applovin.exoplayer2.l.a.a(this.f6066c);
        com.applovin.exoplayer2.l.ai.a(this.f6065b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h[] b() {
        return new h[]{new a()};
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(i iVar, u uVar) throws IOException {
        b cVar;
        a();
        if (this.f6067d == null) {
            com.applovin.exoplayer2.e.j.b bVarA = com.applovin.exoplayer2.e.j.c.a(iVar);
            if (bVarA == null) {
                throw ai.b("Unsupported or unrecognized wav header.", null);
            }
            int i10 = bVarA.f6092a;
            if (i10 == 17) {
                cVar = new C0090a(this.f6065b, this.f6066c, bVarA);
            } else if (i10 == 6) {
                cVar = new c(this.f6065b, this.f6066c, bVarA, "audio/g711-alaw", -1);
            } else if (i10 == 7) {
                cVar = new c(this.f6065b, this.f6066c, bVarA, "audio/g711-mlaw", -1);
            } else {
                int iA = com.applovin.exoplayer2.b.y.a(i10, bVarA.f6097f);
                if (iA == 0) {
                    StringBuilder sbA = defpackage.a.a("Unsupported WAV format type: ");
                    sbA.append(bVarA.f6092a);
                    throw ai.a(sbA.toString());
                }
                cVar = new c(this.f6065b, this.f6066c, bVarA, "audio/raw", iA);
            }
            this.f6067d = cVar;
        }
        if (this.f6068e == -1) {
            Pair<Long, Long> pairB = com.applovin.exoplayer2.e.j.c.b(iVar);
            this.f6068e = ((Long) pairB.first).intValue();
            long jLongValue = ((Long) pairB.second).longValue();
            this.f6069f = jLongValue;
            this.f6067d.a(this.f6068e, jLongValue);
        } else if (iVar.c() == 0) {
            iVar.b(this.f6068e);
        }
        com.applovin.exoplayer2.l.a.b(this.f6069f != -1);
        return this.f6067d.a(iVar, this.f6069f - iVar.c()) ? -1 : 0;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        b bVar = this.f6067d;
        if (bVar != null) {
            bVar.a(j11);
        }
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(j jVar) {
        this.f6065b = jVar;
        this.f6066c = jVar.a(0, 1);
        jVar.a();
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(i iVar) throws IOException {
        return com.applovin.exoplayer2.e.j.c.a(iVar) != null;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }
}
