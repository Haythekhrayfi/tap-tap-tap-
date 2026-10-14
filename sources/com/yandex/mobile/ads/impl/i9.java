package com.yandex.mobile.ads.impl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public class i9 implements r31 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h9 f21636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f21637g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<? super SSLSocket> f21638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f21639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f21640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f21641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Method f21642e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i10) {
            this();
        }

        public static h9 a() {
            return new h9();
        }

        public static final i9 a(Class cls) {
            int i10 = i9.f21637g;
            Class superclass = cls;
            while (!fd.j0.d(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            return new i9(superclass);
        }

        public static h9 b() {
            return i9.f21636f;
        }
    }

    static {
        new a(0);
        f21636f = a.a();
    }

    public i9(Class<? super SSLSocket> cls) throws NoSuchMethodException {
        fd.j0.i(cls, "sslSocketClass");
        this.f21638a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        fd.j0.h(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f21639b = declaredMethod;
        this.f21640c = cls.getMethod("setHostname", String.class);
        this.f21641d = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f21642e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // com.yandex.mobile.ads.impl.r31
    public final void a(SSLSocket sSLSocket, String str, List<? extends nt0> list) {
        fd.j0.i(sSLSocket, "sslSocket");
        fd.j0.i(list, "protocols");
        if (this.f21638a.isInstance(sSLSocket)) {
            try {
                this.f21639b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f21640c.invoke(sSLSocket, str);
                }
                Method method = this.f21642e;
                int i10 = qq0.f24561c;
                method.invoke(sSLSocket, qq0.a.b(list));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.r31
    public final boolean a() {
        int i10 = g9.f20978g;
        return g9.f20977f;
    }

    @Override // com.yandex.mobile.ads.impl.r31
    public final boolean a(SSLSocket sSLSocket) {
        fd.j0.i(sSLSocket, "sslSocket");
        return this.f21638a.isInstance(sSLSocket);
    }

    @Override // com.yandex.mobile.ads.impl.r31
    public final String b(SSLSocket sSLSocket) {
        fd.j0.i(sSLSocket, "sslSocket");
        if (!this.f21638a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f21641d.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            fd.j0.h(charset, "UTF_8");
            return new String(bArr, charset);
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (NullPointerException e11) {
            if (fd.j0.d(e11.getMessage(), "ssl == null")) {
                return null;
            }
            throw e11;
        } catch (InvocationTargetException e12) {
            throw new AssertionError(e12);
        }
    }
}
