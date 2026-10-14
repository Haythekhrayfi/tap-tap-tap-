package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.util.FileUtil;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.id3.MlltFrame;
import com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame;
import java.io.EOFException;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class mf0 implements ut {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final n10.a f23048u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f23050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mp0 f23051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rf0.a f23052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final yx f23053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o10 f23054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final br f23055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private wt f23056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private j71 f23057i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private j71 f23058j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f23059k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Metadata f23060l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f23061m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f23062n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f23063o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f23064p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private s01 f23065q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f23066r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f23067s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f23068t;

    static {
        yn1 yn1Var = yn1.f26960t;
        f23048u = dp1.f19961t;
    }

    public mf0() {
        this(0);
    }

    public mf0(int i10) {
        this((Object) null);
    }

    public mf0(Object obj) {
        this.f23049a = 0;
        this.f23050b = -9223372036854775807L;
        this.f23051c = new mp0(10);
        this.f23052d = new rf0.a();
        this.f23053e = new yx();
        this.f23061m = -9223372036854775807L;
        this.f23054f = new o10();
        br brVar = new br();
        this.f23055g = brVar;
        this.f23058j = brVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(int i10, int i11, int i12, int i13, int i14) {
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    /* JADX WARN: Code duplicated, block: B:46:0x009f  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ac A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3 A[EDGE_INSN: B:76:0x00d3->B:62:0x00d3 BREAK  A[LOOP:0: B:24:0x004a->B:77:0x004a], SYNTHETIC] */
    private boolean a(xn xnVar, boolean z10) throws IOException {
        int iE;
        int i10;
        boolean z11;
        int iB;
        int i11;
        int i12 = z10 ? FileUtil.BUF_SIZE : 131072;
        xnVar.c();
        if (xnVar.getPosition() == 0) {
            Metadata metadataA = this.f23054f.a(xnVar, (this.f23049a & 8) == 0 ? null : f23048u);
            this.f23060l = metadataA;
            if (metadataA != null) {
                this.f23053e.a(metadataA);
            }
            iE = (int) xnVar.e();
            if (!z10) {
                xnVar.a(iE);
            }
            i10 = 0;
        } else {
            iE = 0;
            i10 = 0;
        }
        int i13 = i10;
        int i14 = i13;
        while (true) {
            s01 s01Var = this.f23065q;
            if (s01Var != null) {
                long jA = s01Var.a();
                if (jA == -1 || xnVar.e() <= jA - 4) {
                    try {
                        z11 = !xnVar.b(this.f23051c.c(), 0, 4, true);
                    } catch (EOFException unused) {
                        z11 = true;
                    }
                } else {
                    z11 = true;
                }
            } else {
                z11 = !xnVar.b(this.f23051c.c(), 0, 4, true);
            }
            if (z11) {
                if (i13 > 0) {
                    break;
                }
                throw new EOFException();
            }
            this.f23051c.e(0);
            int iH = this.f23051c.h();
            if (i10 == 0) {
                iB = rf0.b(iH);
                if (iB != -1) {
                    i11 = i14 + 1;
                    if (i14 == i12) {
                        if (z10) {
                            return false;
                        }
                        throw qp0.a("Searched too many bytes.", (Exception) null);
                    }
                    if (z10) {
                        xnVar.c();
                        xnVar.a(false, iE + i11);
                    } else {
                        xnVar.a(1);
                    }
                    i13 = 0;
                    i14 = i11;
                    i10 = 0;
                } else {
                    i13++;
                    if (i13 == 1) {
                        if (i13 == 4) {
                            break;
                        }
                    } else {
                        this.f23052d.a(iH);
                        i10 = iH;
                    }
                    xnVar.a(false, iB - 4);
                }
            } else {
                if (((long) ((-128000) & iH)) == (((long) i10) & (-128000))) {
                    iB = rf0.b(iH);
                    if (iB != -1) {
                        i13++;
                        if (i13 == 1) {
                            if (i13 == 4) {
                                break;
                                break;
                            }
                        } else {
                            this.f23052d.a(iH);
                            i10 = iH;
                        }
                        xnVar.a(false, iB - 4);
                    }
                }
                i11 = i14 + 1;
                if (i14 == i12) {
                    if (z10) {
                        return false;
                    }
                    throw qp0.a("Searched too many bytes.", (Exception) null);
                }
                if (z10) {
                    xnVar.c();
                    xnVar.a(false, iE + i11);
                } else {
                    xnVar.a(1);
                }
                i13 = 0;
                i14 = i11;
                i10 = 0;
            }
        }
        if (z10) {
            xnVar.a(iE + i14);
        } else {
            xnVar.c();
        }
        this.f23059k = i10;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ut[] b() {
        return new ut[]{new mf0()};
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0203  */
    /* JADX WARN: Code duplicated, block: B:105:0x0209  */
    /* JADX WARN: Code duplicated, block: B:106:0x020c  */
    /* JADX WARN: Code duplicated, block: B:10:0x0041  */
    /* JADX WARN: Code duplicated, block: B:110:0x027c  */
    /* JADX WARN: Code duplicated, block: B:111:0x027e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0292  */
    /* JADX WARN: Code duplicated, block: B:115:0x029a  */
    /* JADX WARN: Code duplicated, block: B:117:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:11:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:122:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:132:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:134:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:135:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
    /* JADX WARN: Code duplicated, block: B:153:0x0380  */
    /* JADX WARN: Code duplicated, block: B:155:0x038b  */
    /* JADX WARN: Code duplicated, block: B:156:0x038e  */
    /* JADX WARN: Code duplicated, block: B:159:0x0396  */
    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    /* JADX WARN: Code duplicated, block: B:172:0x02d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0067  */
    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0078  */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:55:0x013f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0146  */
    /* JADX WARN: Code duplicated, block: B:61:0x0157  */
    /* JADX WARN: Code duplicated, block: B:63:0x015f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0182 A[LOOP:0: B:56:0x0144->B:69:0x0182, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x0186 A[EDGE_INSN: B:70:0x0186->B:71:0x0187 BREAK  A[LOOP:0: B:56:0x0144->B:69:0x0182]] */
    /* JADX WARN: Code duplicated, block: B:73:0x018b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0192  */
    /* JADX WARN: Code duplicated, block: B:76:0x0197 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0199  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01dc A[EDGE_INSN: B:91:0x01dc->B:78:0x019d BREAK  A[LOOP:2: B:84:0x01ba->B:90:0x01d9]] */
    /* JADX WARN: Code duplicated, block: B:93:0x01ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:9:0x003f A[DONT_INVERT] */
    @Override // com.yandex.mobile.ads.impl.ut
    public final int a(vt vtVar, cs0 cs0Var) throws IOException {
        int i10;
        xn xnVar;
        long position;
        long j10;
        int iB;
        int i11;
        xn xnVar2;
        s01 s01Var;
        boolean z10;
        int iH;
        boolean z11;
        long jA;
        mp0 mp0Var;
        xn xnVar3;
        int i12;
        int i13;
        int i14;
        int iH2;
        s01 s01VarA;
        yx yxVar;
        boolean z12;
        yx yxVar2;
        int i15;
        int i16;
        Metadata metadata;
        long position2;
        ve0 ve0VarA;
        boolean z13;
        Metadata metadata2;
        long jA2;
        int iC;
        int i17;
        Metadata.Entry entryA;
        TextInformationFrame textInformationFrame;
        long jA3;
        long j11;
        Metadata metadata3;
        int iC2;
        int i18;
        Metadata.Entry entryA2;
        int iC3;
        int i19;
        long jA4;
        Metadata.Entry entryA3;
        TextInformationFrame textInformationFrame2;
        pa.b(this.f23057i);
        int i20 = da1.f19803a;
        int i21 = 0;
        if (this.f23059k == 0) {
            try {
                a((xn) vtVar, false);
                if (this.f23065q == null) {
                    mp0Var = new mp0(this.f23052d.f24698c);
                    xnVar3 = (xn) vtVar;
                    xnVar3.b(mp0Var.c(), 0, this.f23052d.f24698c, false);
                    rf0.a aVar = this.f23052d;
                    i12 = aVar.f24696a & 1;
                    i13 = aVar.f24700e;
                    if (i12 != 0) {
                        if (i13 != 1) {
                            i14 = 36;
                        } else {
                            i14 = 21;
                        }
                    } else if (i13 != 1) {
                        i14 = 21;
                    } else {
                        i14 = 13;
                    }
                    if (mp0Var.e() >= i14 + 4) {
                        mp0Var.e(i14);
                        iH2 = mp0Var.h();
                        if (iH2 != 1483304551 && iH2 != 1231971951) {
                            if (mp0Var.e() >= 40) {
                                mp0Var.e(36);
                                if (mp0Var.h() == 1447187017) {
                                    iH2 = 1447187017;
                                } else {
                                    iH2 = 0;
                                }
                            } else {
                                iH2 = 0;
                            }
                        }
                    } else if (mp0Var.e() >= 40) {
                        mp0Var.e(36);
                        if (mp0Var.h() == 1447187017) {
                            iH2 = 1447187017;
                        } else {
                            iH2 = 0;
                        }
                    } else {
                        iH2 = 0;
                    }
                    if (iH2 != 1483304551 || iH2 == 1231971951) {
                        s01VarA = ck1.a(xnVar3.a(), xnVar3.getPosition(), this.f23052d, mp0Var);
                        if (s01VarA != null) {
                            yxVar = this.f23053e;
                            if (yxVar.f27158a != -1 || yxVar.f27159b == -1) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            if (!z12) {
                                xnVar3.c();
                                xnVar3.a(false, i14 + 141);
                                xnVar3.b(this.f23051c.c(), 0, 3, false);
                                this.f23051c.e(0);
                                yxVar2 = this.f23053e;
                                int iW = this.f23051c.w();
                                i15 = iW >> 12;
                                i16 = iW & 4095;
                                if (i15 <= 0 || i16 > 0) {
                                    yxVar2.f27158a = i15;
                                    yxVar2.f27159b = i16;
                                } else {
                                    Objects.requireNonNull(yxVar2);
                                }
                            }
                        }
                        xnVar3.a(this.f23052d.f24698c);
                        if (s01VarA != null && !s01VarA.b() && iH2 == 1231971951) {
                            xnVar3.b(this.f23051c.c(), 0, 4, false);
                            this.f23051c.e(0);
                            this.f23052d.a(this.f23051c.h());
                            s01VarA = new sk(xnVar3.a(), xnVar3.getPosition(), this.f23052d, false);
                        }
                    } else if (iH2 == 1447187017) {
                        s01VarA = kb1.a(xnVar3.a(), xnVar3.getPosition(), this.f23052d, mp0Var);
                        xnVar3.a(this.f23052d.f24698c);
                    } else {
                        xnVar3.c();
                        s01VarA = null;
                    }
                    metadata = this.f23060l;
                    position2 = xnVar3.getPosition();
                    if (metadata != null) {
                        ve0VarA = null;
                        break;
                    }
                    iC2 = metadata.c();
                    i18 = 0;
                    while (true) {
                        if (i18 < iC2) {
                            ve0VarA = null;
                            break;
                        }
                        entryA2 = metadata.a(i18);
                        if (entryA2 instanceof MlltFrame) {
                            MlltFrame mlltFrame = (MlltFrame) entryA2;
                            iC3 = metadata.c();
                            i19 = 0;
                            while (true) {
                                if (i19 < iC3) {
                                    jA4 = -9223372036854775807L;
                                    break;
                                }
                                entryA3 = metadata.a(i19);
                                if (entryA3 instanceof TextInformationFrame) {
                                    textInformationFrame2 = (TextInformationFrame) entryA3;
                                    if (textInformationFrame2.f18583a.equals("TLEN")) {
                                        jA4 = da1.a(Long.parseLong(textInformationFrame2.f18595c));
                                        break;
                                    }
                                }
                                i19++;
                            }
                            ve0VarA = ve0.a(position2, mlltFrame, jA4);
                            break;
                        }
                        i18++;
                    }
                    if (this.f23066r) {
                        s01VarA = new s01.a();
                    } else {
                        if ((this.f23049a & 4) != 0) {
                            if (ve0VarA != null) {
                                jA2 = ve0VarA.c();
                            } else {
                                if (s01VarA != null) {
                                    metadata2 = this.f23060l;
                                    if (metadata2 != null) {
                                        jA2 = -9223372036854775807L;
                                        break;
                                    }
                                    iC = metadata2.c();
                                    i17 = 0;
                                    while (true) {
                                        if (i17 < iC) {
                                            jA2 = -9223372036854775807L;
                                            break;
                                        }
                                        entryA = metadata2.a(i17);
                                        if (entryA instanceof TextInformationFrame) {
                                            textInformationFrame = (TextInformationFrame) entryA;
                                            if (textInformationFrame.f18583a.equals("TLEN")) {
                                                jA2 = da1.a(Long.parseLong(textInformationFrame.f18595c));
                                                break;
                                            }
                                        }
                                        i17++;
                                    }
                                } else {
                                    long jC = s01VarA.c();
                                    jA3 = s01VarA.a();
                                    j11 = jC;
                                }
                                s01VarA = new e30(j11, xnVar3.getPosition(), jA3);
                            }
                            j11 = jA2;
                            jA3 = -1;
                            s01VarA = new e30(j11, xnVar3.getPosition(), jA3);
                        } else if (ve0VarA != null) {
                            s01VarA = ve0VarA;
                        } else if (s01VarA == null) {
                            s01VarA = null;
                        }
                        if (s01VarA != null || (!s01VarA.b() && (this.f23049a & 1) != 0)) {
                            if ((this.f23049a & 2) != 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            xnVar3.b(this.f23051c.c(), 0, 4, false);
                            this.f23051c.e(0);
                            this.f23052d.a(this.f23051c.h());
                            s01VarA = new sk(xnVar3.a(), xnVar3.getPosition(), this.f23052d, z13);
                        }
                    }
                    this.f23065q = s01VarA;
                    this.f23056h.a(s01VarA);
                    j71 j71Var = this.f23058j;
                    yv.a aVarF = new yv.a().f(this.f23052d.f24697b).i(4096).c(this.f23052d.f24700e).n(this.f23052d.f24699d).e(this.f23053e.f27158a).f(this.f23053e.f27159b);
                    if ((this.f23049a & 8) != 0) {
                        metadata3 = null;
                    } else {
                        metadata3 = this.f23060l;
                    }
                    j71Var.a(aVarF.a(metadata3).a());
                    this.f23063o = xnVar3.getPosition();
                } else if (this.f23063o != 0) {
                    xnVar = (xn) vtVar;
                    position = xnVar.getPosition();
                    j10 = this.f23063o;
                    if (position < j10) {
                        xnVar.a((int) (j10 - position));
                    }
                }
                if (this.f23064p == 0) {
                    xnVar2 = (xn) vtVar;
                    xnVar2.c();
                    s01Var = this.f23065q;
                    if (s01Var != null) {
                        jA = s01Var.a();
                        if (jA != -1 || xnVar2.e() <= jA - 4) {
                            try {
                            } catch (EOFException unused) {
                                z10 = true;
                            }
                        } else {
                            z10 = true;
                        }
                    }
                    if (z10) {
                        i10 = -1;
                        i21 = -1;
                    } else {
                        this.f23051c.e(0);
                        iH = this.f23051c.h();
                        if (((-128000) & iH) == (((long) this.f23059k) & (-128000))) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11 || rf0.b(iH) == -1) {
                            xnVar2.a(1);
                            this.f23059k = 0;
                        } else {
                            this.f23052d.a(iH);
                            if (this.f23061m == -9223372036854775807L) {
                                this.f23061m = this.f23065q.a(xnVar2.getPosition());
                                if (this.f23050b != -9223372036854775807L) {
                                    this.f23061m = (this.f23050b - this.f23065q.a(0L)) + this.f23061m;
                                }
                            }
                            rf0.a aVar2 = this.f23052d;
                            this.f23064p = aVar2.f24698c;
                            s01 s01Var2 = this.f23065q;
                            if (s01Var2 instanceof e30) {
                                e30 e30Var = (e30) s01Var2;
                                e30Var.a((((this.f23062n + ((long) aVar2.f24702g)) * 1000000) / ((long) aVar2.f24699d)) + this.f23061m, xnVar2.getPosition() + ((long) this.f23052d.f24698c));
                                if (this.f23067s && e30Var.c(this.f23068t)) {
                                    this.f23067s = false;
                                    this.f23058j = this.f23057i;
                                }
                            }
                            iB = this.f23058j.b(vtVar, this.f23064p, true);
                            if (iB == -1) {
                                i10 = -1;
                                i21 = -1;
                            } else {
                                i11 = this.f23064p - iB;
                                this.f23064p = i11;
                                if (i11 <= 0) {
                                    j71 j71Var2 = this.f23058j;
                                    long j12 = this.f23062n;
                                    long j13 = this.f23061m;
                                    rf0.a aVar3 = this.f23052d;
                                    j71Var2.a(((j12 * 1000000) / ((long) aVar3.f24699d)) + j13, 1, aVar3.f24698c, 0, null);
                                    this.f23062n += (long) this.f23052d.f24702g;
                                    this.f23064p = 0;
                                }
                            }
                        }
                        i10 = -1;
                    }
                } else {
                    iB = this.f23058j.b(vtVar, this.f23064p, true);
                    if (iB == -1) {
                        i10 = -1;
                        i21 = -1;
                    } else {
                        i11 = this.f23064p - iB;
                        this.f23064p = i11;
                        if (i11 <= 0) {
                            j71 j71Var3 = this.f23058j;
                            long j14 = this.f23062n;
                            long j15 = this.f23061m;
                            rf0.a aVar4 = this.f23052d;
                            j71Var3.a(((j14 * 1000000) / ((long) aVar4.f24699d)) + j15, 1, aVar4.f24698c, 0, null);
                            this.f23062n += (long) this.f23052d.f24702g;
                            this.f23064p = 0;
                        }
                        i10 = -1;
                    }
                }
            } catch (EOFException unused2) {
            }
        } else {
            if (this.f23065q == null) {
                mp0Var = new mp0(this.f23052d.f24698c);
                xnVar3 = (xn) vtVar;
                xnVar3.b(mp0Var.c(), 0, this.f23052d.f24698c, false);
                rf0.a aVar5 = this.f23052d;
                i12 = aVar5.f24696a & 1;
                i13 = aVar5.f24700e;
                if (i12 != 0) {
                    if (i13 != 1) {
                        i14 = 36;
                    } else {
                        i14 = 21;
                    }
                } else if (i13 != 1) {
                    i14 = 21;
                } else {
                    i14 = 13;
                }
                if (mp0Var.e() >= i14 + 4) {
                    mp0Var.e(i14);
                    iH2 = mp0Var.h();
                    if (iH2 != 1483304551) {
                        if (mp0Var.e() >= 40) {
                            mp0Var.e(36);
                            if (mp0Var.h() == 1447187017) {
                                iH2 = 1447187017;
                            } else {
                                iH2 = 0;
                            }
                        } else {
                            iH2 = 0;
                        }
                    }
                } else if (mp0Var.e() >= 40) {
                    mp0Var.e(36);
                    if (mp0Var.h() == 1447187017) {
                        iH2 = 1447187017;
                    } else {
                        iH2 = 0;
                    }
                } else {
                    iH2 = 0;
                }
                if (iH2 != 1483304551) {
                    s01VarA = ck1.a(xnVar3.a(), xnVar3.getPosition(), this.f23052d, mp0Var);
                    if (s01VarA != null) {
                        yxVar = this.f23053e;
                        if (yxVar.f27158a != -1) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            xnVar3.c();
                            xnVar3.a(false, i14 + 141);
                            xnVar3.b(this.f23051c.c(), 0, 3, false);
                            this.f23051c.e(0);
                            yxVar2 = this.f23053e;
                            int iW2 = this.f23051c.w();
                            i15 = iW2 >> 12;
                            i16 = iW2 & 4095;
                            if (i15 <= 0) {
                                yxVar2.f27158a = i15;
                                yxVar2.f27159b = i16;
                            } else {
                                yxVar2.f27158a = i15;
                                yxVar2.f27159b = i16;
                            }
                        }
                    }
                    xnVar3.a(this.f23052d.f24698c);
                    if (s01VarA != null) {
                        xnVar3.b(this.f23051c.c(), 0, 4, false);
                        this.f23051c.e(0);
                        this.f23052d.a(this.f23051c.h());
                        s01VarA = new sk(xnVar3.a(), xnVar3.getPosition(), this.f23052d, false);
                    }
                } else {
                    s01VarA = ck1.a(xnVar3.a(), xnVar3.getPosition(), this.f23052d, mp0Var);
                    if (s01VarA != null) {
                        yxVar = this.f23053e;
                        if (yxVar.f27158a != -1) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            xnVar3.c();
                            xnVar3.a(false, i14 + 141);
                            xnVar3.b(this.f23051c.c(), 0, 3, false);
                            this.f23051c.e(0);
                            yxVar2 = this.f23053e;
                            int iW3 = this.f23051c.w();
                            i15 = iW3 >> 12;
                            i16 = iW3 & 4095;
                            if (i15 <= 0) {
                                yxVar2.f27158a = i15;
                                yxVar2.f27159b = i16;
                            } else {
                                yxVar2.f27158a = i15;
                                yxVar2.f27159b = i16;
                            }
                        }
                    }
                    xnVar3.a(this.f23052d.f24698c);
                    if (s01VarA != null) {
                        xnVar3.b(this.f23051c.c(), 0, 4, false);
                        this.f23051c.e(0);
                        this.f23052d.a(this.f23051c.h());
                        s01VarA = new sk(xnVar3.a(), xnVar3.getPosition(), this.f23052d, false);
                    }
                }
                metadata = this.f23060l;
                position2 = xnVar3.getPosition();
                if (metadata != null) {
                    ve0VarA = null;
                    break;
                }
                iC2 = metadata.c();
                i18 = 0;
                while (true) {
                    if (i18 < iC2) {
                        ve0VarA = null;
                        break;
                    }
                    entryA2 = metadata.a(i18);
                    if (entryA2 instanceof MlltFrame) {
                        MlltFrame mlltFrame2 = (MlltFrame) entryA2;
                        iC3 = metadata.c();
                        i19 = 0;
                        while (true) {
                            if (i19 < iC3) {
                                jA4 = -9223372036854775807L;
                                break;
                            }
                            entryA3 = metadata.a(i19);
                            if (entryA3 instanceof TextInformationFrame) {
                                textInformationFrame2 = (TextInformationFrame) entryA3;
                                if (textInformationFrame2.f18583a.equals("TLEN")) {
                                    jA4 = da1.a(Long.parseLong(textInformationFrame2.f18595c));
                                    break;
                                }
                            }
                            i19++;
                        }
                        ve0VarA = ve0.a(position2, mlltFrame2, jA4);
                        break;
                    }
                    i18++;
                }
                if (this.f23066r) {
                    s01VarA = new s01.a();
                } else {
                    if ((this.f23049a & 4) != 0) {
                        if (ve0VarA != null) {
                            jA2 = ve0VarA.c();
                        } else {
                            if (s01VarA != null) {
                                metadata2 = this.f23060l;
                                if (metadata2 != null) {
                                    jA2 = -9223372036854775807L;
                                    break;
                                }
                                iC = metadata2.c();
                                i17 = 0;
                                while (true) {
                                    if (i17 < iC) {
                                        jA2 = -9223372036854775807L;
                                        break;
                                    }
                                    entryA = metadata2.a(i17);
                                    if (entryA instanceof TextInformationFrame) {
                                        textInformationFrame = (TextInformationFrame) entryA;
                                        if (textInformationFrame.f18583a.equals("TLEN")) {
                                            jA2 = da1.a(Long.parseLong(textInformationFrame.f18595c));
                                            break;
                                        }
                                    }
                                    i17++;
                                }
                            } else {
                                long jC2 = s01VarA.c();
                                jA3 = s01VarA.a();
                                j11 = jC2;
                            }
                            s01VarA = new e30(j11, xnVar3.getPosition(), jA3);
                        }
                        j11 = jA2;
                        jA3 = -1;
                        s01VarA = new e30(j11, xnVar3.getPosition(), jA3);
                    } else if (ve0VarA != null) {
                        s01VarA = ve0VarA;
                    } else if (s01VarA == null) {
                        s01VarA = null;
                    }
                    if (s01VarA != null) {
                        if ((this.f23049a & 2) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        xnVar3.b(this.f23051c.c(), 0, 4, false);
                        this.f23051c.e(0);
                        this.f23052d.a(this.f23051c.h());
                        s01VarA = new sk(xnVar3.a(), xnVar3.getPosition(), this.f23052d, z13);
                    } else {
                        if ((this.f23049a & 2) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        xnVar3.b(this.f23051c.c(), 0, 4, false);
                        this.f23051c.e(0);
                        this.f23052d.a(this.f23051c.h());
                        s01VarA = new sk(xnVar3.a(), xnVar3.getPosition(), this.f23052d, z13);
                    }
                }
                this.f23065q = s01VarA;
                this.f23056h.a(s01VarA);
                j71 j71Var4 = this.f23058j;
                yv.a aVarF2 = new yv.a().f(this.f23052d.f24697b).i(4096).c(this.f23052d.f24700e).n(this.f23052d.f24699d).e(this.f23053e.f27158a).f(this.f23053e.f27159b);
                if ((this.f23049a & 8) != 0) {
                    metadata3 = null;
                } else {
                    metadata3 = this.f23060l;
                }
                j71Var4.a(aVarF2.a(metadata3).a());
                this.f23063o = xnVar3.getPosition();
            } else if (this.f23063o != 0) {
                xnVar = (xn) vtVar;
                position = xnVar.getPosition();
                j10 = this.f23063o;
                if (position < j10) {
                    xnVar.a((int) (j10 - position));
                }
            }
            if (this.f23064p == 0) {
                xnVar2 = (xn) vtVar;
                xnVar2.c();
                s01Var = this.f23065q;
                if (s01Var != null) {
                    jA = s01Var.a();
                    z10 = jA != -1 ? !xnVar2.b(this.f23051c.c(), 0, 4, true) : !xnVar2.b(this.f23051c.c(), 0, 4, true);
                }
                if (z10) {
                    i10 = -1;
                    i21 = -1;
                } else {
                    this.f23051c.e(0);
                    iH = this.f23051c.h();
                    if (((-128000) & iH) == (((long) this.f23059k) & (-128000))) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                    }
                    xnVar2.a(1);
                    this.f23059k = 0;
                    i10 = -1;
                }
            } else {
                iB = this.f23058j.b(vtVar, this.f23064p, true);
                if (iB == -1) {
                    i10 = -1;
                    i21 = -1;
                } else {
                    i11 = this.f23064p - iB;
                    this.f23064p = i11;
                    if (i11 <= 0) {
                        j71 j71Var5 = this.f23058j;
                        long j16 = this.f23062n;
                        long j17 = this.f23061m;
                        rf0.a aVar6 = this.f23052d;
                        j71Var5.a(((j16 * 1000000) / ((long) aVar6.f24699d)) + j17, 1, aVar6.f24698c, 0, null);
                        this.f23062n += (long) this.f23052d.f24702g;
                        this.f23064p = 0;
                    }
                    i10 = -1;
                }
            }
        }
        if (i21 == i10) {
            s01 s01Var3 = this.f23065q;
            if (s01Var3 instanceof e30) {
                long j18 = ((this.f23062n * 1000000) / ((long) this.f23052d.f24699d)) + this.f23061m;
                if (s01Var3.c() != j18) {
                    ((e30) this.f23065q).d(j18);
                    this.f23056h.a(this.f23065q);
                }
            }
        }
        return i21;
    }

    public final void a() {
        this.f23066r = true;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(long j10, long j11) {
        this.f23059k = 0;
        this.f23061m = -9223372036854775807L;
        this.f23062n = 0L;
        this.f23064p = 0;
        this.f23068t = j11;
        s01 s01Var = this.f23065q;
        if (!(s01Var instanceof e30) || ((e30) s01Var).c(j11)) {
            return;
        }
        this.f23067s = true;
        this.f23058j = this.f23055g;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(wt wtVar) {
        this.f23056h = wtVar;
        j71 j71VarA = wtVar.a(0, 1);
        this.f23057i = j71VarA;
        this.f23058j = j71VarA;
        this.f23056h.a();
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final boolean a(vt vtVar) throws IOException {
        return a((xn) vtVar, true);
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void release() {
    }
}
