package com.yandex.mobile.ads.impl;

import com.applovin.sdk.AppLovinMediationProvider;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class m70 extends qq0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f22926i = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f22927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Method f22928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Method f22929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class<?> f22930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Class<?> f22931h;

    public static final class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f22932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f22933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f22934c;

        public a(ArrayList arrayList) {
            fd.j0.i(arrayList, "protocols");
            this.f22932a = arrayList;
        }

        public final String a() {
            return this.f22934c;
        }

        public final boolean b() {
            return this.f22933b;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            fd.j0.i(obj, "proxy");
            fd.j0.i(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (fd.j0.d(name, "supports") && fd.j0.d(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (fd.j0.d(name, "unsupported") && fd.j0.d(Void.TYPE, returnType)) {
                this.f22933b = true;
                return null;
            }
            if (fd.j0.d(name, "protocols")) {
                if (objArr.length == 0) {
                    return this.f22932a;
                }
            }
            if ((fd.j0.d(name, "selectProtocol") || fd.j0.d(name, "select")) && fd.j0.d(String.class, returnType) && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    fd.j0.g(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj2;
                    int size = list.size();
                    if (size >= 0) {
                        int i10 = 0;
                        while (true) {
                            Object obj3 = list.get(i10);
                            fd.j0.g(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            if (this.f22932a.contains(str)) {
                                this.f22934c = str;
                                return str;
                            }
                            if (i10 != size) {
                                i10++;
                            }
                        }
                    }
                    String str2 = this.f22932a.get(0);
                    this.f22934c = str2;
                    return str2;
                }
            }
            if ((!fd.j0.d(name, "protocolSelected") && !fd.j0.d(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj4 = objArr[0];
            fd.j0.g(obj4, "null cannot be cast to non-null type kotlin.String");
            this.f22934c = (String) obj4;
            return null;
        }
    }

    public static final class b {
        public static m70 a() {
            String property = System.getProperty("java.specification.version", AppLovinMediationProvider.UNKNOWN);
            try {
                fd.j0.h(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method method = cls.getMethod("put", SSLSocket.class, cls2);
                Method method2 = cls.getMethod("get", SSLSocket.class);
                Method method3 = cls.getMethod("remove", SSLSocket.class);
                fd.j0.h(method, "putMethod");
                fd.j0.h(method2, "getMethod");
                fd.j0.h(method3, "removeMethod");
                fd.j0.h(cls3, "clientProviderClass");
                fd.j0.h(cls4, "serverProviderClass");
                return new m70(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public m70(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        fd.j0.i(method, "putMethod");
        fd.j0.i(method2, "getMethod");
        fd.j0.i(method3, "removeMethod");
        fd.j0.i(cls, "clientProviderClass");
        fd.j0.i(cls2, "serverProviderClass");
        this.f22927d = method;
        this.f22928e = method2;
        this.f22929f = method3;
        this.f22930g = cls;
        this.f22931h = cls2;
    }

    @Override // com.yandex.mobile.ads.impl.qq0
    public final void a(SSLSocket sSLSocket) {
        fd.j0.i(sSLSocket, "sslSocket");
        try {
            this.f22929f.invoke(null, sSLSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qq0
    public final void a(SSLSocket sSLSocket, String str, List<? extends nt0> list) {
        fd.j0.i(sSLSocket, "sslSocket");
        fd.j0.i(list, "protocols");
        try {
            this.f22927d.invoke(null, sSLSocket, Proxy.newProxyInstance(qq0.class.getClassLoader(), new Class[]{this.f22930g, this.f22931h}, new a(qq0.a.a(list))));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qq0
    public final String b(SSLSocket sSLSocket) {
        fd.j0.i(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f22928e.invoke(null, sSLSocket));
            fd.j0.g(invocationHandler, "null cannot be cast to non-null type com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            a aVar = (a) invocationHandler;
            if (!aVar.b() && aVar.a() == null) {
                qq0.a(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, 6);
                return null;
            }
            if (aVar.b()) {
                return null;
            }
            return aVar.a();
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
