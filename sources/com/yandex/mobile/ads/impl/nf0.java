package com.yandex.mobile.ads.impl;

import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.id3.Id3Frame;
import com.yandex.mobile.ads.exo.metadata.mp4.MdtaMetadataEntry;
import com.yandex.mobile.ads.exo.metadata.mp4.MotionPhotoMetadata;
import com.yandex.mobile.ads.exo.metadata.mp4.SmtaMetadataEntry;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class nf0 implements ut, p01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mp0 f23347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mp0 f23348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mp0 f23349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final mp0 f23350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque<rb.a> f23351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final t01 f23352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayList f23353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f23354i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f23355j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f23356k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f23357l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private mp0 f23358m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f23359n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f23360o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f23361p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f23362q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private wt f23363r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private a[] f23364s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long[][] f23365t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f23366u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f23367v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f23368w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private MotionPhotoMetadata f23369x;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e71 f23370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k71 f23371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j71 f23372c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final k81 f23373d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f23374e;

        public a(e71 e71Var, k71 k71Var, j71 j71Var) {
            this.f23370a = e71Var;
            this.f23371b = k71Var;
            this.f23372c = j71Var;
            this.f23373d = "audio/true-hd".equals(e71Var.f20105f.f27115l) ? new k81() : null;
        }
    }

    static {
        dp1 dp1Var = dp1.f19963v;
    }

    public nf0() {
        this(0);
    }

    public nf0(int i10) {
        this.f23346a = 0;
        this.f23354i = 0;
        this.f23352g = new t01();
        this.f23353h = new ArrayList();
        this.f23350e = new mp0(16);
        this.f23351f = new ArrayDeque<>();
        this.f23347b = new mp0(oh0.f23795a);
        this.f23348c = new mp0(4);
        this.f23349d = new mp0();
        this.f23359n = -1;
        this.f23363r = wt.f26367a;
        this.f23364s = new a[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e71 a(e71 e71Var) {
        return e71Var;
    }

    private void a(rb.a aVar) throws qp0 {
        int i10;
        Metadata metadata;
        Metadata metadata2;
        long j10;
        int i11;
        ArrayList arrayList = new ArrayList();
        boolean z10 = this.f23368w == 1;
        yx yxVar = new yx();
        rb.b bVarD = aVar.d(1969517665);
        int i12 = 1835365473;
        if (bVarD != null) {
            int i13 = sb.f25011b;
            mp0 mp0Var = bVarD.f24657b;
            mp0Var.e(8);
            Metadata metadata3 = null;
            Metadata metadata4 = null;
            for (int i14 = 8; mp0Var.a() >= i14; i14 = 8) {
                int iD = mp0Var.d();
                int iH = mp0Var.h();
                int iH2 = mp0Var.h();
                if (iH2 == i12) {
                    mp0Var.e(iD);
                    int i15 = iD + iH;
                    mp0Var.f(i14);
                    int iD2 = mp0Var.d();
                    mp0Var.f(4);
                    if (mp0Var.h() != 1751411826) {
                        iD2 += 4;
                    }
                    mp0Var.e(iD2);
                    while (true) {
                        if (mp0Var.d() < i15) {
                            int iD3 = mp0Var.d();
                            int iH3 = mp0Var.h();
                            if (mp0Var.h() == 1768715124) {
                                mp0Var.e(iD3);
                                int i16 = iD3 + iH3;
                                mp0Var.f(i14);
                                ArrayList arrayList2 = new ArrayList();
                                while (mp0Var.d() < i16) {
                                    Id3Frame id3FrameB = me0.b(mp0Var);
                                    if (id3FrameB != null) {
                                        arrayList2.add(id3FrameB);
                                    }
                                }
                                if (!arrayList2.isEmpty()) {
                                    metadata3 = new Metadata(arrayList2);
                                    break;
                                }
                            } else {
                                mp0Var.e(iD3 + iH3);
                            }
                        }
                        metadata3 = null;
                        break;
                    }
                }
                if (iH2 == 1936553057) {
                    mp0Var.e(iD);
                    int i17 = iD + iH;
                    mp0Var.f(12);
                    while (true) {
                        if (mp0Var.d() < i17) {
                            int iD4 = mp0Var.d();
                            int iH4 = mp0Var.h();
                            if (mp0Var.h() != 1935766900) {
                                mp0Var.e(iD4 + iH4);
                            } else if (iH4 >= 14) {
                                mp0Var.f(5);
                                int iT = mp0Var.t();
                                if (iT == 12 || iT == 13) {
                                    float f10 = iT == 12 ? 240.0f : 120.0f;
                                    mp0Var.f(1);
                                    metadata4 = new Metadata(new SmtaMetadataEntry(mp0Var.t(), f10));
                                    break;
                                }
                            }
                        }
                        metadata4 = null;
                        break;
                    }
                }
                mp0Var.e(iD + iH);
                i12 = 1835365473;
            }
            Pair pairCreate = Pair.create(metadata3, metadata4);
            Metadata metadata5 = (Metadata) pairCreate.first;
            Metadata metadata6 = (Metadata) pairCreate.second;
            if (metadata5 != null) {
                yxVar.a(metadata5);
            }
            metadata = metadata6;
            metadata2 = metadata5;
            i10 = 1835365473;
        } else {
            i10 = 1835365473;
            metadata = null;
            metadata2 = null;
        }
        rb.a aVarC = aVar.c(i10);
        Metadata metadataA = aVarC != null ? sb.a(aVarC) : null;
        long j11 = -9223372036854775807L;
        ArrayList arrayListA = sb.a(aVar, yxVar, -9223372036854775807L, null, (this.f23346a & 1) != 0, z10, yn1.f26962v);
        int size = arrayListA.size();
        long j12 = -9223372036854775807L;
        int i18 = 0;
        int size2 = -1;
        while (true) {
            j10 = 0;
            if (i18 >= size) {
                break;
            }
            k71 k71Var = (k71) arrayListA.get(i18);
            if (k71Var.f22283b != 0) {
                e71 e71Var = k71Var.f22282a;
                long j13 = e71Var.f20104e;
                if (j13 == j11) {
                    j13 = k71Var.f22289h;
                }
                long jMax = Math.max(j12, j13);
                a aVar2 = new a(e71Var, k71Var, this.f23363r.a(i18, e71Var.f20101b));
                int i19 = "audio/true-hd".equals(e71Var.f20105f.f27115l) ? k71Var.f22286e * 16 : k71Var.f22286e + 30;
                yv.a aVarA = e71Var.f20105f.a();
                aVarA.i(i19);
                if (e71Var.f20101b == 2 && j13 > 0 && (i11 = k71Var.f22283b) > 1) {
                    aVarA.a(i11 / (j13 / 1000000.0f));
                }
                if (e71Var.f20101b == 1) {
                    int i20 = yxVar.f27158a;
                    if ((i20 == -1 || yxVar.f27159b == -1) ? false : true) {
                        aVarA.e(i20).f(yxVar.f27159b);
                    }
                }
                int i21 = e71Var.f20101b;
                Metadata[] metadataArr = new Metadata[2];
                metadataArr[0] = metadata;
                metadataArr[1] = this.f23353h.isEmpty() ? null : new Metadata(this.f23353h);
                Metadata metadata7 = new Metadata(new Metadata.Entry[0]);
                if (i21 == 1) {
                    if (metadata2 != null) {
                        metadata7 = metadata2;
                    }
                } else if (i21 == 2 && metadataA != null) {
                    for (int i22 = 0; i22 < metadataA.c(); i22++) {
                        Metadata.Entry entryA = metadataA.a(i22);
                        if (entryA instanceof MdtaMetadataEntry) {
                            MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) entryA;
                            if ("com.android.capture.fps".equals(mdtaMetadataEntry.f18598a)) {
                                metadata7 = new Metadata(mdtaMetadataEntry);
                                break;
                            }
                        }
                    }
                }
                for (int i23 = 0; i23 < 2; i23++) {
                    metadata7 = metadata7.a(metadataArr[i23]);
                }
                if (metadata7.c() > 0) {
                    aVarA.a(metadata7);
                }
                aVar2.f23372c.a(aVarA.a());
                if (e71Var.f20101b == 2 && size2 == -1) {
                    size2 = arrayList.size();
                }
                arrayList.add(aVar2);
                j12 = jMax;
            }
            i18++;
            arrayListA = arrayListA;
            size = size;
            metadata = metadata;
            j11 = -9223372036854775807L;
        }
        this.f23366u = size2;
        this.f23367v = j12;
        a[] aVarArr = (a[]) arrayList.toArray(new a[0]);
        this.f23364s = aVarArr;
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i24 = 0; i24 < aVarArr.length; i24++) {
            jArr[i24] = new long[aVarArr[i24].f23371b.f22283b];
            jArr2[i24] = aVarArr[i24].f23371b.f22287f[0];
        }
        int i25 = 0;
        while (i25 < aVarArr.length) {
            int i26 = -1;
            long j14 = Long.MAX_VALUE;
            for (int i27 = 0; i27 < aVarArr.length; i27++) {
                if (!zArr[i27]) {
                    long j15 = jArr2[i27];
                    if (j15 <= j14) {
                        i26 = i27;
                        j14 = j15;
                    }
                }
            }
            int i28 = iArr[i26];
            long[] jArr3 = jArr[i26];
            jArr3[i28] = j10;
            k71 k71Var2 = aVarArr[i26].f23371b;
            j10 += (long) k71Var2.f22285d[i28];
            int i29 = i28 + 1;
            iArr[i26] = i29;
            if (i29 < jArr3.length) {
                jArr2[i26] = k71Var2.f22287f[i29];
            } else {
                zArr[i26] = true;
                i25++;
            }
        }
        this.f23365t = jArr;
        this.f23363r.a();
        this.f23363r.a(this);
    }

    private void c(long j10) throws qp0 {
        while (!this.f23351f.isEmpty() && this.f23351f.peek().f24654b == j10) {
            rb.a aVarPop = this.f23351f.pop();
            if (aVarPop.f24653a == 1836019574) {
                a(aVarPop);
                this.f23351f.clear();
                this.f23354i = 2;
            } else if (!this.f23351f.isEmpty()) {
                this.f23351f.peek().f24656d.add(aVarPop);
            }
        }
        if (this.f23354i != 2) {
            this.f23354i = 0;
            this.f23357l = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ut[] d() {
        return new ut[]{new nf0()};
    }

    /* JADX WARN: Code duplicated, block: B:131:0x027e  */
    /* JADX WARN: Code duplicated, block: B:152:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:154:0x0314  */
    /* JADX WARN: Code duplicated, block: B:156:0x0318  */
    /* JADX WARN: Code duplicated, block: B:163:0x0332  */
    /* JADX WARN: Code duplicated, block: B:166:0x0345  */
    /* JADX WARN: Code duplicated, block: B:168:0x034f  */
    /* JADX WARN: Code duplicated, block: B:181:0x036d  */
    /* JADX WARN: Code duplicated, block: B:184:0x0373  */
    /* JADX WARN: Code duplicated, block: B:186:0x0382  */
    /* JADX WARN: Code duplicated, block: B:190:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:194:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:195:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:197:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:199:0x03de  */
    /* JADX WARN: Code duplicated, block: B:233:0x0430  */
    /* JADX WARN: Code duplicated, block: B:235:0x0433 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:236:0x0435  */
    /* JADX WARN: Code duplicated, block: B:237:0x0437  */
    /* JADX WARN: Code duplicated, block: B:240:0x0444  */
    /* JADX WARN: Code duplicated, block: B:241:0x0446  */
    /* JADX WARN: Code duplicated, block: B:243:0x0461  */
    /* JADX WARN: Code duplicated, block: B:245:0x0471  */
    /* JADX WARN: Code duplicated, block: B:254:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x0491 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x0006 A[SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.ut
    public final int a(vt vtVar, cs0 cs0Var) throws IOException {
        boolean z10;
        boolean z11;
        int i10;
        long j10;
        long jA;
        long position;
        rb.a aVarPeek;
        long j11;
        int i11;
        int i12;
        boolean z12;
        boolean z13;
        long j12;
        long j13;
        mp0 mp0Var;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        long j14;
        long j15;
        long j16;
        mp0 mp0Var2;
        int iD;
        while (true) {
            int i13 = this.f23354i;
            if (i13 == 0) {
                if (this.f23357l != 0) {
                    j10 = this.f23356k;
                    if (j10 == 1) {
                        vtVar.readFully(this.f23350e.c(), 8, 8);
                        this.f23357l += 8;
                        position = this.f23350e.y();
                    } else {
                        if (j10 == 0) {
                            jA = vtVar.a();
                            if (jA == -1 && (aVarPeek = this.f23351f.peek()) != null) {
                                jA = aVarPeek.f24654b;
                            }
                            if (jA != -1) {
                                position = (jA - vtVar.getPosition()) + ((long) this.f23357l);
                            }
                        }
                        j11 = this.f23356k;
                        i11 = this.f23357l;
                        if (j11 >= i11) {
                            throw qp0.a("Atom size less than header length (unsupported).");
                        }
                        i12 = this.f23355j;
                        if (i12 != 1836019574 || i12 == 1953653099 || i12 == 1835297121 || i12 == 1835626086 || i12 == 1937007212 || i12 == 1701082227 || i12 == 1835365473) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            long position2 = vtVar.getPosition();
                            j14 = this.f23356k;
                            j15 = this.f23357l;
                            j16 = (position2 + j14) - j15;
                            if (j14 != j15 && this.f23355j == 1835365473) {
                                this.f23349d.c(8);
                                vtVar.a(this.f23349d.c(), 0, 8);
                                mp0Var2 = this.f23349d;
                                int i14 = sb.f25011b;
                                iD = mp0Var2.d();
                                mp0Var2.f(4);
                                if (mp0Var2.h() != 1751411826) {
                                    iD += 4;
                                }
                                mp0Var2.e(iD);
                                vtVar.a(this.f23349d.d());
                                vtVar.c();
                            }
                            this.f23351f.push(new rb.a(this.f23355j, j16));
                            if (this.f23356k == this.f23357l) {
                                c(j16);
                            } else {
                                this.f23354i = 0;
                                this.f23357l = 0;
                            }
                            z14 = true;
                        } else {
                            if (i12 != 1835296868 || i12 == 1836476516 || i12 == 1751411826 || i12 == 1937011556 || i12 == 1937011827 || i12 == 1937011571 || i12 == 1668576371 || i12 == 1701606260 || i12 == 1937011555 || i12 == 1937011578 || i12 == 1937013298 || i12 == 1937007471 || i12 == 1668232756 || i12 == 1953196132 || i12 == 1718909296 || i12 == 1969517665 || i12 == 1801812339 || i12 == 1768715124) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                if (i11 == 8) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                pa.b(z15);
                                if (this.f23356k <= 2147483647L) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                pa.b(z16);
                                mp0Var = new mp0((int) this.f23356k);
                                System.arraycopy(this.f23350e.c(), 0, mp0Var.c(), 0, 8);
                            } else {
                                long position3 = vtVar.getPosition();
                                j12 = this.f23357l;
                                j13 = position3 - j12;
                                if (this.f23355j == 1836086884) {
                                    this.f23369x = new MotionPhotoMetadata(0L, j13, -9223372036854775807L, j13 + j12, this.f23356k - j12);
                                }
                                mp0Var = null;
                            }
                            this.f23358m = mp0Var;
                            z14 = true;
                            this.f23354i = 1;
                        }
                        z17 = z14;
                    }
                    this.f23356k = position;
                    j11 = this.f23356k;
                    i11 = this.f23357l;
                    if (j11 >= i11) {
                        throw qp0.a("Atom size less than header length (unsupported).");
                    }
                    i12 = this.f23355j;
                    if (i12 != 1836019574) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        long position4 = vtVar.getPosition();
                        j14 = this.f23356k;
                        j15 = this.f23357l;
                        j16 = (position4 + j14) - j15;
                        if (j14 != j15) {
                            this.f23349d.c(8);
                            vtVar.a(this.f23349d.c(), 0, 8);
                            mp0Var2 = this.f23349d;
                            int i15 = sb.f25011b;
                            iD = mp0Var2.d();
                            mp0Var2.f(4);
                            if (mp0Var2.h() != 1751411826) {
                                iD += 4;
                            }
                            mp0Var2.e(iD);
                            vtVar.a(this.f23349d.d());
                            vtVar.c();
                        }
                        this.f23351f.push(new rb.a(this.f23355j, j16));
                        if (this.f23356k == this.f23357l) {
                            c(j16);
                        } else {
                            this.f23354i = 0;
                            this.f23357l = 0;
                        }
                        z14 = true;
                    } else {
                        if (i12 != 1835296868) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (z13) {
                            if (i11 == 8) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            pa.b(z15);
                            if (this.f23356k <= 2147483647L) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            pa.b(z16);
                            mp0Var = new mp0((int) this.f23356k);
                            System.arraycopy(this.f23350e.c(), 0, mp0Var.c(), 0, 8);
                        } else {
                            long position5 = vtVar.getPosition();
                            j12 = this.f23357l;
                            j13 = position5 - j12;
                            if (this.f23355j == 1836086884) {
                                this.f23369x = new MotionPhotoMetadata(0L, j13, -9223372036854775807L, j13 + j12, this.f23356k - j12);
                            }
                            mp0Var = null;
                        }
                        this.f23358m = mp0Var;
                        z14 = true;
                        this.f23354i = 1;
                    }
                    z17 = z14;
                } else if (vtVar.a(this.f23350e.c(), 0, 8, true)) {
                    this.f23357l = 8;
                    this.f23350e.e(0);
                    this.f23356k = this.f23350e.v();
                    this.f23355j = this.f23350e.h();
                    j10 = this.f23356k;
                    if (j10 == 1) {
                        vtVar.readFully(this.f23350e.c(), 8, 8);
                        this.f23357l += 8;
                        position = this.f23350e.y();
                    } else {
                        if (j10 == 0) {
                            jA = vtVar.a();
                            if (jA == -1) {
                                jA = aVarPeek.f24654b;
                            }
                            if (jA != -1) {
                                position = (jA - vtVar.getPosition()) + ((long) this.f23357l);
                            }
                        }
                        j11 = this.f23356k;
                        i11 = this.f23357l;
                        if (j11 >= i11) {
                            throw qp0.a("Atom size less than header length (unsupported).");
                        }
                        i12 = this.f23355j;
                        if (i12 != 1836019574) {
                            z12 = true;
                        } else {
                            z12 = true;
                        }
                        if (z12) {
                            long position6 = vtVar.getPosition();
                            j14 = this.f23356k;
                            j15 = this.f23357l;
                            j16 = (position6 + j14) - j15;
                            if (j14 != j15) {
                                this.f23349d.c(8);
                                vtVar.a(this.f23349d.c(), 0, 8);
                                mp0Var2 = this.f23349d;
                                int i16 = sb.f25011b;
                                iD = mp0Var2.d();
                                mp0Var2.f(4);
                                if (mp0Var2.h() != 1751411826) {
                                    iD += 4;
                                }
                                mp0Var2.e(iD);
                                vtVar.a(this.f23349d.d());
                                vtVar.c();
                            }
                            this.f23351f.push(new rb.a(this.f23355j, j16));
                            if (this.f23356k == this.f23357l) {
                                c(j16);
                            } else {
                                this.f23354i = 0;
                                this.f23357l = 0;
                            }
                            z14 = true;
                        } else {
                            if (i12 != 1835296868) {
                                z13 = true;
                            } else {
                                z13 = true;
                            }
                            if (z13) {
                                if (i11 == 8) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                pa.b(z15);
                                if (this.f23356k <= 2147483647L) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                pa.b(z16);
                                mp0Var = new mp0((int) this.f23356k);
                                System.arraycopy(this.f23350e.c(), 0, mp0Var.c(), 0, 8);
                            } else {
                                long position7 = vtVar.getPosition();
                                j12 = this.f23357l;
                                j13 = position7 - j12;
                                if (this.f23355j == 1836086884) {
                                    this.f23369x = new MotionPhotoMetadata(0L, j13, -9223372036854775807L, j13 + j12, this.f23356k - j12);
                                }
                                mp0Var = null;
                            }
                            this.f23358m = mp0Var;
                            z14 = true;
                            this.f23354i = 1;
                        }
                        z17 = z14;
                    }
                    this.f23356k = position;
                    j11 = this.f23356k;
                    i11 = this.f23357l;
                    if (j11 >= i11) {
                        throw qp0.a("Atom size less than header length (unsupported).");
                    }
                    i12 = this.f23355j;
                    if (i12 != 1836019574) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        long position8 = vtVar.getPosition();
                        j14 = this.f23356k;
                        j15 = this.f23357l;
                        j16 = (position8 + j14) - j15;
                        if (j14 != j15) {
                            this.f23349d.c(8);
                            vtVar.a(this.f23349d.c(), 0, 8);
                            mp0Var2 = this.f23349d;
                            int i17 = sb.f25011b;
                            iD = mp0Var2.d();
                            mp0Var2.f(4);
                            if (mp0Var2.h() != 1751411826) {
                                iD += 4;
                            }
                            mp0Var2.e(iD);
                            vtVar.a(this.f23349d.d());
                            vtVar.c();
                        }
                        this.f23351f.push(new rb.a(this.f23355j, j16));
                        if (this.f23356k == this.f23357l) {
                            c(j16);
                        } else {
                            this.f23354i = 0;
                            this.f23357l = 0;
                        }
                        z14 = true;
                    } else {
                        if (i12 != 1835296868) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (z13) {
                            if (i11 == 8) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            pa.b(z15);
                            if (this.f23356k <= 2147483647L) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            pa.b(z16);
                            mp0Var = new mp0((int) this.f23356k);
                            System.arraycopy(this.f23350e.c(), 0, mp0Var.c(), 0, 8);
                        } else {
                            long position9 = vtVar.getPosition();
                            j12 = this.f23357l;
                            j13 = position9 - j12;
                            if (this.f23355j == 1836086884) {
                                this.f23369x = new MotionPhotoMetadata(0L, j13, -9223372036854775807L, j13 + j12, this.f23356k - j12);
                            }
                            mp0Var = null;
                        }
                        this.f23358m = mp0Var;
                        z14 = true;
                        this.f23354i = 1;
                    }
                    z17 = z14;
                } else {
                    if (this.f23368w == 2 && (this.f23346a & 2) != 0) {
                        j71 j71VarA = this.f23363r.a(0, 4);
                        MotionPhotoMetadata motionPhotoMetadata = this.f23369x;
                        j71VarA.a(new yv.a().a(motionPhotoMetadata == null ? null : new Metadata(motionPhotoMetadata)).a());
                        this.f23363r.a();
                        this.f23363r.a(new p01.b(-9223372036854775807L, 0L));
                    }
                    z17 = false;
                }
                if (!z17) {
                    return -1;
                }
            } else {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            throw new IllegalStateException();
                        }
                        this.f23352g.a(vtVar, cs0Var, this.f23353h);
                        if (cs0Var.f19623a == 0) {
                            this.f23354i = 0;
                            this.f23357l = 0;
                        }
                        return 1;
                    }
                    long position10 = vtVar.getPosition();
                    if (this.f23359n == -1) {
                        int i18 = -1;
                        int i19 = -1;
                        boolean z18 = true;
                        boolean z19 = true;
                        int i20 = 0;
                        long j17 = Long.MAX_VALUE;
                        long j18 = Long.MAX_VALUE;
                        long j19 = Long.MAX_VALUE;
                        while (true) {
                            a[] aVarArr = this.f23364s;
                            if (i20 >= aVarArr.length) {
                                break;
                            }
                            a aVar = aVarArr[i20];
                            int i21 = aVar.f23374e;
                            k71 k71Var = aVar.f23371b;
                            if (i21 != k71Var.f22283b) {
                                long j20 = k71Var.f22284c[i21];
                                long[][] jArr = this.f23365t;
                                int i22 = da1.f19803a;
                                long j21 = jArr[i20][i21];
                                long j22 = j20 - position10;
                                boolean z20 = j22 < 0 || j22 >= 262144;
                                if ((!z20 && z18) || (z20 == z18 && j22 < j19)) {
                                    z18 = z20;
                                    i19 = i20;
                                    j19 = j22;
                                    j18 = j21;
                                }
                                if (j21 < j17) {
                                    z19 = z20;
                                    i18 = i20;
                                    j17 = j21;
                                }
                            }
                            i20++;
                        }
                        int i23 = (j17 == RecyclerView.FOREVER_NS || !z19 || j18 < j17 + SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE) ? i19 : i18;
                        this.f23359n = i23;
                        if (i23 == -1) {
                            return -1;
                        }
                    }
                    a aVar2 = this.f23364s[this.f23359n];
                    j71 j71Var = aVar2.f23372c;
                    int i24 = aVar2.f23374e;
                    k71 k71Var2 = aVar2.f23371b;
                    long j23 = k71Var2.f22284c[i24];
                    int i25 = k71Var2.f22285d[i24];
                    k81 k81Var = aVar2.f23373d;
                    long j24 = (j23 - position10) + ((long) this.f23360o);
                    if (j24 < 0 || j24 >= 262144) {
                        cs0Var.f19623a = j23;
                        return 1;
                    }
                    if (aVar2.f23370a.f20106g == 1) {
                        j24 += 8;
                        i25 -= 8;
                    }
                    vtVar.a((int) j24);
                    e71 e71Var = aVar2.f23370a;
                    if (e71Var.f20109j == 0) {
                        if ("audio/ac4".equals(e71Var.f20105f.f27115l)) {
                            if (this.f23361p == 0) {
                                l.a(i25, this.f23349d);
                                j71Var.a(7, this.f23349d);
                                this.f23361p += 7;
                            }
                            i25 += 7;
                        } else if (k81Var != null) {
                            k81Var.a(vtVar);
                        }
                        while (true) {
                            int i26 = this.f23361p;
                            if (i26 >= i25) {
                                break;
                            }
                            int iB = j71Var.b(vtVar, i25 - i26, false);
                            this.f23360o += iB;
                            this.f23361p += iB;
                            this.f23362q -= iB;
                        }
                    } else {
                        byte[] bArrC = this.f23348c.c();
                        bArrC[0] = 0;
                        bArrC[1] = 0;
                        bArrC[2] = 0;
                        int i27 = aVar2.f23370a.f20109j;
                        int i28 = 4 - i27;
                        while (this.f23361p < i25) {
                            int i29 = this.f23362q;
                            if (i29 == 0) {
                                vtVar.readFully(bArrC, i28, i27);
                                this.f23360o += i27;
                                this.f23348c.e(0);
                                int iH = this.f23348c.h();
                                if (iH < 0) {
                                    throw qp0.a("Invalid NAL length", (Exception) null);
                                }
                                this.f23362q = iH;
                                this.f23347b.e(0);
                                j71Var.a(4, this.f23347b);
                                this.f23361p += 4;
                                i25 += i28;
                            } else {
                                int iB2 = j71Var.b(vtVar, i29, false);
                                this.f23360o += iB2;
                                this.f23361p += iB2;
                                this.f23362q -= iB2;
                            }
                        }
                    }
                    k71 k71Var3 = aVar2.f23371b;
                    long j25 = k71Var3.f22287f[i24];
                    int i30 = k71Var3.f22288g[i24];
                    if (k81Var != null) {
                        k81Var.a(j71Var, j25, i30, i25, 0, null);
                        if (i24 + 1 == aVar2.f23371b.f22283b) {
                            k81Var.a(j71Var, null);
                        }
                    } else {
                        j71Var.a(j25, i30, i25, 0, null);
                    }
                    aVar2.f23374e++;
                    this.f23359n = -1;
                    this.f23360o = 0;
                    this.f23361p = 0;
                    this.f23362q = 0;
                    return 0;
                }
                long j26 = this.f23356k - ((long) this.f23357l);
                long position11 = vtVar.getPosition() + j26;
                mp0 mp0Var3 = this.f23358m;
                if (mp0Var3 != null) {
                    vtVar.readFully(mp0Var3.c(), this.f23357l, (int) j26);
                    if (this.f23355j == 1718909296) {
                        mp0Var3.e(8);
                        int iH2 = mp0Var3.h();
                        if (iH2 != 1751476579) {
                            i10 = iH2 != 1903435808 ? 0 : 1;
                        } else {
                            i10 = 2;
                        }
                        if (i10 == 0) {
                            mp0Var3.f(4);
                            do {
                                if (mp0Var3.a() <= 0) {
                                    i10 = 0;
                                    break;
                                }
                                int iH3 = mp0Var3.h();
                                if (iH3 != 1751476579) {
                                    i10 = iH3 != 1903435808 ? 0 : 1;
                                } else {
                                    i10 = 2;
                                }
                            } while (i10 == 0);
                        }
                        this.f23368w = i10;
                    } else if (!this.f23351f.isEmpty()) {
                        this.f23351f.peek().f24655c.add(new rb.b(this.f23355j, mp0Var3));
                    }
                } else {
                    if (j26 < 262144) {
                        vtVar.a((int) j26);
                    } else {
                        cs0Var.f19623a = vtVar.getPosition() + j26;
                        z10 = true;
                    }
                    c(position11);
                    if (z10 || this.f23354i == 2) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        return 1;
                    }
                }
                z10 = false;
                c(position11);
                if (z10) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                if (z11) {
                    return 1;
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(long j10, long j11) {
        this.f23351f.clear();
        this.f23357l = 0;
        this.f23359n = -1;
        this.f23360o = 0;
        this.f23361p = 0;
        this.f23362q = 0;
        if (j10 == 0) {
            if (this.f23354i != 3) {
                this.f23354i = 0;
                this.f23357l = 0;
                return;
            } else {
                this.f23352g.a();
                this.f23353h.clear();
                return;
            }
        }
        for (a aVar : this.f23364s) {
            k71 k71Var = aVar.f23371b;
            int iB = da1.b(k71Var.f22287f, j11, false);
            while (true) {
                if (iB < 0) {
                    iB = -1;
                    break;
                } else if ((k71Var.f22288g[iB] & 1) != 0) {
                    break;
                } else {
                    iB--;
                }
            }
            if (iB == -1) {
                iB = k71Var.a(j11);
            }
            aVar.f23374e = iB;
            k81 k81Var = aVar.f23373d;
            if (k81Var != null) {
                k81Var.a();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(wt wtVar) {
        this.f23363r = wtVar;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final boolean a(vt vtVar) throws IOException {
        return a31.a(vtVar, (this.f23346a & 2) != 0);
    }

    @Override // com.yandex.mobile.ads.impl.p01
    public final p01.a b(long j10) {
        long jMin;
        long jMin2;
        long j11;
        long j12;
        int iA;
        long j13 = j10;
        a[] aVarArr = this.f23364s;
        if (aVarArr.length == 0) {
            r01 r01Var = r01.f24582c;
            return new p01.a(r01Var, r01Var);
        }
        int i10 = this.f23366u;
        boolean z10 = false;
        int i11 = -1;
        if (i10 != -1) {
            k71 k71Var = aVarArr[i10].f23371b;
            int iB = da1.b(k71Var.f22287f, j13, false);
            while (true) {
                if (iB < 0) {
                    iB = -1;
                    break;
                }
                if ((k71Var.f22288g[iB] & 1) != 0) {
                    break;
                }
                iB--;
            }
            if (iB == -1) {
                iB = k71Var.a(j13);
            }
            if (iB == -1) {
                r01 r01Var2 = r01.f24582c;
                return new p01.a(r01Var2, r01Var2);
            }
            long j14 = k71Var.f22287f[iB];
            jMin = k71Var.f22284c[iB];
            if (j14 >= j13 || iB >= k71Var.f22283b - 1 || (iA = k71Var.a(j13)) == -1 || iA == iB) {
                j12 = -1;
                j11 = -9223372036854775807L;
            } else {
                j11 = k71Var.f22287f[iA];
                j12 = k71Var.f22284c[iA];
            }
            long j15 = j12;
            j13 = j14;
            jMin2 = j15;
        } else {
            jMin = RecyclerView.FOREVER_NS;
            jMin2 = -1;
            j11 = -9223372036854775807L;
        }
        int i12 = 0;
        while (true) {
            a[] aVarArr2 = this.f23364s;
            if (i12 >= aVarArr2.length) {
                break;
            }
            if (i12 != this.f23366u) {
                k71 k71Var2 = aVarArr2[i12].f23371b;
                int iB2 = da1.b(k71Var2.f22287f, j13, z10);
                while (true) {
                    if (iB2 < 0) {
                        iB2 = i11;
                        break;
                    }
                    if ((k71Var2.f22288g[iB2] & 1) != 0) {
                        break;
                    }
                    iB2--;
                }
                if (iB2 == i11) {
                    iB2 = k71Var2.a(j13);
                }
                if (iB2 != i11) {
                    jMin = Math.min(k71Var2.f22284c[iB2], jMin);
                }
                if (j11 != -9223372036854775807L) {
                    int iB3 = da1.b(k71Var2.f22287f, j11, false);
                    while (true) {
                        if (iB3 < 0) {
                            iB3 = -1;
                            break;
                        }
                        if ((k71Var2.f22288g[iB3] & 1) != 0) {
                            break;
                        }
                        iB3--;
                    }
                    if (iB3 == -1) {
                        iB3 = k71Var2.a(j11);
                    }
                    if (iB3 != -1) {
                        jMin2 = Math.min(k71Var2.f22284c[iB3], jMin2);
                    }
                    i12++;
                    z10 = false;
                    i11 = -1;
                }
            }
            jMin2 = jMin2;
            i12++;
            z10 = false;
            i11 = -1;
        }
        long j16 = jMin2;
        r01 r01Var3 = new r01(j13, jMin);
        return j11 == -9223372036854775807L ? new p01.a(r01Var3, r01Var3) : new p01.a(r01Var3, new r01(j11, j16));
    }

    @Override // com.yandex.mobile.ads.impl.p01
    public final boolean b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.p01
    public final long c() {
        return this.f23367v;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void release() {
    }
}
