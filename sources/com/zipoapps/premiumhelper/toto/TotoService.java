package com.zipoapps.premiumhelper.toto;

import ch.qos.logback.core.CoreConstants;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.gson.Gson;
import defpackage.a;
import fd.j0;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.net.URLEncoder;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import jc.h;
import kc.e0;
import kc.f0;
import l1.e;
import mc.d;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import r6.b;
import ue.a0;
import ue.b0;
import ue.q;
import ue.z;
import vc.g;
import we.f;
import we.i;
import we.k;
import we.o;
import we.s;
import we.u;

/* JADX INFO: loaded from: classes3.dex */
public final class TotoService {
    public static final TotoService INSTANCE = new TotoService();

    public static final class PostConfigParameters {
        private final String country;
        private final String deviceModel;
        private final long installTimestamp;
        private final String lang;
        private final String os;
        private final String osVersion;
        private final String userId;
        private final String versionName;

        public PostConfigParameters(long j10, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            j0.i(str, "versionName");
            j0.i(str2, "userId");
            j0.i(str3, "country");
            j0.i(str4, "deviceModel");
            j0.i(str5, "os");
            j0.i(str6, "osVersion");
            j0.i(str7, "lang");
            this.installTimestamp = j10;
            this.versionName = str;
            this.userId = str2;
            this.country = str3;
            this.deviceModel = str4;
            this.os = str5;
            this.osVersion = str6;
            this.lang = str7;
        }

        public /* synthetic */ PostConfigParameters(long j10, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, g gVar) {
            this(j10, str, str2, (i10 & 8) != 0 ? "" : str3, (i10 & 16) != 0 ? "" : str4, (i10 & 32) != 0 ? "Android" : str5, (i10 & 64) != 0 ? "" : str6, (i10 & 128) != 0 ? "" : str7);
        }

