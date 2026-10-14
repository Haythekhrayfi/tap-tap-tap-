package w;

/* JADX INFO: loaded from: classes.dex */
public abstract class q implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v.f f37071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n f37072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v.f.b f37073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f37074e = new h(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37075f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f37076g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g f37077h = new g(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f37078i = new g(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f37079j = b.NONE;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37080a;

        static {
            int[] iArr = new int[v.d.b.values().length];
            f37080a = iArr;
            try {
                iArr[v.d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37080a[v.d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37080a[v.d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37080a[v.d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37080a[v.d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public q(v.f fVar) {
        this.f37071b = fVar;
    }

    @Override // w.d
    public void a(d dVar) {
    }

    public final void b(g gVar, g gVar2, int i10) {
        gVar.f37051l.add(gVar2);
        gVar.f37045f = i10;
        gVar2.f37050k.add(gVar);
    }

    public final void c(g gVar, g gVar2, int i10, h hVar) {
        gVar.f37051l.add(gVar2);
        gVar.f37051l.add(this.f37074e);
        gVar.f37047h = i10;
        gVar.f37048i = hVar;
        gVar2.f37050k.add(gVar);
        hVar.f37050k.add(gVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        int iMax;
        if (i11 == 0) {
            v.f fVar = this.f37071b;
            int i12 = fVar.f36619w;
            iMax = Math.max(fVar.f36617v, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax == i10) {
                return i10;
            }
        } else {
            v.f fVar2 = this.f37071b;
            int i13 = fVar2.f36625z;
            iMax = Math.max(fVar2.f36623y, i10);
            if (i13 > 0) {
                iMax = Math.min(i13, i10);
            }
            if (iMax == i10) {
                return i10;
            }
        }
        return iMax;
    }

    public final g h(v.d dVar) {
        q qVar;
        q qVar2;
        v.d dVar2 = dVar.f36570f;
        if (dVar2 == null) {
            return null;
        }
        v.f fVar = dVar2.f36568d;
        int i10 = a.f37080a[dVar2.f36569e.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                qVar2 = fVar.f36581d;
            } else if (i10 == 3) {
                qVar = fVar.f36583e;
            } else {
                if (i10 == 4) {
                    return fVar.f36583e.f37061k;
                }
                if (i10 != 5) {
                    return null;
                }
                qVar2 = fVar.f36583e;
            }
            return qVar2.f37078i;
        }
        qVar = fVar.f36581d;
        return qVar.f37077h;
    }

    public final g i(v.d dVar, int i10) {
        v.d dVar2 = dVar.f36570f;
        if (dVar2 == null) {
            return null;
        }
        v.f fVar = dVar2.f36568d;
        q qVar = i10 == 0 ? fVar.f36581d : fVar.f36583e;
        int i11 = a.f37080a[dVar2.f36569e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return qVar.f37078i;
        }
        return qVar.f37077h;
    }

    public long j() {
        h hVar = this.f37074e;
        if (hVar.f37049j) {
            return hVar.f37046g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code duplicated, block: B:29:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    public void l(v.d dVar, v.d dVar2, int i10) {
        int i11;
        int iG;
        h hVar;
        float f10;
        g gVarH = h(dVar);
        g gVarH2 = h(dVar2);
        if (gVarH.f37049j && gVarH2.f37049j) {
            int iE = dVar.e() + gVarH.f37046g;
            int iE2 = gVarH2.f37046g - dVar2.e();
            int i12 = iE2 - iE;
            h hVar2 = this.f37074e;
            if (!hVar2.f37049j) {
                v.f.b bVar = this.f37073d;
                v.f.b bVar2 = v.f.b.MATCH_CONSTRAINT;
                if (bVar == bVar2) {
                    int i13 = this.f37070a;
                    if (i13 != 0) {
                        if (i13 == 1) {
                            int iG2 = g(hVar2.f37052m, i10);
                            h hVar3 = this.f37074e;
                            iG = Math.min(iG2, i12);
                            hVar2 = hVar3;
                        } else if (i13 == 2) {
                            v.f fVar = this.f37071b;
                            v.f fVar2 = fVar.Y;
                            if (fVar2 != null) {
                                h hVar4 = (i10 == 0 ? fVar2.f36581d : fVar2.f36583e).f37074e;
                                if (hVar4.f37049j) {
                                    i11 = (int) ((hVar4.f37046g * (i10 == 0 ? fVar.f36621x : fVar.A)) + 0.5f);
                                }
                            }
                        } else if (i13 == 3) {
                            v.f fVar3 = this.f37071b;
                            q qVar = fVar3.f36581d;
                            if (qVar.f37073d == bVar2 && qVar.f37070a == 3) {
                                o oVar = fVar3.f36583e;
                                if (oVar.f37073d != bVar2 || oVar.f37070a != 3) {
                                    if (i10 == 0) {
                                        qVar = fVar3.f36583e;
                                    }
                                    hVar = qVar.f37074e;
                                    if (hVar.f37049j) {
                                        f10 = fVar3.f36578b0;
                                        if (i10 == 1) {
                                            iG = (int) ((hVar.f37046g / f10) + 0.5f);
                                        } else {
                                            iG = (int) ((f10 * hVar.f37046g) + 0.5f);
                                        }
                                    }
                                }
                            } else {
                                if (i10 == 0) {
                                    qVar = fVar3.f36583e;
                                }
                                hVar = qVar.f37074e;
                                if (hVar.f37049j) {
                                    f10 = fVar3.f36578b0;
                                    if (i10 == 1) {
                                        iG = (int) ((hVar.f37046g / f10) + 0.5f);
                                    } else {
                                        iG = (int) ((f10 * hVar.f37046g) + 0.5f);
                                    }
                                }
                            }
                        }
                        hVar2.c(iG);
                    } else {
                        i11 = i12;
                    }
                    iG = g(i11, i10);
                    hVar2.c(iG);
                }
            }
            h hVar5 = this.f37074e;
            if (hVar5.f37049j) {
                int i14 = hVar5.f37046g;
                if (i14 == i12) {
                    this.f37077h.c(iE);
                    this.f37078i.c(iE2);
                    return;
                }
                float f11 = i10 == 0 ? this.f37071b.f36600m0 : this.f37071b.f36602n0;
                if (gVarH == gVarH2) {
                    iE = gVarH.f37046g;
                    iE2 = gVarH2.f37046g;
                    f11 = 0.5f;
                }
                this.f37077h.c((int) ((((iE2 - iE) - i14) * f11) + iE + 0.5f));
                this.f37078i.c(this.f37077h.f37046g + this.f37074e.f37046g);
            }
        }
    }
}
