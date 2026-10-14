package ue;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import retrofit2.ParameterHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f36507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HttpUrl f36508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f36510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Headers f36511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final MediaType f36512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f36513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f36514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f36515i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ParameterHandler<?>[] f36516j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f36517k;

    public static final class a {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final Pattern f36518x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final Pattern f36519y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b0 f36520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f36521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Annotation[] f36522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Annotation[][] f36523d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Type[] f36524e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f36525f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f36526g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f36527h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f36528i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f36529j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f36530k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f36531l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f36532m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        public String f36533n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f36534o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f36535p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f36536q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @Nullable
        public String f36537r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        public Headers f36538s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @Nullable
        public MediaType f36539t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @Nullable
        public Set<String> f36540u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Nullable
        public ParameterHandler<?>[] f36541v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f36542w;

        public a(b0 b0Var, Method method) {
            this.f36520a = b0Var;
            this.f36521b = method;
            this.f36522c = method.getAnnotations();
            this.f36524e = method.getGenericParameterTypes();
            this.f36523d = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            return Short.TYPE == cls ? Short.class : cls;
        }

        public final void b(String str, String str2, boolean z10) {
            String str3 = this.f36533n;
            if (str3 != null) {
                throw f0.j(this.f36521b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f36533n = str;
            this.f36534o = z10;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (f36518x.matcher(strSubstring).find()) {
                    throw f0.j(this.f36521b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f36537r = str2;
            Matcher matcher = f36518x.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.f36540u = linkedHashSet;
        }

        public final void c(int i10, Type type) {
            if (f0.h(type)) {
                throw f0.l(this.f36521b, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public y(a aVar) {
        this.f36507a = aVar.f36521b;
        this.f36508b = aVar.f36520a.f36380c;
        this.f36509c = aVar.f36533n;
        this.f36510d = aVar.f36537r;
        this.f36511e = aVar.f36538s;
        this.f36512f = aVar.f36539t;
        this.f36513g = aVar.f36534o;
        this.f36514h = aVar.f36535p;
        this.f36515i = aVar.f36536q;
        this.f36516j = aVar.f36541v;
        this.f36517k = aVar.f36542w;
    }
}
