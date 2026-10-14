package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class tb1 implements fg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sc1<?> f25311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v1 f25312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final cg1 f25313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private w5 f25314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ub0 f25315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private n2 f25316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f25317h;

    public tb1(Context context, sc1<?> sc1Var, v1 v1Var, cg1 cg1Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(sc1Var, "videoAdInfo");
        fd.j0.i(v1Var, "adBreakPosition");
        fd.j0.i(cg1Var, "eventsTracker");
        this.f25310a = context;
        this.f25311b = sc1Var;
        this.f25312c = v1Var;
        this.f25313d = cg1Var;
    }

    public static final void a(tb1 tb1Var, nb1 nb1Var) {
        Objects.requireNonNull(tb1Var);
        Map<String, String> mapB = kc.e0.b(new jc.h("[REASON]", String.valueOf(mb1.a(nb1Var.a()))));
        cg1 cg1Var = tb1Var.f25313d;
        lb1 lb1VarB = nb1Var.b();
        fd.j0.h(lb1VarB, "exception.verification");
        cg1Var.a(lb1VarB, "verificationNotExecuted", mapB);
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(float f10) {
        ub0 ub0Var = this.f25315f;
        if (ub0Var != null) {
            try {
                if (this.f25317h) {
                    return;
                }
                ub0Var.b(f10);
            } catch (Exception e10) {
                x60.a(e10, e10.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(long j10) {
        ub0 ub0Var = this.f25315f;
        if (ub0Var != null) {
            try {
                if (this.f25317h) {
                    return;
                }
                ub0Var.a(j10 / 1000);
            } catch (Exception e10) {
                x60.a(e10, e10.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(View view, List<qc1> list) {
        fd.j0.i(view, "view");
        fd.j0.i(list, "friendlyOverlays");
        k();
        this.f25317h = false;
        sc1<?> sc1Var = this.f25311b;
        try {
            Context context = this.f25310a;
            ArrayList arrayListD = sc1Var.e().d();
            fd.j0.h(arrayListD, "videoAdInfo.vastVideoAd.adVerifications");
            qo0 qo0VarA = new ro0(context, new sb1(this)).a(arrayListD);
            if (qo0VarA != null) {
                w5 w5VarB = qo0VarA.b();
                w5VarB.a(view);
                this.f25314e = w5VarB;
                this.f25315f = qo0VarA.c();
                this.f25316g = qo0VarA.a();
            }
        } catch (Exception e10) {
            x60.a(e10, e10.getMessage(), new Object[0]);
        }
        w5 w5Var = this.f25314e;
        if (w5Var != null) {
            for (qc1 qc1Var : list) {
                View viewC = qc1Var.c();
                if (viewC != null) {
                    try {
                        w5Var.a(viewC, fo0.a(qc1Var.b()), qc1Var.a());
                    } catch (Exception e11) {
                        x60.a(e11, e11.getMessage(), new Object[0]);
                    }
                }
            }
        }
        w5 w5Var2 = this.f25314e;
        if (w5Var2 != null) {
            try {
                if (!this.f25317h) {
                    w5Var2.b();
                }
            } catch (Exception e12) {
                x60.a(e12, e12.getMessage(), new Object[0]);
            }
        }
        sc1<?> sc1Var2 = this.f25311b;
        n2 n2Var = this.f25316g;
        if (n2Var != null) {
            try {
                if (this.f25317h) {
                    return;
                }
                za1 za1VarA = to0.a(sc1Var2.a(), this.f25312c);
                fd.j0.h(za1VarA, "create(videoAdInfo.creative, adBreakPosition)");
                n2Var.a(za1VarA);
            } catch (Exception e13) {
                x60.a(e13, e13.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(eg1.a aVar) {
        fd.j0.i(aVar, "quartile");
        ub0 ub0Var = this.f25315f;
        if (ub0Var != null) {
            try {
                if (!this.f25317h) {
                    int iOrdinal = aVar.ordinal();
                    if (iOrdinal == 0) {
                        ub0Var.e();
                    } else if (iOrdinal == 1) {
                        ub0Var.f();
                    } else if (iOrdinal == 2) {
                        ub0Var.j();
                    }
                }
            } catch (Exception e10) {
                x60.a(e10, e10.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(pd1 pd1Var) {
        fg1.a.a(pd1Var);
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(String str) {
        fd.j0.i(str, "assetName");
        m();
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void b() {
        ub0 ub0Var = this.f25315f;
        if (ub0Var != null) {
            try {
                if (this.f25317h) {
                    return;
                }
                ub0Var.d();
            } catch (Exception e10) {
                x60.a(e10, e10.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void c() {
        ub0 ub0Var = this.f25315f;
        if (ub0Var != null) {
            try {
                if (this.f25317h) {
                    return;
                }
                ub0Var.h();
            } catch (Exception e10) {
                x60.a(e10, e10.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void d() {
        ub0 ub0Var = this.f25315f;
        if (ub0Var != null) {
            try {
                if (this.f25317h) {
                    return;
                }
                ub0Var.g();
            } catch (Exception e10) {
                x60.a(e10, e10.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void e() {
        ub0 ub0Var = this.f25315f;
        if (ub0Var != null) {
            try {
                if (this.f25317h) {
                    return;
                }
                ub0Var.i();
            } catch (Exception e10) {
                x60.a(e10, e10.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void f() {
        ub0 ub0Var = this.f25315f;
        if (ub0Var != null) {
            try {
                if (this.f25317h) {
                    return;
                }
                ub0Var.c();
            } catch (Exception e10) {
                x60.a(e10, e10.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void g() {
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void h() {
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void i() {
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void j() {
        ub0 ub0Var = this.f25315f;
        if (ub0Var != null) {
            try {
                if (this.f25317h) {
                    return;
                }
                ub0Var.b();
            } catch (Exception e10) {
                x60.a(e10, e10.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void k() {
        w5 w5Var = this.f25314e;
        if (w5Var != null) {
            try {
                if (this.f25317h) {
                    return;
                }
                w5Var.a();
                this.f25314e = null;
                this.f25315f = null;
                this.f25316g = null;
                this.f25317h = true;
            } catch (Exception e10) {
                x60.a(e10, e10.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void l() {
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void m() {
        ub0 ub0Var = this.f25315f;
        if (ub0Var != null) {
            try {
                if (this.f25317h) {
                    return;
                }
                ub0Var.a();
            } catch (Exception e10) {
                x60.a(e10, e10.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void n() {
        n2 n2Var = this.f25316g;
        if (n2Var != null) {
            try {
                if (this.f25317h) {
                    return;
                }
                n2Var.a();
            } catch (Exception e10) {
                x60.a(e10, e10.getMessage(), new Object[0]);
            }
        }
    }
}
