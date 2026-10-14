package com.yandex.mobile.ads.impl;

import android.view.Display;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ho1 implements bn.a, nb0.f, r80.a, vx, cs.b, ft0.a, ze.d, bg1, yp0, ye1.b.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21481c = 7;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f21482d;

    public /* synthetic */ ho1(Metadata metadata) {
        this.f21482d = metadata;
    }

    public /* synthetic */ ho1(ac1 ac1Var) {
        this.f21482d = ac1Var;
    }

    public /* synthetic */ ho1(cm cmVar) {
        this.f21482d = cmVar;
    }

    public /* synthetic */ ho1(cs csVar) {
        this.f21482d = csVar;
    }

    public /* synthetic */ ho1(cw cwVar) {
        this.f21482d = cwVar;
    }

    public /* synthetic */ ho1(dp dpVar) {
        this.f21482d = dpVar;
    }

    public /* synthetic */ ho1(ec0 ec0Var) {
        this.f21482d = ec0Var;
    }

    public /* synthetic */ ho1(ih ihVar) {
        this.f21482d = ihVar;
    }

    public /* synthetic */ ho1(rs.b bVar) {
        this.f21482d = bVar;
    }

    public /* synthetic */ ho1(wf1 wf1Var) {
        this.f21482d = wf1Var;
    }

    public /* synthetic */ ho1(yd1 yd1Var) {
        this.f21482d = yd1Var;
    }

    public /* synthetic */ ho1(ye1 ye1Var) {
        this.f21482d = ye1Var;
    }

    public /* synthetic */ ho1(yt ytVar) {
        this.f21482d = ytVar;
    }

    public /* synthetic */ ho1(yv yvVar) {
        this.f21482d = yvVar;
    }

    public /* synthetic */ ho1(List list) {
        this.f21482d = list;
    }

    @Override // com.yandex.mobile.ads.impl.nb0.f
    public int a(Object obj) {
        return nb0.a((yv) this.f21482d, (ib0) obj);
    }

    @Override // com.yandex.mobile.ads.impl.ze.d
    public long a(long j10) {
        return ((pv) this.f21482d).a(j10);
    }

    @Override // com.yandex.mobile.ads.impl.cs.b
    public cs a(vg vgVar) {
        return ea1.a((cs) this.f21482d, vgVar);
    }

    @Override // com.yandex.mobile.ads.impl.ft0.a
    public ft0 a(gr0 gr0Var) {
        return it0.a.a((yt) this.f21482d, gr0Var);
    }

    @Override // com.yandex.mobile.ads.impl.bg1
    public Map a() {
        return pc1.b((ac1) this.f21482d);
    }

    @Override // com.yandex.mobile.ads.impl.yp0
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void mo3a() {
        yd1.b((yd1) this.f21482d);
    }

    @Override // com.yandex.mobile.ads.impl.ye1.b.a
    public void a(Display display) {
        ((ye1) this.f21482d).a(display);
    }

    @Override // com.yandex.mobile.ads.impl.bn.a
    public void a(bn bnVar) {
        ((ih) this.f21482d).a((ih.b) bnVar);
    }

    @Override // com.yandex.mobile.ads.impl.vx
    public Object apply(Object obj) {
        return ((cw) this.f21482d).a((e71) obj);
    }

    @Override // com.yandex.mobile.ads.impl.r80.a
    public void invoke(Object obj) {
        switch (this.f21481c) {
            case 2:
                ((dr0.b) obj).a((ec0) this.f21482d);
                break;
            case 3:
                ((dr0.b) obj).onCues((List) this.f21482d);
                break;
            case 4:
                ((dr0.b) obj).a((cm) this.f21482d);
                break;
            case 5:
                ((dr0.b) obj).a((dp) this.f21482d);
                break;
            case 6:
                ((rs.b) this.f21482d).a((dr0.b) obj);
                break;
            case 7:
                ((dr0.b) obj).a((Metadata) this.f21482d);
                break;
            default:
                ((dr0.b) obj).a((wf1) this.f21482d);
                break;
        }
    }
}
