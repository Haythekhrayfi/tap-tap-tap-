package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.mp4.MotionPhotoMetadata;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class o70 implements ut {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private wt f23715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23718e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MotionPhotoMetadata f23720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private vt f23721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private m41 f23722i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private nf0 f23723j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mp0 f23714a = new mp0(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f23719f = -1;

    /* JADX WARN: Code duplicated, block: B:79:0x01fb  */
    @Override // com.yandex.mobile.ads.impl.ut
    public final int a(vt vtVar, cs0 cs0Var) throws IOException {
        String strQ;
        MotionPhotoMetadata motionPhotoMetadata;
        lf0 lf0VarA;
        long j10;
        wt wtVar;
        p01.b bVar;
        int i10 = this.f23716c;
        if (i10 == 0) {
            this.f23714a.c(2);
            ((xn) vtVar).a(this.f23714a.c(), 0, 2, false);
            int iZ = this.f23714a.z();
            this.f23717d = iZ;
            if (iZ == 65498) {
                if (this.f23719f != -1) {
                    this.f23716c = 4;
                } else {
                    wt wtVar2 = this.f23715b;
                    Objects.requireNonNull(wtVar2);
                    wtVar2.a(1024, 4).a(new yv.a().b("image/jpeg").a(new Metadata(new Metadata.Entry[0])).a());
                    wt wtVar3 = this.f23715b;
                    Objects.requireNonNull(wtVar3);
                    wtVar3.a();
                    this.f23715b.a(new p01.b(-9223372036854775807L, 0L));
                    this.f23716c = 6;
                }
            } else if ((iZ < 65488 || iZ > 65497) && iZ != 65281) {
                this.f23716c = 1;
            }
            return 0;
        }
        if (i10 == 1) {
            this.f23714a.c(2);
            ((xn) vtVar).a(this.f23714a.c(), 0, 2, false);
            this.f23718e = this.f23714a.z() - 2;
            this.f23716c = 2;
            return 0;
        }
        if (i10 == 2) {
            if (this.f23717d == 65505) {
                mp0 mp0Var = new mp0(this.f23718e);
                xn xnVar = (xn) vtVar;
                xnVar.a(mp0Var.c(), 0, this.f23718e, false);
                if (this.f23720g == null && "http://ns.adobe.com/xap/1.0/".equals(mp0Var.q()) && (strQ = mp0Var.q()) != null) {
                    long jA = xnVar.a();
                    if (jA == -1 || (lf0VarA = hk1.a(strQ)) == null || lf0VarA.f22698b.size() < 2) {
                        motionPhotoMetadata = null;
                    } else {
                        boolean zEquals = false;
                        long j11 = -1;
                        long j12 = -1;
                        long j13 = -1;
                        long j14 = -1;
                        for (int size = lf0VarA.f22698b.size() - 1; size >= 0; size--) {
                            lf0.a aVar = lf0VarA.f22698b.get(size);
                            zEquals |= "video/mp4".equals(aVar.f22699a);
                            if (size == 0) {
                                j10 = jA - aVar.f22701c;
                                jA = 0;
                            } else {
                                long j15 = jA;
                                jA -= aVar.f22700b;
                                j10 = j15;
                            }
                            if (zEquals && jA != j10) {
                                j13 = jA;
                                j14 = j10 - jA;
                                zEquals = false;
                            }
                            if (size == 0) {
                                j11 = jA;
                                j12 = j10;
                            }
                        }
                        if (j13 == -1 || j14 == -1 || j11 == -1 || j12 == -1) {
                            motionPhotoMetadata = null;
                        } else {
                            motionPhotoMetadata = new MotionPhotoMetadata(j11, j12, lf0VarA.f22697a, j13, j14);
                        }
                    }
                    this.f23720g = motionPhotoMetadata;
                    if (motionPhotoMetadata != null) {
                        this.f23719f = motionPhotoMetadata.f18605d;
                    }
                }
            } else {
                ((xn) vtVar).a(this.f23718e);
            }
            this.f23716c = 0;
            return 0;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                if (i10 == 6) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            if (this.f23722i == null || vtVar != this.f23721h) {
                this.f23721h = vtVar;
                this.f23722i = new m41((xn) vtVar, this.f23719f);
            }
            nf0 nf0Var = this.f23723j;
            Objects.requireNonNull(nf0Var);
            int iA = nf0Var.a(this.f23722i, cs0Var);
            if (iA == 1) {
                cs0Var.f19623a += this.f23719f;
            }
            return iA;
        }
        xn xnVar2 = (xn) vtVar;
        long position = xnVar2.getPosition();
        long j16 = this.f23719f;
        if (position != j16) {
            cs0Var.f19623a = j16;
            return 1;
        }
        if (xnVar2.b(this.f23714a.c(), 0, 1, true)) {
            xnVar2.c();
            if (this.f23723j == null) {
                this.f23723j = new nf0();
            }
            m41 m41Var = new m41(xnVar2, this.f23719f);
            this.f23722i = m41Var;
            if (this.f23723j.a(m41Var)) {
                nf0 nf0Var2 = this.f23723j;
                long j17 = this.f23719f;
                wt wtVar4 = this.f23715b;
                Objects.requireNonNull(wtVar4);
                nf0Var2.a(new n41(j17, wtVar4));
                MotionPhotoMetadata motionPhotoMetadata2 = this.f23720g;
                Objects.requireNonNull(motionPhotoMetadata2);
                Metadata.Entry[] entryArr = {motionPhotoMetadata2};
                wt wtVar5 = this.f23715b;
                Objects.requireNonNull(wtVar5);
                wtVar5.a(1024, 4).a(new yv.a().b("image/jpeg").a(new Metadata(entryArr)).a());
                this.f23716c = 5;
            } else {
                wt wtVar6 = this.f23715b;
                Objects.requireNonNull(wtVar6);
                wtVar6.a(1024, 4).a(new yv.a().b("image/jpeg").a(new Metadata(new Metadata.Entry[0])).a());
                wt wtVar7 = this.f23715b;
                Objects.requireNonNull(wtVar7);
                wtVar7.a();
                wtVar = this.f23715b;
                bVar = new p01.b(-9223372036854775807L, 0L);
            }
            return 0;
        }
        wt wtVar8 = this.f23715b;
        Objects.requireNonNull(wtVar8);
        wtVar8.a(1024, 4).a(new yv.a().b("image/jpeg").a(new Metadata(new Metadata.Entry[0])).a());
        wt wtVar9 = this.f23715b;
        Objects.requireNonNull(wtVar9);
        wtVar9.a();
        wtVar = this.f23715b;
        bVar = new p01.b(-9223372036854775807L, 0L);
        wtVar.a(bVar);
        this.f23716c = 6;
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(long j10, long j11) {
        if (j10 == 0) {
            this.f23716c = 0;
            this.f23723j = null;
        } else if (this.f23716c == 5) {
            nf0 nf0Var = this.f23723j;
            Objects.requireNonNull(nf0Var);
            nf0Var.a(j10, j11);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(wt wtVar) {
        this.f23715b = wtVar;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final boolean a(vt vtVar) throws IOException {
        xn xnVar = (xn) vtVar;
        this.f23714a.c(2);
        xnVar.b(this.f23714a.c(), 0, 2, false);
        if (this.f23714a.z() != 65496) {
            return false;
        }
        this.f23714a.c(2);
        xnVar.b(this.f23714a.c(), 0, 2, false);
        int iZ = this.f23714a.z();
        this.f23717d = iZ;
        if (iZ == 65504) {
            this.f23714a.c(2);
            xnVar.b(this.f23714a.c(), 0, 2, false);
            xnVar.a(false, this.f23714a.z() - 2);
            this.f23714a.c(2);
            xnVar.b(this.f23714a.c(), 0, 2, false);
            this.f23717d = this.f23714a.z();
        }
        if (this.f23717d != 65505) {
            return false;
        }
        xnVar.a(false, 2);
        this.f23714a.c(6);
        xnVar.b(this.f23714a.c(), 0, 6, false);
        return this.f23714a.v() == 1165519206 && this.f23714a.z() == 0;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void release() {
    }
}
