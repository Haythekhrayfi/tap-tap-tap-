package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class e7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oq f20087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SocketFactory f20088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SSLSocketFactory f20089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HostnameVerifier f20090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final mh f20091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final hc f20092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Proxy f20093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ProxySelector f20094h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d10 f20095i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<nt0> f20096j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<nk> f20097k;

    public e7(String str, int i10, oq oqVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, xn0 xn0Var, mh mhVar, hc hcVar, List list, List list2, ProxySelector proxySelector) {
        fd.j0.i(str, "uriHost");
        fd.j0.i(oqVar, AppLovinSdkExtraParameterKey.DO_NOT_SELL);
        fd.j0.i(socketFactory, "socketFactory");
        fd.j0.i(hcVar, "proxyAuthenticator");
        fd.j0.i(list, "protocols");
        fd.j0.i(list2, "connectionSpecs");
        fd.j0.i(proxySelector, "proxySelector");
        this.f20087a = oqVar;
        this.f20088b = socketFactory;
        this.f20089c = sSLSocketFactory;
        this.f20090d = xn0Var;
        this.f20091e = mhVar;
        this.f20092f = hcVar;
        this.f20093g = null;
        this.f20094h = proxySelector;
        this.f20095i = new d10.a().c(sSLSocketFactory != null ? "https" : "http").b(str).a(i10).a();
        this.f20096j = ea1.b(list);
        this.f20097k = ea1.b(list2);
    }

    public final mh a() {
        return this.f20091e;
    }

    public final boolean a(e7 e7Var) {
        fd.j0.i(e7Var, "that");
        return fd.j0.d(this.f20087a, e7Var.f20087a) && fd.j0.d(this.f20092f, e7Var.f20092f) && fd.j0.d(this.f20096j, e7Var.f20096j) && fd.j0.d(this.f20097k, e7Var.f20097k) && fd.j0.d(this.f20094h, e7Var.f20094h) && fd.j0.d(this.f20093g, e7Var.f20093g) && fd.j0.d(this.f20089c, e7Var.f20089c) && fd.j0.d(this.f20090d, e7Var.f20090d) && fd.j0.d(this.f20091e, e7Var.f20091e) && this.f20095i.i() == e7Var.f20095i.i();
    }

    public final List<nk> b() {
        return this.f20097k;
    }

    public final oq c() {
        return this.f20087a;
    }

    public final HostnameVerifier d() {
        return this.f20090d;
    }

    public final List<nt0> e() {
        return this.f20096j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e7) {
            e7 e7Var = (e7) obj;
            if (fd.j0.d(this.f20095i, e7Var.f20095i) && a(e7Var)) {
                return true;
            }
        }
        return false;
    }

    public final Proxy f() {
        return this.f20093g;
    }

    public final hc g() {
        return this.f20092f;
    }

    public final ProxySelector h() {
        return this.f20094h;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f20091e) + ((Objects.hashCode(this.f20090d) + ((Objects.hashCode(this.f20089c) + ((Objects.hashCode(this.f20093g) + ((this.f20094h.hashCode() + ((this.f20097k.hashCode() + ((this.f20096j.hashCode() + ((this.f20092f.hashCode() + ((this.f20087a.hashCode() + ((this.f20095i.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final SocketFactory i() {
        return this.f20088b;
    }

    public final SSLSocketFactory j() {
        return this.f20089c;
    }

    public final d10 k() {
        return this.f20095i;
    }

    public final String toString() {
        StringBuilder sbA;
        Object obj;
        StringBuilder sbA2 = v60.a("Address{");
        sbA2.append(this.f20095i.g());
        sbA2.append(CoreConstants.COLON_CHAR);
        sbA2.append(this.f20095i.i());
        sbA2.append(", ");
        if (this.f20093g != null) {
            sbA = v60.a("proxy=");
            obj = this.f20093g;
        } else {
            sbA = v60.a("proxySelector=");
            obj = this.f20094h;
        }
        sbA.append(obj);
        sbA2.append(sbA.toString());
        sbA2.append('}');
        return sbA2.toString();
    }
}