        public final Map<String, String> asMap() {
            Map mapE = f0.e(new h("installTimestamp", String.valueOf(this.installTimestamp)), new h("version", this.versionName), new h("userId", this.userId), new h("country", this.country), new h("deviceModel", this.deviceModel), new h("os", this.os), new h("osVersion", this.osVersion), new h("lang", this.lang));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapE.entrySet()) {
                if (((String) entry.getValue()).length() > 0) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(e0.a(linkedHashMap.size()));
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry2.getKey(), URLEncoder.encode((String) entry2.getValue(), "UTF-8"));
            }
            return linkedHashMap2;
        }

        public final long component1() {
            return this.installTimestamp;
        }

        public final String component2() {
            return this.versionName;
        }

        public final String component3() {
            return this.userId;
        }

        public final String component4() {
            return this.country;
        }

        public final String component5() {
            return this.deviceModel;
        }

        public final String component6() {
            return this.os;
        }

        public final String component7() {
            return this.osVersion;
        }

        public final String component8() {
            return this.lang;
        }

        public final PostConfigParameters copy(long j10, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            j0.i(str, "versionName");
            j0.i(str2, "userId");
            j0.i(str3, "country");
            j0.i(str4, "deviceModel");
            j0.i(str5, "os");
            j0.i(str6, "osVersion");
            j0.i(str7, "lang");
            return new PostConfigParameters(j10, str, str2, str3, str4, str5, str6, str7);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PostConfigParameters)) {
                return false;
            }
            PostConfigParameters postConfigParameters = (PostConfigParameters) obj;
            return this.installTimestamp == postConfigParameters.installTimestamp && j0.d(this.versionName, postConfigParameters.versionName) && j0.d(this.userId, postConfigParameters.userId) && j0.d(this.country, postConfigParameters.country) && j0.d(this.deviceModel, postConfigParameters.deviceModel) && j0.d(this.os, postConfigParameters.os) && j0.d(this.osVersion, postConfigParameters.osVersion) && j0.d(this.lang, postConfigParameters.lang);
        }

        public final String getCountry() {
            return this.country;
        }

        public final String getDeviceModel() {
            return this.deviceModel;
        }

        public final long getInstallTimestamp() {
            return this.installTimestamp;
        }

        public final String getLang() {
            return this.lang;
        }

        public final String getOs() {
            return this.os;
        }

        public final String getOsVersion() {
            return this.osVersion;
        }

        public final String getUserId() {
            return this.userId;
        }

        public final String getVersionName() {
            return this.versionName;
        }

        public int hashCode() {
            return this.lang.hashCode() + e.a(this.osVersion, e.a(this.os, e.a(this.deviceModel, e.a(this.country, e.a(this.userId, e.a(this.versionName, Long.hashCode(this.installTimestamp) * 31, 31), 31), 31), 31), 31), 31);
        }

        public String toString() {
            StringBuilder sbA = a.a("PostConfigParameters(installTimestamp=");
            sbA.append(this.installTimestamp);
            sbA.append(", versionName=");
            sbA.append(this.versionName);
            sbA.append(", userId=");
            sbA.append(this.userId);
            sbA.append(", country=");
            sbA.append(this.country);
            sbA.append(", deviceModel=");
            sbA.append(this.deviceModel);
            sbA.append(", os=");
            sbA.append(this.os);
            sbA.append(", osVersion=");
            sbA.append(this.osVersion);
            sbA.append(", lang=");
            return s.a.a(sbA, this.lang, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public static final class RegisterRequest {
        private final String fcmToken;
        private final long installTimestamp;
        private final String obfuscatedUserID;
        private final String packageName;
        private final String purchaseToken;
        private final String sku;
        private final String version;

        public RegisterRequest(String str, String str2, long j10, String str3, String str4, String str5, String str6) {
            j0.i(str, "packageName");
            j0.i(str2, "version");
            j0.i(str3, "obfuscatedUserID");
            j0.i(str4, AppLovinEventParameters.PRODUCT_IDENTIFIER);
            j0.i(str5, "purchaseToken");
            j0.i(str6, "fcmToken");
            this.packageName = str;
            this.version = str2;
            this.installTimestamp = j10;
            this.obfuscatedUserID = str3;
            this.sku = str4;
            this.purchaseToken = str5;
            this.fcmToken = str6;
        }

        public final String component1() {
            return this.packageName;
        }

        public final String component2() {
            return this.version;
        }

        public final long component3() {
            return this.installTimestamp;
        }

        public final String component4() {
            return this.obfuscatedUserID;
        }

        public final String component5() {
            return this.sku;
        }

        public final String component6() {
            return this.purchaseToken;
        }

        public final String component7() {
            return this.fcmToken;
        }

        public final RegisterRequest copy(String str, String str2, long j10, String str3, String str4, String str5, String str6) {
            j0.i(str, "packageName");
            j0.i(str2, "version");
            j0.i(str3, "obfuscatedUserID");
            j0.i(str4, AppLovinEventParameters.PRODUCT_IDENTIFIER);
            j0.i(str5, "purchaseToken");
            j0.i(str6, "fcmToken");
            return new RegisterRequest(str, str2, j10, str3, str4, str5, str6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegisterRequest)) {
                return false;
            }
            RegisterRequest registerRequest = (RegisterRequest) obj;
            return j0.d(this.packageName, registerRequest.packageName) && j0.d(this.version, registerRequest.version) && this.installTimestamp == registerRequest.installTimestamp && j0.d(this.obfuscatedUserID, registerRequest.obfuscatedUserID) && j0.d(this.sku, registerRequest.sku) && j0.d(this.purchaseToken, registerRequest.purchaseToken) && j0.d(this.fcmToken, registerRequest.fcmToken);
        }

        public final String getFcmToken() {
            return this.fcmToken;
        }

        public final long getInstallTimestamp() {
            return this.installTimestamp;
        }

        public final String getObfuscatedUserID() {
            return this.obfuscatedUserID;
        }

        public final String getPackageName() {
            return this.packageName;
        }

        public final String getPurchaseToken() {
            return this.purchaseToken;
        }

        public final String getSku() {
            return this.sku;
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.fcmToken.hashCode() + e.a(this.purchaseToken, e.a(this.sku, e.a(this.obfuscatedUserID, b.a(this.installTimestamp, e.a(this.version, this.packageName.hashCode() * 31, 31), 31), 31), 31), 31);
        }

        public String toString() {
            StringBuilder sbA = a.a("RegisterRequest(packageName=");
            sbA.append(this.packageName);
            sbA.append(", version=");
            sbA.append(this.version);
            sbA.append(", installTimestamp=");
            sbA.append(this.installTimestamp);
            sbA.append(", obfuscatedUserID=");
            sbA.append(this.obfuscatedUserID);
            sbA.append(", sku=");
            sbA.append(this.sku);
            sbA.append(", purchaseToken=");
            sbA.append(this.purchaseToken);
            sbA.append(", fcmToken=");
            return s.a.a(sbA, this.fcmToken, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public static final class ServiceConfig {
        public static final Companion Companion = new Companion(null);
        private static final ServiceConfig Production = new ServiceConfig("https://config.toto.zipoapps.com/", "");
        private static final ServiceConfig Staging = new ServiceConfig("https://staging.config.toto.zipoapps.com/", "");
        private final String endpoint;
        private final String secret;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final ServiceConfig getProduction() {
                return ServiceConfig.Production;
            }

            public final ServiceConfig getStaging() {
                return ServiceConfig.Staging;
            }
        }

        public ServiceConfig(String str, String str2) {
            j0.i(str, "endpoint");
            j0.i(str2, "secret");
            this.endpoint = str;
            this.secret = str2;
        }

        public static /* synthetic */ ServiceConfig copy$default(ServiceConfig serviceConfig, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = serviceConfig.endpoint;
            }
            if ((i10 & 2) != 0) {
                str2 = serviceConfig.secret;
            }
            return serviceConfig.copy(str, str2);
        }

        public final String component1() {
            return this.endpoint;
        }

        public final String component2() {
            return this.secret;
        }

        public final ServiceConfig copy(String str, String str2) {
            j0.i(str, "endpoint");
            j0.i(str2, "secret");
            return new ServiceConfig(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServiceConfig)) {
                return false;
            }
            ServiceConfig serviceConfig = (ServiceConfig) obj;
            return j0.d(this.endpoint, serviceConfig.endpoint) && j0.d(this.secret, serviceConfig.secret);
        }

        public final String getEndpoint() {
            return this.endpoint;
        }

        public final String getSecret() {
            return this.secret;
        }

        public int hashCode() {
            return this.secret.hashCode() + (this.endpoint.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sbA = a.a("ServiceConfig(endpoint=");
            sbA.append(this.endpoint);
            sbA.append(", secret=");
            return s.a.a(sbA, this.secret, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public interface TotoServiceApi {
        @f("/v1/apps/{package}/config")
        Object getConfig(@s("package") String str, @i("User-Agent") String str2, d<? super z<Map<String, Map<String, Integer>>>> dVar);

        @o("/v1/apps/{package}/config")
        Object postConfig(@s("package") String str, @i("User-Agent") String str2, @u Map<String, String> map, @we.a Map<String, String> map2, d<? super z<Void>> dVar);

        @k({"Content-Type: application/json"})
        @o("api/v1/register")
        Object register(@we.a RegisterRequest registerRequest, @i("User-Agent") String str, d<? super z<Void>> dVar);
    }

    private TotoService() {
    }

    private final OkHttpClient.Builder enableTls12OnPreLollipop(OkHttpClient.Builder builder) {
        return builder;
    }

    private final X509TrustManager findX509TrustManager() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        j0.h(trustManagers, "managers");
        if (!(trustManagers.length == 0)) {
            TrustManager trustManager = trustManagers[0];
            X509TrustManager x509TrustManager = trustManager instanceof X509TrustManager ? (X509TrustManager) trustManager : null;
            if (x509TrustManager != null) {
                return x509TrustManager;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final TotoServiceApi build(ServiceConfig serviceConfig, boolean z10) {
        j0.i(serviceConfig, "config");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        int i10 = 1;
        if (z10) {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, i10, 0 == true ? 1 : 0);
            httpLoggingInterceptor.level(z10 ? HttpLoggingInterceptor.Level.BODY : HttpLoggingInterceptor.Level.NONE);
            builder.addInterceptor(httpLoggingInterceptor);
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.connectTimeout(5L, timeUnit);
        builder.readTimeout(5L, timeUnit);
        builder.writeTimeout(5L, timeUnit);
        INSTANCE.enableTls12OnPreLollipop(builder);
        OkHttpClient okHttpClientBuild = builder.build();
        b0.a aVar = new b0.a();
        String endpoint = serviceConfig.getEndpoint();
        Objects.requireNonNull(endpoint, "baseUrl == null");
        HttpUrl httpUrl = HttpUrl.get(endpoint);
        Objects.requireNonNull(httpUrl, "baseUrl == null");
        List<String> listPathSegments = httpUrl.pathSegments();
        if (!"".equals(listPathSegments.get(listPathSegments.size() - 1))) {
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
        }
        aVar.f36387c = httpUrl;
        Objects.requireNonNull(okHttpClientBuild, "client == null");
        aVar.f36386b = okHttpClientBuild;
        aVar.f36388d.add(new ve.a(new Gson()));
        if (aVar.f36387c == null) {
            throw new IllegalStateException("Base URL required.");
        }
        Call.Factory okHttpClient = aVar.f36386b;
        if (okHttpClient == null) {
            okHttpClient = new OkHttpClient();
        }
        Call.Factory factory = okHttpClient;
        Executor executorA = aVar.f36385a.a();
        ArrayList arrayList = new ArrayList(aVar.f36389e);
        ue.u uVar = aVar.f36385a;
        Objects.requireNonNull(uVar);
        ue.g gVar = new ue.g(executorA);
        arrayList.addAll(uVar.f36489a ? Arrays.asList(ue.e.f36390a, gVar) : Collections.singletonList(gVar));
        ArrayList arrayList2 = new ArrayList(aVar.f36388d.size() + 1 + (aVar.f36385a.f36489a ? 1 : 0));
        arrayList2.add(new ue.a());
        arrayList2.addAll(aVar.f36388d);
        arrayList2.addAll(aVar.f36385a.f36489a ? Collections.singletonList(q.f36445a) : Collections.emptyList());
        b0 b0Var = new b0(factory, aVar.f36387c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executorA, false);
        if (!TotoServiceApi.class.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(TotoServiceApi.class);
        while (!arrayDeque.isEmpty()) {
            Class cls = (Class) arrayDeque.removeFirst();
            if (cls.getTypeParameters().length != 0) {
                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                sb2.append(cls.getName());
                if (cls != TotoServiceApi.class) {
                    sb2.append(" which is an interface of ");
                    sb2.append(TotoServiceApi.class.getName());
                }
                throw new IllegalArgumentException(sb2.toString());
            }
            Collections.addAll(arrayDeque, cls.getInterfaces());
        }
        if (b0Var.f36384g) {
            ue.u uVar2 = ue.u.f36488c;
            for (Method method : TotoServiceApi.class.getDeclaredMethods()) {
                if ((uVar2.f36489a && method.isDefault()) == false && !Modifier.isStatic(method.getModifiers())) {
                    b0Var.b(method);
                }
            }
        }
        Object objNewProxyInstance = Proxy.newProxyInstance(TotoServiceApi.class.getClassLoader(), new Class[]{TotoServiceApi.class}, new a0(b0Var, TotoServiceApi.class));
        j0.h(objNewProxyInstance, "retrofit.create(TotoServiceApi::class.java)");
        return (TotoServiceApi) objNewProxyInstance;
    }
}
