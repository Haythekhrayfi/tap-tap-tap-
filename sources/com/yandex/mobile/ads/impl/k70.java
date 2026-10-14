package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k70 implements hc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final oq f22280b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22281a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            f22281a = iArr;
        }
    }

    public k70(oq oqVar) {
        fd.j0.i(oqVar, "defaultDns");
        this.f22280b = oqVar;
    }

    @Override // com.yandex.mobile.ads.impl.hc
    public final nw0 a(oy0 oy0Var, ex0 ex0Var) throws IOException {
        Proxy proxyB;
        InetAddress address;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        InetAddress address2;
        e7 e7VarA;
        oq oqVarC;
        fd.j0.i(ex0Var, "response");
        List<nh> listD = ex0Var.d();
        nw0 nw0VarP = ex0Var.p();
        d10 d10VarH = nw0VarP.h();
        boolean z10 = ex0Var.e() == 407;
        if (oy0Var == null || (proxyB = oy0Var.b()) == null) {
            proxyB = Proxy.NO_PROXY;
        }
        for (nh nhVar : listD) {
            if (ed.q.i("Basic", nhVar.c(), true)) {
                oq oqVar = (oy0Var == null || (e7VarA = oy0Var.a()) == null || (oqVarC = e7VarA.c()) == null) ? this.f22280b : oqVarC;
                if (z10) {
                    SocketAddress socketAddressAddress = proxyB.address();
                    fd.j0.g(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    Proxy.Type type = proxyB.type();
                    if ((type != null ? a.f22281a[type.ordinal()] : -1) == 1) {
                        address2 = (InetAddress) kc.t.r(oqVar.a(d10VarH.g()));
                    } else {
                        SocketAddress socketAddressAddress2 = proxyB.address();
                        fd.j0.g(socketAddressAddress2, "null cannot be cast to non-null type java.net.InetSocketAddress");
                        address2 = ((InetSocketAddress) socketAddressAddress2).getAddress();
                        fd.j0.h(address2, "address() as InetSocketAddress).address");
                    }
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, address2, inetSocketAddress.getPort(), d10VarH.l(), nhVar.b(), nhVar.c(), d10VarH.n(), Authenticator.RequestorType.PROXY);
                } else {
                    String strG = d10VarH.g();
                    fd.j0.h(proxyB, "proxy");
                    Proxy.Type type2 = proxyB.type();
                    if ((type2 != null ? a.f22281a[type2.ordinal()] : -1) == 1) {
                        address = (InetAddress) kc.t.r(oqVar.a(d10VarH.g()));
                    } else {
                        SocketAddress socketAddressAddress3 = proxyB.address();
                        fd.j0.g(socketAddressAddress3, "null cannot be cast to non-null type java.net.InetSocketAddress");
                        address = ((InetSocketAddress) socketAddressAddress3).getAddress();
                        fd.j0.h(address, "address() as InetSocketAddress).address");
                    }
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strG, address, d10VarH.i(), d10VarH.l(), nhVar.b(), nhVar.c(), d10VarH.n(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z10 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    fd.j0.h(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    fd.j0.h(password, "auth.password");
                    return nw0VarP.g().b(str, xl.a(userName, new String(password), nhVar.a())).a();
                }
            }
        }
        return null;
    }
}
