package com.yandex.mobile.ads.impl;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zn1 implements Comparator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ zn1 f27376d = new zn1(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ zn1 f27377e = new zn1(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ zn1 f27378f = new zn1(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ zn1 f27379g = new zn1(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ zn1 f27380h = new zn1(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ zn1 f27381i = new zn1(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ zn1 f27382j = new zn1(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ zn1 f27383k = new zn1(7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27384c;

    public /* synthetic */ zn1(int i10) {
        this.f27384c = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f27384c) {
            case 0:
                return fj1.a.a((fj1.a) obj, (fj1.a) obj2);
            case 1:
                return p21.a((p21.a) obj, (p21.a) obj2);
            case 2:
                return po.f.a((List) obj, (List) obj2);
            case 3:
                return po.h.a((po.h) obj, (po.h) obj2);
            case 4:
                return po.h.a((po.h) obj, (po.h) obj2);
            case 5:
                return po.h.b((po.h) obj, (po.h) obj2);
            case 6:
                return h80.a((qg) obj, (qg) obj2);
            default:
                return po.a((Integer) obj, (Integer) obj2);
        }
    }
}
