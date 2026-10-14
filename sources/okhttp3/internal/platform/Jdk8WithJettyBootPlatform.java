package okhttp3.internal.platform;

import com.applovin.sdk.AppLovinMediationProvider;
import fd.j0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class Jdk8WithJettyBootPlatform extends Platform {
    public static final Companion Companion = new Companion(null);
    private final Class<?> clientProviderClass;
    private final Method getMethod;
    private final Method putMethod;
    private final Method removeMethod;
    private final Class<?> serverProviderClass;

    public static final class AlpnProvider implements InvocationHandler {
        private final List<String> protocols;
        private String selected;
        private boolean unsupported;

        public AlpnProvider(List<String> list) {
            j0.i(list, "protocols");
            this.protocols = list;
        }

        public final String getSelected() {
            return this.selected;
        }

        public final boolean getUnsupported() {
            return this.unsupported;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            j0.i(obj, "proxy");
            j0.i(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (j0.d(name, "supports") && j0.d(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (j0.d(name, "unsupported") && j0.d(Void.TYPE, returnType)) {
                this.unsupported = true;
                return null;
            }
            if (j0.d(name, "protocols")) {
                if (objArr.length == 0) {
                    return this.protocols;
                }
            }
            if ((!j0.d(name, "selectProtocol") && !j0.d(name, "select")) || !j0.d(String.class, returnType) || objArr.length != 1 || !(objArr[0] instanceof List)) {
                if ((!j0.d(name, "protocolSelected") && !j0.d(name, "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                }
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
                this.selected = (String) obj2;
                return null;
            }
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj3;
            int size = list.size();
            if (size >= 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    Object obj4 = list.get(i10);
                    Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) obj4;
                    if (this.protocols.contains(str)) {
                        this.selected = str;
                        return str;
                    }
                    if (i10 != size) {
                        i10 = i11;
                    }
                }
            }
            String str2 = this.protocols.get(0);
            this.selected = str2;
            return str2;
        }

        public final void setSelected(String str) {
            this.selected = str;
        }

        public final void setUnsupported(boolean z10) {
            this.unsupported = z10;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final Platform buildIfSupported() {
            String property = System.getProperty("java.specification.version", AppLovinMediationProvider.UNKNOWN);
            try {
                j0.h(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName(j0.p("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                Class<?> cls3 = Class.forName(j0.p("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                Class<?> cls4 = Class.forName(j0.p("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                Method method = cls.getMethod("put", SSLSocket.class, cls2);
                Method method2 = cls.getMethod("get", SSLSocket.class);
                Method method3 = cls.getMethod("remove", SSLSocket.class);
                j0.h(method, "putMethod");
                j0.h(method2, "getMethod");
                j0.h(method3, "removeMethod");
                j0.h(cls3, "clientProviderClass");
                j0.h(cls4, "serverProviderClass");
                return new Jdk8WithJettyBootPlatform(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public Jdk8WithJettyBootPlatform(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        j0.i(method, "putMethod");
        j0.i(method2, "getMethod");
        j0.i(method3, "removeMethod");
        j0.i(cls, "clientProviderClass");
        j0.i(cls2, "serverProviderClass");
        this.putMethod = method;
        this.getMethod = method2;
        this.removeMethod = method3;
        this.clientProviderClass = cls;
        this.serverProviderClass = cls2;
    }

    @Override // okhttp3.internal.platform.Platform
    public void afterHandshake(SSLSocket sSLSocket) {
        j0.i(sSLSocket, "sslSocket");
        try {
            this.removeMethod.invoke(null, sSLSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        j0.i(sSLSocket, "sslSocket");
        j0.i(list, "protocols");
        try {
            this.putMethod.invoke(null, sSLSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.clientProviderClass, this.serverProviderClass}, new AlpnProvider(Platform.Companion.alpnProtocolNames(list))));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        j0.i(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.getMethod.invoke(null, sSLSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            AlpnProvider alpnProvider = (AlpnProvider) invocationHandler;
            if (!alpnProvider.getUnsupported() && alpnProvider.getSelected() == null) {
                Platform.log$default(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (alpnProvider.getUnsupported()) {
                return null;
            }
            return alpnProvider.getSelected();
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
