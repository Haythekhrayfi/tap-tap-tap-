package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class rg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nw0 f24703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ex0 f24704b;

    public static final class a {
        /* JADX WARN: Code duplicated, block: B:24:0x003b  */
        public static boolean a(nw0 nw0Var, ex0 ex0Var) {
            fd.j0.i(ex0Var, "response");
            fd.j0.i(nw0Var, "request");
            int iE = ex0Var.e();
            if (iE != 200 && iE != 410 && iE != 414 && iE != 501 && iE != 203 && iE != 204) {
                if (iE == 307) {
                    if (ex0.a(ex0Var, "Expires") == null && ex0Var.b().c() == -1 && !ex0Var.b().b() && !ex0Var.b().a()) {
                        return false;
                    }
                } else if (iE != 308 && iE != 404 && iE != 405) {
                    switch (iE) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            if (ex0.a(ex0Var, "Expires") == null) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                }
            }
            return (ex0Var.b().h() || nw0Var.b().h()) ? false : true;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f24705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final nw0 f24706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ex0 f24707c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f24708d;

        public b(long j10, nw0 nw0Var) {
            fd.j0.i(nw0Var, "request");
            this.f24705a = j10;
            this.f24706b = nw0Var;
            this.f24707c = null;
            this.f24708d = -1;
        }

        /* JADX WARN: Code duplicated, block: B:59:0x0120  */
        /* JADX WARN: Code duplicated, block: B:60:0x0128  */
        public final rg a() {
            rg rgVar;
            if (this.f24707c == null) {
                rgVar = new rg(this.f24706b, null);
            } else if (this.f24706b.e() && this.f24707c.g() == null) {
                rgVar = new rg(this.f24706b, null);
            } else {
                if (a.a(this.f24706b, this.f24707c)) {
                    fg fgVarB = this.f24706b.b();
                    if (fgVarB.g()) {
                        rgVar = new rg(this.f24706b, null);
                    } else {
                        nw0 nw0Var = this.f24706b;
                        if ((nw0Var.a("If-Modified-Since") == null && nw0Var.a("If-None-Match") == null) ? false : true) {
                            rgVar = new rg(this.f24706b, null);
                        } else {
                            fg fgVarB2 = this.f24707c.b();
                            int i10 = this.f24708d;
                            long millis = 0;
                            long jMax = (i10 != -1 ? Math.max(0L, TimeUnit.SECONDS.toMillis(i10)) : 0L) + 0 + (this.f24705a - 0);
                            ex0 ex0Var = this.f24707c;
                            fd.j0.f(ex0Var);
                            fg fgVarB3 = ex0Var.b();
                            long millis2 = fgVarB3.c() != -1 ? TimeUnit.SECONDS.toMillis(fgVarB3.c()) : 0L;
                            if (fgVarB.c() != -1) {
                                millis2 = Math.min(millis2, TimeUnit.SECONDS.toMillis(fgVarB.c()));
                            }
                            long millis3 = fgVarB.e() != -1 ? TimeUnit.SECONDS.toMillis(fgVarB.e()) : 0L;
                            if (!fgVarB2.f() && fgVarB.d() != -1) {
                                millis = TimeUnit.SECONDS.toMillis(fgVarB.d());
                            }
                            if (fgVarB2.g()) {
                                rgVar = new rg(this.f24706b, null);
                            } else {
                                long j10 = millis3 + jMax;
                                if (j10 < millis + millis2) {
                                    ex0.a aVarL = this.f24707c.l();
                                    if (j10 >= millis2) {
                                        aVarL.a("110 HttpURLConnection \"Response is stale\"");
                                    }
                                    if (jMax > 86400000) {
                                        ex0 ex0Var2 = this.f24707c;
                                        fd.j0.f(ex0Var2);
                                        if (ex0Var2.b().c() == -1) {
                                            aVarL.a("113 HttpURLConnection \"Heuristic expiration\"");
                                        }
                                    }
                                    rgVar = new rg(null, aVarL.a());
                                } else {
                                    rgVar = new rg(this.f24706b, null);
                                }
                            }
                        }
                    }
                } else {
                    rgVar = new rg(this.f24706b, null);
                }
            }
            return (rgVar.b() == null || !this.f24706b.b().i()) ? rgVar : new rg(null, null);
        }
    }

    public rg(nw0 nw0Var, ex0 ex0Var) {
        this.f24703a = nw0Var;
        this.f24704b = ex0Var;
    }

    public final ex0 a() {
        return this.f24704b;
    }

    public final nw0 b() {
        return this.f24703a;
    }
}
