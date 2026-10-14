package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ry0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e7 f24885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final py0 f24886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vg f24887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final cs f24888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<? extends Proxy> f24889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f24890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<? extends InetSocketAddress> f24891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayList f24892h;

    public static final class a {
        public static String a(InetSocketAddress inetSocketAddress) {
            String hostAddress;
            String str;
            fd.j0.i(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                hostAddress = inetSocketAddress.getHostName();
                str = "hostName";
            } else {
                hostAddress = address.getHostAddress();
                str = "address.hostAddress";
            }
            fd.j0.h(hostAddress, str);
            return hostAddress;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<oy0> f24893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f24894b;

        public b(ArrayList arrayList) {
            fd.j0.i(arrayList, "routes");
            this.f24893a = arrayList;
        }

        public final List<oy0> a() {
            return this.f24893a;
        }

        public final boolean b() {
            return this.f24894b < this.f24893a.size();
        }

        public final oy0 c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List<oy0> list = this.f24893a;
            int i10 = this.f24894b;
            this.f24894b = i10 + 1;
            return list.get(i10);
        }
    }

    public ry0(e7 e7Var, py0 py0Var, wu0 wu0Var, cs csVar) {
        fd.j0.i(e7Var, "address");
        fd.j0.i(py0Var, "routeDatabase");
        fd.j0.i(wu0Var, "call");
        fd.j0.i(csVar, "eventListener");
        this.f24885a = e7Var;
        this.f24886b = py0Var;
        this.f24887c = wu0Var;
        this.f24888d = csVar;
        kc.w wVar = kc.w.f32009c;
        this.f24889e = wVar;
        this.f24891g = wVar;
        this.f24892h = new ArrayList();
        a(e7Var.k(), e7Var.f());
    }

    private final void a(d10 d10Var, Proxy proxy) {
        List<? extends Proxy> listB;
        cs csVar = this.f24888d;
        vg vgVar = this.f24887c;
        Objects.requireNonNull(csVar);
        cs.a(vgVar, d10Var);
        if (proxy != null) {
            listB = kc.k.a(proxy);
        } else {
            URI uriM = d10Var.m();
            if (uriM.getHost() == null) {
                listB = ea1.a(Proxy.NO_PROXY);
            } else {
                List<Proxy> listSelect = this.f24885a.h().select(uriM);
                if (listSelect == null || listSelect.isEmpty()) {
                    listB = ea1.a(Proxy.NO_PROXY);
                } else {
                    fd.j0.h(listSelect, "proxiesOrNull");
                    listB = ea1.b(listSelect);
                }
            }
        }
        this.f24889e = listB;
        this.f24890f = 0;
        cs csVar2 = this.f24888d;
        vg vgVar2 = this.f24887c;
        Objects.requireNonNull(csVar2);
        cs.a(vgVar2, d10Var, listB);
    }

    public final boolean a() {
        return (this.f24890f < this.f24889e.size()) || (this.f24892h.isEmpty() ^ true);
    }

    public final b b() throws IOException {
        String strG;
        int i10;
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        do {
            boolean z10 = false;
            if (!(this.f24890f < this.f24889e.size())) {
                break;
            }
            if (!(this.f24890f < this.f24889e.size())) {
                StringBuilder sbA = v60.a("No route to ");
                sbA.append(this.f24885a.k().g());
                sbA.append("; exhausted proxy configurations: ");
                sbA.append(this.f24889e);
                throw new SocketException(sbA.toString());
            }
            List<? extends Proxy> list = this.f24889e;
            int i11 = this.f24890f;
            this.f24890f = i11 + 1;
            Proxy proxy = list.get(i11);
            ArrayList arrayList2 = new ArrayList();
            this.f24891g = arrayList2;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                strG = this.f24885a.k().g();
                i10 = this.f24885a.k().i();
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    StringBuilder sbA2 = v60.a("Proxy.address() is not an InetSocketAddress: ");
                    sbA2.append(socketAddressAddress.getClass());
                    throw new IllegalArgumentException(sbA2.toString().toString());
                }
                fd.j0.h(socketAddressAddress, "proxyAddress");
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                strG = a.a(inetSocketAddress);
                i10 = inetSocketAddress.getPort();
            }
            if (1 <= i10 && i10 < 65536) {
                z10 = true;
            }
            if (!z10) {
                throw new SocketException("No route to " + strG + CoreConstants.COLON_CHAR + i10 + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList2.add(InetSocketAddress.createUnresolved(strG, i10));
            } else {
                cs csVar = this.f24888d;
                vg vgVar = this.f24887c;
                Objects.requireNonNull(csVar);
                cs.a(vgVar, strG);
                List<InetAddress> listA = this.f24885a.c().a(strG);
                if (listA.isEmpty()) {
                    throw new UnknownHostException(this.f24885a.c() + " returned no addresses for " + strG);
                }
                cs csVar2 = this.f24888d;
                vg vgVar2 = this.f24887c;
                Objects.requireNonNull(csVar2);
                cs.a(vgVar2, strG, listA);
                Iterator<InetAddress> it = listA.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new InetSocketAddress(it.next(), i10));
                }
            }
            Iterator<? extends InetSocketAddress> it2 = this.f24891g.iterator();
            while (it2.hasNext()) {
                oy0 oy0Var = new oy0(this.f24885a, proxy, it2.next());
                if (this.f24886b.c(oy0Var)) {
                    this.f24892h.add(oy0Var);
                } else {
                    arrayList.add(oy0Var);
                }
            }
        } while (!(!arrayList.isEmpty()));
        if (arrayList.isEmpty()) {
            kc.q.l(arrayList, this.f24892h);
            this.f24892h.clear();
        }
        return new b(arrayList);
    }
}
