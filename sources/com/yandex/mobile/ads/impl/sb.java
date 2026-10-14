package com.yandex.mobile.ads.impl;

import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.mp4.MdtaMetadataEntry;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class sb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f25010a = da1.b("OpusHead");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f25011b = 0;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f25012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f25013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25014c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f25015d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f25016e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final mp0 f25017f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final mp0 f25018g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f25019h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f25020i;

        public a(mp0 mp0Var, mp0 mp0Var2, boolean z10) throws qp0 {
            this.f25018g = mp0Var;
            this.f25017f = mp0Var2;
            this.f25016e = z10;
            mp0Var2.e(12);
            this.f25012a = mp0Var2.x();
            mp0Var.e(12);
            this.f25020i = mp0Var.x();
            xt.a("first_chunk must be 1", mp0Var.h() == 1);
            this.f25013b = -1;
        }

        public final boolean a() {
            int i10 = this.f25013b + 1;
            this.f25013b = i10;
            if (i10 == this.f25012a) {
                return false;
            }
            this.f25015d = this.f25016e ? this.f25017f.y() : this.f25017f.v();
            if (this.f25013b == this.f25019h) {
                this.f25014c = this.f25018g.x();
                this.f25018g.f(4);
                int i11 = this.f25020i - 1;
                this.f25020i = i11;
                this.f25019h = i11 > 0 ? this.f25018g.x() - 1 : -1;
            }
            return true;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f25021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f25022b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f25023c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f25024d;

        public b(String str, byte[] bArr, long j10, long j11) {
            this.f25021a = str;
            this.f25022b = bArr;
            this.f25023c = j10;
            this.f25024d = j11;
        }
    }

    public interface c {
        int a();

        int b();

        int c();
    }

    public static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f25025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f25026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final mp0 f25027c;

        public d(rb.b bVar, yv yvVar) {
            mp0 mp0Var = bVar.f24657b;
            this.f25027c = mp0Var;
            mp0Var.e(12);
            int iX = mp0Var.x();
            if ("audio/raw".equals(yvVar.f27115l)) {
                int iB = da1.b(yvVar.A, yvVar.f27128y);
                if (iX == 0 || iX % iB != 0) {
                    p90.d("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iB + ", stsz sample size: " + iX);
                    iX = iB;
                }
            }
            this.f25025a = iX == 0 ? -1 : iX;
            this.f25026b = mp0Var.x();
        }

        @Override // com.yandex.mobile.ads.impl.sb.c
        public final int a() {
            return this.f25025a;
        }

        @Override // com.yandex.mobile.ads.impl.sb.c
        public final int b() {
            return this.f25026b;
        }

        @Override // com.yandex.mobile.ads.impl.sb.c
        public final int c() {
            int i10 = this.f25025a;
            return i10 == -1 ? this.f25027c.x() : i10;
        }
    }

    public static final class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final mp0 f25028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f25029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f25030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f25031d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f25032e;

        public e(rb.b bVar) {
            mp0 mp0Var = bVar.f24657b;
            this.f25028a = mp0Var;
            mp0Var.e(12);
            this.f25030c = mp0Var.x() & 255;
            this.f25029b = mp0Var.x();
        }

        @Override // com.yandex.mobile.ads.impl.sb.c
        public final int a() {
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.sb.c
        public final int b() {
            return this.f25029b;
        }

        @Override // com.yandex.mobile.ads.impl.sb.c
        public final int c() {
            int i10 = this.f25030c;
            if (i10 == 8) {
                return this.f25028a.t();
            }
            if (i10 == 16) {
                return this.f25028a.z();
            }
            int i11 = this.f25031d;
            this.f25031d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f25032e & 15;
            }
            int iT = this.f25028a.t();
            this.f25032e = iT;
            return (iT & 240) >> 4;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f25033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f25034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f25035c;

        public f(int i10, int i11, long j10) {
            this.f25033a = i10;
            this.f25034b = j10;
            this.f25035c = i11;
        }
    }

    private static Pair a(int i10, int i11, mp0 mp0Var) throws qp0 {
        f71 f71Var;
        Pair pairCreate;
        int i12;
        int i13;
        byte[] bArr;
        int iD = mp0Var.d();
        while (iD - i10 < i11) {
            mp0Var.e(iD);
            int iH = mp0Var.h();
            xt.a("childAtomSize must be positive", iH > 0);
            if (mp0Var.h() == 1936289382) {
                int i14 = iD + 8;
                int i15 = 0;
                int i16 = -1;
                String strA = null;
                Integer numValueOf = null;
                while (i14 - iD < iH) {
                    mp0Var.e(i14);
                    int iH2 = mp0Var.h();
                    int iH3 = mp0Var.h();
                    if (iH3 == 1718775137) {
                        numValueOf = Integer.valueOf(mp0Var.h());
                    } else if (iH3 == 1935894637) {
                        mp0Var.f(4);
                        strA = mp0Var.a(4, qh.f24496c);
                    } else if (iH3 == 1935894633) {
                        i16 = i14;
                        i15 = iH2;
                    }
                    i14 += iH2;
                }
                if ("cenc".equals(strA) || "cbc1".equals(strA) || "cens".equals(strA) || "cbcs".equals(strA)) {
                    xt.a("frma atom is mandatory", numValueOf != null);
                    xt.a("schi atom is mandatory", i16 != -1);
                    int i17 = i16 + 8;
                    while (true) {
                        if (i17 - i16 >= i15) {
                            f71Var = null;
                            break;
                        }
                        mp0Var.e(i17);
                        int iH4 = mp0Var.h();
                        if (mp0Var.h() == 1952804451) {
                            int iB = rb.b(mp0Var.h());
                            mp0Var.f(1);
                            if (iB == 0) {
                                mp0Var.f(1);
                                i12 = 0;
                                i13 = 0;
                            } else {
                                int iT = mp0Var.t();
                                int i18 = (iT & 240) >> 4;
                                i12 = iT & 15;
                                i13 = i18;
                            }
                            boolean z10 = mp0Var.t() == 1;
                            int iT2 = mp0Var.t();
                            byte[] bArr2 = new byte[16];
                            mp0Var.a(bArr2, 0, 16);
                            if (z10 && iT2 == 0) {
                                int iT3 = mp0Var.t();
                                byte[] bArr3 = new byte[iT3];
                                mp0Var.a(bArr3, 0, iT3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            f71Var = new f71(z10, strA, iT2, bArr2, i13, i12, bArr);
                            break;
                        }
                        i17 += iH4;
                    }
                    xt.a("tenc atom is mandatory", f71Var != null);
                    int i19 = da1.f19803a;
                    pairCreate = Pair.create(numValueOf, f71Var);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iD += iH;
        }
        return null;
    }

    public static Metadata a(rb.a aVar) {
        MdtaMetadataEntry mdtaMetadataEntry;
        rb.b bVarD = aVar.d(1751411826);
        rb.b bVarD2 = aVar.d(1801812339);
        rb.b bVarD3 = aVar.d(1768715124);
        if (bVarD == null || bVarD2 == null || bVarD3 == null) {
            return null;
        }
        mp0 mp0Var = bVarD.f24657b;
        mp0Var.e(16);
        if (mp0Var.h() != 1835299937) {
            return null;
        }
        mp0 mp0Var2 = bVarD2.f24657b;
        mp0Var2.e(12);
        int iH = mp0Var2.h();
        String[] strArr = new String[iH];
        for (int i10 = 0; i10 < iH; i10++) {
            int iH2 = mp0Var2.h();
            mp0Var2.f(4);
            strArr[i10] = mp0Var2.a(iH2 - 8, qh.f24496c);
        }
        mp0 mp0Var3 = bVarD3.f24657b;
        mp0Var3.e(8);
        ArrayList arrayList = new ArrayList();
        while (mp0Var3.a() > 8) {
            int iD = mp0Var3.d();
            int iH3 = mp0Var3.h();
            int iH4 = mp0Var3.h() - 1;
            if (iH4 < 0 || iH4 >= iH) {
                o80.a("Skipped metadata with unknown key index: ", iH4, "AtomParsers");
            } else {
                String str = strArr[iH4];
                int i11 = iD + iH3;
                while (true) {
                    int iD2 = mp0Var3.d();
                    if (iD2 >= i11) {
                        mdtaMetadataEntry = null;
                        break;
                    }
                    int iH5 = mp0Var3.h();
                    if (mp0Var3.h() == 1684108385) {
                        int iH6 = mp0Var3.h();
                        int iH7 = mp0Var3.h();
                        int i12 = iH5 - 16;
                        byte[] bArr = new byte[i12];
                        mp0Var3.a(bArr, 0, i12);
                        mdtaMetadataEntry = new MdtaMetadataEntry(iH7, iH6, str, bArr);
                        break;
                    }
                    mp0Var3.e(iD2 + iH5);
                }
                if (mdtaMetadataEntry != null) {
                    arrayList.add(mdtaMetadataEntry);
                }
            }
            mp0Var3.e(iD + iH3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static k71 a(e71 e71Var, rb.a aVar, yx yxVar) throws qp0 {
        c eVar;
        boolean z10;
        int iX;
        int iX2;
        boolean z11;
        int i10;
        e71 e71Var2;
        int i11;
        long j10;
        int[] iArr;
        long[] jArr;
        int i12;
        int[] iArr2;
        long[] jArr2;
        int i13;
        int i14;
        int i15;
        int i16;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int i17;
        int i18;
        rb.b bVarD = aVar.d(1937011578);
        if (bVarD != null) {
            eVar = new d(bVarD, e71Var.f20105f);
        } else {
            rb.b bVarD2 = aVar.d(1937013298);
            if (bVarD2 == null) {
                throw qp0.a("Track has no sample table size information", (Exception) null);
            }
            eVar = new e(bVarD2);
        }
        int iB = eVar.b();
        int iX3 = 0;
        if (iB == 0) {
            return new k71(e71Var, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        rb.b bVarD3 = aVar.d(1937007471);
        if (bVarD3 == null) {
            bVarD3 = aVar.d(1668232756);
            Objects.requireNonNull(bVarD3);
            z10 = true;
        } else {
            z10 = false;
        }
        mp0 mp0Var = bVarD3.f24657b;
        rb.b bVarD4 = aVar.d(1937011555);
        Objects.requireNonNull(bVarD4);
        mp0 mp0Var2 = bVarD4.f24657b;
        rb.b bVarD5 = aVar.d(1937011827);
        Objects.requireNonNull(bVarD5);
        mp0 mp0Var3 = bVarD5.f24657b;
        rb.b bVarD6 = aVar.d(1937011571);
        mp0 mp0Var4 = bVarD6 != null ? bVarD6.f24657b : null;
        rb.b bVarD7 = aVar.d(1668576371);
        mp0 mp0Var5 = bVarD7 != null ? bVarD7.f24657b : null;
        a aVar2 = new a(mp0Var2, mp0Var, z10);
        mp0Var3.e(12);
        int iX4 = mp0Var3.x() - 1;
        int iX5 = mp0Var3.x();
        int iX6 = mp0Var3.x();
        if (mp0Var5 != null) {
            mp0Var5.e(12);
            iX = mp0Var5.x();
        } else {
            iX = 0;
        }
        if (mp0Var4 != null) {
            mp0Var4.e(12);
            iX3 = mp0Var4.x();
            if (iX3 > 0) {
                iX2 = mp0Var4.x() - 1;
            } else {
                mp0Var4 = null;
                iX2 = -1;
            }
        } else {
            iX2 = -1;
        }
        int iA = eVar.a();
        int i19 = iX2;
        String str = e71Var.f20105f.f27115l;
        if (iA != -1 && ("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && iX4 == 0 && iX == 0 && iX3 == 0) {
            int i20 = aVar2.f25012a;
            long[] jArr3 = new long[i20];
            int[] iArr6 = new int[i20];
            while (aVar2.a()) {
                int i21 = aVar2.f25013b;
                jArr3[i21] = aVar2.f25015d;
                iArr6[i21] = aVar2.f25014c;
            }
            long j11 = iX6;
            int i22 = 8192 / iA;
            int iA2 = 0;
            for (int i23 = 0; i23 < i20; i23++) {
                iA2 += da1.a(iArr6[i23], i22);
            }
            long[] jArr4 = new long[iA2];
            int[] iArr7 = new int[iA2];
            long[] jArr5 = new long[iA2];
            int[] iArr8 = new int[iA2];
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            while (i24 < i20) {
                int i28 = iArr6[i24];
                long j12 = jArr3[i24];
                int i29 = i27;
                int i30 = i20;
                int iMax = i26;
                int i31 = i29;
                long[] jArr6 = jArr3;
                int i32 = i28;
                while (i32 > 0) {
                    int iMin = Math.min(i22, i32);
                    jArr4[i31] = j12;
                    int[] iArr9 = iArr6;
                    int i33 = iA * iMin;
                    iArr7[i31] = i33;
                    iMax = Math.max(iMax, i33);
                    jArr5[i31] = ((long) i25) * j11;
                    iArr8[i31] = 1;
                    j12 += (long) iArr7[i31];
                    i25 += iMin;
                    i32 -= iMin;
                    i31++;
                    i22 = i22;
                    jArr4 = jArr4;
                    iArr6 = iArr9;
                }
                i24++;
                jArr3 = jArr6;
                iArr6 = iArr6;
                int i34 = i31;
                i26 = iMax;
                i20 = i30;
                i27 = i34;
            }
            j10 = j11 * ((long) i25);
            e71Var2 = e71Var;
            i12 = iB;
            iArr2 = iArr8;
            iArr = iArr7;
            jArr = jArr5;
            i11 = i26;
            jArr2 = jArr4;
        } else {
            long[] jArrCopyOf = new long[iB];
            int[] iArrCopyOf = new int[iB];
            long[] jArrCopyOf2 = new long[iB];
            int i35 = iX3;
            int[] iArrCopyOf2 = new int[iB];
            int i36 = 0;
            long j13 = 0;
            long j14 = 0;
            int i37 = iX6;
            int i38 = 0;
            int iH = 0;
            int iX7 = 0;
            int iX8 = iX5;
            int i39 = i35;
            int i40 = 0;
            int i41 = iX;
            int iX9 = i19;
            int i42 = iX4;
            while (i38 < iB) {
                boolean zA = true;
                while (i36 == 0) {
                    zA = aVar2.a();
                    if (!zA) {
                        break;
                    }
                    j14 = aVar2.f25015d;
                    i36 = aVar2.f25014c;
                    iB = iB;
                    i37 = i37;
                }
                int i43 = i37;
                int i44 = iB;
                if (!zA) {
                    p90.d("AtomParsers", "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i38);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i38);
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i38);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i38);
                    iB = i38;
                    break;
                }
                if (mp0Var5 != null) {
                    while (iX7 == 0 && i41 > 0) {
                        iX7 = mp0Var5.x();
                        iH = mp0Var5.h();
                        i41--;
                    }
                    iX7--;
                }
                int i45 = iH;
                jArrCopyOf[i38] = j14;
                int iC = eVar.c();
                iArrCopyOf[i38] = iC;
                if (iC > i40) {
                    i40 = iC;
                }
                c cVar = eVar;
                jArrCopyOf2[i38] = j13 + ((long) i45);
                iArrCopyOf2[i38] = mp0Var4 == null ? 1 : 0;
                if (i38 == iX9) {
                    iArrCopyOf2[i38] = 1;
                    i39--;
                    if (i39 > 0) {
                        Objects.requireNonNull(mp0Var4);
                        iX9 = mp0Var4.x() - 1;
                    }
                }
                int iH2 = i43;
                int[] iArr10 = iArrCopyOf2;
                j13 += (long) iH2;
                iX8--;
                if (iX8 != 0 || i42 <= 0) {
                    i13 = i42;
                } else {
                    i13 = i42 - 1;
                    iX8 = mp0Var3.x();
                    iH2 = mp0Var3.h();
                }
                j14 += (long) iArrCopyOf[i38];
                i36--;
                i38++;
                i37 = iH2;
                i42 = i13;
                iH = i45;
                eVar = cVar;
                iB = i44;
                iArrCopyOf2 = iArr10;
            }
            int i46 = i36;
            long j15 = j13 + ((long) iH);
            if (mp0Var5 == null) {
                z11 = true;
                break;
            }
            while (true) {
                if (i41 <= 0) {
                    z11 = true;
                    break;
                }
                if (mp0Var5.x() != 0) {
                    z11 = false;
                    break;
                }
                mp0Var5.h();
                i41--;
            }
            if (i39 == 0 && iX8 == 0 && i46 == 0 && i42 == 0) {
                i10 = iX7;
                if (i10 == 0 && z11) {
                    e71Var2 = e71Var;
                }
                i11 = i40;
                j10 = j15;
                iArr = iArrCopyOf;
                jArr = jArrCopyOf2;
                i12 = iB;
                iArr2 = iArrCopyOf2;
                jArr2 = jArrCopyOf;
            } else {
                i10 = iX7;
            }
            StringBuilder sbA = v60.a("Inconsistent stbl box for track ");
            e71Var2 = e71Var;
            v1.b.a(sbA, e71Var2.f20100a, ": remainingSynchronizationSamples ", i39, ", remainingSamplesAtTimestampDelta ");
            v1.b.a(sbA, iX8, ", remainingSamplesInChunk ", i46, ", remainingTimestampDeltaChanges ");
            sbA.append(i42);
            sbA.append(", remainingSamplesAtTimestampOffset ");
            sbA.append(i10);
            sbA.append(!z11 ? ", ctts invalid" : "");
            p90.d("AtomParsers", sbA.toString());
            i11 = i40;
            j10 = j15;
            iArr = iArrCopyOf;
            jArr = jArrCopyOf2;
            i12 = iB;
            iArr2 = iArrCopyOf2;
            jArr2 = jArrCopyOf;
        }
        long jA = da1.a(j10, 1000000L, e71Var2.f20102c);
        long[] jArr7 = e71Var2.f20107h;
        if (jArr7 == null) {
            da1.a(jArr, e71Var2.f20102c);
            return new k71(e71Var, jArr2, iArr, i11, jArr, iArr2, jA);
        }
        if (jArr7.length == 1 && e71Var2.f20101b == 1 && jArr.length >= 2) {
            long[] jArr8 = e71Var2.f20108i;
            Objects.requireNonNull(jArr8);
            long j16 = jArr8[0];
            i14 = i12;
            long jA2 = da1.a(e71Var2.f20107h[0], e71Var2.f20102c, e71Var2.f20103d) + j16;
            int length = jArr.length - 1;
            int iMax2 = Math.max(0, Math.min(4, length));
            int iMax3 = Math.max(0, Math.min(jArr.length - 4, length));
            long j17 = jArr[0];
            if (j17 <= j16 && j16 < jArr[iMax2] && jArr[iMax3] < jA2 && jA2 <= j10) {
                long j18 = j10 - jA2;
                long jA3 = da1.a(j16 - j17, e71Var2.f20105f.f27129z, e71Var2.f20102c);
                long jA4 = da1.a(j18, e71Var2.f20105f.f27129z, e71Var2.f20102c);
                if ((jA3 != 0 || jA4 != 0) && jA3 <= 2147483647L && jA4 <= 2147483647L) {
                    yxVar.f27158a = (int) jA3;
                    yxVar.f27159b = (int) jA4;
                    da1.a(jArr, e71Var2.f20102c);
                    return new k71(e71Var, jArr2, iArr, i11, jArr, iArr2, da1.a(e71Var2.f20107h[0], 1000000L, e71Var2.f20103d));
                }
            }
        } else {
            i14 = i12;
        }
        long[] jArr9 = e71Var2.f20107h;
        if (jArr9.length == 1) {
            i15 = 0;
            if (jArr9[0] == 0) {
                long[] jArr10 = e71Var2.f20108i;
                Objects.requireNonNull(jArr10);
                long j19 = jArr10[0];
                while (i15 < jArr.length) {
                    jArr[i15] = da1.a(jArr[i15] - j19, 1000000L, e71Var2.f20102c);
                    i15++;
                }
                return new k71(e71Var, jArr2, iArr, i11, jArr, iArr2, da1.a(j10 - j19, 1000000L, e71Var2.f20102c));
            }
        } else {
            i15 = 0;
        }
        boolean z12 = e71Var2.f20101b == 1 ? 1 : i15;
        int[] iArr11 = new int[jArr9.length];
        int[] iArr12 = new int[jArr9.length];
        long[] jArr11 = e71Var2.f20108i;
        Objects.requireNonNull(jArr11);
        int i47 = i15;
        int i48 = i47;
        int i49 = i48;
        while (true) {
            long[] jArr12 = e71Var2.f20107h;
            i16 = i11;
            iArr3 = iArr;
            if (i15 >= jArr12.length) {
                break;
            }
            long j20 = jArr11[i15];
            if (j20 != -1) {
                int i50 = i48;
                int i51 = i49;
                long jA5 = da1.a(jArr12[i15], e71Var2.f20102c, e71Var2.f20103d);
                iArr11[i15] = da1.b(jArr, j20, true);
                iArr12[i15] = da1.a(jArr, j20 + jA5, z12);
                while (true) {
                    i17 = iArr11[i15];
                    i18 = iArr12[i15];
                    if (i17 >= i18 || (iArr2[i17] & 1) != 0) {
                        break;
                    }
                    iArr11[i15] = i17 + 1;
                }
                int i52 = (i18 - i17) + i47;
                i48 = i50 | (i51 == i17 ? 0 : 1);
                i49 = i18;
                i47 = i52;
            }
            i15++;
            i11 = i16;
            i14 = i14;
            iArr = iArr3;
            jArr11 = jArr11;
        }
        int i53 = i48 | (i47 == i14 ? 0 : 1);
        long[] jArr13 = i53 != 0 ? new long[i47] : jArr2;
        int[] iArr13 = i53 != 0 ? new int[i47] : iArr3;
        int i54 = i53 != 0 ? 0 : i16;
        int[] iArr14 = i53 != 0 ? new int[i47] : iArr2;
        long[] jArr14 = new long[i47];
        int i55 = 0;
        int i56 = 0;
        long j21 = 0;
        int i57 = i54;
        while (i55 < e71Var2.f20107h.length) {
            long j22 = e71Var2.f20108i[i55];
            int i58 = iArr11[i55];
            int[] iArr15 = iArr11;
            int i59 = iArr12[i55];
            int[] iArr16 = iArr12;
            if (i53 != 0) {
                int i60 = i59 - i58;
                System.arraycopy(jArr2, i58, jArr13, i56, i60);
                iArr4 = iArr3;
                System.arraycopy(iArr4, i58, iArr13, i56, i60);
                System.arraycopy(iArr2, i58, iArr14, i56, i60);
            } else {
                iArr4 = iArr3;
            }
            int i61 = i57;
            while (true) {
                iArr5 = iArr4;
                long[] jArr15 = jArr13;
                if (i58 < i59) {
                    long j23 = j21;
                    long[] jArr16 = jArr;
                    int i62 = i58;
                    jArr14[i56] = da1.a(j21, 1000000L, e71Var2.f20103d) + da1.a(Math.max(0L, jArr[i58] - j22), 1000000L, e71Var2.f20102c);
                    if (i53 != 0 && iArr13[i56] > i61) {
                        i61 = iArr5[i62];
                    }
                    i56++;
                    i58 = i62 + 1;
                    iArr4 = iArr5;
                    jArr13 = jArr15;
                    jArr = jArr16;
                    j21 = j23;
                }
            }
            j21 += e71Var2.f20107h[i55];
            i55++;
            i57 = i61;
            jArr = jArr;
            iArr11 = iArr15;
            iArr12 = iArr16;
            jArr2 = jArr2;
            iArr3 = iArr5;
        }
        return new k71(e71Var, jArr13, iArr13, i57, jArr14, iArr14, da1.a(j21, 1000000L, e71Var2.f20103d));
    }

    private static b a(int i10, mp0 mp0Var) {
        mp0Var.e(i10 + 8 + 4);
        mp0Var.f(1);
        while ((mp0Var.t() & 128) == 128) {
        }
        mp0Var.f(2);
        int iT = mp0Var.t();
        if ((iT & 128) != 0) {
            mp0Var.f(2);
        }
        if ((iT & 64) != 0) {
            mp0Var.f(mp0Var.t());
        }
        if ((iT & 32) != 0) {
            mp0Var.f(2);
        }
        mp0Var.f(1);
        while ((mp0Var.t() & 128) == 128) {
        }
        String strA = te0.a(mp0Var.t());
        if ("audio/mpeg".equals(strA) || "audio/vnd.dts".equals(strA) || "audio/vnd.dts.hd".equals(strA)) {
            return new b(strA, null, -1L, -1L);
        }
        mp0Var.f(4);
        long jV = mp0Var.v();
        long jV2 = mp0Var.v();
        mp0Var.f(1);
        int iT2 = mp0Var.t();
        int i11 = iT2 & 127;
        while ((iT2 & 128) == 128) {
            iT2 = mp0Var.t();
            i11 = (i11 << 7) | (iT2 & 127);
        }
        byte[] bArr = new byte[i11];
        mp0Var.a(bArr, 0, i11);
        return new b(strA, bArr, jV2 > 0 ? jV2 : -1L, jV > 0 ? jV : -1L);
    }

    /* JADX WARN: Code duplicated, block: B:328:0x0583  */
    /* JADX WARN: Code duplicated, block: B:330:0x058e  */
    /* JADX WARN: Code duplicated, block: B:331:0x0590  */
    /* JADX WARN: Code duplicated, block: B:334:0x059f  */
    /* JADX WARN: Code duplicated, block: B:336:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:338:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:344:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:346:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:348:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:349:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:351:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:353:0x0617  */
    /* JADX WARN: Code duplicated, block: B:354:0x061b  */
    /* JADX WARN: Code duplicated, block: B:356:0x0637  */
    /* JADX WARN: Code duplicated, block: B:358:0x063e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:359:0x0640  */
    /* JADX WARN: Code duplicated, block: B:362:0x065f  */
    /* JADX WARN: Code duplicated, block: B:364:0x0664  */
    /* JADX WARN: Code duplicated, block: B:366:0x068d  */
    /* JADX WARN: Code duplicated, block: B:368:0x0692  */
    /* JADX WARN: Code duplicated, block: B:369:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:371:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:372:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:374:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:375:0x072c  */
    /* JADX WARN: Code duplicated, block: B:377:0x0736  */
    /* JADX WARN: Code duplicated, block: B:379:0x0739  */
    /* JADX WARN: Code duplicated, block: B:381:0x073f  */
    /* JADX WARN: Code duplicated, block: B:382:0x0741  */
    /* JADX WARN: Code duplicated, block: B:386:0x074a  */
    /* JADX WARN: Code duplicated, block: B:388:0x0753  */
    /* JADX WARN: Code duplicated, block: B:389:0x0755  */
    /* JADX WARN: Code duplicated, block: B:393:0x0763 A[LOOP:4: B:384:0x0746->B:393:0x0763, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:396:0x076c  */
    /* JADX WARN: Code duplicated, block: B:398:0x077a  */
    /* JADX WARN: Code duplicated, block: B:400:0x0782  */
    /* JADX WARN: Code duplicated, block: B:401:0x079a  */
    /* JADX WARN: Code duplicated, block: B:403:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:404:0x07a7 A[PHI: r47 r48
  0x07a7: PHI (r47v7 java.util.List<byte[]>) = (r2v35 java.util.List<byte[]>), (r47v10 java.util.List<byte[]>) binds: [B:395:0x076a, B:373:0x06e0] A[DONT_GENERATE, DONT_INLINE]
  0x07a7: PHI (r48v2 int) = (r9v65 int), (r48v5 int) binds: [B:395:0x076a, B:373:0x06e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:414:0x0809  */
    /* JADX WARN: Code duplicated, block: B:416:0x0815  */
    /* JADX WARN: Code duplicated, block: B:418:0x084b  */
    /* JADX WARN: Code duplicated, block: B:420:0x0855  */
    /* JADX WARN: Code duplicated, block: B:422:0x0861  */
    /* JADX WARN: Code duplicated, block: B:423:0x0863  */
    /* JADX WARN: Code duplicated, block: B:425:0x0874  */
    /* JADX WARN: Code duplicated, block: B:427:0x087b  */
    /* JADX WARN: Code duplicated, block: B:430:0x0887  */
    /* JADX WARN: Code duplicated, block: B:431:0x088a  */
    /* JADX WARN: Code duplicated, block: B:433:0x088f  */
    /* JADX WARN: Code duplicated, block: B:434:0x0892  */
    /* JADX WARN: Code duplicated, block: B:438:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:440:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:443:0x08d3  */
    /* JADX WARN: Code duplicated, block: B:445:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:446:0x08d9  */
    /* JADX WARN: Code duplicated, block: B:449:0x08e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:450:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:451:0x08ec  */
    /* JADX WARN: Code duplicated, block: B:454:0x0900  */
    /* JADX WARN: Code duplicated, block: B:457:0x0922  */
    /* JADX WARN: Code duplicated, block: B:459:0x0927 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:460:0x0929  */
    /* JADX WARN: Code duplicated, block: B:461:0x092b  */
    /* JADX WARN: Code duplicated, block: B:464:0x093f  */
    /* JADX WARN: Code duplicated, block: B:466:0x0946  */
    /* JADX WARN: Code duplicated, block: B:468:0x094b  */
    /* JADX WARN: Code duplicated, block: B:593:0x0ba4  */
    /* JADX WARN: Code duplicated, block: B:595:0x0bbc  */
    /* JADX WARN: Code duplicated, block: B:601:0x0bec  */
    /* JADX WARN: Code duplicated, block: B:602:0x0bf3  */
    /* JADX WARN: Code duplicated, block: B:604:0x0c39  */
    /* JADX WARN: Code duplicated, block: B:606:0x0c3f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:609:0x0c44  */
    /* JADX WARN: Code duplicated, block: B:612:0x0c4c  */
    /* JADX WARN: Code duplicated, block: B:613:0x0c51  */
    /* JADX WARN: Code duplicated, block: B:616:0x0c5a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0113 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:621:0x0ca6  */
    /* JADX WARN: Code duplicated, block: B:623:0x0cb1  */
    /* JADX WARN: Code duplicated, block: B:625:0x0cba  */
    /* JADX WARN: Code duplicated, block: B:626:0x0cbc  */
    /* JADX WARN: Code duplicated, block: B:628:0x0cd6  */
    /* JADX WARN: Code duplicated, block: B:62:0x0115 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:630:0x0cd9  */
    /* JADX WARN: Code duplicated, block: B:631:0x0cde  */
    /* JADX WARN: Code duplicated, block: B:634:0x0ce6  */
    /* JADX WARN: Code duplicated, block: B:635:0x0ceb  */
    /* JADX WARN: Code duplicated, block: B:638:0x0cf8 A[LOOP:7: B:627:0x0cd4->B:638:0x0cf8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:643:0x0d0d  */
    /* JADX WARN: Code duplicated, block: B:644:0x0d18  */
    /* JADX WARN: Code duplicated, block: B:648:0x0d23  */
    /* JADX WARN: Code duplicated, block: B:651:0x0d52  */
    /* JADX WARN: Code duplicated, block: B:652:0x0d57  */
    /* JADX WARN: Code duplicated, block: B:657:0x0648 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:0x0cff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:673:0x0768 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:0x0737 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:0x0bd7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:0x08c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0120 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x0129  */
    /* JADX WARN: Code duplicated, block: B:74:0x0133  */
    /* JADX WARN: Code duplicated, block: B:75:0x013a  */
    /* JADX WARN: Code duplicated, block: B:78:0x014d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0150  */
    /* JADX WARN: Code duplicated, block: B:82:0x015d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0160  */
    /* JADX WARN: Code duplicated, block: B:86:0x0198  */
    /* JADX WARN: Code duplicated, block: B:87:0x019b  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:94:0x020f  */
    /* JADX WARN: Code duplicated, block: B:96:0x021f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0221  */
    public static ArrayList a(rb.a aVar, yx yxVar, long j10, DrmInitData drmInitData, boolean z10, boolean z11, vx vxVar) throws qp0 {
        int i10;
        boolean z12;
        long jV;
        int iH;
        int i11;
        f fVar;
        long j11;
        mp0 mp0Var;
        int i12;
        long jV2;
        long jA;
        int iB;
        int i13;
        int i14;
        Pair pairCreate;
        mp0 mp0Var2;
        int i15;
        int i16;
        String str;
        int iH2;
        int i17;
        f71[] f71VarArr;
        ArrayList arrayList;
        int i18;
        yv yvVarA;
        int i19;
        int i20;
        f fVar2;
        f71[] f71VarArr2;
        rb.a aVar2;
        long j12;
        Pair pair;
        int i21;
        long j13;
        long[] jArr;
        long[] jArr2;
        e71 e71Var;
        rb.a aVarC;
        rb.b bVarD;
        mp0 mp0Var3;
        int iB2;
        int iX;
        long[] jArr3;
        long[] jArr4;
        int i22;
        Pair pairCreate2;
        long jV3;
        long jH;
        int iD;
        int iH3;
        boolean z13;
        String str2;
        int iH4;
        int i23;
        int iZ;
        int iZ2;
        int iD2;
        int i24;
        int i25;
        DrmInitData drmInitDataA;
        String str3;
        int i26;
        boolean z14;
        DrmInitData drmInitData2;
        int i27;
        String str4;
        int i28;
        ByteBuffer byteBufferOrder;
        b bVar;
        int i29;
        int i30;
        int i31;
        List<byte[]> listA;
        float f10;
        String str5;
        byte[] bArrCopyOfRange;
        byte[] bArr;
        int i32;
        float f11;
        int i33;
        int i34;
        yv.a aVarA;
        int i35;
        int i36;
        int i37;
        byte[] bArrArray;
        int iD3;
        int iH5;
        boolean z15;
        int iH6;
        int i38;
        int i39;
        int i40;
        float fX;
        pq pqVarA;
        int i41;
        String str6;
        boolean z16;
        uy uyVarA;
        List<byte[]> list;
        int i42;
        String str7;
        String str8;
        boolean z17;
        rc rcVarA;
        Pair pairA;
        int iZ3;
        int i43;
        int iRound;
        int i44;
        DrmInitData drmInitData3;
        String str9;
        int i45;
        int i46;
        List<byte[]> listA2;
        String str10;
        int i47;
        yv yvVarA2;
        b bVar2;
        int i48;
        int iH7;
        boolean z18;
        int iH8;
        int i49;
        int iD4;
        boolean z19;
        int i50;
        int iH9;
        boolean z20;
        b bVarA;
        byte[] bArr2;
        yv.a aVarN;
        int i51;
        yv yvVarB;
        String str11;
        com.yandex.mobile.ads.embedded.guava.collect.p pVarA;
        long j14;
        yv.a aVarF;
        e71 e71Var2;
        ArrayList arrayList2 = new ArrayList();
        int i52 = 0;
        while (i52 < aVar.f24656d.size()) {
            rb.a aVar3 = (rb.a) aVar.f24656d.get(i52);
            if (aVar3.f24653a != 1953653099) {
                i17 = i52;
            } else {
                rb.b bVarD2 = aVar.d(1836476516);
                Objects.requireNonNull(bVarD2);
                rb.a aVarC2 = aVar3.c(1835297121);
                Objects.requireNonNull(aVarC2);
                rb.b bVarD3 = aVarC2.d(1751411826);
                Objects.requireNonNull(bVarD3);
                mp0 mp0Var4 = bVarD3.f24657b;
                mp0Var4.e(16);
                int iH10 = mp0Var4.h();
                if (iH10 == 1936684398) {
                    i10 = 1;
                } else if (iH10 == 1986618469) {
                    i10 = 2;
                } else if (iH10 == 1952807028 || iH10 == 1935832172 || iH10 == 1937072756 || iH10 == 1668047728) {
                    i10 = 3;
                } else {
                    i10 = iH10 == 1835365473 ? 5 : -1;
                }
                if (i10 == -1) {
                    arrayList = arrayList2;
                    i17 = i52;
                } else {
                    rb.b bVarD4 = aVar3.d(1953196132);
                    Objects.requireNonNull(bVarD4);
                    mp0 mp0Var5 = bVarD4.f24657b;
                    mp0Var5.e(8);
                    int iB3 = rb.b(mp0Var5.h());
                    mp0Var5.f(iB3 == 0 ? 8 : 16);
                    int iH11 = mp0Var5.h();
                    mp0Var5.f(4);
                    int iD5 = mp0Var5.d();
                    int i53 = iB3 == 0 ? 4 : 8;
                    int i54 = 0;
                    while (true) {
                        if (i54 >= i53) {
                            z12 = true;
                            break;
                        }
                        if (mp0Var5.c()[iD5 + i54] != -1) {
                            z12 = false;
                            break;
                        }
                        i54++;
                    }
                    if (z12) {
                        mp0Var5.f(i53);
                    } else {
                        jV = iB3 == 0 ? mp0Var5.v() : mp0Var5.y();
                        if (jV == 0) {
                        }
                        mp0Var5.f(16);
                        iH = mp0Var5.h();
                        int iH12 = mp0Var5.h();
                        mp0Var5.f(4);
                        int iH13 = mp0Var5.h();
                        int iH14 = mp0Var5.h();
                        if (iH != 0 && iH12 == 65536 && iH13 == -65536 && iH14 == 0) {
                            i11 = 90;
                        } else if (iH != 0 && iH12 == -65536 && iH13 == 65536 && iH14 == 0) {
                            i11 = 270;
                        } else if (iH != -65536 && iH12 == 0 && iH13 == 0 && iH14 == -65536) {
                            i11 = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                        } else {
                            i11 = 0;
                        }
                        fVar = new f(iH11, i11, jV);
                        if (j10 == -9223372036854775807L) {
                            j11 = fVar.f25034b;
                        } else {
                            j11 = j10;
                        }
                        mp0Var = bVarD2.f24657b;
                        mp0Var.e(8);
                        if (rb.b(mp0Var.h()) == 0) {
                            i12 = 8;
                        } else {
                            i12 = 16;
                        }
                        mp0Var.f(i12);
                        jV2 = mp0Var.v();
                        if (j11 == -9223372036854775807L) {
                            jA = -9223372036854775807L;
                        } else {
                            jA = da1.a(j11, 1000000L, jV2);
                        }
                        rb.a aVarC3 = aVarC2.c(1835626086);
                        Objects.requireNonNull(aVarC3);
                        rb.a aVarC4 = aVarC3.c(1937007212);
                        Objects.requireNonNull(aVarC4);
                        rb.b bVarD5 = aVarC2.d(1835296868);
                        Objects.requireNonNull(bVarD5);
                        mp0 mp0Var6 = bVarD5.f24657b;
                        mp0Var6.e(8);
                        iB = rb.b(mp0Var6.h());
                        if (iB == 0) {
                            i13 = 8;
                        } else {
                            i13 = 16;
                        }
                        mp0Var6.f(i13);
                        long jV4 = mp0Var6.v();
                        if (iB == 0) {
                            i14 = 4;
                        } else {
                            i14 = 8;
                        }
                        mp0Var6.f(i14);
                        int iZ4 = mp0Var6.z();
                        StringBuilder sbA = v60.a("");
                        sbA.append((char) (((iZ4 >> 10) & 31) + 96));
                        sbA.append((char) (((iZ4 >> 5) & 31) + 96));
                        sbA.append((char) ((iZ4 & 31) + 96));
                        pairCreate = Pair.create(Long.valueOf(jV4), sbA.toString());
                        rb.b bVarD6 = aVarC4.d(1937011556);
                        Objects.requireNonNull(bVarD6);
                        mp0Var2 = bVarD6.f24657b;
                        i15 = fVar.f25033a;
                        i16 = fVar.f25035c;
                        str = (String) pairCreate.second;
                        mp0Var2.e(12);
                        iH2 = mp0Var2.h();
                        i17 = i52;
                        f71VarArr = new f71[iH2];
                        arrayList = arrayList2;
                        i18 = 0;
                        yvVarA = null;
                        i19 = 0;
                        i20 = 0;
                        while (i18 < iH2) {
                            int i55 = iH2;
                            iD = mp0Var2.d();
                            long j15 = jA;
                            iH3 = mp0Var2.h();
                            long j16 = jV2;
                            if (iH3 > 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            str2 = "childAtomSize must be positive";
                            xt.a("childAtomSize must be positive", z13);
                            iH4 = mp0Var2.h();
                            int i56 = i10;
                            if (iH4 != 1635148593 || iH4 == 1635148595 || iH4 == 1701733238 || iH4 == 1831958048 || iH4 == 1836070006 || iH4 == 1752589105 || iH4 == 1751479857 || iH4 == 1932670515 || iH4 == 1211250227 || iH4 == 1987063864 || iH4 == 1987063865 || iH4 == 1635135537 || iH4 == 1685479798 || iH4 == 1685479729 || iH4 == 1685481573 || iH4 == 1685481521) {
                                i18 = i18;
                                fVar = fVar;
                                f71VarArr = f71VarArr;
                                aVar3 = aVar3;
                                pairCreate = pairCreate;
                                i23 = i16;
                                mp0Var2.e(iD + 8 + 8);
                                mp0Var2.f(16);
                                iZ = mp0Var2.z();
                                iZ2 = mp0Var2.z();
                                mp0Var2.f(50);
                                iD2 = mp0Var2.d();
                                if (iH4 == 1701733238) {
                                    i24 = iH3;
                                    i25 = iD;
                                    pairA = a(i25, i24, mp0Var2);
                                    if (pairA != null) {
                                        iH4 = ((Integer) pairA.first).intValue();
                                        if (drmInitData == null) {
                                            drmInitDataA = null;
                                        } else {
                                            drmInitDataA = drmInitData.a(((f71) pairA.second).f20573b);
                                        }
                                        f71VarArr[i18] = (f71) pairA.second;
                                    } else {
                                        drmInitDataA = drmInitData;
                                    }
                                    mp0Var2.e(iD2);
                                } else {
                                    i24 = iH3;
                                    i25 = iD;
                                    drmInitDataA = drmInitData;
                                }
                                if (iH4 == 1831958048) {
                                    str3 = "video/mpeg";
                                } else if (iH4 == 1211250227) {
                                    str3 = "video/3gpp";
                                } else {
                                    str3 = null;
                                }
                                i26 = iD2;
                                z14 = false;
                                drmInitData2 = drmInitDataA;
                                str = str;
                                i27 = i20;
                                str4 = null;
                                i28 = -1;
                                byteBufferOrder = null;
                                bVar = null;
                                i29 = -1;
                                i30 = -1;
                                i31 = -1;
                                listA = null;
                                f10 = 1.0f;
                                str5 = str3;
                                bArrCopyOfRange = null;
                                while (true) {
                                    if (i26 - i25 >= i24) {
                                        bArr = bArrCopyOfRange;
                                        i32 = i28;
                                        break;
                                    }
                                    mp0Var2.e(i26);
                                    iD3 = mp0Var2.d();
                                    i32 = i28;
                                    iH5 = mp0Var2.h();
                                    if (iH5 == 0) {
                                        bArr = bArrCopyOfRange;
                                        if (mp0Var2.d() - i25 == i24) {
                                            break;
                                        }
                                    } else {
                                        bArr = bArrCopyOfRange;
                                    }
                                    if (iH5 > 0) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    xt.a(str2, z15);
                                    iH6 = mp0Var2.h();
                                    String str12 = str2;
                                    if (iH6 == 1635148611) {
                                        if (str5 == null) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        xt.a(null, z17);
                                        mp0Var2.e(iD3 + 8);
                                        rcVarA = rc.a(mp0Var2);
                                        list = rcVarA.f24661a;
                                        i42 = rcVarA.f24662b;
                                        if (!z14) {
                                            f10 = rcVarA.f24665e;
                                        }
                                        str7 = rcVarA.f24666f;
                                        str8 = "video/avc";
                                    } else {
                                        if (iH6 == 1752589123) {
                                            if (str5 == null) {
                                                z16 = true;
                                            } else {
                                                z16 = false;
                                            }
                                            xt.a(null, z16);
                                            mp0Var2.e(iD3 + 8);
                                            uyVarA = uy.a(mp0Var2);
                                            list = uyVarA.f25757a;
                                            i42 = uyVarA.f25758b;
                                            if (!z14) {
                                                f10 = uyVarA.f25759c;
                                            }
                                            str7 = uyVarA.f25760d;
                                            str8 = "video/hevc";
                                        } else {
                                            if (iH6 != 1685480259 || iH6 == 1685485123) {
                                                iZ = iZ;
                                                iZ2 = iZ2;
                                                i38 = i25;
                                                i39 = iH4;
                                                i40 = i24;
                                                fX = f10;
                                                pqVarA = pq.a(mp0Var2);
                                                if (pqVarA != null) {
                                                    str4 = pqVarA.f24225a;
                                                    str5 = "video/dolby-vision";
                                                }
                                            } else {
                                                if (iH6 == 1987076931) {
                                                    xt.a(null, str5 == null);
                                                    str6 = iH4 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                } else if (iH6 == 1635135811) {
                                                    xt.a(null, str5 == null);
                                                    str6 = "video/av01";
                                                } else if (iH6 == 1668050025) {
                                                    if (byteBufferOrder == null) {
                                                        byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                    }
                                                    byteBufferOrder.position(21);
                                                    byteBufferOrder.putShort(mp0Var2.r());
                                                    byteBufferOrder.putShort(mp0Var2.r());
                                                    i38 = i25;
                                                    i39 = iH4;
                                                    i40 = i24;
                                                    fX = f10;
                                                    bArrCopyOfRange = bArr;
                                                } else {
                                                    if (iH6 == 1835295606) {
                                                        if (byteBufferOrder == null) {
                                                            byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                        }
                                                        short sR = mp0Var2.r();
                                                        short sR2 = mp0Var2.r();
                                                        short sR3 = mp0Var2.r();
                                                        i39 = iH4;
                                                        short sR4 = mp0Var2.r();
                                                        i38 = i25;
                                                        short sR5 = mp0Var2.r();
                                                        i40 = i24;
                                                        short sR6 = mp0Var2.r();
                                                        fX = f10;
                                                        short sR7 = mp0Var2.r();
                                                        iZ2 = iZ2;
                                                        short sR8 = mp0Var2.r();
                                                        long jV5 = mp0Var2.v();
                                                        long jV6 = mp0Var2.v();
                                                        iZ = iZ;
                                                        byteBufferOrder.position(1);
                                                        byteBufferOrder.putShort(sR5);
                                                        byteBufferOrder.putShort(sR6);
                                                        byteBufferOrder.putShort(sR);
                                                        byteBufferOrder.putShort(sR2);
                                                        byteBufferOrder.putShort(sR3);
                                                        byteBufferOrder.putShort(sR4);
                                                        byteBufferOrder.putShort(sR7);
                                                        byteBufferOrder.putShort(sR8);
                                                        byteBufferOrder.putShort((short) (jV5 / AbstractComponentTracker.LINGERING_TIMEOUT));
                                                        byteBufferOrder.putShort((short) (jV6 / AbstractComponentTracker.LINGERING_TIMEOUT));
                                                    } else {
                                                        iZ = iZ;
                                                        iZ2 = iZ2;
                                                        i38 = i25;
                                                        i39 = iH4;
                                                        i40 = i24;
                                                        fX = f10;
                                                        if (iH6 == 1681012275) {
                                                            xt.a(null, str5 == null);
                                                            str5 = "video/3gpp";
                                                        } else if (iH6 == 1702061171) {
                                                            xt.a(null, str5 == null);
                                                            b bVarA2 = a(iD3, mp0Var2);
                                                            String str13 = bVarA2.f25021a;
                                                            byte[] bArr3 = bVarA2.f25022b;
                                                            if (bArr3 != null) {
                                                                listA = com.yandex.mobile.ads.embedded.guava.collect.p.a(bArr3);
                                                            }
                                                            bVar = bVarA2;
                                                            str5 = str13;
                                                        } else if (iH6 == 1885434736) {
                                                            mp0Var2.e(iD3 + 8);
                                                            fX = mp0Var2.x() / mp0Var2.x();
                                                            bArrCopyOfRange = bArr;
                                                            z14 = true;
                                                        } else if (iH6 == 1937126244) {
                                                            int i57 = iD3 + 8;
                                                            while (true) {
                                                                if (i57 - iD3 >= iH5) {
                                                                    bArrCopyOfRange = null;
                                                                    break;
                                                                }
                                                                mp0Var2.e(i57);
                                                                int iH15 = mp0Var2.h();
                                                                if (mp0Var2.h() == 1886547818) {
                                                                    bArrCopyOfRange = Arrays.copyOfRange(mp0Var2.c(), i57, iH15 + i57);
                                                                    break;
                                                                }
                                                                i57 += iH15;
                                                            }
                                                        } else if (iH6 == 1936995172) {
                                                            int iT = mp0Var2.t();
                                                            mp0Var2.f(3);
                                                            if (iT == 0) {
                                                                int iT2 = mp0Var2.t();
                                                                if (iT2 == 0) {
                                                                    bArrCopyOfRange = bArr;
                                                                    i32 = 0;
                                                                } else if (iT2 == 1) {
                                                                    bArrCopyOfRange = bArr;
                                                                    i32 = 1;
                                                                } else if (iT2 == 2) {
                                                                    bArrCopyOfRange = bArr;
                                                                    i32 = 2;
                                                                } else if (iT2 == 3) {
                                                                    i32 = 3;
                                                                    bArrCopyOfRange = bArr;
                                                                }
                                                            }
                                                        } else if (iH6 == 1668246642) {
                                                            int iH16 = mp0Var2.h();
                                                            if (iH16 == 1852009592 || iH16 == 1852009571) {
                                                                int iZ5 = mp0Var2.z();
                                                                int iZ6 = mp0Var2.z();
                                                                mp0Var2.f(2);
                                                                boolean z21 = iH5 == 19 && (mp0Var2.t() & 128) != 0;
                                                                wf.a<nj> aVar4 = nj.f23395f;
                                                                int i58 = 7;
                                                                if (iZ5 == 1) {
                                                                    i41 = 1;
                                                                } else if (iZ5 != 9) {
                                                                    i41 = (iZ5 == 4 || iZ5 == 5 || iZ5 == 6 || iZ5 == 7) ? 2 : -1;
                                                                } else {
                                                                    i41 = 6;
                                                                }
                                                                int i59 = z21 ? 1 : 2;
                                                                if (iZ6 != 1) {
                                                                    if (iZ6 == 16) {
                                                                        i58 = 6;
                                                                    } else if (iZ6 != 18) {
                                                                        if (iZ6 != 6 && iZ6 != 7) {
                                                                            i58 = -1;
                                                                        }
                                                                    }
                                                                    i31 = i41;
                                                                    i30 = i59;
                                                                    i29 = i58;
                                                                }
                                                                i58 = 3;
                                                                i31 = i41;
                                                                i30 = i59;
                                                                i29 = i58;
                                                            } else {
                                                                StringBuilder sbA2 = v60.a("Unsupported color type: ");
                                                                sbA2.append(rb.a(iH16));
                                                                p90.d("AtomParsers", sbA2.toString());
                                                            }
                                                        }
                                                    }
                                                    bArrCopyOfRange = bArr;
                                                }
                                                str5 = str6;
                                                i38 = i25;
                                                i39 = iH4;
                                                i40 = i24;
                                                fX = f10;
                                                bArrCopyOfRange = bArr;
                                            }
                                            bArrCopyOfRange = bArr;
                                        }
                                        i26 += iH5;
                                        i28 = i32;
                                        str2 = str12;
                                        iH4 = i39;
                                        i25 = i38;
                                        i24 = i40;
                                        f10 = fX;
                                        iZ2 = iZ2;
                                        iZ = iZ;
                                    }
                                    iZ = iZ;
                                    iZ2 = iZ2;
                                    listA = list;
                                    i38 = i25;
                                    i27 = i42;
                                    i39 = iH4;
                                    i40 = i24;
                                    str5 = str8;
                                    fX = f10;
                                    bArrCopyOfRange = bArr;
                                    str4 = str7;
                                    i26 += iH5;
                                    i28 = i32;
                                    str2 = str12;
                                    iH4 = i39;
                                    i25 = i38;
                                    i24 = i40;
                                    f10 = fX;
                                    iZ2 = iZ2;
                                    iZ = iZ;
                                }
                                f11 = f10;
                                if (str5 == null) {
                                    i34 = i23;
                                    i20 = i27;
                                } else {
                                    yv.a aVarB = new yv.a().h(i15).f(str5).a(str4).q(iZ).g(i33).b(f11);
                                    i34 = i23;
                                    aVarA = aVarB.m(i34).a(bArr).p(i32).a(listA).a(drmInitData2);
                                    i35 = i31;
                                    if (i35 == -1) {
                                        i37 = i30;
                                        i36 = i29;
                                        if (i37 == -1 || i36 != -1 || byteBufferOrder != null) {
                                        }
                                        if (bVar != null) {
                                            aVarA.b(h70.b(bVar.f25023c)).k(h70.b(bVar.f25024d));
                                        }
                                        yvVarA = aVarA.a();
                                        i20 = i27;
                                    } else {
                                        i33 = iZ2;
                                        i36 = i29;
                                        i37 = i30;
                                    }
                                    i33 = iZ2;
                                    if (byteBufferOrder != null) {
                                        bArrArray = byteBufferOrder.array();
                                    } else {
                                        bArrArray = null;
                                    }
                                    aVarA.a(new nj(i35, i37, i36, bArrArray));
                                    if (bVar != null) {
                                        aVarA.b(h70.b(bVar.f25023c)).k(h70.b(bVar.f25024d));
                                    }
                                    yvVarA = aVarA.a();
                                    i20 = i27;
                                }
                            } else {
                                if (iH4 == 1836069985 || iH4 == 1701733217 || iH4 == 1633889587 || iH4 == 1700998451 || iH4 == 1633889588 || iH4 == 1835823201 || iH4 == 1685353315 || iH4 == 1685353317 || iH4 == 1685353320 || iH4 == 1685353324 || iH4 == 1685353336 || iH4 == 1935764850 || iH4 == 1935767394 || iH4 == 1819304813 || iH4 == 1936684916 || iH4 == 1953984371 || iH4 == 778924082 || iH4 == 778924083 || iH4 == 1835557169 || iH4 == 1835560241 || iH4 == 1634492771 || iH4 == 1634492791 || iH4 == 1970037111 || iH4 == 1332770163 || iH4 == 1716281667) {
                                    pairCreate = pairCreate;
                                    mp0Var2.e(iD + 8 + 8);
                                    if (z11) {
                                        iZ3 = mp0Var2.z();
                                        mp0Var2.f(6);
                                    } else {
                                        mp0Var2.f(8);
                                        iZ3 = 0;
                                    }
                                    if (iZ3 == 0 || iZ3 == 1) {
                                        int iZ7 = mp0Var2.z();
                                        mp0Var2.f(6);
                                        int iU = mp0Var2.u();
                                        i43 = iZ7;
                                        mp0Var2.e(mp0Var2.d() - 4);
                                        int iH17 = mp0Var2.h();
                                        if (iZ3 == 1) {
                                            mp0Var2.f(16);
                                        }
                                        iRound = iU;
                                        i44 = iH17;
                                    } else if (iZ3 == 2) {
                                        mp0Var2.f(16);
                                        iRound = (int) Math.round(Double.longBitsToDouble(mp0Var2.p()));
                                        int iX2 = mp0Var2.x();
                                        mp0Var2.f(20);
                                        i43 = iX2;
                                        i44 = 0;
                                    }
                                    int iD6 = mp0Var2.d();
                                    int i60 = iRound;
                                    if (iH4 == 1701733217) {
                                        Pair pairA2 = a(iD, iH3, mp0Var2);
                                        if (pairA2 != null) {
                                            int iIntValue = ((Integer) pairA2.first).intValue();
                                            DrmInitData drmInitDataA2 = drmInitData == null ? null : drmInitData.a(((f71) pairA2.second).f20573b);
                                            f71VarArr[i18] = (f71) pairA2.second;
                                            drmInitData3 = drmInitDataA2;
                                            iH4 = iIntValue;
                                        } else {
                                            drmInitData3 = drmInitData;
                                        }
                                        mp0Var2.e(iD6);
                                    } else {
                                        drmInitData3 = drmInitData;
                                    }
                                    if (iH4 == 1633889587) {
                                        str9 = "audio/ac3";
                                    } else if (iH4 == 1700998451) {
                                        str9 = "audio/eac3";
                                    } else if (iH4 == 1633889588) {
                                        str9 = "audio/ac4";
                                    } else if (iH4 == 1685353315) {
                                        str9 = "audio/vnd.dts";
                                    } else if (iH4 == 1685353320 || iH4 == 1685353324) {
                                        str9 = "audio/vnd.dts.hd";
                                    } else if (iH4 == 1685353317) {
                                        str9 = "audio/vnd.dts.hd;profile=lbr";
                                    } else if (iH4 == 1685353336) {
                                        str9 = "audio/vnd.dts.uhd;profile=p2";
                                    } else if (iH4 == 1935764850) {
                                        str9 = "audio/3gpp";
                                    } else if (iH4 == 1935767394) {
                                        str9 = "audio/amr-wb";
                                    } else {
                                        if (iH4 == 1819304813 || iH4 == 1936684916) {
                                            str9 = "audio/raw";
                                            i45 = 2;
                                        } else if (iH4 == 1953984371) {
                                            i45 = 268435456;
                                            str9 = "audio/raw";
                                        } else if (iH4 == 778924082 || iH4 == 778924083) {
                                            str9 = "audio/mpeg";
                                        } else if (iH4 == 1835557169) {
                                            str9 = "audio/mha1";
                                        } else if (iH4 == 1835560241) {
                                            str9 = "audio/mhm1";
                                        } else if (iH4 == 1634492771) {
                                            str9 = "audio/alac";
                                        } else if (iH4 == 1634492791) {
                                            str9 = "audio/g711-alaw";
                                        } else if (iH4 == 1970037111) {
                                            str9 = "audio/g711-mlaw";
                                        } else if (iH4 == 1332770163) {
                                            str9 = "audio/opus";
                                        } else if (iH4 == 1716281667) {
                                            str9 = "audio/flac";
                                        } else {
                                            str9 = iH4 == 1835823201 ? "audio/true-hd" : null;
                                        }
                                        i18 = i18;
                                        f71VarArr = f71VarArr;
                                        int i61 = i16;
                                        i46 = i43;
                                        listA2 = null;
                                        str10 = null;
                                        fVar = fVar;
                                        i47 = i60;
                                        yvVarA2 = yvVarA;
                                        bVar2 = null;
                                        aVar3 = aVar3;
                                        i48 = iD6;
                                        while (i48 - iD < iH3) {
                                            mp0Var2.e(i48);
                                            iH7 = mp0Var2.h();
                                            int i62 = iH3;
                                            if (iH7 > 0) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                            xt.a("childAtomSize must be positive", z18);
                                            iH8 = mp0Var2.h();
                                            int i63 = iD;
                                            if (iH8 == 1835557187) {
                                                int i64 = iH7 - 13;
                                                byte[] bArr4 = new byte[i64];
                                                mp0Var2.e(i48 + 13);
                                                mp0Var2.a(bArr4, 0, i64);
                                                listA2 = com.yandex.mobile.ads.embedded.guava.collect.p.a(bArr4);
                                                i44 = i44;
                                            } else {
                                                if (iH8 != 1702061171) {
                                                    if (z11 || iH8 != 2002876005) {
                                                        if (iH8 == 1684103987) {
                                                            mp0Var2.e(i48 + 8);
                                                            yvVarB = i.a(mp0Var2, Integer.toString(i15), str, drmInitData3);
                                                        } else if (iH8 == 1684366131) {
                                                            mp0Var2.e(i48 + 8);
                                                            yvVarB = i.b(mp0Var2, Integer.toString(i15), str, drmInitData3);
                                                        } else {
                                                            if (iH8 == 1684103988) {
                                                                mp0Var2.e(i48 + 8);
                                                                String string = Integer.toString(i15);
                                                                mp0Var2.f(1);
                                                                listA2 = listA2;
                                                                if (((mp0Var2.t() & 32) >> 5) == 1) {
                                                                    i51 = 48000;
                                                                } else {
                                                                    i51 = 44100;
                                                                }
                                                                aVarN = new yv.a().c(string).f("audio/ac4").c(2).n(i51);
                                                            } else {
                                                                listA2 = listA2;
                                                                if (iH8 == 1684892784) {
                                                                    if (i44 > 0) {
                                                                        throw qp0.a("Invalid sample rate for Dolby TrueHD MLP stream: " + i44, (Exception) null);
                                                                    }
                                                                    i47 = i44;
                                                                    i44 = i47;
                                                                    listA2 = listA2;
                                                                    i46 = 2;
                                                                } else if (iH8 == 1684305011) {
                                                                    aVarN = new yv.a().h(i15).f(str9).c(i46).n(i47);
                                                                } else if (iH8 == 1682927731) {
                                                                    int i65 = iH7 - 8;
                                                                    byte[] bArr5 = f25010a;
                                                                    byte[] bArrCopyOf = Arrays.copyOf(bArr5, bArr5.length + i65);
                                                                    i44 = i44;
                                                                    mp0Var2.e(i48 + 8);
                                                                    mp0Var2.a(bArrCopyOf, bArr5.length, i65);
                                                                    listA2 = ap0.a(bArrCopyOf);
                                                                } else {
                                                                    i44 = i44;
                                                                    if (iH8 == 1684425825) {
                                                                        int i66 = iH7 - 12;
                                                                        byte[] bArr6 = new byte[i66 + 4];
                                                                        bArr6[0] = 102;
                                                                        bArr6[1] = 76;
                                                                        bArr6[2] = 97;
                                                                        bArr6[3] = 67;
                                                                        mp0Var2.e(i48 + 12);
                                                                        mp0Var2.a(bArr6, 4, i66);
                                                                        listA2 = com.yandex.mobile.ads.embedded.guava.collect.p.a(bArr6);
                                                                    } else if (iH8 == 1634492771) {
                                                                        int i67 = iH7 - 12;
                                                                        byte[] bArr7 = new byte[i67];
                                                                        mp0Var2.e(i48 + 12);
                                                                        mp0Var2.a(bArr7, 0, i67);
                                                                        mp0 mp0Var7 = new mp0(bArr7);
                                                                        mp0Var7.e(9);
                                                                        int iT3 = mp0Var7.t();
                                                                        mp0Var7.e(20);
                                                                        Pair pairCreate3 = Pair.create(Integer.valueOf(mp0Var7.x()), Integer.valueOf(iT3));
                                                                        int iIntValue2 = ((Integer) pairCreate3.first).intValue();
                                                                        int iIntValue3 = ((Integer) pairCreate3.second).intValue();
                                                                        listA2 = com.yandex.mobile.ads.embedded.guava.collect.p.a(bArr7);
                                                                        i46 = iIntValue3;
                                                                        i47 = iIntValue2;
                                                                    } else {
                                                                        listA2 = listA2;
                                                                    }
                                                                }
                                                            }
                                                            yvVarA2 = aVarN.a(drmInitData3).e(str).a();
                                                            i44 = i44;
                                                            listA2 = listA2;
                                                        }
                                                        i44 = i44;
                                                        yvVarA2 = yvVarB;
                                                    } else {
                                                        i49 = 1702061171;
                                                    }
                                                    i48 += iH7;
                                                    iH3 = i62;
                                                    iD = i63;
                                                    i44 = i44;
                                                } else {
                                                    i49 = 1702061171;
                                                }
                                                if (iH8 == i49) {
                                                    iD4 = i48;
                                                } else {
                                                    iD4 = mp0Var2.d();
                                                    if (iD4 >= i48) {
                                                        z19 = true;
                                                    } else {
                                                        z19 = false;
                                                    }
                                                    xt.a(null, z19);
                                                    while (true) {
                                                        if (iD4 - i48 < iH7) {
                                                            i50 = -1;
                                                            iD4 = -1;
                                                            break;
                                                        }
                                                        mp0Var2.e(iD4);
                                                        iH9 = mp0Var2.h();
                                                        if (iH9 > 0) {
                                                            z20 = true;
                                                        } else {
                                                            z20 = false;
                                                        }
                                                        xt.a("childAtomSize must be positive", z20);
                                                        if (mp0Var2.h() == 1702061171) {
                                                            iD4 += iH9;
                                                        }
                                                    }
                                                    if (iD4 != i50) {
                                                        bVarA = a(iD4, mp0Var2);
                                                        str9 = bVarA.f25021a;
                                                        bArr2 = bVarA.f25022b;
                                                        if (bArr2 != null) {
                                                            if ("audio/mp4a-latm".equals(str9)) {
                                                                com.yandex.mobile.ads.impl.d.a aVarA2 = com.yandex.mobile.ads.impl.d.a(new lp0(bArr2.length, bArr2), false);
                                                                int i68 = aVarA2.f19685a;
                                                                int i69 = aVarA2.f19686b;
                                                                str10 = aVarA2.f19687c;
                                                                i47 = i68;
                                                                i46 = i69;
                                                            }
                                                            bVar2 = bVarA;
                                                            listA2 = com.yandex.mobile.ads.embedded.guava.collect.p.a(bArr2);
                                                        } else {
                                                            bVar2 = bVarA;
                                                        }
                                                        i48 += iH7;
                                                        iH3 = i62;
                                                        iD = i63;
                                                        i44 = i44;
                                                    }
                                                    listA2 = listA2;
                                                    i48 += iH7;
                                                    iH3 = i62;
                                                    iD = i63;
                                                    i44 = i44;
                                                }
                                                i50 = -1;
                                                if (iD4 != i50) {
                                                    bVarA = a(iD4, mp0Var2);
                                                    str9 = bVarA.f25021a;
                                                    bArr2 = bVarA.f25022b;
                                                    if (bArr2 != null) {
                                                        if ("audio/mp4a-latm".equals(str9)) {
                                                            com.yandex.mobile.ads.impl.d.a aVarA3 = com.yandex.mobile.ads.impl.d.a(new lp0(bArr2.length, bArr2), false);
                                                            int i610 = aVarA3.f19685a;
                                                            int i611 = aVarA3.f19686b;
                                                            str10 = aVarA3.f19687c;
                                                            i47 = i610;
                                                            i46 = i611;
                                                        }
                                                        bVar2 = bVarA;
                                                        listA2 = com.yandex.mobile.ads.embedded.guava.collect.p.a(bArr2);
                                                    } else {
                                                        bVar2 = bVarA;
                                                    }
                                                    i48 += iH7;
                                                    iH3 = i62;
                                                    iD = i63;
                                                    i44 = i44;
                                                }
                                                listA2 = listA2;
                                                i48 += iH7;
                                                iH3 = i62;
                                                iD = i63;
                                                i44 = i44;
                                            }
                                            i48 += iH7;
                                            iH3 = i62;
                                            iD = i63;
                                            i44 = i44;
                                        }
                                        List<byte[]> list2 = listA2;
                                        int i70 = iH3;
                                        int i71 = iD;
                                        if (yvVarA2 == null || str9 == null) {
                                            yvVarA = yvVarA2;
                                        } else {
                                            yv.a aVarE = new yv.a().h(i15).f(str9).a(str10).c(i46).n(i47).j(i45).a(list2).a(drmInitData3).e(str);
                                            if (bVar2 != null) {
                                                aVarE.b(h70.b(bVar2.f25023c)).k(h70.b(bVar2.f25024d));
                                            }
                                            yvVarA = aVarE.a();
                                        }
                                        i34 = i61;
                                        i24 = i70;
                                        i25 = i71;
                                    }
                                    i45 = -1;
                                    i18 = i18;
                                    f71VarArr = f71VarArr;
                                    int i612 = i16;
                                    i46 = i43;
                                    listA2 = null;
                                    str10 = null;
                                    fVar = fVar;
                                    i47 = i60;
                                    yvVarA2 = yvVarA;
                                    bVar2 = null;
                                    aVar3 = aVar3;
                                    i48 = iD6;
                                    while (i48 - iD < iH3) {
                                        mp0Var2.e(i48);
                                        iH7 = mp0Var2.h();
                                        int i613 = iH3;
                                        if (iH7 > 0) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                        xt.a("childAtomSize must be positive", z18);
                                        iH8 = mp0Var2.h();
                                        int i614 = iD;
                                        if (iH8 == 1835557187) {
                                            int i615 = iH7 - 13;
                                            byte[] bArr8 = new byte[i615];
                                            mp0Var2.e(i48 + 13);
                                            mp0Var2.a(bArr8, 0, i615);
                                            listA2 = com.yandex.mobile.ads.embedded.guava.collect.p.a(bArr8);
                                            i44 = i44;
                                        } else {
                                            if (iH8 != 1702061171) {
                                                if (z11) {
                                                }
                                                if (iH8 == 1684103987) {
                                                    mp0Var2.e(i48 + 8);
                                                    yvVarB = i.a(mp0Var2, Integer.toString(i15), str, drmInitData3);
                                                } else {
                                                    if (iH8 == 1684366131) {
                                                        mp0Var2.e(i48 + 8);
                                                        yvVarB = i.b(mp0Var2, Integer.toString(i15), str, drmInitData3);
                                                    } else {
                                                        if (iH8 == 1684103988) {
                                                            mp0Var2.e(i48 + 8);
                                                            String string2 = Integer.toString(i15);
                                                            mp0Var2.f(1);
                                                            listA2 = listA2;
                                                            if (((mp0Var2.t() & 32) >> 5) == 1) {
                                                                i51 = 48000;
                                                            } else {
                                                                i51 = 44100;
                                                            }
                                                            aVarN = new yv.a().c(string2).f("audio/ac4").c(2).n(i51);
                                                        } else {
                                                            listA2 = listA2;
                                                            if (iH8 == 1684892784) {
                                                                if (i44 > 0) {
                                                                    throw qp0.a("Invalid sample rate for Dolby TrueHD MLP stream: " + i44, (Exception) null);
                                                                }
                                                                i47 = i44;
                                                                i44 = i47;
                                                                listA2 = listA2;
                                                                i46 = 2;
                                                            } else if (iH8 == 1684305011) {
                                                                aVarN = new yv.a().h(i15).f(str9).c(i46).n(i47);
                                                            } else if (iH8 == 1682927731) {
                                                                int i616 = iH7 - 8;
                                                                byte[] bArr9 = f25010a;
                                                                byte[] bArrCopyOf2 = Arrays.copyOf(bArr9, bArr9.length + i616);
                                                                i44 = i44;
                                                                mp0Var2.e(i48 + 8);
                                                                mp0Var2.a(bArrCopyOf2, bArr9.length, i616);
                                                                listA2 = ap0.a(bArrCopyOf2);
                                                            } else {
                                                                i44 = i44;
                                                                if (iH8 == 1684425825) {
                                                                    int i617 = iH7 - 12;
                                                                    byte[] bArr10 = new byte[i617 + 4];
                                                                    bArr10[0] = 102;
                                                                    bArr10[1] = 76;
                                                                    bArr10[2] = 97;
                                                                    bArr10[3] = 67;
                                                                    mp0Var2.e(i48 + 12);
                                                                    mp0Var2.a(bArr10, 4, i617);
                                                                    listA2 = com.yandex.mobile.ads.embedded.guava.collect.p.a(bArr10);
                                                                } else if (iH8 == 1634492771) {
                                                                    int i618 = iH7 - 12;
                                                                    byte[] bArr11 = new byte[i618];
                                                                    mp0Var2.e(i48 + 12);
                                                                    mp0Var2.a(bArr11, 0, i618);
                                                                    mp0 mp0Var8 = new mp0(bArr11);
                                                                    mp0Var8.e(9);
                                                                    int iT4 = mp0Var8.t();
                                                                    mp0Var8.e(20);
                                                                    Pair pairCreate4 = Pair.create(Integer.valueOf(mp0Var8.x()), Integer.valueOf(iT4));
                                                                    int iIntValue4 = ((Integer) pairCreate4.first).intValue();
                                                                    int iIntValue5 = ((Integer) pairCreate4.second).intValue();
                                                                    listA2 = com.yandex.mobile.ads.embedded.guava.collect.p.a(bArr11);
                                                                    i46 = iIntValue5;
                                                                    i47 = iIntValue4;
                                                                } else {
                                                                    listA2 = listA2;
                                                                }
                                                            }
                                                        }
                                                        yvVarA2 = aVarN.a(drmInitData3).e(str).a();
                                                        i44 = i44;
                                                        listA2 = listA2;
                                                    }
                                                    i48 += iH7;
                                                    iH3 = i613;
                                                    iD = i614;
                                                    i44 = i44;
                                                }
                                                i44 = i44;
                                                yvVarA2 = yvVarB;
                                            } else {
                                                i49 = 1702061171;
                                            }
                                            if (iH8 == i49) {
                                                iD4 = i48;
                                            } else {
                                                iD4 = mp0Var2.d();
                                                if (iD4 >= i48) {
                                                    z19 = true;
                                                } else {
                                                    z19 = false;
                                                }
                                                xt.a(null, z19);
                                                while (true) {
                                                    if (iD4 - i48 < iH7) {
                                                        i50 = -1;
                                                        iD4 = -1;
                                                        break;
                                                    }
                                                    mp0Var2.e(iD4);
                                                    iH9 = mp0Var2.h();
                                                    if (iH9 > 0) {
                                                        z20 = true;
                                                    } else {
                                                        z20 = false;
                                                    }
                                                    xt.a("childAtomSize must be positive", z20);
                                                    if (mp0Var2.h() == 1702061171) {
                                                        iD4 += iH9;
                                                    }
                                                }
                                                if (iD4 != i50) {
                                                    bVarA = a(iD4, mp0Var2);
                                                    str9 = bVarA.f25021a;
                                                    bArr2 = bVarA.f25022b;
                                                    if (bArr2 != null) {
                                                        if ("audio/mp4a-latm".equals(str9)) {
                                                            com.yandex.mobile.ads.impl.d.a aVarA4 = com.yandex.mobile.ads.impl.d.a(new lp0(bArr2.length, bArr2), false);
                                                            int i619 = aVarA4.f19685a;
                                                            int i6110 = aVarA4.f19686b;
                                                            str10 = aVarA4.f19687c;
                                                            i47 = i619;
                                                            i46 = i6110;
                                                        }
                                                        bVar2 = bVarA;
                                                        listA2 = com.yandex.mobile.ads.embedded.guava.collect.p.a(bArr2);
                                                    } else {
                                                        bVar2 = bVarA;
                                                    }
                                                    i48 += iH7;
                                                    iH3 = i613;
                                                    iD = i614;
                                                    i44 = i44;
                                                }
                                                listA2 = listA2;
                                                i48 += iH7;
                                                iH3 = i613;
                                                iD = i614;
                                                i44 = i44;
                                            }
                                            i50 = -1;
                                            if (iD4 != i50) {
                                                bVarA = a(iD4, mp0Var2);
                                                str9 = bVarA.f25021a;
                                                bArr2 = bVarA.f25022b;
                                                if (bArr2 != null) {
                                                    if ("audio/mp4a-latm".equals(str9)) {
                                                        com.yandex.mobile.ads.impl.d.a aVarA5 = com.yandex.mobile.ads.impl.d.a(new lp0(bArr2.length, bArr2), false);
                                                        int i6111 = aVarA5.f19685a;
                                                        int i6112 = aVarA5.f19686b;
                                                        str10 = aVarA5.f19687c;
                                                        i47 = i6111;
                                                        i46 = i6112;
                                                    }
                                                    bVar2 = bVarA;
                                                    listA2 = com.yandex.mobile.ads.embedded.guava.collect.p.a(bArr2);
                                                } else {
                                                    bVar2 = bVarA;
                                                }
                                                i48 += iH7;
                                                iH3 = i613;
                                                iD = i614;
                                                i44 = i44;
                                            }
                                            listA2 = listA2;
                                            i48 += iH7;
                                            iH3 = i613;
                                            iD = i614;
                                            i44 = i44;
                                        }
                                        i48 += iH7;
                                        iH3 = i613;
                                        iD = i614;
                                        i44 = i44;
                                    }
                                    List<byte[]> list3 = listA2;
                                    int i72 = iH3;
                                    int i73 = iD;
                                    if (yvVarA2 == null) {
                                        yvVarA = yvVarA2;
                                    } else {
                                        yvVarA = yvVarA2;
                                    }
                                    i34 = i612;
                                    i24 = i72;
                                    i25 = i73;
                                } else if (iH4 == 1414810956 || iH4 == 1954034535 || iH4 == 2004251764 || iH4 == 1937010800 || iH4 == 1664495672) {
                                    mp0Var2.e(iD + 8 + 8);
                                    long j17 = RecyclerView.FOREVER_NS;
                                    if (iH4 == 1414810956) {
                                        str11 = "application/ttml+xml";
                                        pVarA = null;
                                        j14 = j17;
                                    } else if (iH4 == 1954034535) {
                                        int i74 = (iH3 - 8) - 8;
                                        byte[] bArr12 = new byte[i74];
                                        mp0Var2.a(bArr12, 0, i74);
                                        pVarA = com.yandex.mobile.ads.embedded.guava.collect.p.a(bArr12);
                                        str11 = "application/x-quicktime-tx3g";
                                        j14 = Long.MAX_VALUE;
                                    } else {
                                        if (iH4 == 2004251764) {
                                            str11 = "application/x-mp4-vtt";
                                            pVarA = null;
                                        } else if (iH4 == 1937010800) {
                                            j17 = 0;
                                            str11 = "application/ttml+xml";
                                            pVarA = null;
                                        } else {
                                            if (iH4 != 1664495672) {
                                                throw new IllegalStateException();
                                            }
                                            str11 = "application/x-mp4-cea-608";
                                            pVarA = null;
                                            i19 = 1;
                                        }
                                        j14 = j17;
                                    }
                                    yvVarA = new yv.a().h(i15).f(str11).e(str).a(j14).a(pVarA).a();
                                } else if (iH4 == 1835365492) {
                                    mp0Var2.e(iD + 8 + 8);
                                    if (iH4 == 1835365492) {
                                        mp0Var2.q();
                                        String strQ = mp0Var2.q();
                                        if (strQ != null) {
                                            aVarF = new yv.a().h(i15).f(strQ);
                                            yvVarA = aVarF.a();
                                            pairCreate = pairCreate;
                                            i24 = iH3;
                                            i34 = i16;
                                            str = str;
                                            i25 = iD;
                                        }
                                    }
                                    pairCreate = pairCreate;
                                } else {
                                    if (iH4 == 1667329389) {
                                        aVarF = new yv.a().h(i15).f("application/x-camera-motion");
                                        yvVarA = aVarF.a();
                                        pairCreate = pairCreate;
                                        i24 = iH3;
                                        i34 = i16;
                                        str = str;
                                        i25 = iD;
                                    }
                                    pairCreate = pairCreate;
                                }
                                i24 = iH3;
                                i34 = i16;
                                str = str;
                                i25 = iD;
                            }
                            mp0Var2.e(i25 + i24);
                            i16 = i34;
                            iH2 = i55;
                            i10 = i56;
                            jA = j15;
                            jV2 = j16;
                            pairCreate = pairCreate;
                            str = str;
                            fVar = fVar;
                            aVar3 = aVar3;
                            f71VarArr = f71VarArr;
                            i18++;
                            drmInitData = drmInitData;
                        }
                        fVar2 = fVar;
                        f71VarArr2 = f71VarArr;
                        aVar2 = aVar3;
                        j12 = jV2;
                        pair = pairCreate;
                        i21 = i10;
                        j13 = jA;
                        if (z10) {
                            aVar3 = aVar2;
                        } else {
                            aVar3 = aVar2;
                            aVarC = aVar3.c(1701082227);
                            if (aVarC == null) {
                                bVarD = aVarC.d(1701606260);
                                if (bVarD == null) {
                                    pairCreate2 = null;
                                } else {
                                    mp0Var3 = bVarD.f24657b;
                                    mp0Var3.e(8);
                                    iB2 = rb.b(mp0Var3.h());
                                    iX = mp0Var3.x();
                                    jArr3 = new long[iX];
                                    jArr4 = new long[iX];
                                    for (i22 = 0; i22 < iX; i22++) {
                                        if (iB2 == 1) {
                                            jV3 = mp0Var3.y();
                                        } else {
                                            jV3 = mp0Var3.v();
                                        }
                                        jArr3[i22] = jV3;
                                        if (iB2 == 1) {
                                            jH = mp0Var3.p();
                                        } else {
                                            jH = mp0Var3.h();
                                        }
                                        jArr4[i22] = jH;
                                        if (mp0Var3.r() == 1) {
                                            throw new IllegalArgumentException("Unsupported media rate.");
                                        }
                                        mp0Var3.f(2);
                                    }
                                    pairCreate2 = Pair.create(jArr3, jArr4);
                                }
                                if (pairCreate2 != null) {
                                    jArr = (long[]) pairCreate2.first;
                                    jArr2 = (long[]) pairCreate2.second;
                                }
                            }
                            if (yvVarA == null) {
                                e71Var = new e71(fVar2.f25033a, i21, ((Long) pair.first).longValue(), j12, j13, yvVarA, i19, f71VarArr2, i20, jArr, jArr2);
                            }
                            e71Var2 = (e71) vxVar.apply(e71Var);
                            if (e71Var2 == null) {
                                arrayList2 = arrayList;
                            } else {
                                rb.a aVarC5 = aVar3.c(1835297121);
                                Objects.requireNonNull(aVarC5);
                                rb.a aVarC6 = aVarC5.c(1835626086);
                                Objects.requireNonNull(aVarC6);
                                rb.a aVarC7 = aVarC6.c(1937007212);
                                Objects.requireNonNull(aVarC7);
                                k71 k71VarA = a(e71Var2, aVarC7, yxVar);
                                arrayList2 = arrayList;
                                arrayList2.add(k71VarA);
                            }
                        }
                        jArr = null;
                        jArr2 = null;
                        if (yvVarA == null) {
                            e71Var = new e71(fVar2.f25033a, i21, ((Long) pair.first).longValue(), j12, j13, yvVarA, i19, f71VarArr2, i20, jArr, jArr2);
                        }
                        e71Var2 = (e71) vxVar.apply(e71Var);
                        if (e71Var2 == null) {
                            arrayList2 = arrayList;
                        } else {
                            rb.a aVarC8 = aVar3.c(1835297121);
                            Objects.requireNonNull(aVarC8);
                            rb.a aVarC9 = aVarC8.c(1835626086);
                            Objects.requireNonNull(aVarC9);
                            rb.a aVarC10 = aVarC9.c(1937007212);
                            Objects.requireNonNull(aVarC10);
                            k71 k71VarA2 = a(e71Var2, aVarC10, yxVar);
                            arrayList2 = arrayList;
                            arrayList2.add(k71VarA2);
                        }
                    }
                    jV = -9223372036854775807L;
                    mp0Var5.f(16);
                    iH = mp0Var5.h();
                    int iH18 = mp0Var5.h();
                    mp0Var5.f(4);
                    int iH19 = mp0Var5.h();
                    int iH110 = mp0Var5.h();
                    if (iH != 0) {
                        if (iH != 0) {
                            if (iH != -65536) {
                                i11 = 0;
                            } else {
                                i11 = 0;
                            }
                        } else if (iH != -65536) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                        }
                    } else if (iH != 0) {
                        if (iH != -65536) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                        }
                    } else if (iH != -65536) {
                        i11 = 0;
                    } else {
                        i11 = 0;
                    }
                    fVar = new f(iH11, i11, jV);
                    if (j10 == -9223372036854775807L) {
                        j11 = fVar.f25034b;
                    } else {
                        j11 = j10;
                    }
                    mp0Var = bVarD2.f24657b;
                    mp0Var.e(8);
                    if (rb.b(mp0Var.h()) == 0) {
                        i12 = 8;
                    } else {
                        i12 = 16;
                    }
                    mp0Var.f(i12);
                    jV2 = mp0Var.v();
                    if (j11 == -9223372036854775807L) {
                        jA = -9223372036854775807L;
                    } else {
                        jA = da1.a(j11, 1000000L, jV2);
                    }
                    rb.a aVarC11 = aVarC2.c(1835626086);
                    Objects.requireNonNull(aVarC11);
                    rb.a aVarC12 = aVarC11.c(1937007212);
                    Objects.requireNonNull(aVarC12);
                    rb.b bVarD7 = aVarC2.d(1835296868);
                    Objects.requireNonNull(bVarD7);
                    mp0 mp0Var9 = bVarD7.f24657b;
                    mp0Var9.e(8);
                    iB = rb.b(mp0Var9.h());
                    if (iB == 0) {
                        i13 = 8;
                    } else {
                        i13 = 16;
                    }
                    mp0Var9.f(i13);
                    long jV7 = mp0Var9.v();
                    if (iB == 0) {
                        i14 = 4;
                    } else {
                        i14 = 8;
                    }
                    mp0Var9.f(i14);
                    int iZ8 = mp0Var9.z();
                    StringBuilder sbA3 = v60.a("");
                    sbA3.append((char) (((iZ8 >> 10) & 31) + 96));
                    sbA3.append((char) (((iZ8 >> 5) & 31) + 96));
                    sbA3.append((char) ((iZ8 & 31) + 96));
                    pairCreate = Pair.create(Long.valueOf(jV7), sbA3.toString());
                    rb.b bVarD8 = aVarC12.d(1937011556);
                    Objects.requireNonNull(bVarD8);
                    mp0Var2 = bVarD8.f24657b;
                    i15 = fVar.f25033a;
                    i16 = fVar.f25035c;
                    str = (String) pairCreate.second;
                    mp0Var2.e(12);
                    iH2 = mp0Var2.h();
                    i17 = i52;
                    f71VarArr = new f71[iH2];
                    arrayList = arrayList2;
                    i18 = 0;
                    yvVarA = null;
                    i19 = 0;
                    i20 = 0;
                    while (i18 < iH2) {
                        int i510 = iH2;
                        iD = mp0Var2.d();
                        long j18 = jA;
                        iH3 = mp0Var2.h();
                        long j19 = jV2;
                        if (iH3 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        str2 = "childAtomSize must be positive";
                        xt.a("childAtomSize must be positive", z13);
                        iH4 = mp0Var2.h();
                        int i511 = i10;
                        if (iH4 != 1635148593) {
                            i18 = i18;
                            fVar = fVar;
                            f71VarArr = f71VarArr;
                            aVar3 = aVar3;
                            pairCreate = pairCreate;
                            i23 = i16;
                            mp0Var2.e(iD + 8 + 8);
                            mp0Var2.f(16);
                            iZ = mp0Var2.z();
                            iZ2 = mp0Var2.z();
                            mp0Var2.f(50);
                            iD2 = mp0Var2.d();
                            if (iH4 == 1701733238) {
                                i24 = iH3;
                                i25 = iD;
                                pairA = a(i25, i24, mp0Var2);
                                if (pairA != null) {
                                    iH4 = ((Integer) pairA.first).intValue();
                                    if (drmInitData == null) {
                                        drmInitDataA = null;
                                    } else {
                                        drmInitDataA = drmInitData.a(((f71) pairA.second).f20573b);
                                    }
                                    f71VarArr[i18] = (f71) pairA.second;
                                } else {
                                    drmInitDataA = drmInitData;
                                }
                                mp0Var2.e(iD2);
                            } else {
                                i24 = iH3;
                                i25 = iD;
                                drmInitDataA = drmInitData;
                            }
                            if (iH4 == 1831958048) {
                                str3 = "video/mpeg";
                            } else if (iH4 == 1211250227) {
                                str3 = "video/3gpp";
                            } else {
                                str3 = null;
                            }
                            i26 = iD2;
                            z14 = false;
                            drmInitData2 = drmInitDataA;
                            str = str;
                            i27 = i20;
                            str4 = null;
                            i28 = -1;
                            byteBufferOrder = null;
                            bVar = null;
                            i29 = -1;
                            i30 = -1;
                            i31 = -1;
                            listA = null;
                            f10 = 1.0f;
                            str5 = str3;
                            bArrCopyOfRange = null;
                            while (true) {
                                if (i26 - i25 >= i24) {
                                    bArr = bArrCopyOfRange;
                                    i32 = i28;
                                    break;
                                }
                                mp0Var2.e(i26);
                                iD3 = mp0Var2.d();
                                i32 = i28;
                                iH5 = mp0Var2.h();
                                if (iH5 == 0) {
                                    bArr = bArrCopyOfRange;
                                    if (mp0Var2.d() - i25 == i24) {
                                        break;
                                        break;
                                    }
                                } else {
                                    bArr = bArrCopyOfRange;
                                }
                                if (iH5 > 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                xt.a(str2, z15);
                                iH6 = mp0Var2.h();
                                String str14 = str2;
                                if (iH6 == 1635148611) {
                                    if (str5 == null) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    xt.a(null, z17);
                                    mp0Var2.e(iD3 + 8);
                                    rcVarA = rc.a(mp0Var2);
                                    list = rcVarA.f24661a;
                                    i42 = rcVarA.f24662b;
                                    if (!z14) {
                                        f10 = rcVarA.f24665e;
                                    }
                                    str7 = rcVarA.f24666f;
                                    str8 = "video/avc";
                                } else {
                                    if (iH6 == 1752589123) {
                                        if (str5 == null) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        xt.a(null, z16);
                                        mp0Var2.e(iD3 + 8);
                                        uyVarA = uy.a(mp0Var2);
                                        list = uyVarA.f25757a;
                                        i42 = uyVarA.f25758b;
                                        if (!z14) {
                                            f10 = uyVarA.f25759c;
                                        }
                                        str7 = uyVarA.f25760d;
                                        str8 = "video/hevc";
                                    } else if (iH6 != 1685480259) {
                                        iZ = iZ;
                                        iZ2 = iZ2;
                                        i38 = i25;
                                        i39 = iH4;
                                        i40 = i24;
                                        fX = f10;
                                        pqVarA = pq.a(mp0Var2);
                                        if (pqVarA != null) {
                                            str4 = pqVarA.f24225a;
                                            str5 = "video/dolby-vision";
                                        }
                                        bArrCopyOfRange = bArr;
                                    } else {
                                        iZ = iZ;
                                        iZ2 = iZ2;
                                        i38 = i25;
                                        i39 = iH4;
                                        i40 = i24;
                                        fX = f10;
                                        pqVarA = pq.a(mp0Var2);
                                        if (pqVarA != null) {
                                            str4 = pqVarA.f24225a;
                                            str5 = "video/dolby-vision";
                                        }
                                        bArrCopyOfRange = bArr;
                                    }
                                    i26 += iH5;
                                    i28 = i32;
                                    str2 = str14;
                                    iH4 = i39;
                                    i25 = i38;
                                    i24 = i40;
                                    f10 = fX;
                                    iZ2 = iZ2;
                                    iZ = iZ;
                                }
                                iZ = iZ;
                                iZ2 = iZ2;
                                listA = list;
                                i38 = i25;
                                i27 = i42;
                                i39 = iH4;
                                i40 = i24;
                                str5 = str8;
                                fX = f10;
                                bArrCopyOfRange = bArr;
                                str4 = str7;
                                i26 += iH5;
                                i28 = i32;
                                str2 = str14;
                                iH4 = i39;
                                i25 = i38;
                                i24 = i40;
                                f10 = fX;
                                iZ2 = iZ2;
                                iZ = iZ;
                            }
                            f11 = f10;
                            if (str5 == null) {
                                i34 = i23;
                                i20 = i27;
                            } else {
                                yv.a aVarB2 = new yv.a().h(i15).f(str5).a(str4).q(iZ).g(i33).b(f11);
                                i34 = i23;
                                aVarA = aVarB2.m(i34).a(bArr).p(i32).a(listA).a(drmInitData2);
                                i35 = i31;
                                if (i35 == -1) {
                                    i37 = i30;
                                    i36 = i29;
                                    if (i37 == -1) {
                                    }
                                    if (bVar != null) {
                                        aVarA.b(h70.b(bVar.f25023c)).k(h70.b(bVar.f25024d));
                                    }
                                    yvVarA = aVarA.a();
                                    i20 = i27;
                                } else {
                                    i33 = iZ2;
                                    i36 = i29;
                                    i37 = i30;
                                }
                                i33 = iZ2;
                                if (byteBufferOrder != null) {
                                    bArrArray = byteBufferOrder.array();
                                } else {
                                    bArrArray = null;
                                }
                                aVarA.a(new nj(i35, i37, i36, bArrArray));
                                if (bVar != null) {
                                    aVarA.b(h70.b(bVar.f25023c)).k(h70.b(bVar.f25024d));
                                }
                                yvVarA = aVarA.a();
                                i20 = i27;
                            }
                        } else {
                            i18 = i18;
                            fVar = fVar;
                            f71VarArr = f71VarArr;
                            aVar3 = aVar3;
                            pairCreate = pairCreate;
                            i23 = i16;
                            mp0Var2.e(iD + 8 + 8);
                            mp0Var2.f(16);
                            iZ = mp0Var2.z();
                            iZ2 = mp0Var2.z();
                            mp0Var2.f(50);
                            iD2 = mp0Var2.d();
                            if (iH4 == 1701733238) {
                                i24 = iH3;
                                i25 = iD;
                                pairA = a(i25, i24, mp0Var2);
                                if (pairA != null) {
                                    iH4 = ((Integer) pairA.first).intValue();
                                    if (drmInitData == null) {
                                        drmInitDataA = null;
                                    } else {
                                        drmInitDataA = drmInitData.a(((f71) pairA.second).f20573b);
                                    }
                                    f71VarArr[i18] = (f71) pairA.second;
                                } else {
                                    drmInitDataA = drmInitData;
                                }
                                mp0Var2.e(iD2);
                            } else {
                                i24 = iH3;
                                i25 = iD;
                                drmInitDataA = drmInitData;
                            }
                            if (iH4 == 1831958048) {
                                str3 = "video/mpeg";
                            } else if (iH4 == 1211250227) {
                                str3 = "video/3gpp";
                            } else {
                                str3 = null;
                            }
                            i26 = iD2;
                            z14 = false;
                            drmInitData2 = drmInitDataA;
                            str = str;
                            i27 = i20;
                            str4 = null;
                            i28 = -1;
                            byteBufferOrder = null;
                            bVar = null;
                            i29 = -1;
                            i30 = -1;
                            i31 = -1;
                            listA = null;
                            f10 = 1.0f;
                            str5 = str3;
                            bArrCopyOfRange = null;
                            while (true) {
                                if (i26 - i25 >= i24) {
                                    bArr = bArrCopyOfRange;
                                    i32 = i28;
                                    break;
                                }
                                mp0Var2.e(i26);
                                iD3 = mp0Var2.d();
                                i32 = i28;
                                iH5 = mp0Var2.h();
                                if (iH5 == 0) {
                                    bArr = bArrCopyOfRange;
                                    if (mp0Var2.d() - i25 == i24) {
                                        break;
                                        break;
                                    }
                                } else {
                                    bArr = bArrCopyOfRange;
                                }
                                if (iH5 > 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                xt.a(str2, z15);
                                iH6 = mp0Var2.h();
                                String str15 = str2;
                                if (iH6 == 1635148611) {
                                    if (str5 == null) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    xt.a(null, z17);
                                    mp0Var2.e(iD3 + 8);
                                    rcVarA = rc.a(mp0Var2);
                                    list = rcVarA.f24661a;
                                    i42 = rcVarA.f24662b;
                                    if (!z14) {
                                        f10 = rcVarA.f24665e;
                                    }
                                    str7 = rcVarA.f24666f;
                                    str8 = "video/avc";
                                } else {
                                    if (iH6 == 1752589123) {
                                        if (str5 == null) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        xt.a(null, z16);
                                        mp0Var2.e(iD3 + 8);
                                        uyVarA = uy.a(mp0Var2);
                                        list = uyVarA.f25757a;
                                        i42 = uyVarA.f25758b;
                                        if (!z14) {
                                            f10 = uyVarA.f25759c;
                                        }
                                        str7 = uyVarA.f25760d;
                                        str8 = "video/hevc";
                                    } else if (iH6 != 1685480259) {
                                        iZ = iZ;
                                        iZ2 = iZ2;
                                        i38 = i25;
                                        i39 = iH4;
                                        i40 = i24;
                                        fX = f10;
                                        pqVarA = pq.a(mp0Var2);
                                        if (pqVarA != null) {
                                            str4 = pqVarA.f24225a;
                                            str5 = "video/dolby-vision";
                                        }
                                        bArrCopyOfRange = bArr;
                                    } else {
                                        iZ = iZ;
                                        iZ2 = iZ2;
                                        i38 = i25;
                                        i39 = iH4;
                                        i40 = i24;
                                        fX = f10;
                                        pqVarA = pq.a(mp0Var2);
                                        if (pqVarA != null) {
                                            str4 = pqVarA.f24225a;
                                            str5 = "video/dolby-vision";
                                        }
                                        bArrCopyOfRange = bArr;
                                    }
                                    i26 += iH5;
                                    i28 = i32;
                                    str2 = str15;
                                    iH4 = i39;
                                    i25 = i38;
                                    i24 = i40;
                                    f10 = fX;
                                    iZ2 = iZ2;
                                    iZ = iZ;
                                }
                                iZ = iZ;
                                iZ2 = iZ2;
                                listA = list;
                                i38 = i25;
                                i27 = i42;
                                i39 = iH4;
                                i40 = i24;
                                str5 = str8;
                                fX = f10;
                                bArrCopyOfRange = bArr;
                                str4 = str7;
                                i26 += iH5;
                                i28 = i32;
                                str2 = str15;
                                iH4 = i39;
                                i25 = i38;
                                i24 = i40;
                                f10 = fX;
                                iZ2 = iZ2;
                                iZ = iZ;
                            }
                            f11 = f10;
                            if (str5 == null) {
                                i34 = i23;
                                i20 = i27;
                            } else {
                                yv.a aVarB3 = new yv.a().h(i15).f(str5).a(str4).q(iZ).g(i33).b(f11);
                                i34 = i23;
                                aVarA = aVarB3.m(i34).a(bArr).p(i32).a(listA).a(drmInitData2);
                                i35 = i31;
                                if (i35 == -1) {
                                    i37 = i30;
                                    i36 = i29;
                                    if (i37 == -1) {
                                    }
                                    if (bVar != null) {
                                        aVarA.b(h70.b(bVar.f25023c)).k(h70.b(bVar.f25024d));
                                    }
                                    yvVarA = aVarA.a();
                                    i20 = i27;
                                } else {
                                    i33 = iZ2;
                                    i36 = i29;
                                    i37 = i30;
                                }
                                i33 = iZ2;
                                if (byteBufferOrder != null) {
                                    bArrArray = byteBufferOrder.array();
                                } else {
                                    bArrArray = null;
                                }
                                aVarA.a(new nj(i35, i37, i36, bArrArray));
                                if (bVar != null) {
                                    aVarA.b(h70.b(bVar.f25023c)).k(h70.b(bVar.f25024d));
                                }
                                yvVarA = aVarA.a();
                                i20 = i27;
                            }
                        }
                        mp0Var2.e(i25 + i24);
                        i16 = i34;
                        iH2 = i510;
                        i10 = i511;
                        jA = j18;
                        jV2 = j19;
                        pairCreate = pairCreate;
                        str = str;
                        fVar = fVar;
                        aVar3 = aVar3;
                        f71VarArr = f71VarArr;
                        i18++;
                        drmInitData = drmInitData;
                    }
                    fVar2 = fVar;
                    f71VarArr2 = f71VarArr;
                    aVar2 = aVar3;
                    j12 = jV2;
                    pair = pairCreate;
                    i21 = i10;
                    j13 = jA;
                    if (z10) {
                        aVar3 = aVar2;
                        aVarC = aVar3.c(1701082227);
                        if (aVarC == null) {
                            bVarD = aVarC.d(1701606260);
                            if (bVarD == null) {
                                pairCreate2 = null;
                            } else {
                                mp0Var3 = bVarD.f24657b;
                                mp0Var3.e(8);
                                iB2 = rb.b(mp0Var3.h());
                                iX = mp0Var3.x();
                                jArr3 = new long[iX];
                                jArr4 = new long[iX];
                                while (i22 < iX) {
                                    if (iB2 == 1) {
                                        jV3 = mp0Var3.y();
                                    } else {
                                        jV3 = mp0Var3.v();
                                    }
                                    jArr3[i22] = jV3;
                                    if (iB2 == 1) {
                                        jH = mp0Var3.p();
                                    } else {
                                        jH = mp0Var3.h();
                                    }
                                    jArr4[i22] = jH;
                                    if (mp0Var3.r() == 1) {
                                        throw new IllegalArgumentException("Unsupported media rate.");
                                    }
                                    mp0Var3.f(2);
                                }
                                pairCreate2 = Pair.create(jArr3, jArr4);
                            }
                            if (pairCreate2 != null) {
                                jArr = (long[]) pairCreate2.first;
                                jArr2 = (long[]) pairCreate2.second;
                            }
                        }
                        if (yvVarA == null) {
                            e71Var = new e71(fVar2.f25033a, i21, ((Long) pair.first).longValue(), j12, j13, yvVarA, i19, f71VarArr2, i20, jArr, jArr2);
                        }
                        e71Var2 = (e71) vxVar.apply(e71Var);
                        if (e71Var2 == null) {
                            arrayList2 = arrayList;
                        } else {
                            rb.a aVarC13 = aVar3.c(1835297121);
                            Objects.requireNonNull(aVarC13);
                            rb.a aVarC14 = aVarC13.c(1835626086);
                            Objects.requireNonNull(aVarC14);
                            rb.a aVarC15 = aVarC14.c(1937007212);
                            Objects.requireNonNull(aVarC15);
                            k71 k71VarA3 = a(e71Var2, aVarC15, yxVar);
                            arrayList2 = arrayList;
                            arrayList2.add(k71VarA3);
                        }
                    } else {
                        aVar3 = aVar2;
                    }
                    jArr = null;
                    jArr2 = null;
                    if (yvVarA == null) {
                        e71Var = new e71(fVar2.f25033a, i21, ((Long) pair.first).longValue(), j12, j13, yvVarA, i19, f71VarArr2, i20, jArr, jArr2);
                    }
                    e71Var2 = (e71) vxVar.apply(e71Var);
                    if (e71Var2 == null) {
                        arrayList2 = arrayList;
                    } else {
                        rb.a aVarC16 = aVar3.c(1835297121);
                        Objects.requireNonNull(aVarC16);
                        rb.a aVarC17 = aVarC16.c(1835626086);
                        Objects.requireNonNull(aVarC17);
                        rb.a aVarC18 = aVarC17.c(1937007212);
                        Objects.requireNonNull(aVarC18);
                        k71 k71VarA4 = a(e71Var2, aVarC18, yxVar);
                        arrayList2 = arrayList;
                        arrayList2.add(k71VarA4);
                    }
                }
                e71Var = null;
                e71Var2 = (e71) vxVar.apply(e71Var);
                if (e71Var2 == null) {
                    arrayList2 = arrayList;
                } else {
                    rb.a aVarC19 = aVar3.c(1835297121);
                    Objects.requireNonNull(aVarC19);
                    rb.a aVarC110 = aVarC19.c(1835626086);
                    Objects.requireNonNull(aVarC110);
                    rb.a aVarC111 = aVarC110.c(1937007212);
                    Objects.requireNonNull(aVarC111);
                    k71 k71VarA5 = a(e71Var2, aVarC111, yxVar);
                    arrayList2 = arrayList;
                    arrayList2.add(k71VarA5);
                }
            }
            i52 = i17 + 1;
        }
        return arrayList2;
    }
}
